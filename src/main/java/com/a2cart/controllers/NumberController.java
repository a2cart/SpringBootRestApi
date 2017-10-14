package com.a2cart.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.a2cart.models.NumberPojo;
import com.a2cart.util.APIUtil;

@Controller
public class NumberController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String sumNumber(Model model, @Valid NumberPojo number) {

		try {
			Double a = number.getA();
			Double b = number.getB();

			Double sum = APIUtil.sumNumber(a, b);

			String result = a + "+" + b + "=" + sum;

			model.addAttribute("result", result);
		} catch (Exception e) {
			model.addAttribute("message", "Please check the given number");

		}

		return "index";
	}

}