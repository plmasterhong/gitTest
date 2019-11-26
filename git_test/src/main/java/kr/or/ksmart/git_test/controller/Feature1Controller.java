package kr.or.ksmart.git_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Feature1Controller {

	@GetMapping("/feature1")
	public String feature1() {
		return "feature1";
	}
}
