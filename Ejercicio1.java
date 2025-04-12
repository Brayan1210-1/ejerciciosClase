import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        //Definimos  los números que vamos a pedir
         double num2;
         double num1;
         //mostramos al usuario un mensaje
         System.out.print(" Ingrese un numero: ");
         //hacemos que el usuario digite el valor de los números
        Scanner num = new Scanner(System.in);
         num1 = num.nextInt();
        
        System.out.print(" Ingrese un numero: ");
        
        Scanner numero = new Scanner(System.in);
        num2 = numero.nextInt();
        //mostramos el resultado en cada operación
        System.out.println(" El resultado de la suma es:"+ (num1+num2));
        System.out.println(" El resultado de la multiplicacion es:" + (num1*num2));
        System.out.println(" El resultado de la resta es:" + (num1-num2));
        System.out.println(" El resultado del modulo es:" + (num1%num2));
        System.out.println(" El resultado de la division es:" + (num1/num2));
        
    }
}
