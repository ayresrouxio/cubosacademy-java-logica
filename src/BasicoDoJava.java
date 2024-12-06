public class BasicoDoJava {
    public static void main(String[] args) {
        String texto = "Ayres Roux";
        final String ESCOLA = "Cubos Academy";
        int ano = 2024;
        double versao = 1.0;
        boolean isAprovado = true;
        int mesNascimento = 7;
        boolean isAtivo = true;
        String mensagemAtivo;

        System.out.println(texto);
        System.out.println(ESCOLA);
        System.out.println(ano);
        System.out.println(versao);
        System.out.println(isAprovado);

        if (isAprovado) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        switch (mesNascimento) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            default:
                System.out.println("Mês não implementado");
                break;
        }

        mensagemAtivo = isAtivo ? "Conta Ativa" : "Conta Desativada";

        System.out.println(mensagemAtivo);
    }
}