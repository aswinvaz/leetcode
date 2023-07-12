
import java.util.Scanner;

public class flipandinvert {
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++) {
a[i] = sc.nextInt();
        } //Arrays should be  of 1s and 0s
    
for (int i=0; i<a.length; i++) {
    if (a[i]==0){
        a[i]=1;
           }
        else {
 a[i]=0;
        }
} //swaping elements
        for (int j = a.length - 1; j >= 0; j--) {

            System.out.print(a[j] + ",");
        }  // flipped array
    }
}