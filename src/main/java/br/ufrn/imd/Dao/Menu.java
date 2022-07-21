package br.ufrn.imd.Dao;
import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public Menu(){

    }
    public void MenuSexo(){
        System.out.println("Opçoes: ");
        System.out.println("1 - Feminino ");
        System.out.println("2 - Masculino ");
        System.out.println("3 - NãoBinário ");
        System.out.println("Insira o sexo do novo atleta: ");
    }

    public void MenuCategoria(){
        System.out.println("Opçoes: ");
        System.out.println("1 - Aluno ");
        System.out.println("2 - Servidor ");
        System.out.println("Insira a categoria do novo atleta: ");
    }
    /*
    public void LerSexo(){
        int op;
        Scanner input = new Scanner( System.in );

        try{
            op = input.nextInt();
        }catch (IOException e){
            System.out.println("O valor inserido deve ser um inteiro!");
        }
    }
     */
}
