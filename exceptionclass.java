package Exceptions;
import java.util.Scanner;
public class exceptionclass {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if(a<9){
            try{
                throw new Exceptiontrial();
            }catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
class Exceptiontrial extends Exception{
    public String getMessage(){
        return super.getMessage() + " hey I am get message";
    }
    public String toString(){
        return super.toString() + " I am to string";
    }
    public void printStackTrace(){
         super.printStackTrace();
    }
   
}

