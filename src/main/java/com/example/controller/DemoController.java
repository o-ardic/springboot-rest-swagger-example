package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A demo controller to demonstrate basic REST service functionality.
 *
 * @author Okan ARDIC
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

	/**
	 * Adds two numbers.
	 *
	 * @param num1 first number.
	 * @param num2 second number.
	 * @return sum of two numbers.
	 */
	@PostMapping("/add/{num1}/{num2}")
	public int addNumbers(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
		return num1 + num2;
	}
}
