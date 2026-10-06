package Basics;

import java.util.Scanner;

public class DuplicatecharinaString {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String s = sc.next();
         boolean duplicate= false;
         for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            for(int  j=i+1; j<s.length();j++){
                if(ch == s.charAt(j)){
                    duplicate = true;
                    break;
                }
            }
            if(duplicate){
                break;
            }
        }
            if(duplicate){
                System.out.println("given string has duplicate character");
            }
            else{
                System.out.println("given string has not duplicate character");
            }
         
    }
}
