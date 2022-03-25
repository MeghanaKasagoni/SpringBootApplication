package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class Laptop implements Gadgets{

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "Laptop Screen is Large";
	}

}
