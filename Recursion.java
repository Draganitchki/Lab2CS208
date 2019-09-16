/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author s_draganitchki
 */
public class Recursion {
    static int rev = 0; 
    static int base_pos = 1; 
    //place holder
    static int reversDigits(int num) 
    { 
        if( num == 0){
            return rev;
        }
        else{
            reversDigits(num / 10);
            rev += (num%10) * base_pos;
            base_pos *=10;
            return rev;
        }
    }
    
    public static String asterisk(int size){
        String a = "*";
        if( size == 0){
            return " ";
        }
        else
        {
            asterisk(size-1);
            a +=size;
            return a;
        }
    }
    
    public static String palindrome(String a){
        String rev = "";
        
    }
}

