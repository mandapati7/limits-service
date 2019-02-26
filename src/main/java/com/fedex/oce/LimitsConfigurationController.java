package com.fedex.oce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fedex.oce.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired(required=true)
	Configuration config;

	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsConfiguration() {
		//return new LimitsConfiguration(1000, 100);
		return new LimitsConfiguration(config.getMaximum(), config.getMinimum());
	}
	
}
