import java.util.Scanner;

import javax.swing.plaf.synth.SynthLookAndFeel;
public class roman{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int size=str.length();
        
        int count =0;
        int counti=0;
        int countv=0;
        int countx=0;
        int countl=0;
        int countc=0;
        int countd=0;
        int countm=0;
        for (int i=0; i<size; i++) {
            if(str.charAt(i)=='I'){
                counti=counti+1;
            }
            if(str.charAt(i)=='V'){
                countv=countv+5;
            }
             if(str.charAt(i)=='X'){
                countx=countx+10;
            }
              if(str.charAt(i)=='L'){
                countl=countl+50;
            }
              if(str.charAt(i)=='C'){
                countc=countc+100;
            }
              if(str.charAt(i)=='D'){
                countd=countd+500;
            }
              if(str.charAt(i)=='M'){
                countm=countm+1000;
            }
                        


    }
    count = counti + countx + countv + countc + countl + countd + countm;
    System.out.println("num="+count);
}
}