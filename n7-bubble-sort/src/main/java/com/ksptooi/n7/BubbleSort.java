package com.ksptooi.n7;

/**
 * N7项目 - 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] resource = {2,432,42,321,2,56,0,543,4,54,543,987,16,154,12,65,645,954,21,243};

        boolean change = true;

        int cacheValue = 0;

        for(;change;){

            for(int i1=0;i1<resource.length;i1++){

                for(int i2=0;i2<resource.length;i2++){

                    if(resource[i1] < resource[i2]){

                        cacheValue = resource[i2];
                        resource[i2] = resource[i1];
                        resource[i1] = cacheValue;
                        change = true;
                        continue;
                    }

                    change = false;

                }

            }

        }

        for(int i:resource){
            System.out.println(i);
        }


    }


}
