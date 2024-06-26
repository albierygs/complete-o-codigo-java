package br.com.felixgilioli.exercicios.medio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Métodos utilitários para trabalhar com JSON.
 */
public class Jsons {

    private Jsons() {}

    /**
     * Deve converter um objeto para json usando a biblioteca {@link com.google.gson.Gson}.
     * @param obj objeto.
     * @throws NullPointerException caso o {@param obj} seja nulo. mensagem retornada deve ser "obj é obrigatório.".
     * @return json.
     */
    public static String toGson(Object obj) {
        if (obj == null) {
            throw new NullPointerException("obj é obrigatório.");
        }

        Gson gson = new GsonBuilder().create();

        String json = gson.toJson(obj);

        return json;
    }

}
