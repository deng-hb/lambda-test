package com.denghb.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by denghb on 2017/7/28.
 */
public class Test1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Jill", "Nate", "Kara", "Kim", "Jullie", "Paul", "Peter");

        old(names);
        lambda(names);

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;

//        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    public static void old(List<String> names) {

        StringBuilder namesOfLength4 = new StringBuilder();
        for (String name : names) {
            if (name.length() == 4) {
                namesOfLength4.append(name);
                namesOfLength4.append(", ");
            }
        }

        System.out.println(namesOfLength4);
    }

    public static void lambda(List<String> names) {


        System.out.println(names.stream()
                .filter(name -> name.length() == 4)
                .collect(Collectors.joining(", ")));
    }
}
