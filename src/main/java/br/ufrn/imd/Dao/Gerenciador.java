package br.ufrn.imd;

import Enum.*;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.Reader;

public class Gerenciador {
    JSONArray lista;

    public Gerenciador() {
        if (lista == null) {
            JSONParser parser = new JSONParser();
            try {
                Reader reader = new FileReader("src/main/resources/Database.json");
                lista = (JSONArray) parser.parse(reader);
            } catch (Exception e) {
                lista = new JSONArray();
            }
        }
    }

    public boolean adicionar(Atleta atl) {
        if (!buscar(atl.getMatricula())) {
            JSONObject obj = new JSONObject();
            obj.put("Identificação", atl.getMatricula());
            obj.put("Nome", atl.getNome());
            obj.put("Sexo", atl.getSexo().getCod());
            obj.put("Categoria", atl.getCategoria().getCategoria());
            if (atl.getCategoria() == Categoria.Servidor) {
                obj.put("Curso", Curso.Sem_Curso.getCod());
                obj.put("Ano/Periodo", 0);
            } else {
                obj.put("Curso", atl.getCurso().getCod());
                obj.put("Ano/Periodo", atl.getAno_periodo());
            }
            JSONArray aux = new JSONArray();
            for (var i : atl.getMod()) {
                JSONObject obj2 = new JSONObject();
                obj2.put("Modalidade", i.getNome());
                obj2.put("Tipo", i.getTipo().getCod());
                aux.add(obj2);
            }
            obj.put("Modalidades", aux);
            lista.add(obj);
            return true;
        }
        return false;
    }

    public boolean remover(long mat) {
        if (buscar(mat)) {
            for (int i = 0; i < lista.size(); i++) {
                JSONObject obj = (JSONObject) lista.get(i);
                if(((long) obj.get("Identificação")) == mat) {
                    lista.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    /*public boolean buscar(Atleta atl) {
        for (int i = 0; i < lista.size(); i++) {
            JSONObject obj = (JSONObject) lista.get(i);
            if(((long) obj.get("Identificação")) == atl.getMatricula()) return true;
        }
        return false;
    }*/

    public boolean buscar(long mat) {
        for (int i = 0; i < lista.size(); i++) {
            JSONObject obj = (JSONObject) lista.get(i);
            if(((long) obj.get("Identificação")) == mat) return true;
        }
        return false;
    }

    public void listarAtleta(int mat) {
        if (buscar(mat)) {
            for (int i = 0; i < lista.size(); i++) {
                JSONObject obj = (JSONObject) lista.get(i);
                if(((long) obj.get("Identificação")) == mat) {
                    System.out.println(obj);
                    return;
                }
            }
        }
        System.out.println("Erro: não existe atleta cadastrado com o número de identificação fornecido!!!");
    }

    public ArrayList<Atleta> listar() {
        ArrayList<Atleta> listagem = new ArrayList<Atleta>();
        for (int i = 0; i < lista.size(); i++) {
            JSONObject obj = (JSONObject) lista.get(i);
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
            listagem.add(atl);
        }
        return listagem;
    }
}
