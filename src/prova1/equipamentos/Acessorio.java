/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1.equipamentos;

import java.util.List;
import prova1.factory.EquipamentoFactory;

/**
 *
 * @author user
 */
public class Acessorio extends Equipamento{
    
    private String descricao;

    private Acessorio(String identificador, int quantidade, String descricao){
        super(identificador,quantidade);
        this.descricao = descricao;
    }
    
    public static Equipamento novoAcessorio(String identificador, int quantidade, String descricao, List<Equipamento> equipamentos){
       
    	Equipamento equipamento = EquipamentoFactory.verificarExistenciaEquipamento(identificador, equipamentos);
        
        if (equipamento != null) {
        	
        	equipamento.addQuantidade();
            return equipamento;
            
        } else {
        	
        	equipamento = new Acessorio(identificador,quantidade, descricao); 
            equipamentos.add(equipamento);
            return equipamento;
        } 
    	                  
    }
    
    @Override
    public void Treinar() {
        System.out.println("Você está treinando num " + this.descricao);
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
