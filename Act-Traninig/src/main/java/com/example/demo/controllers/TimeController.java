package com.example.demo.controllers;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.time.domain.Hour;
import com.example.demo.time.domain.HourDay;
import com.example.demo.time.domain.Minute;
import com.example.demo.time.domain.Second;
import com.example.demo.time.domain.UnitTime;

@RestController
@RequestMapping
public class TimeController {

	@GetMapping("/Hour")
	public HourDay getHour() {
		LocalTime now = LocalTime.now();
		Hour hour = Hour.of(now.getHour());
		Minute minute = Minute.of(now.getMinute());
		Second second = Second.of(now.getSecond());
		
		Long hora = UnitTime.fromHour(UnitTime.HOURS,now);
		Long minuto = UnitTime.fromHour(UnitTime.MINUTES,now);
		Long segundo = UnitTime.fromHour(UnitTime.SECONDS,now);
		Long milisegundo = UnitTime.fromHour(UnitTime.MILLISECONS,now);
		
		return HourDay.from(hour, minute, second, minuto.intValue());
	}
}
