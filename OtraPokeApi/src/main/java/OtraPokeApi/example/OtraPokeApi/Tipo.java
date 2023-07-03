package OtraPokeApi.example.OtraPokeApi;

import com.google.gson.Gson;

public class Tipo
{
    private String name;
    private int id;

    public Tipo() {
    }

    public Tipo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String MostrarJson()
    {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
