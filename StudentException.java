package com.crud.exception;

@SuppressWarnings("serial")
public class StudentException extends RuntimeException {
	
	String resourceName;
	String resourseType;
	int resourceValue;
	
	public StudentException(String resourceName, String resourseType, int resourceValue) {
		super();
		this.resourceName = resourceName;
		this.resourseType = resourseType;
		this.resourceValue = resourceValue;
	}
	
	

}
