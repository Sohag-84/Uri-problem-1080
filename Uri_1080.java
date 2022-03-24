
import java.util.Scanner;

public class Uri_1080 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int pos=0;
   int num[] = new int[100];
   int max = num[0];
      for (int i = 0; i < 5; i++) {
          num[i] = sc.nextInt();
      }
      for (int i = 0; i < 5; i++) {
          if(max<num[i]){
              max = num[i];
              pos = i;
          }
      }
      System.out.println(max);
      System.out.println(pos+1);
}
  
}
