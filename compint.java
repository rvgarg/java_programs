import java.util.Scanner;

public class compint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float p, r, t;
        System.out.println("Principal: ");
        p = s.nextFloat();
        System.out.println("Rate of Interest: ");
        r = s.nextFloat();
        System.out.println("Time in years: ");
        t = s.nextFloat();
        float ci = p * Math.pow(((100 + r) / 100), t) - p;
        System.out.println("Compound Interest: " + ci);
        int a[][] = new Int()[3][3];
    }

}