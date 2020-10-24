package com.cliffside.strategy;

import java.util.Arrays;

/**
 * 策略模式，
 * 封装了做一件事情的不同执行方式
 * @author windo
 */
public class Main {

    public static void main(String[] args) {
        //int[] a = {9,2,3,5,7,1,4};

        Cat[] a = {new Cat(3,3),new Cat(5,5),new Cat(9,9),new Cat(1,1)};
        Sorter<Cat> sorter = new Sorter<>();
        //sorter.sort(a,new CatHeightComparator());
        //System.out.println(Arrays.toString(a));

        //如果接口里只有一个方法，可以使用函数式接口。
        sorter.sort(a,(o1,o2)->{
            if (o1.weight<o2.weight){
                return -1;
            }else if (o1.weight>o2.weight){
                return 1;
            }
            return 0;
        });
        System.out.println(Arrays.toString(a));
    }
}
