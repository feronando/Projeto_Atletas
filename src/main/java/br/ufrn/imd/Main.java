package br.ufrn.imd;
import br.ufrn.imd.Controlador.AtletaController;
import br.ufrn.imd.Modelos.Atleta;
import br.ufrn.imd.Dao.Menu;

import java.util.Scanner;

//https://mkyong.com/java/json-simple-example-read-and-write-json/
public class Main {
    public static void main(String[] args) {
        AtletaController con = new AtletaController();
        Scanner input = new Scanner( System.in );
        int op;

        do{
            System.out.println("\nEscolha a opção desejada: ");
            System.out.println("\t1 - Adicionar um atleta");
            System.out.println("\t2 - Excluir um atleta");
            System.out.println("\t3 - Visualizar lista de atletas");
            System.out.println("\t4 - Visualizar um atleta");
            System.out.println("\t5 - Editar um atleta");
            op = input.nextInt();

            switch (op)
            case 1:
                //adicionar um atleta
                Atleta atleta = new Atleta();
                System.out.println("Insira a matricula do novo atleta: ");
                System.out.println("Insira o nome do novo atleta: ");
                Menu menu = new Menu();
                menu.MenuSexo();

                System.out.println("Insira a categoria do novo atleta: ");
                System.out.println("Insira o curso do novo atleta: ");
                System.out.println("Insira o ano do novo atleta: ");
                System.out.println("Insira as modalidades do novo atleta: ");
                break;
            case 2:
                //excluir um atleta
                break;
            case 3:
                //visualizar lista de atletas
                break;
            case 4:
                //visualizar um atleta
                break;
            case 5:
                //editar um atleta
                break;


        }while(op != 5);

    }
}
