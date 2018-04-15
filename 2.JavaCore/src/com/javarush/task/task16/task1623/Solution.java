package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {

        //System.out.println(new GenerateThread());
        System.out.println(new GenerateThread());

    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            super(String.valueOf(++countCreatedThreads));
            start();
        }

        @Override
        public String toString() {
            return (getName() + " created");
        }

        public void run() {
                //new GenerateThread();

            if (countCreatedThreads < count) {

                System.out.println(new GenerateThread());

            }



        }
    }
}
