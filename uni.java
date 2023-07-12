import java.util.Scanner;
public class uni {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int [] arr= new int[100];
             int ans=0;
             
              for (int i=0; i<n; i++){
                 arr[i] = sc.nextInt();
              }
              for (int j=0; j<n; j++){
                ans=ans^arr[j];
}
System.out.println(ans);
        }
    }
}
