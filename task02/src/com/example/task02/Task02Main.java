package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int b;
        boolean prevWasCR = false;

        while ((b = System.in.read()) != -1) {
            if (prevWasCR) {
                if (b == 10) {
                    System.out.write(10);
                    prevWasCR = false;
                } else {
                    System.out.write(13);
                    if (b == 13) {
                        prevWasCR = true;
                    } else {
                        System.out.write(b);
                        prevWasCR = false;
                    }
                }
            } else {
                if (b == 13) {
                    prevWasCR = true;
                } else {
                    System.out.write(b);
                }
            }
        }

        if (prevWasCR) {
            System.out.write(13);
        }

        System.out.flush();
    }
}
