package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Indietro {
	
	@RequestMapping(value  = "/indietro", method = RequestMethod.POST)
	public ModelAndView operation(@RequestParam("testo") String testo, Model model) {
		
		ModelAndView newModel = new ModelAndView("scegliOperazioni");
		newModel.addObject("testo", testo);
		
		return newModel;
		
	}
}
