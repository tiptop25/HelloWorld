import java.util.Random;

/**
 * Created by superova on 30.10.2015.
 */
public class Task4 {
    public static void main(String[] args) {

     int []way =new int[156] ;
    for (int i =5; i<way.length; i++){
       way[i] = i;
    }
      int random = (way[new Random().nextInt(way.length)]);
        if (random<=25||random>=100)
            System.out.println("Число"+" "+ random + " " + "не содержится в интервале (25,100)");
        else
            System.out.println("Число"+" "+ random + " " + "содержится в интервале (25,100)");
    }


}


