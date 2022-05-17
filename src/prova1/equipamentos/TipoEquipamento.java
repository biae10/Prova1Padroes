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
public enum TipoEquipamento {
    
    HALTERE("prova1.factory.HaltereFactory"),
    ACESSORIO("prova1.factory.AcessorioFactory"),
    MAQUINA("prova1.factory.MaquinaFactory");
    
    String className;
    
    TipoEquipamento(String tipo){
        this.className = tipo;
    }
    
    public String getClassName(){
        return this.className;
    }
}
