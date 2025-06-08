package dev;

import dev.pack1.BaseClass;
import dev.pack2.ChildClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BaseClass parent= new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferredToAsBase=new ChildClass();

        parent.recommendedMethod();
        System.out.println("-------------------------------");

        childReferredToAsBase.recommendedMethod();
        System.out.println("-------------------------------");

        child.recommendedMethod();
        System.out.println("-------------------------------");


        parent.recommendedStatic();
        System.out.println("-------------------------------");

        childReferredToAsBase.recommendedStatic();
        System.out.println("-------------------------------");

        child.recommendedStatic();
        System.out.println("-------------------------------");


        Arrays.asLi st()

    }
}
