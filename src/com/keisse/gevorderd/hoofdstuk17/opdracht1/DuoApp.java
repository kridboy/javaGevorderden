package com.keisse.gevorderd.hoofdstuk17.opdracht1;

public class DuoApp{
    public static void main(String[] args) {
        Duo<String> sd = new Duo<>("Belle", "Perez");
        Duo<Integer> id = new Duo<>(7, 5);
        NumberDuo<?> nd = new NumberDuo<>(7, 12.12);
        Duo<?> std = new Duo<>(5.5,"dadada");
        NumberDuo<Integer> ndi= new NumberDuo<>(5,7);
        Duo<Number> duon = new Duo<>(15,45.88);

        ComparableDuo<Integer> nd1 = new ComparableDuo<>(3,5);
        ComparableDuo<Double> nd2 = new ComparableDuo<>(15.2,55.0);

        String x="schmeckle";
        String y="gazorpazorp";

        ComparableDuo<Integer> nd3 =  new ComparableDuo<>(x.toCharArray().length,y.toCharArray().length);


        String s1 = sd.getFirst();
        String s2 = sd.getSecond();

        Integer i1 = id.getFirst();
        Integer i2 = id.getSecond();

        System.out.println(String.format("%s %s", s1, s2));
        System.out.println(i1 + i2);

        System.out.println(nd1.getHighest()>nd2.getHighest()?nd1.getHighest():nd2.getHighest()+" is the highest!");
        System.out.println(nd3.getHighest()); //WAAROM MAAK GIJ EEN HELE NIEUWE KLASSE xD

        System.out.println(String.format("%.2f",nd.getSum()));
        DuoUtility.printUpper(sd);
        DuoUtility.printDuo(std);


        DuoUtility.printSum(id);
        DuoUtility.printSum(duon);
        System.out.println(nd.getSum());
    }
}
