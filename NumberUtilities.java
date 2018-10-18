 
   
import java.util.*;
public class NumberUtilities {
    
    public static String getRange(int stop) {
        String done = "";
        for (int i = 0; i < stop; i++){
           done += String.valueOf(i);
    }
    return done;
}
   
     public static String getRange(int start, int stop) {
        String done2 = "";
        for (int i = start; i < stop; i++){
        done2 += String.valueOf(i);
        }
        return done2;
    }


    public static String getRange(int start, int stop, int step) {
        String done3 = "";
        for (int i = start; i < stop; i += step) {
            done3 += String.valueOf(i);
        }
        return done3;
    }
    
    public static String getEvenNumbers(int start, int stop) {
        String done4 = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0){
                done4 += String.valueOf(i);
            }
       
        }
        
        return done4;
    }


    public static String getOddNumbers(int start, int stop) {
        String done4 = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 1){
                done4 += String.valueOf(i);
            }
       
        }
        
        return done4;
    }


    public static String getExponentiations(int start, int stop, int exponent){
        String done4 = "";
        for (int i = start; i <= stop; i++) {
             int k = (int)Math.pow(i, exponent);
 
             done4 += String.valueOf(k);
            }
        return done4;
        }
        
       
    }

