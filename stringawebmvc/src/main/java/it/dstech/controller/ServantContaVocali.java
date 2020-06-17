package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.service.Service;

@Controller
public class ServantContaVocali {

	@RequestMapping(value  = "/contaVocali", method = RequestMethod.POST)
	public ModelAndView operation(@RequestParam("testo") String testo, Model model) {
		
		Service s = new Service(testo);
		
		ModelAndView newModel = new ModelAndView("risultato");
		newModel.addObject("testo", testo);
		newModel.addObject("ris", s.contaVocali());
		return newModel;
		
	}
}
