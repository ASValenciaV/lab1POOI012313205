import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //ejercicio 5
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7 para obtener el día de la semana: ");

        int numero = sc.nextInt();
        String diaSemana;
        switch (numero) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Número fuera de rango (debe ser del 1 al 7)";
                break;
        }
        System.out.println("Día de la semana: " + diaSemana);
        sc.close();
    }
}
//Respuesta: Introduce un número del 1 al 7 para obtener el día de la semana: 5
//Día de la semana: Viernes
