package com;
import javax.ejb.Remote;
import javax.ejb.Stateless;
@Remote
@Stateless
public interface IRemote
{
public int add(int a,int b);
}

