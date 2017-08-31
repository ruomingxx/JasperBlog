package com.jasper.blog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jason on 8/31/2017.
 */

@RestController
public class HelloWordController {
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

}
