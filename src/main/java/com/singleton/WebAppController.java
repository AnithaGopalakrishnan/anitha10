package com.singleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppController {
	@GetMapping(value="/getHello")
	public String getData() {
		return "Hello EveryOne";
	}

}
