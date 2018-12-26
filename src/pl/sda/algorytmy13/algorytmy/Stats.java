package pl.sda.algorytmy13.algorytmy;

import java.util.Scanner;

public class Stats {
    public static void main(String[] args){
        Bag<Double> numbers = new Bag<Double>();
        Scanner stdin = new Scanner(System.in);

        System.out.println(" podaj liczbe, 0 konczy program ");
         double y;
        y=1;
        while(y!=0) {
            y=stdin.nextDouble();
            numbers.add(y);
        }
        int N = numbers.size();

        double sum = 0.0;
        for(double x : numbers)
            sum+=x;
        double mean = sum/N;

        sum =0.0;
        for(double x: numbers)
            sum+=(x-mean)*(x-mean);
        double std = Math.sqrt(sum/(N-1));

        System.out.println("Srednia %.2f\n" + mean);
        System.out.println(" Odch. st.: %.2f\n" + std);
    }
}
