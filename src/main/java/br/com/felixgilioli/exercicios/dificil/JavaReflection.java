package br.com.felixgilioli.exercicios.dificil;

import java.lang.reflect.Field;
import java.util.*;

/**
 * Classe com exercícios sobre java reflection.
 */
public class JavaReflection {

    private JavaReflection() {}

    /**
     * Deve retornar o nome dos atributos do objeto {@param objeto}.
     * obs: os nomes devem ser retornados em ordem alfabetica.
     * @return lista com nome dos atributos.
     */
    public static List<String> getNomeDosAtributosDoObjeto(Object objeto) {
        Set<String> atributos = new TreeSet<>();

        if (objeto == null) {
            return new ArrayList<>(atributos);
        }
        Class<?> objetoClasse = objeto.getClass();

        for (Field atributo : objetoClasse.getDeclaredFields()) {
            atributos.add(atributo.getName());
        }

        return new ArrayList<>(atributos);
    }

}
