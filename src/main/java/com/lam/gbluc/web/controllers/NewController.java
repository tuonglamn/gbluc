/**
 * 
 */
package com.lam.gbluc.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/**
 * @author LamNguyen
 *
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NewController {

	@Autowired
	public Environment env;
	
	@RequestMapping("/new")
    public String index(Model model) {
		model.addAttribute("page", "new");
        return "new";
        
    }
}
