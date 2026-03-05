package com.example.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import com.example.model.Device;
import com.example.model.Devices;

@Controller
public class Store {
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;
	private Devices listOfDevices;
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/samsung")
	public ModelAndView samsung()
	{
		ModelAndView mv=new ModelAndView("samsung");
		List<Device> samsungList= new ArrayList<>();
		samsungList.add(new Device("Galaxy","smart phone"));
		samsungList.add(new Device("Note","smart tablet"));
		Devices listOfDevices=new Devices("Samsung",samsungList);
		String name="upasana dew";
		mv.addObject("devices",listOfDevices);
		mv.addObject("myname",name);
		return mv;
	}
	
	@RequestMapping("/apple")
	public ModelAndView apple()
	{
		ModelAndView mv=new ModelAndView("apple");
		//RestTemplate rt=new RestTemplate();
		Devices listOfDevices = restTemplate.getForObject("http://APPLE/devices/apple", Devices.class);
		mv.addObject("devices",listOfDevices);
				return mv;
	}

}
