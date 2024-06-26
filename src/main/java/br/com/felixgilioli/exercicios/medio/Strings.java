package br.com.felixgilioli.exercicios.medio;

/**
 * Classe com métodos para trabalhar com Strings.
 */
public class Strings {

    private Strings() {}

    /**
     * Deve retornar a quantidade de letras maiúsculas que a string {@param str} contém.
     * @param str string.
     * @return inteiro informando a quantidade de letras maiúsculas.
     */
    public static int getQuantidadeLetrasMaiusculas(String str) {
        if (str == null) {return 0;}
        char[] arrayString = str.toCharArray();
        int soma = 0;

        for (char caracter : arrayString) {
            if (Character.isUpperCase(caracter)) {
                soma++;
            }
        }

        return soma;
    }

    /**
     * Deve retornar a quantidade de letras minúsculas que a string {@param str} contém.
     * @param str string.
     * @return inteiro informando a quantidade de letras minúsculas.
     */
    public static int getQuantidadeLetrasMinusculas(String str) {
        if (str == null) {return 0;}
        char[] arrayString = str.toCharArray();
        int soma = 0;

        for (char caracter : arrayString) {
            if (Character.isLowerCase(caracter)) {
                soma++;
            }
        }

        return soma;
    }

    /**
     * Deve retornar a quantidade de caracteres especiais(*, #, @, !, etc) que a string {@param str} contém.
     * @param str string.
     * @return inteiro informando a quantidade de caracteres especiais.
     */
    public static int getQuantidadeCaracteresEspeciais(String str) {
        if (str == null) {return 0;}
        char[] arrayString = str.toCharArray();
        int soma = 0;

        for (char caracter : arrayString) {
            if (!Character.isLetterOrDigit(caracter)) {
                soma++;
            }
        }

        return soma;
    }

}
