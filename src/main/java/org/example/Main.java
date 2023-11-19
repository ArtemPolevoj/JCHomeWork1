package org.example;

import org.example.calculator.Print;

public class Main {
    public static void main(String[] args) {
        Print print = new Print();
        print.sum(5, 10);
        print.division(50, 36);
        print.multiply(23, 56);
        print.difference(56, 87);
    }
}