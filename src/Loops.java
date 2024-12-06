public class Loops {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("-------------");

        // foreach
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("-------------");

        int i = 0;
        while (i < numeros.length) {
            System.out.println(numeros[i]);
            i++;
        }

        System.out.println("-------------");

        int c = 0;
        do {
            System.out.println(numeros[c]);
            c++;
        } while (c < numeros.length);
    }
}
