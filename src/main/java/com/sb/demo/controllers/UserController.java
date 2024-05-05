package com.sb.demo.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	public static String dateFormat = "dd-MM-yyyy hh:mm";
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);

	@RequestMapping(value="/test",method = RequestMethod.GET)
	public String testData() {
		return "Hello!This is from springboot app " + ConvertMilliSecondsToFormattedDate(String.valueOf(System.currentTimeMillis()));
	}



	private String ConvertMilliSecondsToFormattedDate(String l){
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(Long.parseLong(l));
		return simpleDateFormat.format(calendar.getTime());
	}

}
