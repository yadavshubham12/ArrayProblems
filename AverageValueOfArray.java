package com.Arrayproblems;

import java.util.Scanner;

public class AverageValueOfArray {
    public static void main(String[] args) {

        int[] arr = { 40,60,50,80,50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        double average = sum / arr.length;
        System.out.println("Average of the element :"  +average);
    }
}
