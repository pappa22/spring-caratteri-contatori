package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Indietro {
	
	@RequestMapping(value  = "/indietroDue", method = RequestMethod.POST)
	public ModelAndView secondo(@RequestParam("testo") String testo, Model model) {
		
		ModelAndView newModel = new ModelAndView("scegliOperazioni");
		newModel.addObject("testo", testo);
		
		return newModel;
		
	}
	
	//ovviamente non può mappare l'index perchè è fuori dal web-inf
	/*@RequestMapping(value  = "/indietroUno", method = RequestMethod.POST)
	public ModelAndView primo(Model model) {
		
		ModelAndView newModel = new ModelAndView("index");
		
		return newModel;
		
	}*/
}
