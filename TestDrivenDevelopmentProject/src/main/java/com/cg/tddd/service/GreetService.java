package com.cg.tddd.service;

import com.cg.tddd.exception.InvalidUserNameException;

public interface GreetService {
	String greet(String userName) throws InvalidUserNameException;
}
