package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < days; i++) {
            Scanner scanner1 = new Scanner(System.in);
            int a = scanner1.nextInt();
            count.add(a);
        }
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < count.size(); i++) {
            int temp = i + 1;
            if (temp%2 != 0){
                oddSum = oddSum + count.get(i);
            } else
                evenSum = evenSum + count.get(i);
        }
        int result = oddSum - evenSum;
        if (result < 0){
            int temp = count.get(0);
            count.set(0, count.get(1));
            count.set(1, temp);
        }
        for (int i = 0; i < count.size(); i++) {
            int temp = i + 1;
            if (temp%2 != 0){
                oddSum = oddSum + count.get(i);
            } else
                evenSum = evenSum + count.get(i);
        }
        System.out.println(result);
    }
}
