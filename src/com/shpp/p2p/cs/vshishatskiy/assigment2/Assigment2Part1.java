/**
 * File: Assigment2Part1.java
 *
 * Program find roots quadratic equation through the discriminant
 */

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
        listenTerminal();
        calculatingDiscriminant(A,B,C);
        calculatingRoots(DISCRIMINANT, A, B);
        printRoots(DISCRIMINANT);
    }

    private void listenTerminal(){
        print("Please enter a: ");
        A = readDouble();
        print("Please enter b: ");
        B = readDouble();
        print("Please enter c: ");
        C =readDouble();
    }

    /**
     * @param a,b,c - coefficient, A*(x^2) + B*x + C = 0
     */

    private void calculatingDiscriminant(double a, double b, double c){
        DISCRIMINANT = Math.pow(b, 2) - 4 * a * c;
    }

    private void calculatingRoots(double discriminant,double a, double b){
        if (DISCRIMINANT < 0){
            return;
        }
        double denominator = 2 * a;
        FIRST_ROOT = (-b + Math.sqrt(discriminant) ) / denominator;
        SECOND_ROOT = (-b - Math.sqrt(discriminant) ) / denominator;
    }

    /**
     * If the discriminant is greater than zero, then the equation has two roots.
     * If the discriminant is zero, then the equation has one root.
     * If the discriminant is less than zero, then the equation has no roots.
     */

    private void printRoots(double discriminant){
        if(discriminant < 0){
            print("There are no real roots");
        }

        if(discriminant == 0){
            System.out.printf("There is one root: %.3f", FIRST_ROOT);
        }

        if (discriminant > 0){
            System.out.printf("There are two roots: %.3f and %.3f", FIRST_ROOT, SECOND_ROOT);
        }
    }
}
