package Exceptions;
import java.util.*;
public class exceptions{
    static class Exceptionretry extends Exception{
        public String getMessage(){
            return "more than 5 times";
        }
    }
    static void array() throws Exceptionretry(){
        
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        // System.out.println("hi");
        // try{
        //     int a = 666/0;
        //     System.out.println(a);
        // }catch(IllegalArgumentException e){
        //     System.out.println("haha");
        // }catch(ArithmeticException e){
        //     System.out.println("haha");
        // }
        int[] marks = new int[3];
        marks[0] = 0;
        marks[1] = 1;
        marks[2] = 2;
        int i = 0;
        boolean flag = true;
        while(flag && i<5){
            try{
                int index = scn.nextInt();
                System.out.println(marks[index]);
                flag = false;
                break;
            }catch(IndexOutOfBoundsException e){
                System.out.println("INVALID");
                i++;
            }
        }
        if(flag){
            try{
                throw new Exceptionretry();
            }catch(Exceptionretry e){
                System.out.println(e.getMessage() + " Limits Exceeded");
            }
        }else{
            System.out.println("Printed");
        }
    }
}