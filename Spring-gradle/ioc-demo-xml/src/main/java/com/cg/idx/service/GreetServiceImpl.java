package com.cg.idx.service;

public class GreetServiceImpl implements IGreetService{
	public String getGreeting(String userName) {
		return "Hello "+userName;
	}
}
