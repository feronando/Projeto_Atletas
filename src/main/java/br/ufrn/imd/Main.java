package br.ufrn.imd;
import br.ufrn.imd.Controlador.AtletaController;
import br.ufrn.imd.Modelos.Atleta;
import br.ufrn.imd.Dao.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtletaController con = new AtletaController();
        Scanner input = new Scanner( System.in );
        int op;

        do{
            Menu menu = new Menu();
            menu.MenuPrincipal();
            op = input.nextInt();

            switch (op){
                case 1:
                    //adicionar um atleta
                    Atleta atleta = new Atleta();
                    System.out.println("Insira a matricula do novo atleta: ");
                    atleta.setMatricula(input.nextInt());

                    System.out.println("Insira o nome do novo atleta: ");
                    atleta.setNome(input.nextLine());

                    menu.MenuSexo();
                    atleta.setSexo(menu.LerSexo());

                    menu.MenuCategoria();
                    atleta.setCategoria(menu.LerCategoria());

                    menu.MenuCurso();
                    atleta.setCurso(menu.LerCurso());

                    System.out.println("Insira o ano do novo atleta: ");
                    atleta.setAno_periodo(input.nextInt());

                    menu.MenuModalidade();
                    System.out.println("Quantas modalidades deseja inserir? ");
                    int num = input.nextInt();
                    for(int i=0; i< num; i++){
                        atleta.setMod(input.nextLine());
                    }
                    
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
            }


        }while(op != 5);

    }
}
