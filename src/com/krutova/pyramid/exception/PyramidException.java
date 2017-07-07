package com.krutova.pyramid.exception;

public class PyramidException extends Exception {

	private static final long serialVersionUID = -7461147942894477088L;

	public PyramidException() {
	}
	
	public PyramidException(String message, Throwable cause) {
		super(message, cause);
	}

	public PyramidException(String message) {
		super(message);
	}

	public PyramidException(Throwable cause) {
		super(cause);
	}
}
