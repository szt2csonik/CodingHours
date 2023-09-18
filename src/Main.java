import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double coding=6*5*17;
        double workhours=52*17;
        double percent=(coding/workhours)*100;
        System.out.println("Hours spent coding: "+coding);
        System.out.println("avg of coding hours in %:"+percent);
    }
}