package com.ista.springboot.di.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ista.springboot.di.app.models.domain.Vcard;

@Controller
@RequestMapping("/index")
public class VCardController {
	
	@Autowired
    private Vcard tageta;

    @GetMapping("/informacion")
    public String index(Model model){
        model.addAttribute("tageta", tageta);
        model.addAttribute("titulo", "Card");
        return "informacion";
    }
}
