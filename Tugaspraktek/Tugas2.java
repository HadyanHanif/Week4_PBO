import java.util.Scanner;

//Nama  = Ananda Hadyan Hanif
//NIM   = A11.2021.13486

public class Tugas2 {
    
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
            
    int a, b, c, D;
    double x1, x2;
        
    System.out.println("Format persamaan: ax^2 + bx + c = 0 ");
    System.out.print("Inputkan nilai A = ");
    a = input.nextInt();
    System.out.print("Inputkan nilai B = ");
    b = input.nextInt();
    System.out.print("Inputkan nilai C = ");
    c = input.nextInt();
        
    System.out.println();
        
    D = (b*b)-(4*a*c);
    System.out.print("Diskriminan = "+D);
        
    if (D>0){
        System.out.println(" (akar real dan berbeda)");
    
        x1 = (-b + Math.sqrt(D)) / (2*a);
        x2 = (-b - Math.sqrt(D)) / (2*a);
        
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
    }
    else if (D==0){
        System.out.println(" (akar real dan sama)");
    
        x1 = x2 = (-b + Math.sqrt(D)) / (2*a);
        
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
    }
    else {
        System.out.println(" (akar tidak real atau imajiner)");
    }  
    }
}
