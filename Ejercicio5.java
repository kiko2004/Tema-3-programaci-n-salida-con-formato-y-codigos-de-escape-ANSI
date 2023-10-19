public class Ejercicio5 {
    public static void main(String[] args) {
        int num = 9;
        String[] colores = {
            "\u001B[30m", 
            "\u001B[31m", 
            "\u001B[32m", 
            "\u001B[33m", 
            "\u001B[34m", 
            "\u001B[35m", 
            "\u001B[36m", 
            "\u001B[37m", 
            "\u001B[30m"  
        };

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) 
                System.out.print("  ");
            
            for (int k = 1; k <= i; k++) 
                System.out.print(colores[k - 1] + k + " " + "\u001B[0m"); 
            
            System.out.println();
        }
    }
}