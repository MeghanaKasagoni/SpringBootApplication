package com.example.demo;

import org.springframework.stereotype.Service;

@Service
//@Primary ----- Autowired by @Primary
public class Tablet implements Gadgets {
	@Override
    public String display() {
		return "Tablet Screen size is Medium";
		
		
		
	}
	
}