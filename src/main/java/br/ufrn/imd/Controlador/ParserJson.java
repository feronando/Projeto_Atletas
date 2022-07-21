package br.ufrn.imd.Controlador;

import br.ufrn.imd.Modelos.Atleta;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

public class ParserJson {
    public ArrayList<Atleta> parserAll(){
        JSONArray lista;
        JSONParser parser = new JSONParser();
        try {
            Reader reader = new FileReader("src/main/resources/Database.json");
            lista = (JSONArray) parser.parse(reader);
        } catch (Exception e) {
            lista = new JSONArray();
        }
        ArrayList<Atleta> atl = new ArrayList<Atleta>();
        lista.forEach( x -> { atl.add(parseAtleta((JSONObject) x)); } );
        return atl;
    }

    private Atleta parseAtleta(JSONObject obj) {
        Atleta atl = new Atleta();
        atl.setMatricula( (long) obj.get("Identificação") );
        atl.setNome( (String) obj.get("Nome") );
        atl.setSexo( (int) obj.get("Sexo") );
        atl.setCategoria( (int) obj.get("Categoria") );
        atl.setCurso( (int) obj.get("Curso") );
        atl.setAno_periodo( (int) obj.get("Ano_Periodo"));
        JSONArray aux = (JSONArray) obj.get("Modalidades");
        for (int j = 0; j < aux.size(); j++) {
            JSONObject obj2 = (JSONObject) aux.get(j);
            atl.setMod( (String) obj2.get("Modalidade") );
        }
        return atl;
    }
}
