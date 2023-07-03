package OtraPokeApi.example.OtraPokeApi;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DataHandingTest
{
    @Test
    void contextLoads() {
    }
    @org.junit.Test
    public void buscarObjeto()
    {
        //Comprobamos si un objeto se ha añadido correctamente
        Parametro paramN = new Parametro("type" , "5");
        LeerJson reader = new LeerJson();
        ArrayList<Parametro> listaORG = reader.LeerFicheroPeticiones("Peticiones.json");
        DataHanding data = new DataHanding();

        ArrayList<Parametro> listaNuev = reader.LeerFicheroPeticiones("Peticiones.json");
        listaNuev.add(paramN);

        if(listaNuev.size() == listaORG.size())
        {
            fail("No se ha añadido correctamente");
        }
        {
            assertTrue(true);
        }

    }

}