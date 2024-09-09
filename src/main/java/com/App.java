package com;
import javax.ejb.Stateless;
@Stateless
public class App implements IRemote
{
	public int add(int a,int b)
	{
		return a+b;
	}

}
