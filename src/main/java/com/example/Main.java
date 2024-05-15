package com.example;

public class Main {
    public static void main(String[] args) {
        mioThread t = new mioThread();
        System.out.println("stampa dal main: ");
        t.start();
    }
}