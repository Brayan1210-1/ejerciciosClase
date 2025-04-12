import java.util.Scanner;
public class Ejercicio3 {
    
    public static void main(String[] args) {
        int figuraP;
        //Se muestra el menú al ususrio y se le pide un número
       do  {
         System.out.println(" Escoge la figura de la que quieres saber el area: ");
         System.out.println(" 1. Triangulo ");
         System.out.println(" 2. Rectangulo ");
         System.out.println(" 3. Circulo ");
          Scanner figura = new Scanner(System.in);
         figuraP = figura.nextInt();
         //Si los números que ingresa no están en el menú, este se repetirá
         } while (figuraP <1 || figuraP > 3);
       //Se abre un segun para los números ingresadsos
       switch (figuraP){
           //caso para el triángulo o 1
           case 1:
           System.out.println(" Has escogido el triangulo, digite la base ");
           Scanner baseT = new Scanner(System.in);
           double base = baseT.nextDouble();
           System.out.println(" Ingrese la altura ");
           Scanner alturaT = new Scanner(System.in);
           Double altura = alturaT.nextDouble();
            System.out.println(" el area del triangulo es de: "+ (base*altura)/2);
           break;
           //caso para el rectangulo o 2
           case 2:
             System.out.println(" Has escogido el rectangulo, digite la base");
             Scanner baseR = new Scanner(System.in);
             double baseRec = baseR.nextDouble();
             System.out.println(" ingrese la altura del rectangulo");
             Scanner alturaR = new Scanner(System.in);
             double alturaRec = alturaR.nextDouble();
             System.out.println(" El area del rectangulo es: "+ baseRec*alturaRec);
             break;
             //caso para el círculo o 3
            case 3: 
                double pi = 3.14159265359;
                System.out.println(" Has escogido el circulo, digite el radio");
                Scanner radioo = new Scanner(System.in);
                Double radio = radioo.nextDouble();
                System.out.println(" El area del circulo es: "+ (radio*radio) * pi);
             break;
       }
    }
}
