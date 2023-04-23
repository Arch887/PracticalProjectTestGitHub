package org.example;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    printPeriodicalyDateAndTime();
    }
    public static void printPeriodicalyDateAndTime(){
        while (true){
            try {
                System.out.println(Instant.now());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
