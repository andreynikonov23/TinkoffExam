package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();
        if (years <= 1 || years > 10 * 10 * 10) {
            System.out.println("Колличество лет задано неправильно");
        } else {
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < years; i++) {
                Scanner scanName = new Scanner(System.in);
                String names = scanName.nextLine();
                boolean isTrue = false;
                char[] chars = names.toCharArray();
                for (char ch : chars) {
                    if (ch >= 'a' && ch <= 'z') {
                        System.out.println("Введено имя в нижнем регистре!");
                        isTrue = true;
                    }
                }
                if (isTrue) {
                    break;
                }
                StringTokenizer tokenizer = new StringTokenizer(names, " ");
                if (tokenizer.countTokens() < 3) {
                    System.out.println("Нужно ввести 3 имя");
                    break;
                }
                boolean isTrue2 = false;
                StringTokenizer tokenizer1 = new StringTokenizer(names, " ");
                while (tokenizer1.hasMoreTokens()) {
                    String name = tokenizer1.nextToken();
                    if (name.length() > 10) {
                        isTrue2 = true;
                    }
                }
                if (isTrue2) {
                    System.out.println("Имя больше 10 символов");
                    break;
                }
                list.add(names);
            }
            ArrayList<Integer> results = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                ArrayList<String> tempList = new ArrayList<>();
                StringTokenizer tokenizer = new StringTokenizer(list.get(i), " ");
                while (tokenizer.hasMoreTokens()) {
                    String name = tokenizer.nextToken();
                    tempList.add(name);
                }
                int count = 0;
                int result = 0;
                for (int j = 0; j < list.size(); j++) {
                    for (int k = 0; k < tempList.size(); k++) {
                        if (list.get(j).contains(tempList.get(k))) {
                            count = count + 1;
                        }
                    }
                    if (count == 3) {
                        result = result + 1;
                    }
                    count = 0;
                    if (j == list.size() - 1) {
                        results.add(result);
                    }
                }
            }
            int max = 0;
            for (Integer c : results) {
                if (max < c) {
                    max = c;
                }
            }
            System.out.println(max);
        }
    }
}
