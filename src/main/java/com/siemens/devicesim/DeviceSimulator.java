package com.siemens.devicesim;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/device")
public class DeviceSimulator {

	@RequestMapping(method = RequestMethod.GET, path = "start")
	public String start() {
		System.out.println("Device Started ...... ");
		return "Started";
	}

	@RequestMapping(method = RequestMethod.GET, path = "stop")
	public String stop() {
		System.out.println("Device Stopped ");
		return "Stopped";
	}
}
