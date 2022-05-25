/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1.equipamentos;

/**
 *
 * @author user
 */
public abstract class Equipamento {
    
    protected String identificador;
    protected int quantidade;

    public abstract void Treinar();
    
    protected Equipamento(String identificador, int quantidade){
        this.identificador = identificador;
        this.quantidade = quantidade;
    }
    
    private Equipamento(){};
    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void addQuantidade() {
    	this.quantidade += 1;
    }
    
    
    
}
