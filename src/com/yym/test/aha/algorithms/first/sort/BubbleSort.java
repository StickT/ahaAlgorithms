package com.yym.test.aha.algorithms.first.sort;

/**
 * Created by StickT on 2017/4/14.
 */
public class BubbleSort {

    public static void sort(int[] a){
        int n = a.length;
        for (int i = 0;i < n-1;i++){
            for (int j = 0;j< n-1-i;j++){
                if(a[j]<a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }


}
