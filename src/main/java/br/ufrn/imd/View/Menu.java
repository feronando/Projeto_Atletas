package br.ufrn.imd.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Menu {

    public Menu() {

    }

    public void MenuPrincipal() {
        System.out.println("\nEscolha a opção desejada: ");
        System.out.println("\t1 - Adicionar um atleta");
        System.out.println("\t2 - Excluir um atleta");
        System.out.println("\t3 - Visualizar lista de atletas");
        System.out.println("\t4 - Visualizar um atleta");
        System.out.println("\t5 - Editar um atleta");
        System.out.println("\t6 - Sair");
    }


    public void MenuSexo() {
        System.out.println("Opçoes: ");
        System.out.println("1 - Feminino ");
        System.out.println("2 - Masculino ");
        System.out.println("3 - NãoBinário ");
        System.out.println("Insira o sexo do novo atleta: ");
    }

    public int LerSexo() {
        String op;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            op = br.readLine();
            if (!op.equals("1") && !op.equals("2") && !op.equals("3")) {
                System.out.println("Opção selecionada é inválida!");
                return -1;
            } else {
                return Integer.parseInt(String.valueOf(op));
            }
        } catch (Exception e) {
            System.out.println("deu ruim!");
            return -1;
        }
    }

    public void MenuCategoria() {
        System.out.println("Opçoes: ");
        System.out.println("1 - Aluno ");
        System.out.println("2 - Servidor ");
        System.out.println("Insira a categoria do novo atleta: ");
    }

    public int LerCategoria() {
        String op;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            op = br.readLine();
            if (!op.equals("1") && !op.equals("2")) {
                System.out.println("Opção selecionada é inválida!");
                return -1;
            } else {
                return Integer.parseInt(String.valueOf(op));
            }
        } catch (Exception e) {
            System.out.println("deu ruim!");
            return -1;
        }


    }

    public void MenuCurso() {
        System.out.println("Opções: ");
        System.out.println("0 - Sem curso");
        System.out.println("1 - BTI Livre");
        System.out.println("2 - BTI - CC");
        System.out.println("3 - BTI - DS");
        System.out.println("4 - Pos graduação");
        System.out.println("Insira o curso do novo atleta: ");
    }

    public int LerCurso() {
        String op;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            op = br.readLine();
            if (!op.equals("0") && !op.equals("1") && !op.equals("2") && !op.equals("3") && !op.equals("4")) {
                System.out.println("Opção selecionada é inválida!");
                return -1;
            } else {
                return Integer.parseInt(String.valueOf(op));
            }
        } catch (Exception e) {
            System.out.println("deu ruim!");
            return -1;
        }

    }

    public void MenuModalidade() {
        System.out.println("Opções: ");
        System.out.println("1 - Atletismo");
        System.out.println("2 - Basquete");
        System.out.println("3 - Futebol");
        System.out.println("4 - Futsal");
        System.out.println("5 - Handebol");
        System.out.println("6 - Jiu-Jitsu");
        System.out.println("7 - Natação");
        System.out.println("8 - Tenis");
        System.out.println("9 - Voleibol");
        System.out.println("Insira a(s) modalidade(s) para o novo atleta: ");
    }

}