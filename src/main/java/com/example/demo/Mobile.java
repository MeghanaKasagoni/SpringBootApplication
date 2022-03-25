package com.example.demo;

import org.springframework.stereotype.Service;
@Service
public class Mobile implements Gadgets {
	
	@Override
	public String display() {
	      return "Mobile - Screen is Small";
}
}