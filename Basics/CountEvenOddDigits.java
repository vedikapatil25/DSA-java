package Basics;

import java.util.Scanner;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenCount = 0;
        int oddCount =  0;
        while(n>0){
            int lastDigit = n % 10;
            if(lastDigit % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            n = n/10;
        }
        System.out.println("Even digits are :" + evenCount + " Odd digits are :" + oddCount);
        sc.close();
    }
}
