package Exceptions;
import java.util.*;
public class Array{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = scn.nextInt();
        }
        try{
            int idx = scn.nextInt();
            System.out.println(array[idx]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}