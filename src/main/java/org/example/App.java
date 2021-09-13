/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String password = "abc$123",user_password;

        System.out.print("What is the password? ");
        user_password = user_input.nextLine();

        if (user_password.equals(password))
        {
            System.out.println(String.format("Welcome!"));
        }
        else
        {
            System.out.println(String.format("I don't know you."));
        }
    }
}
