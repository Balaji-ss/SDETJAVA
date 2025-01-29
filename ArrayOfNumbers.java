package com.fss;

import java.util.Arrays;

public class ArrayOfNumbers {
    public static void main(String[] args) {
        int[] arr = {23,12,32,10,5,7,6,26,15,20};
        /* int[] numbers = new int[10];
         for (int i = 0; i < numbers.length; i++) {
             numbers[i] = i + 1; 
         } */

         /* for (int a : arr) {             (enhanced for loop java7)
            System.out.println(a);
        } */

        /* System.out.println("");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        } */

       // Arrays.stream(arr).forEach(a->System.out.println(a));  using lamda
       //   Arrays.stream(arr).forEach(System.out::println);

       //smallest element in array
        /* int min = arr[0];
        for(int a : arr){
            if(a < min){
                min=a;
            }
        }
        System.out.println("smallet element is " + min);
        //largest element in array
        int max = arr[0];
        for(int a : arr){
            if(a > max){
                max=a;
            }
        }
        System.out.println("largest element is " + max); */

        System.out.println("smallest element is "+Arrays.stream(arr).min().getAsInt()); //as min() is optional,we need to use getter method
        System.out.println("largest element is"+Arrays.stream(arr).max().getAsInt());

        //SUM

        System.out.println("sum of elements "+Arrays.stream(arr).sum());
        System.out.println("average of elements "+Arrays.stream(arr).average().getAsDouble());


}}
