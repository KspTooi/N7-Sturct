package com.ksptooi.n7;

/**
 * N7项目 - 二分法
 */
public class Dichotomy {


    public static void main(String[] args) {

        int[] resource = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int target = 6;

        int left = 0;
        int middle = resource.length / 2;
        int right = resource.length;


        for(;middle != target;){

            if(target > middle){
                left = middle;
                middle = (left + right) / 2;
            }

            if(target < middle){
                right = middle;
                middle = (left + right) / 2;
            }

        }

        System.out.println("find target of location:"+middle);

    }


}
