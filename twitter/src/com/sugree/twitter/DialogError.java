package com.sugree.twitter;

public class DialogError extends Throwable {

	private static final long serialVersionUID = -992704825747001028L;
	
	private int mErrorCode;
	private String mFailingUrl;
	// Okay, this is just a test to see if this actually comes up.
	// SJUNEJO WAS HERE !!!
	public DialogError(String message, int errorCode, String failingUrl) {
		super(message);
		mErrorCode = errorCode;
		mFailingUrl = failingUrl;
	}

	// THIS IS ENTIRELY DIFFERENT TO MASTER BRANCH DURRR 
	public int getErrorCode() {
		return mErrorCode;
	}

	public String getFailingUrl() {
		return mFailingUrl;
	}

}
