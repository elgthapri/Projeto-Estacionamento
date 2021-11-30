package view;

import java.util.Scanner;

import menu.factory.MenuFactory;
import model.*;

public class Gerenciamento {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Login login = new Login();
        int condicaoParada = -1;

        while (condicaoParada != 0) {
            System.out.println("------------------------------------------------------");
            System.out.println(  "\n###  SISTEMA DE CONTROLE - ESTACIONAMENTO MORAIS  ###\n         ");
            System.out.println("------------------------------------------------------");
            System.out.println("\n");
            System.out.println("   |---------------DIGITE O LOGIN:----------------|");
            login.setLogin(in.nextLine());
            System.out.println("   |---------------DIGITE A SENHA:----------------|");
            login.setSenha(in.nextLine());

            if (login.getLogin().equals("Admin") && login.getSenha().equals("12345")) {

                System.out.println("\n");
                System.out.printf("         Usuário %s logado com sucesso! ", login.getLogin());
                System.out.println("\n");
                new MenuFactory();
                break;
            } else {
                System.out.println("\n");
                System.out.println("     Login ou senha inválidos! Tente novamente...\n");
                condicaoParada = -2;
                continue;
            }
        }
    }

}
