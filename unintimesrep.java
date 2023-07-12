import java.util.Scanner;
public class unintimesrep {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int [] arr= new int[100];
            for (int i=0; i<n; i++){
                 arr[i] = sc.nextInt();
              }
            int k=sc.nextInt();  //number of repeating
             int ans=0;
              for (int j=0; j<n; j++){
                ans=ans+arr[j];
        
}
ans=ans%k;
System.out.println(ans);
        }
    }
}