package com.example.helloworld;

import java.util.Scanner;

public class hello_world {
    static int a,b;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        if(a+b>10)
            System.out.println("hello world !");
        else
            System.out.println("Hello manali naik !");
        
        System.out.println("Welcome aboard");
    }

}
