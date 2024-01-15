package Exceptions;

class NegativeRadiusException extends Exception{
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "you have entered a negative radius";
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    @Override
    public void printStackTrace() {
        // TODO Auto-generated method stub
        super.printStackTrace();
    }
}
public class thows{
    static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
    static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        return 3.14 * r * r;
    }
    public static void main(String[] args){
        // int ans = divide(6,0);
        try{
            double ar = area(-2);
        }catch(NegativeRadiusException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
                        e.printStackTrace();
        }
    }
}
