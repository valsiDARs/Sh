package com.shpp.p2p.cs.vshishatskiy.assigment2;

import com.shpp.cs.a.console.TextProgram;

public class Assigment2Part1 extends TextProgram {

    private static double A;
    private static double B;
    private static double C;

    private static double DISCRIMINANT;

    private static double FIRST_ROOT;
    private static double SECOND_ROOT;

    @Override
    public void run() {
        lisConsole();
        calculatingDiscriminant(A,B,C);
        calculatingRoots(DISCRIMINANT, A, B);
        printRoots(DISCRIMINANT);
    }

    private void lisConsole(){
        print("Please enter a: ");
        A = readDouble();
        print("Please enter b: ");
        B = readDouble();
        print("Please enter c: ");
        C =readDouble();
    }
    private void calculatingDiscriminant(double a, double b, double c){
        DISCRIMINANT = Math.pow(b, 2) - 4 * a * c;
    }

    private void calculatingRoots(double discriminant,double a, double b){
        double denominator = 2 * a;
        FIRST_ROOT = (-b + Math.sqrt(discriminant) ) / denominator;
        SECOND_ROOT = (-b - Math.sqrt(discriminant) ) / denominator;
    }

    private void printRoots(double discriminant){
        if(discriminant < 0){
            print("There are no real roots");
        }

        if(discriminant == 0){
            print("There is one root: " + FIRST_ROOT);
        }

        if (discriminant > 0){
            print("There are two roots: " + FIRST_ROOT + " and " + SECOND_ROOT);
        }
    }
}
