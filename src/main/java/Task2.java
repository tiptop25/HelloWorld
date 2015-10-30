/**
 * Created by superova on 30.10.2015.
 */
public class Task2 {
    public static void main(String[] args) {
        double a = 8.5;
        double b = 11.5;
        double c = 10d;
        double aa = Math.abs(a-c);
        double bb = Math.abs(b-c);
        if(aa<bb)
            System.out.println( a+" "+"ближе к 10");
        if(aa>bb)
            System.out.println( b+" "+"ближе к 10");
    }
}
