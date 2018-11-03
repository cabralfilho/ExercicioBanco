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
public interface ContaDAO {
    public String abrirConta(String tipo);
    
    public String fecharConta();
    
    public String depositar(double valor);  
    
    public String sacar(double valor);
    
    public void pagarMensalidade(int valor);
}
