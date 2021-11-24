package com.company;

public class Main {

    public static void main(String[] args) {


                int[] array = {9, 7, 2, 11};
                int i = 1;
                while (i < array.length) {
                    int val = array[i];
                    int j = i - 1;
                    while (j >= 0 && array[j] > val) {
                        array[j + 1] = array[j];
                        j--;
                    }
                    array[j + 1] = val;
                    i++;
                }
                for (int v: array)
                    System.out.println(v);
            }
    }
