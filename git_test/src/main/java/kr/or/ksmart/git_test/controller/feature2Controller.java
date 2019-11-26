package kr.or.ksmart.git_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class feature2Controller {

	@GetMapping("/feature2")
	public String feature2() {
		return "feture2";
	}
}
