package com.Arrayproblems;

public class MaxMinValueArray {
    public static void main(String[] args) {

        int[] arr = new int[]{150, 500, 700, 100, 200, 250};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            }
        int min = arr[0];
        for (int i = 0; i > arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
            System.out.println("Max value of array : " + max);
            System.out.println("Min value of array : " + min);
        }
    }