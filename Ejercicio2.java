import java.util.Scanner;
    public class Ejercicio2{
        public static void main(String[] args){
            Scanner Scanner = new Scanner(System.in);
            int num;

            System.out.println("introduce una cantidad de horas");
            int horas = Scanner.nextInt();
            System.out.println("introduce una cantidad de minutos");
            int minutos = Scanner.nextInt();
            System.out.println("introduce una cantidad de segundos");
            int segundos = Scanner.nextInt();


            System.out.printf("La hora es: %02d:%02d:%02d%n", horas, minutos, segundos);
  


        }






    }