package com.cg.tddd.service;

import com.cg.tddd.exception.ZeroNotAllowedException;

public interface ArithmeticService {
	int subtract(int ... a);
	
	int divide(int ... a) throws ZeroNotAllowedException;
}
