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
        atl.setMatricula( Long.valueOf(obj.get("Identificacao").toString()));
        atl.setNome( obj.get("Nome").toString() );
        atl.setSexo( Integer.valueOf(obj.get("Sexo").toString()) );
        atl.setCategoria( Integer.valueOf(obj.get("Categoria").toString()) );
        atl.setCurso( Integer.valueOf(obj.get("Curso").toString()) );
        atl.setAno_periodo( Integer.valueOf(obj.get("Ano_Periodo").toString()) );
        JSONArray aux = (JSONArray) obj.get("Modalidades");
        for (int j = 0; j < aux.size(); j++) {
            JSONObject obj2 = (JSONObject) aux.get(j);
            atl.setMod( obj2.get("Modalidade").toString() );
        }
        return atl;
    }
}
