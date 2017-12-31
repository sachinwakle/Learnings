package com.practice;

import org.omg.CORBA.Object;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello sachin!" );
        String st="unmodifiable";
        String str="unmodifiable";
        final Integer int1 = Integer.valueOf(new String("100"));
        final Integer int2 = Integer.valueOf(new String("789"));
        
        final String st1 = new String("sachin");
        final String st2 = new String("sachin");
        
//        System.out.println(st1 == st2);
        
        
        System.out.println(int1 == int2);
        
//        StringBuilder j = new StringBuilder(st.replace('m','s'));
//        System.out.println(j);
//        System.out.println(st.equals(str));
        
    }
}
