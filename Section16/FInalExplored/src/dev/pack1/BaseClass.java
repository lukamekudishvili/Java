package dev.pack1;

public class BaseClass {
    public final void recommendedMethod(){
        System.out.println("[dev.pack1.BaseClass.recommendedMethod]: Best Way to Do it");
        optionalMethod();
        mandatoryMethod();
    }

    protected void optionalMethod(){
        System.out.println("[dev.pack1.BaseClass.optionalMethod]: Customize Optional Method");
    }

    private final void mandatoryMethod(){
        System.out.println("[dev.pack1.BaseClass.mandatoryMethod]: NON-NEGOTIABLE!");
    }

    public static void recommendedStatic(){
        System.out.println("[BaseClass.recommendedStatic:] Best way to Do it");
        optionalStatic();
        mandatoryStatic();
    }

    protected static void optionalStatic(){

        System.out.println("[BaseClass.optionalStatic]: OptionalStatic");
    }

    private static void mandatoryStatic(){
        System.out.println("[BaseClass.mandatoryStatic]: Mandatory");
    }
}
