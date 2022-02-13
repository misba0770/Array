
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misba zaidi
 */
public class complexNumberMultiply {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s=new Scanner(System.in);
        String num1=s.next();
        String num2=s.next();
        //num1=a+bi
        //num2=c+di
        //res=(a*c)-(b*d)+(a*d)+(c*d)i
        int a=Integer.parseInt(num1.substring(0,num1.indexOf('+')));
        int b=Integer.parseInt(num1.substring(num1.indexOf('+')+1,num1.length()-1));
        int c=Integer.parseInt(num1.substring(0,num2.indexOf('+')));
        int d=Integer.parseInt(num1.substring(num2.indexOf('+')+1,num2.length()-1));
        System.out.print(((a*c)-(b*d))+"+"+((a*d)+(c*b))+"i");
    }
    
}
