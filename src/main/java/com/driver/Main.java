package com.driver;

import java.util.*;

public class Main {

    // Yeh method testable hai
    public static String generatePattern(int N) {
        String s = "";
        boolean toggle = false;

        char[] alphabets = "abcdefghijklmnopqrstuvwyz".toCharArray();
        Queue<Character> q = new LinkedList<>();

        for (char c : alphabets)
            q.add(c);

        while (N > 0) {
            char ch = q.remove();
            if (toggle)
                s = s + ch;
            else
                s = ch + s;

            toggle = !toggle;
            q.add(ch);
            N--;
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // ab method ko call karke output le rahe hain
        String result = generatePattern(N);
        System.out.println(result);
    }
}
