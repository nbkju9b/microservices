package com.dailycodebuffer.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallbackMethod() {
		return "UserService is taking longer than expected, please try again later";
	}

	@GetMapping("/departmentServiceFallback")
	public String departmentServiceFallbackMethod() {
		return "DepartmentService is taking longer than expected, please try again later";
	}
}
