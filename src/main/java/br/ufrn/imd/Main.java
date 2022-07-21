package br.ufrn.imd;
import br.ufrn.imd.Controlador.AtletaController;
import br.ufrn.imd.Enum.Categoria;
import br.ufrn.imd.Enum.Curso;
import br.ufrn.imd.Modelos.Atleta;
import br.ufrn.imd.View.Menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtletaController con = new AtletaController();
        String op;
        int opInt = 0;
        Menu menu = new Menu();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        do{
            menu.MenuPrincipal();
            try {
                op = br.readLine();
                opInt = Integer.parseInt(op);
                switch (opInt) {
                    case 1:
                        Atleta atleta = new Atleta();
                        System.out.println("Insira a matricula do novo atleta: ");
                        String matricula = br.readLine();
                        try {
                            atleta.setMatricula(Long.parseLong(matricula));
                        } catch( Exception e ){
                            System.out.println("Matrícula inserida é inválida :(");
                            continue;
                        }

                        System.out.println("Insira o nome do novo atleta: ");
                        atleta.setNome(br.readLine());

                        menu.MenuSexo();
                        int test = menu.LerSexo();
                        if (test == -1) {
                            System.out.println("deu ruim");
                            continue;
                        } else
                            atleta.setSexo(test);

                        menu.MenuCategoria();
                        int test2 = menu.LerCategoria();
                        if (test2 == -1) {
                            System.out.println("deu ruim");
                            continue;
                        } else
                            atleta.setCategoria(test2);

                        if (atleta.getCategoria() == Categoria.Servidor) {
                            atleta.setCurso(Curso.Sem_Curso.getCod());
                            atleta.setAno_periodo(0);
                        } else {
                            menu.MenuCurso();
                            int test3 = menu.LerCurso();
                            if (test3 == -1) {
                                System.out.println("deu ruim");
                                continue;
                            } else
                                atleta.setCurso(test3);

                            System.out.println("Insira o ano/período do novo atleta: ");
                            String ano = br.readLine();
                            try {
                                atleta.setAno_periodo(Integer.parseInt(ano));
                            } catch( Exception e ){
                                System.out.println("Ano/período inserida é inválida :(");
                                continue;
                            }
                        }
                        menu.MenuModalidade();
                        System.out.println("Quantas modalidades deseja inserir? ");
                        String num = br.readLine();
                        System.out.println("Quantas modalidades deseja inserir? Selecione as modalidades:");
                        try {
                            int numInt = Integer.parseInt(num);
                            for (int i = 0; i < numInt; i++) {
                                String mod = br.readLine();
                                if (!mod.equals("1") && !mod.equals("2") && !mod.equals("3") && !mod.equals("4") && !mod.equals("5") && !mod.equals("6") && !mod.equals("7") && !mod.equals("8") && !mod.equals("9")) {
                                    System.out.println("Opção selecionada é inválida!");
                                    System.out.println("Tente novamente!");
                                    i--;
                                } else {
                                    atleta.setMod(Integer.parseInt(mod));
                                    System.out.println("Modalidade inserida!");
                                }
                            }
                        } catch( Exception e ){
                            System.out.println("Opção inserida é inválida :(");
                            continue;
                        }
                        con.create(atleta);
                        break;
                    case 2:
                        System.out.println("Insira a matricula do atleta que deseja excluir: ");
                        String mat = br.readLine();
                        try {
                            con.delete(Long.parseLong(mat));
                        } catch( Exception e ){
                            System.out.println("Matrícula inserida é inválida :(");
                            continue;
                        }
                        break;
                    case 3:
                        con.index();
                        break;
                    case 4:
                        System.out.println("Insira a matricula do atleta que deseja exibir: ");
                        String matr = br.readLine();
                        try {
                            con.show(Long.parseLong(matr));
                        } catch( Exception e ) {
                            System.out.println("Matrícula inserida é inválida :(");
                            continue;
                        }
                        break;
                    case 5:
                        Atleta atleta1 = new Atleta();
                        System.out.println("Insira a matricula do atleta: ");
                        String matri = br.readLine();
                        try {
                            atleta1.setMatricula(Long.parseLong(matri));
                        } catch( Exception e ){
                            System.out.println("Matrícula inserida é inválida :(");
                            continue;
                        }

                        System.out.println("Insira o nome do novo atleta: ");
                        atleta1.setNome(br.readLine());

                        menu.MenuSexo();
                        int test4 = menu.LerSexo();
                        if (test4 == -1) {
                            System.out.println("deu ruim");
                            continue;
                        } else
                            atleta1.setSexo(test4);

                        menu.MenuCategoria();
                        int test5 = menu.LerCategoria();
                        if (test5 == -1) {
                            System.out.println("deu ruim");
                            continue;
                        } else
                            atleta1.setCategoria(test5);

                        if (atleta1.getCategoria() == Categoria.Servidor) {
                            atleta1.setCurso(Curso.Sem_Curso.getCod());
                            atleta1.setAno_periodo(0);
                        } else {
                            menu.MenuCurso();
                            int test6 = menu.LerCurso();
                            if (test6 == -1) {
                                System.out.println("deu ruim");
                                continue;
                            } else
                                atleta1.setCurso(test6);

                            System.out.println("Insira o ano/período do novo atleta: ");
                            String ano1 = br.readLine();
                            try {
                                atleta1.setAno_periodo(Integer.parseInt(ano1));
                            } catch( Exception e ){
                                System.out.println("Ano/período inserida é inválida :(");
                                continue;
                            }
                        }
                        menu.MenuModalidade();
                        System.out.println("Quantas modalidades deseja inserir? ");
                        String num1 = br.readLine();
                        System.out.println("Quantas modalidades deseja inserir? Selecione as modalidades:");
                        try {
                            int numInt1 = Integer.parseInt(num1);
                            for (int i = 0; i < numInt1; i++) {
                                String mod1 = br.readLine();
                                if (!mod1.equals("1") && !mod1.equals("2") && !mod1.equals("3") && !mod1.equals("4") && !mod1.equals("5") && !mod1.equals("6") && !mod1.equals("7") && !mod1.equals("8") && !mod1.equals("9")) {
                                    System.out.println("Opção selecionada é inválida!");
                                    System.out.println("Tente novamente!");
                                    i--;
                                } else {
                                    atleta1.setMod(Integer.parseInt(mod1));
                                }
                            }
                        } catch( Exception e ){
                            System.out.println("Opção inserida é inválida :(");
                            continue;
                        }
                        con.edit(atleta1);
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Opção inserida é inválida :(");
                        break;
                }
            } catch( Exception e ){
                System.out.println("Opção inserida é inválida :(");
                continue;
            }
        } while(opInt != 6);
        con.index();

    }

}
