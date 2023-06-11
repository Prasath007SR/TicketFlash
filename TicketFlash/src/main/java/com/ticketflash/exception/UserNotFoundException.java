package com.ticketflash.exception;

public class UserNotFoundException extends RuntimeException{
public UserNotFoundException(Long id)
{
	super("Could not found the user"+id);
}
}