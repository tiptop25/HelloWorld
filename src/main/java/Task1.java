import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by superova on 30.10.2015.
 */
public class Task1 {
    public static void main(String[] args)throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n%2 == 0)
            System.out.println(n+ " "+ "парное число");
        else
            System.out.println(n+ " "+ "не парное число");
    }


}
