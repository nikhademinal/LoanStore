package com.loan.store.exception;

public class InvalidLoanException extends RuntimeException{

	private final String id;
	
	public InvalidLoanException(final String id)
	{
		super("Invalid Load: "+ id);
		this.id=id;
	}
	
	public String getId()
	{
		return id;
	}
}
