package InitDnepr.pset1.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * Created by d1mys1klapo4ka on 13.03.2017.
 */
public class Greedy {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("O hai! How much change is owed?");
        int f = (int)Math.round (Double.parseDouble(reader.readLine()) * 100);

        while(f < 0){

            System.out.println("Retry");
            f = (int)Math.round (Double.parseDouble(reader.readLine()) * 100);

        }

        SmallChange(f);

    }

    static void SmallChange(int f){
        int m = 25, n = 10, b = 5, v = 1;
        int count = 0;

        while(true){
            if (f >= m ){
                f = f - m;
                count++;
            }else if (f >= n){
                f = f - n;
                count++;
            }else if (f >= b){
                f = f - b;
                count++;
            }else if (f >= v){
                f = f-v;
                count++;
            }else {
                break;
            }

        }
        System.out.println(count);

    }
}

