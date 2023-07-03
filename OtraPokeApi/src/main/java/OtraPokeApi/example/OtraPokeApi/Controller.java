package OtraPokeApi.example.OtraPokeApi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {

    LeerJson reader = new LeerJson();
    DataHanding data = new DataHanding();
    EscribirJson writter = new EscribirJson();

    @GetMapping("/registro")
    public ArrayList<Parametro> listaObjeto1()
    {
        //Leemos el reason e introducimos los elementos en un arraylist
        ArrayList<Parametro> listaPeticiones = reader.LeerFicheroPeticiones("Peticiones.json");
        //Mostramos los elementos leido
        return listaPeticiones;
    }

    @GetMapping("/registroP")
    public ArrayList<Pokemon> listaPlanets()
    {
        //Leemos el reason e introducimos los elementos en un arraylist
        ArrayList<Pokemon> listaPlanets = reader.LeerFicheroPokemons("Pokemons.json");
        //Mostramos los elementos leidos
        return listaPlanets;
    }

    @PostMapping("/peticion")
    public void mandarElemento(@RequestBody Parametro objeto1)
    {
        //Hecho
        ArrayList<Pokemon> listaPlanets = reader.LeerFicheroPokemons("Pokemons.json");
        ArrayList<Parametro> listaPeticiones = reader.LeerFicheroPeticiones("Peticiones.json");
        ArrayList<Tipo> listaTipos = reader.LeerFicheroTipos("Tipos.json");

        if(objeto1.getParameter1().equals("type"))
        {
            Tipo tipo = new Tipo();
            tipo = data.obtenerTipos(objeto1);
            listaTipos.add(tipo);
            writter.escribirJsonTipos(listaTipos);

        }
        else
        {
            Pokemon pokemon = new Pokemon();
            pokemon = data.obtenerPokemons(objeto1);
            listaPlanets.add(pokemon);
            writter.escribirJsonPokemon(listaPlanets);

        }

        listaPeticiones.add(objeto1);
        writter.escribirJsonPeticiones(listaPeticiones);
    }

    @DeleteMapping("/Borrar{parameter1}{parameter2}")
    public ArrayList<Parametro> borrarParam(@RequestParam String parameter1,@RequestParam String parameter2 )
    {
        ArrayList<Parametro>  lista = data.buscarObjeto(parameter1,parameter2,"Peticiones.json");
        EscribirJson escribirJSON = new EscribirJson();
        writter.escribirJsonPeticiones(lista);

        return lista;

    }
}
