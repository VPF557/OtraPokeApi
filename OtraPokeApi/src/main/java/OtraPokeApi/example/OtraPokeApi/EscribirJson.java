package OtraPokeApi.example.OtraPokeApi;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EscribirJson {
    static void escribirJsonPokemon(ArrayList<Pokemon> listaPokemons)
    {

        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("Pokemons.json")) {
            gson.toJson(listaPokemons, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void escribirJsonPeticiones(ArrayList<Parametro> listaParams)
    {
        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("Peticiones.json")) {
            gson.toJson(listaParams, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void escribirJsonTipos(ArrayList<Tipo> listaTipos)
    {

        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("Tipos.json")) {
            gson.toJson(listaTipos, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
