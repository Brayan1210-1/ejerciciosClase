import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Definimos las variables del nombre, correo y edad
        String nombre;
        String correo;
        int edad;
        //le pedimos al usuario que ingrese el nombre y se guarda en la variable "nombre"
        System.out.println(" Ingrese su nombre ");
        Scanner pedirN = new Scanner(System.in);
        nombre = pedirN.nextLine();
        //le pedimos al usuario que ingrese su edad y se guarda en la variable "edad"
        System.out.println(" ingrese su edad ");
        Scanner pedirE = new Scanner(System.in);
        edad = pedirE.nextInt();
        
        //le pedimos al usuario que ingrese el correo y se guarda en la variable "correo"
        System.out.println(" ingrese su correo electrónico");
        Scanner pedirC = new Scanner(System.in);
        correo = pedirC.nextLine();
        //escribimos un espacio para que se vea mejor
        System.out.println("");
        //se muestra los datos ingresados por el usuario
        System.out.println(" Su nombre es: "+ nombre);
        System.out.println(" Su edad es: "+ edad);
        System.out.println(" Su correo es: "+ correo);
    }
}
