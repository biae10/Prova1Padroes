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
public class Maquina extends Equipamento{
    
    private String descricao;
    private String marca;

    
    private Maquina(String identificador, int quantidade, String descricao, String marca){
        super(identificador,quantidade);
        this.descricao = descricao;
        this.marca = marca;
    }
    
    public static Equipamento novaMaquina(String identificador, int quantidade, String descricao, String marca, List<Equipamento> equipamentos){
 
    	Equipamento equipamento = EquipamentoFactory.verificarExistenciaEquipamento(identificador, equipamentos);
        
        if (equipamento != null) {
        	
        	equipamento.addQuantidade();
            return equipamento;
            
        } else {
        	
        	equipamento = new Maquina(identificador,quantidade, descricao,marca); 
            equipamentos.add(equipamento);
            return equipamento;
        } 
          
    }
      
    @Override
    public void Treinar() {
        System.out.println("Você está treinando numa Maquina");
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
