/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciobanco;

import javax.swing.JOptionPane;

/**
 *
 * @author Jander
 */
public class ExercicioBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta c1 = new Conta(1, "CP", "Jander Silva", 5624.25);
        
        System.out.println("* Bem vindo ao banco *"
                           +"(1) Abrir Conta \n"
                           + "(2) Acessar Conta");

        
       int opcao = (Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja fazer?")));
       
       Conta c2 = new Conta(1, "CP", "Jander Silva", 5624.25);
       

        
    }
    
}
