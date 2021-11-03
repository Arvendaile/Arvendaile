package com.company;

public class Main {

    public static void main(String[] args) {
        /* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

        /* Name of the class has to be "Main" only if the class is public. */
        class Ideone
        {
            public static void main (String[] args) throws java.lang.Exception
            {
                System.out.println("Система расчёта штрафов");

                int carSpeed = 187;

                int fineFor20to40 = 500;
                int fineFor40to60 = 1000;
                int fineFor60to80 = 2000;
                int fineFor80andMore = 5000;

                int townSpeed = 50;

                int overSpeed = carSpeed - townSpeed;

                if(overSpeed < 0) {
                    System.out.println("Скорость не превышена");
                }
                else if(overSpeed >= 1 && overSpeed <= 10) {
                    System.out.println("Штраф: " + fineFor20to40);
                }
                else if(overSpeed >= 40 && overSpeed < 60) {
                    System.out.println("Штраф: " + fineFor40to60);
                }
                else if(overSpeed >= 60 && overSpeed < 80) {
                    System.out.println("Штраф: " + fineFor60to80);
                }
                else if(overSpeed >= 80) {
                    System.out.println("Штраф: " + fineFor80andMore);
                }
            }
        }
    }
}
