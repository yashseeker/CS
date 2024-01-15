package Exceptions;
import java.util.Scanner;

public class CalculatorSimulator {
    public static void main(String[] args) throws Exception{
        // input mang
        Scanner scn = new Scanner((System.in));
        String empName = scn.nextLine();
        double empSal = scn.nextInt();
        boolean isIndian = scn.nextBoolean();
        
        // double taxAmount = scn.nextInt(); // empname , isIndian , sal , taxamount 

        try{
            System.out.println("Tax amount is:"+ TaxCalculator.calculateTax(empName,isIndian,empSal)); 
        }catch(EmployeeNameInvalidException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(CountryNotValidException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(TaxNotEligibleException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

class EmployeeNameInvalidException extends Exception{
    public String getMessage(){
        return "The employee name cannot be empty";
    }
}
class CountryNotValidException extends Exception{
    public String getMessage(){
        return "The employee should be an Indian citizen for calculating tax";
    }
}
class TaxNotEligibleException extends Exception{
    public String getMessage(){
        return "The employee does not need to pay tax";
    }
}
class TaxCalculator{
    
    static double calculateTax(String empName,boolean isIndian,double empSal) throws Exception{
        if(empName == null || 
        empName.isEmpty()){ // null vala bhi 
            throw new EmployeeNameInvalidException();
        }
        if(!isIndian){
            throw new CountryNotValidException();
        }else if(empSal>100000){
            return empSal * 8/100;
        }else if(empSal > 50000){
            return empSal * 6/100;
        }else if(empSal>30000){
            return empSal * 5/100;
        }else if(empSal > 10000){
            return empSal * 4/100;
        }else{
            throw new TaxNotEligibleException();
        }
    }
}
//  सीम कि चाप सकइ कोउ तासू । बड़ रखवार रमापति जासू ।।
 

// Test Case 1 
// Ron 34000 False 
// The employee should be an Indian citizen for calculating tax. 
// Test Case 2 
// Tim 1000 True 
// The employee does not need to pay tax 
// Test Case 3 
// Jack 55000 True 
// Tax amount is 3300 
// Test Case 4 
//  30000 True The employee name cannot be empty.

