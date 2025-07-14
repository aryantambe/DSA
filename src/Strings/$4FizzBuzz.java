package Strings;

import java.util.*;

//Leetcode 412
public class $4FizzBuzz {
    private static ArrayList<String> fn(int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = i + 1;
            if (num % 15 == 0) { // as 3 and 5 are co-prime numbers
                list.add(i, "FizzBuzz");
            } else if (num % 3 == 0) {
                list.add(i, "Fizz");
            } else if (num % 5 == 0) {
                list.add(i, "Buzz");
            } else {
                list.add(i, Integer.toString(i + 1)); //typecasting from integet to string
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int num = 5;
        ArrayList<String> list = new ArrayList<>();
        list = fn(num);
        for (String string : list) {
            System.out.print(string + " ");
        }
    }
}
