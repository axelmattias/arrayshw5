package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {-3, 2, 6, -11};
        int[] sumarray = new int[numbers.length];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            sum = sum + numbers[i];
            sumarray[i] = sum;
        }

         for (int v : sumarray) {
            System.out.print(v + " ");
        }
    }
}

