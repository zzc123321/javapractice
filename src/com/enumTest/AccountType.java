package com.enumTest;

enum AccountType
{
SAVING, FIXED, CURRENT;
private AccountType()
{
	System.out.println("It is a account type");
}
}
