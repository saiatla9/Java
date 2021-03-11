package com.cg.tddd.exception;

public class ZeroNotAllowedException extends Exception {
	public ZeroNotAllowedException() {
		super("zero is not allowed for division");
	}
}