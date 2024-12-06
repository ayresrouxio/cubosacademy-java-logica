public class ManipulacaoStrings {
    public static void main(String[] args) {
        String nome = "Ayres Roux";
        int idade = 31;

        System.out.println("Manipulação de Strings:");

        String idadeString = String.valueOf(idade);
        System.out.println(idadeString);

        char primeiraLetraNome = nome.charAt(0);
        System.out.println(primeiraLetraNome);

        String comecaComAy = nome.startsWith("Ay") ? "Sim" : "Não";
        System.out.println(comecaComAy);

        String terminaComEs = nome.endsWith("es") ? "Sim" : "Não";
        System.out.println(terminaComEs);

        int tamanhoDoNome = nome.length();
        System.out.println(tamanhoDoNome);

        String fraseComEspacosNoInicioEFinal = " Olá Mundo!   ";
        String fraseSemEspacosNoInicioEFinal = fraseComEspacosNoInicioEFinal.trim();
        System.out.println(fraseSemEspacosNoInicioEFinal);

        String nomeEmLowerCase = nome.toLowerCase();
        System.out.println(nomeEmLowerCase);

        String nomeEmUpperCase = nome.toUpperCase();
        System.out.println(nomeEmUpperCase);

        int indiceLetraYNome = nome.indexOf("y");
        System.out.println(indiceLetraYNome);

        int ultimoIndiceLetraNome = nome.lastIndexOf("o");
        System.out.println(ultimoIndiceLetraNome);

        String trocaRouxPorJunior = nome.replace("Roux", "Junior");
        System.out.println(trocaRouxPorJunior);

        String extraiPrimeiroNome = nome.substring(0, 5);
        System.out.println(extraiPrimeiroNome);

        int ultimoEspacoEmBranco = nome.lastIndexOf(" ");
        String ultimoNome = nome.substring(ultimoEspacoEmBranco + 1);
        System.out.println(ultimoNome);
    }
}
