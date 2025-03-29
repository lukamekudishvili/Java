import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("alpha", "bravo", "charlie", "delta"));

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string);
            }
        });

        System.out.println("----------------");

        list.forEach((String s) -> System.out.println("name: " + s));

        /*--------------------------------------------------------------------*/
        System.out.println("------------------------------------------------------");

        int result = calculator(new Operation<Integer>() {
            @Override
            public Integer operate(Integer value1, Integer value2) {
                return value1 + value2;
            }
        }, 10, 20);

        double result2 = calculator((Double value1, Double value2) -> value1 * value2, 5.0, 12.0);
        double result3 = calculator((Double value1, Double value2) -> {
            return value1 * value2;
        }, 5.0, 12.0);
        double result4 = calculator((Double value1, Double value2) -> {
                    double res = value1 * value2;
                    return res;
                },
                5.0, 12.0);
        double result5 = calculator((value1, value2) -> {
            double res = value1 * value2;
            return res;
        }, 5.0, 12.0);

        /*----------------------------------------------------------------------------*/
        System.out.println("/*----------------------------------------------------------------------------*/");
        var coords = Arrays.asList(
                new double[]{47.2160, -95.2348},
                new double[]{29.1566, -89.2495},
                new double[]{35.1556, -90.0659});
        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        System.out.println("<----------------------------------->");
        BiConsumer<Double,Double> p1=(lat, lon)-> System.out.println("lat: "+lat+", lon: "+lon);
        var firstElement=coords.getFirst();

        processPoint(firstElement[0],firstElement[1],p1);


        System.out.println("<----------------------------------->");
        processPoint(firstElement[0], firstElement[1], new BiConsumer<Double, Double>() {
            @Override
            public void accept(Double lat, Double lon) {
                System.out.println("FROM ANONYMOUS CLASS -> lat: "+lat+", lon: "+lon);
            }
        });
        System.out.println("<----------------------------------->");
        processPoint(firstElement[0], firstElement[1],(lat, lon)->
                System.out.println("FROM Lambda Expression -> lat: "+lat+", lon: "+lon));


        System.out.println("<----------------------------------->");
        coords.forEach((double[] s)->processPoint(s[0], s[1],p1));

        System.out.println("<----------------------------------->");
        coords.forEach(e->processPoint(e[0], e[1], new BiConsumer<Double, Double>() {
            @Override
            public void accept(Double lat, Double lon) {
                System.out.println("FROM ANONYMOUS CLASS -> lat: "+lat+", lon: "+lon);
            }
        }));

        System.out.println("<----------------------------------->");
        coords.forEach(d->processPoint(d[0],d[1],(lat,lon)->System.out.println("FROM Lambda Expression -> lat: "+lat+", lon: "+lon)));

        System.out.println("/*----------------------------------------------------------------------------*/");
        //Predicate
        System.out.println("Before delete: "+list);
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return "bravo".equalsIgnoreCase(string);
            }
        });
        list.removeIf(s->s.equalsIgnoreCase("alpha"));
        list.addFirst("alpha");
        System.out.println("After delete: "+list);

        System.out.println("<----------------------------------->");

        list.addAll(List.of("ECHO", "EASY", "EARNEST"));
        list.forEach(s-> System.out.println(s));

        System.out.println("<----------------------------------->");
        list.removeIf(s->s.toLowerCase().startsWith("ea"));
        list.forEach(s-> System.out.println(s));

        System.out.println("/*----------------------------------------------------------------------------*/");
        //Function
        list.replaceAll(s->s.toLowerCase().charAt(0)+" -"+s.toUpperCase());
        list.forEach(s-> System.out.println(s));

        System.out.println("/*----------------------------------------------------------------------------*/");
        String[] emptyStrings= new String[10];
        System.out.println(Arrays.toString(emptyStrings));
        Arrays.setAll(emptyStrings,(i)->"Element N:"+(i+1));
//        Arrays.setAll(emptyStrings, new IntFunction<String>() {
//            @Override
//            public String apply(int value) {
//                return value+" element";
//            }
//        });
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings,(i)->emptyStrings[i]+
                switch (i){
            case 0 ->" one";
            case 1->" two";
            case 2->" three";
            case 3->" four";
            case 4->" five";
            case 5->" six";
            case 6->" seven";
            case 7->" eight";
            case 8->" nine";
            case 9->" ten";
            default -> "No valid";
                });
        System.out.println(Arrays.toString(emptyStrings));

        System.out.println("/*----------------------------------------------------------------------------*/");
        String[] names={"Ann", "Bob", "Carol", "David", "Ed", "Fred"};
        String[] randomList=randomlySelectedValues(15, names, new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random rnd= new Random();
                return rnd.nextInt(0,names.length);

            }
        });
        System.out.println(Arrays.toString(randomList));
        System.out.println("<----------------------------------->");


        String[] randomListWithLambda=randomlySelectedValues(20,names,()->new Random().nextInt(0,names.length));
        System.out.println(Arrays.toString(randomListWithLambda));
    };

    public static <T> T calculator(Operation<T> action, T value1, T value2) {

        T result = action.operate(value1, value2);
        System.out.println(result);
        return result;
    }

    //same as
    public static <T> T calculator1(BinaryOperator<T> operator, T val1, T val2) {
        T result = operator.apply(val1, val2);
        System.out.println(result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer){
        consumer.accept(t1,t2);
    }

    public static String[] randomlySelectedValues(int count,String[] values, Supplier<Integer> s){
        String[] selectedValues= new String[count];
        for(int i=0; i<count; i++){
            selectedValues[i]=values[s.get()];
        }
        return selectedValues;
    }
}