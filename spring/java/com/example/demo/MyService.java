package com.example.demo;

import org.springframework.stereotype.Component;

@Component
class MyService implements HelloService {

	public void sayHello() {
		System.out.println("this is oustanding");
	}
}
