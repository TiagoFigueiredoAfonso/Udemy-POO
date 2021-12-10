
package exe01SemObjeto;

import java.util.Scanner;


public class exe01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
                classEx01 x, y;
        x = new classEx01();
        y = new classEx01();
        
        System.out.println("X -> entre a, b , c:");
        x.a = leia.nextDouble();
        x.b = leia.nextDouble();
        x.c = leia.nextDouble();
        
        double areax = x.area();
        
        System.out.println("Y-> entre a, b , c:");
        y.a = leia.nextDouble();
        y.b = leia.nextDouble();
        y.c = leia.nextDouble();
        
         
        double areay = y.area();
        
        System.out.printf("Triangle X area: %.4f%n" ,  areax);
        System.out.printf("Triangle Y area: %.4f%n" , areay);
        
        if(areax > areay) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
    }
}
