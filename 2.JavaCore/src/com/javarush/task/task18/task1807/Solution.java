package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        byte[] buffer = new byte[1000];
        int count = 0;

        while (fileInputStream.available() > 0) {
            fileInputStream.read(buffer);
        }

        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] == 44) {
                count++;
            }
        }

        System.out.println(count);
        reader.close();
        fileInputStream.close();
    }
}
