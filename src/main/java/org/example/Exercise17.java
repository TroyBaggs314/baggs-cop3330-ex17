/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.util.Scanner;

class Prompt
{
    int a;
    int w;
    double r;
    int h;
}

public class Exercise17
{
    public static void main(String[] args)
    {
        Prompt p = new Prompt();
        p = inputs(p);
        if((p.a * 5.14 / p.w * p.r) - 0.015 * p.h >= 0.08)
        {
            System.out.println("It is not legal for you to drive.");
        }
        else
        {
            System.out.println("It is legal for you to drive.");
        }
    }

    public static Prompt inputs(Prompt p)
    {
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("How many ounces of alcohol did you drink?");
            while (!sc.hasNextInt())
            {
                sc.next();
            }
            p.a = sc.nextInt();
        } while (p.a <= 0);

        do
        {
            System.out.println("What is your body weight?");
            while (!sc.hasNextInt())
            {
                sc.next();
            }
            p.w = sc.nextInt();
        } while (p.w <= 0);

        System.out.println("What is your gender? (m/f)");
        char g = sc.next().charAt(0);
        while(g != 'm' && g != 'f' )
        {
            System.out.println("What is your gender? (m/f)");
            g = sc.next().charAt(0);
        }
        if(g == 'm')
        {
            p.r = 0.73;
        }
        else if(g == 'f')
        {
            p.r = 0.66;
        }

        do
        {
            System.out.println("How many hours since you last drank?");
            while (!sc.hasNextInt())
            {
                sc.next();
            }
            p.h = sc.nextInt();
        } while (p.h <= 0);
        return p;
    }
}
