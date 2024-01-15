package Exceptions;
import java.util.*;
public class calculator{
    static class InvalidInputException extends Exception{
        public String getMessage(){
            return "Invalid input";
        }
    }
    static class MaxInputException extends Exception{
        public String getMessage(){
            return "Invalid Limit Exceeded";
        }
    }
    static class MaxMultiplierException extends Exception{
        public String getMessage(){
            return "Invalid Limit Exceeded";
        }
    }
    public static void main(String[] args){
        Scanner scn  = new Scanner(System.in);
        String exp = scn.next();
        int a = scn.nextInt();
        int b = scn.nextInt();
        try{
            if(!(exp.equals("+"))){
                if(!(exp.equals("-"))){
                    if(!exp.equals("*")){
                        if(!exp.equals("/")){
                            throw new InvalidInputException();
                        }
                    }
                }
            }

        if(a > 100000 || b > 100000){
            throw new MaxInputException(); 
        }
        
        switch(exp){
            case "+" : System.out.println(a+b);
                        break;
            case "-" : System.out.println(a-b);
                        break;
            case "*" : if(a > 7000 || b > 7000)
                        throw new MaxMultiplierException();
                        System.out.println(a*b);
                        break;
            case "/" : System.out.println(a/b);
            default : System.out.println("wrong input");
                        break;
        }
    }catch(InvalidInputException e){
        System.out.println(e.getMessage());
    }catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }catch(MaxInputException e){
        System.out.println(e.getMessage());
    }catch(MaxMultiplierException e){
        System.out.println(e.getMessage());
    }
}
}