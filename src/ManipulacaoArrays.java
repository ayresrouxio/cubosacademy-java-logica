import java.util.Arrays;

public class ManipulacaoArrays {
    public static void main(String[] args) {
        int[] numeros = {12, 14, 18, 22, 26};

        System.out.println(numeros[2]);

        int[] numeros2 = new int[5];
        numeros2[1] = 2024;

        System.out.println(numeros2[1]);

        String[][] multidimensional = {
                {"Ayres", "Gabriel"},
                {"Luiza"},
                {"Adriano", "Juliano"}
        };

        System.out.println(Arrays.deepToString(multidimensional));
    }
}
