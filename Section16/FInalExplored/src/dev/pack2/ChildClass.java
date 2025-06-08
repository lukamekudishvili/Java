package dev.pack2;

import dev.pack1.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {
        System.out.println("[Child:optionalMethod] EXTRA Stuff Here");
        super.optionalMethod();
    }

//    @Override
//    public void recommendedMethod() {
//        System.out.println("[Child:recommendedMethod]: I'll do things my way");
//        optionalMethod();
//    }

    public static void recommendedStatic(){
        System.out.println("[ChildClass.recommendedStatic:] Best way to Do it");
        optionalStatic();
//        mandatoryStatic();
    }
}
