package com.company;

import java.util.Arrays;
import java.util.Random;

public class sort {
    private int Sort;


    public void setSort(int sort[]) {
        boolean bool = true;
        int temp = sort[0];
        while(bool) {
            bool = false;
            for (int i = 0; i < sort.length; i++) {
                if (sort[i] > sort[i + 1]) {
                    temp = sort[i];
                    sort[i] = sort[i + 1];
                    sort[i + 1] = temp;
                    bool = true;
                }
            }
        }
        System.out.println(Arrays.toString(sort));
    }
    sort(int _sort){


        this.Sort = _sort;


    }


}
