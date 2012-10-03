package org.love320.interfacem.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.love320.interfacem.services.ParameterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
public class Parameter {

	@Autowired
	private ParameterServices parameterServices; 
	
	@RequestMapping("/parameter-list")
	public @ResponseBody  Object list(Model model){
		List list = parameterServices.newListAll();
		Gson gson = new Gson();
		Map dataMap = new HashMap();
		dataMap.put("Lists", list);
		System.out.println(">>");
		return gson.toJson(dataMap);
	}
	
	
}