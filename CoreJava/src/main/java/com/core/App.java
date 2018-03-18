package com.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<String> one = new ArrayList<String>();
    	one.add("sachin");
    	one.add("pune");
    	for(String o : one)
    		System.out.print(o+" ");
    	System.out.println();
    	one.add(1, "wakle");
    	for(String o : one)
    		System.out.print(o+" ");
    	System.out.println();
    	System.out.println(one.remove(1));
    	for(String o : one)
    		System.out.print(o+" ");
    }
}
