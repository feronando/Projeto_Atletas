package br.ufrn.imd.Dao;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {

    public Menu(){

    }

    public void MenuPrincipal(){
        System.out.println("\nEscolha a opção desejada: ");
        System.out.println("\t1 - Adicionar um atleta");
        System.out.println("\t2 - Excluir um atleta");
        System.out.println("\t3 - Visualizar lista de atletas");
        System.out.println("\t4 - Visualizar um atleta");
        System.out.println("\t5 - Editar um atleta");
    }



    public void MenuSexo(){
        System.out.println("Opçoes: ");
        System.out.println("1 - Feminino ");
        System.out.println("2 - Masculino ");
        System.out.println("3 - NãoBinário ");
        System.out.println("Insira o sexo do novo atleta: ");
    }

    public int LerSexo(){
        char op;
        try(Scanner input = new Scanner( System.in )){
            op = input.next().charAt(0);
        }catch (IOException e){
            System.out.println(input.ioException());
        }

        if(op != '1' && op != '2' && op != '3' ){
            System.out.println("Opção selecionada é inválida!");
            return -1;
        }
        else{
            return Character.getNumericValue(op);
        }
    }

    public void MenuCategoria(){
        System.out.println("Opçoes: ");
        System.out.println("1 - Aluno ");
        System.out.println("2 - Servidor ");
        System.out.println("Insira a categoria do novo atleta: ");
    }

    public int LerCategoria(){
        char op;
        try(Scanner input = new Scanner( System.in )){
            op = input.next().charAt(0);
        }catch (IOException e){
            System.out.println(input.ioException());
        }

        if(op != '1' && op != '2'){
            System.out.println("Opção selecionada é inválida!");
            return -1;
        }
        else{
            return Character.getNumericValue(op);
        }
    }

    public void MenuCurso(){
        System.out.println("Opções: ");
        System.out.println("0 - Sem curso");
        System.out.println("1 - BTI Livre");
        System.out.println("2 - BTI - CC");
        System.out.println("3 - BTI -DS");
        System.out.println("4 - Pos graduação");
        System.out.println("Insira o curso do novo atleta: ");
    }

    public int LerCurso(){
        char op;
        try(Scanner input = new Scanner( System.in )){
            op = input.next().charAt(0);
        }catch (IOException e){
            System.out.println(input.ioException());
        }

        if(op != '0' && op != '1' && op != '2' && op != '3' && op != '4'){
            System.out.println("Opção selecionada é inválida!");
            return -1;
        }
        else{
            return Character.getNumericValue(op);
        }
    }

    public void MenuModalidade(){
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
        System.out.println("Insira uma modalidade para o novo atleta: ");
    }





}
