import java.util.*;
public class int2roman {
     public static void main(String[] args){
         try (Scanner scn = new Scanner(System.in)) {
            int num = scn.nextInt();
            String romans[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
            int value[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
            int seqSize = romans.length;
            int idx = seqSize - 1;
            String ans = "";
            while(num>0){
                while(value[idx]<=num){
                    ans += romans[idx];
                    System.out.println(ans);
                    num -= value[idx];
                    System.out.println(num);
                }
                idx--;

            }
     System.out.println((ans));
        }
    }
}
   
    


