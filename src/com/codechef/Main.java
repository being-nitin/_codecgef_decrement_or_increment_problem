package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*
     Write a program to obtain a number N and increment its value by 1 if the number
     is divisible by 4 otherwise decrement its value by 1.

     Input:
     First line will contain a number N.
     Output:
     Output a single line, the new value of the number.

     Constraints
     0≤N≤1000
     Sample Input:
     5
     Sample Output:
     4
         */
    Scanner sc = new Scanner(System.in);
    int t;
    t = sc.nextInt();
    if(t%4==0){
        t = t+1;
        System.out.println(t);
    }
    else{
        t = t-1;
        System.out.println(t);
    }
    }
}
