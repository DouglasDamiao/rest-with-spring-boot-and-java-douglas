<<<<<<< HEAD
<<<<<<< HEAD
package br.com.douglas;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController{
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(
			@RequestParam(value = "name", defaultValue = "World")
			String name) {
		return new Greeting(counter.incrementAndGet(),
				String.format(template, name));
	}
	
}

=======
package br.com.douglas;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController{
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(
			@RequestParam(value = "name", defaultValue = "World")
			String name) {
		return new Greeting(counter.incrementAndGet(),
				String.format(template, name));
	}
	
}

>>>>>>> f10b4ff05b964fdf49f024794c794d02d06c56c6
=======
package br.com.douglas;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController{
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(
			@RequestParam(value = "name", defaultValue = "World")
			String name) {
		return new Greeting(counter.incrementAndGet(),
				String.format(template, name));
	}
	
}

>>>>>>> f10b4ff05b964fdf49f024794c794d02d06c56c6
