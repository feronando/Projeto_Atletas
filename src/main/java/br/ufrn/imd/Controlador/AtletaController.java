package br.ufrn.imd.Controlador;

import br.ufrn.imd.Atleta;

import java.util.ArrayList;

import br.ufrn.imd.Dao.AtletaDao;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.Reader;

public class AtletaController implements Controller<Atleta> {

    AtletaDao dao;


    public void index() {
        // TODO: Listar todos os atletas

        // TODO: Retornar para o usuário um JSON contendo todos o usuários
        return;
    }

    public void create(Atleta atleta) {
        // TODO: Criar o atleta utilizando o modelo atleta caso ele não exista

        // TODO: Retornar para o usuário um JSON contendo apenas o usuário criado
    }

    public void show(long id, Atleta atleta) {
        // TODO: Mostrar apenas um usuário caso ele exista

        // TODO: Retornar o usuário um JSON contendo apenas o usuário encontrado
    }

    public void edit(long id, Atleta atleta) {
        // TODO: Editar o usuário com id igual ao informado pelo usuário

        // TODO: Retornar o usuário um JSON contendo o usuário editado com os dados do usuário

    }

    public void delete(long id, Atleta atleta) {
        // TODO: Remover o usuário com o id igual ao informado pelo usuário

        // TODO: Retonar um json informando que foi excluido com sucesso
    }

}