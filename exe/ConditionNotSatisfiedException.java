package com.exe;
//Custom Exception
public class ConditionNotSatisfiedException extends Exception {
	String msg;

	public ConditionNotSatisfiedException(String msg) {
		super(msg);
		this.msg = msg;
	}
	

}
