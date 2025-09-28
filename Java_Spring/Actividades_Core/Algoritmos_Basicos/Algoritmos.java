public class Algoritmos {
    public static void main(String[] args) {
        int numero = 5;
        int numeroFB = 30;
        String reverse = "Chao Mundo";
        String Palindromo = "anitalavalatina";
        System.out.println(esPar(numero));
        System.out.println(esPrimo(numero));
        System.out.println(reverseText(reverse));
        System.out.println(esPalindromo(Palindromo));
        secuenciaFizzBuzz(numeroFB);
    }
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static String reverseText(String reverse) {
        String resultado = "";
        for (int i = reverse.length() - 1; i >= 0; i--) {
            resultado += reverse.charAt(i);
        }
        return resultado;
    }
    public static String reversePalindromo(String Palindromo) {
        String reversePalindromo = "";
        for (int i = Palindromo.length() - 1; i >= 0; i--) {
            reversePalindromo += Palindromo.charAt(i);
        }
        return reversePalindromo;
    }
    public static boolean esPalindromo(String Palindromo) {
        return Palindromo.equals(reversePalindromo(Palindromo));
    }
    public static void secuenciaFizzBuzz(int numeroFB) {
        for (int i = 1; i <= numeroFB; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
