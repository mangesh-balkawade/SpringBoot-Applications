package com.mangesh.crud.exception;

public class ProductException extends Exception
{
  public ProductException(String message)
  {
	  super(message);
  }
  public ProductException()
  {
	  super("Product Service Exception Caused");
  }
}
