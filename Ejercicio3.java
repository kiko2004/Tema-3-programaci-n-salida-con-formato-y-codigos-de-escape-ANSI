public class Ejercicio3 {
    public static void main(String[] args) {
        int num = 9;
            //primer bucle, se ejecuta si i es menor o igual que num para ir aumentando los numeros de uno en uno
            for (int i = 1; i <= num; i++) {
           
          //segundo bucle para imprimir los numeros en el orden deseado
             for (int j = 1; j <= num - i; j++) 
                System.out.print("  ");
         //tercer bucle para imprimir espacios en blanco
            for (int k = 1; k <= i; k++) 
                System.out.print(k + " ");
            
            System.out.println();
        }
    }
}
