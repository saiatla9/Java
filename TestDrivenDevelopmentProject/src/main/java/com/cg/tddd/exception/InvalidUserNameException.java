package com.cg.tddd.exception;

public class InvalidUserNameException extends Exception{
	public InvalidUserNameException(String errMsg) {
		super(errMsg);
	}
}
