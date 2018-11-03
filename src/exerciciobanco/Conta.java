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
public class Conta implements ContaDAO{
    
    public int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public Conta(int numConta, String tipo, String dono, double saldo){
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
    }
    
    public Conta(){
        this.saldo =  0;
        this.status = false;
    }
    
    @Override
    public String abrirConta(String tipo){
        this.status = true; //Define a conta como aberta.
        tipo = JOptionPane.showInputDialog("Deseja abrir uma Conta Poupança(CP) ou uma Conta Concorrente(CC)?");
        
       switch(tipo){
           case "CP":
               this.setSaldo(150);
           case "CC":
               this.setSaldo(50);
       }
       return "Conta aberta com sucesso!";
    }
    // @Override
    // public String fecharConta(){
    //     if (this.getSaldo() < 0){ //Verificação de saldo negativo.
    //         return "Não é possível fechar a conta com o saldo negativo.";
    //     } else if (this.getSaldo() > 0){ //Vericação de saldo positivo;
    //         return "Não é possível fechar a conta pois ainda há dinheiro.";
    //     } else { //Fechamento da conta
    //        this.setStatus(false); 
    //         return "Conta fechada com sucesso!";
    //     }
    // }
    // @Override
    // public String depositar(double valor){
    //     if (this.isStatus() == true){
    //         valor = (Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantia a ser depositada:")));
    //         this.setSaldo(this.getSaldo() + valor); //Adionar o valor do deposito à conta.
    //             return "Valor depositado com sucesso!";
    //     } else { //Verifica a possibilidade da conta estar fechada.
    //         return "Erro: Esta conta está fechada.";
    //     }
    // }    
    // @Override
    // public String sacar(double valor){
    //     valor = (Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantia a ser sacada:")));
        
    //     if ((this.isStatus() == true) && (this.getSaldo() >= valor)){
    //         this.setSaldo(this.getSaldo() - valor);
    //         return "Valor depositado com sucesso!";
    //     }
        
    //     else if ((this.isStatus() == true) && (this.getSaldo() <= 0)){
    //         return "Erro: Você não possui saldo para sacar.";
    //     }
        
    //     else if ((this.isStatus() == true) && (this.getSaldo() < valor)){
    //         this.setSaldo(this.getSaldo() - this.getSaldo());
    //         return "Aviso: O saldo é inferior ao valor de saque pedido.";
    //     }
    
    //     else {
    //         return "Erro: Esta conta está fechada.";
    //     }
    // }
    // @Override
    // public void pagarMensalidade(int valor){
    //     while (this.isStatus() != false){
    //     if (this.getTipo().equals("CC")){ //Define o valor da mensalidade para CONTAS CORRENTES.
    //         valor = 12;
    //     }
    //     else if (this.getTipo().equals("CP")){ //Define o valor da mensalidade para CONTAS POUPANÇAS.
    //         valor = 20;
    //     }

    //         if (this.getSaldo() > valor){ // Condição de sucesso
    //             this.setSaldo(this.getSaldo() - valor);
    //                 System.out.println("Mensalidade paga com Sucesso");
    //         } else if (this.getSaldo() < valor){ //Exceção de saldo insuficiente.
    //                 System.out.println("Erro: Conta não possui saldo suficiente.");
    //         }
    //     }
    //     System.out.println("Erro: Conta fechada.");
    // }
    
    /**
     * @return the numConta
     */
    public int getNumConta() {
        return numConta;
    }

    /**
     * @param numConta the numConta to set
     */
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the dono
     */
    public String getDono() {
        return dono;
    }

    /**
     * @param dono the dono to set
     */
    public void setDono(String dono) {
        this.dono = dono;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
}
