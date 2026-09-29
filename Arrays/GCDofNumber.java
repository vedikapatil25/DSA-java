import java.util.Scanner;

public class GCDofNumber {
    public static int euclideanGcd(int n1 , int n2) {
        while(n1>0 && n2>0){
            if(n1>n2){
                n1 = n1%n2;
            }
            else{
                n2 = n2%n1;
            
            }

         }
         if(n1==0){
            return n2;
         }
         else{
            return n1;

         }
    }
    public static void euclideanLcm(int a , int b){
        int res = (int)(a*b) / euclideanGcd(a, b);
        System.out.println("LCM of given numbers is : " + res);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n1 = sc.nextInt();
         int n2 = sc.nextInt();
         System.out.println("GCD of given numbers is : " + euclideanGcd(n1, n2));
         euclideanLcm(n1, n2);
         sc.close();
    }
}
