package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        int n = Integer.parseInt(numbers.substring(0, 1));
        int q = Integer.parseInt(numbers.substring(2, 3));
        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Scanner scanner1 = new Scanner(System.in);
            String str = scanner1.nextLine();
            data.add(str);
        }
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<String> values = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            Scanner scanner2 = new Scanner(System.in);
            String str = scanner2.nextLine();
            int num = Integer.parseInt(str.substring(0, 1));
            String value = str.substring(2);
            nums.add(num);
            values.add(value);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = nums.size() -1; i >= 0; i--) {
            for (int j = data.size() -1; j >= nums.size(); j--) {
                if (data.get(j).contains(values.get(i))){
                    result.add(j+1);
                    break;
                }
            }
        }
        Collections.reverse(result);
        for (Integer i : result){
            System.out.println(i);
        }
    }
}
