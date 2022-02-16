import java.util.Scanner;

public class A1E13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //definir variables
        double Radio;
        double Altura;
        double Volumen;
        double Volumen2;
        double PI = 3.1416;

        //pedir datos
        System.out.print("Ingrese el radio del cilindro: ");
        Radio = scanner.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        Altura = scanner.nextDouble();

        //hacer condicion para ver si los datos son diferentes a 0 y si son positivas
        if ((Radio > 0) && (Altura > 0)) {

            //hacer operacion 
            Volumen = PI * (Radio * Radio) * Altura;
            Volumen2 = (Radio * Radio) * Altura;

            System.out.println("El volumen del cilindro es de " + Volumen + " o: " + Volumen2 + "PI");

        } else {

            System.out.println("Se ingresaron valores negativos, ingresa valores positivos porfas B)");

        }
    }

}
