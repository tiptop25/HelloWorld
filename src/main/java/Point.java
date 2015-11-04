import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by superova on 04.11.2015.
 */
//Создайте в классе метод, который будет выводить на экран сообщение о том, в какой координатной четверти лежит точка.
public class Point {

    public double x;
    public double y;

    public Point(double a, double b) {
        x = a;
        y = b;
    }

    public void wherePointIs() {
        if (x > 0 && y > 0) {
            System.out.println("Точка " + x + "; " + y + " лежит в I координатной чверти.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка " + x + "; " + y + " лежит в II координатной чверти.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка " + x + "; " + y + " лежит в III координатной чверти.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка " + x + "; " + y + " лежит в IV координатной чверти.");
        } else if (x == 0 && y == 0) {
            System.out.println("Точка " + x + "; " + y + " лежит в начале координат.");
        }
    }

    public static void main(String[] args) {
        Point p1 =new Point(1.7,-5.8);
        p1.wherePointIs();

    }
}


