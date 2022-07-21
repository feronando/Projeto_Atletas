package br.ufrn.imd.Controlador;

import br.ufrn.imd.Enum.Categoria;
import br.ufrn.imd.Enum.Curso;
import br.ufrn.imd.Modelos.Atleta;
import java.io.FileWriter;

import br.ufrn.imd.Dao.AtletaDao;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AtletaController implements Controller<Atleta> {

    AtletaDao dao;

    public AtletaController() {
        ParserJson parse = new ParserJson();
        this.dao = new AtletaDao( parse.parserAll() );
    }

    public void index() {
        if (!dao.getAll().isEmpty()) {
            JSONArray lista = new JSONArray();
            for( Atleta atl : dao.getAll() ) {
                JSONObject obj = atletaToJson(atl);
                lista.add(obj);
            }
            try {
                FileWriter file = new FileWriter("src/main/resources/Database.json");
                file.write(lista.toJSONString());
                file.close();
                System.out.println("Foi gerado um arquivo contendo todos os atlestas salvos!!");
                System.out.println(lista);
            } catch (Exception e) {
                System.out.println("Erro: não foi possível gerar arquivo 'Database.json'!");
            }
        } else
            System.out.println("Erro: não existem atletas salvos no sistema!");
    }

    public JSONObject atletaToJson(Atleta A) {
        JSONObject obj = new JSONObject();
        obj.put("Identificacao", A.getMatricula());
        obj.put("Nome", A.getNome());
        obj.put("Sexo", A.getSexo().getCod());
        obj.put("Categoria", A.getCategoria().getCategoria());
        if (A.getCategoria() == Categoria.Servidor) {
            obj.put("Curso", Curso.Sem_Curso.getCod());
            obj.put("Ano_Periodo", 0);
        } else {
            obj.put("Curso", A.getCurso().getCod());
            obj.put("Ano_Periodo", A.getAno_periodo());
        }
        JSONArray aux = new JSONArray();
        for (var i : A.getMod()) {
            JSONObject obj2 = new JSONObject();
            obj2.put("Modalidade", i.getNome());
            obj2.put("Tipo", i.getTipo().getCod());
            aux.add(obj2);
        }
        obj.put("Modalidades", aux);
        return obj;
    }

    public void create(Atleta atleta) {
        if (dao.get(atleta.getMatricula()) != null) {
            System.out.println("Erro: já existe atleta salvo no sistema com a matrícula fornecida!");
            return;
        }
        dao.save(atleta);
        if(dao.get(atleta.getMatricula()) != null) {
            JSONObject obj = atletaToJson(atleta);
            System.out.println("O atleta adicionado com sucesso!!!");
            System.out.println(obj);
        } else
            System.out.println("Erro: não foi possível salvar o atleta fornecido no sistema!");
    }

    public void show(long id) {
        Atleta atl = dao.get(id);
        if(atl != null) {
            JSONObject obj = atletaToJson(atl);
            System.out.println("O atleta foi encontrado!!!");
            System.out.println(obj);
        } else
            System.out.println("Erro: não existe atleta no sistema com a matrícula fornecida!");
    }

    public void edit(Atleta atleta) {
        if(dao.get(atleta.getMatricula()) != null) {
            dao.update(atleta);
            JSONObject obj = atletaToJson(atleta);
            System.out.println("O atleta foi editado com sucesso!!!");
            System.out.println(obj);
        } else
            System.out.println("Erro: não existe atleta no sistema com a matrícula fornecida!");
    }

    public void delete(long id) {
        if(dao.get(id) != null) {
            Atleta atl = dao.get(id);
            dao.delete(id);
            if(dao.get(id) == null) {
                JSONObject obj = atletaToJson(atl);
                System.out.println("O atleta foi removido com sucesso!!!");
                System.out.println(obj);
            } else
                System.out.println("Erro: não foi possível remover o atleta do sistema!");
        } else
            System.out.println("Erro: não existe atleta no sistema com a matrícula fornecida!");
    }

}