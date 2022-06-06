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
public class Haltere extends Equipamento{
   
    private double peso;

    private Haltere(String identificador, int quantidade, double peso){
        super(identificador,quantidade);
        this.peso = peso;
    }
    
    public static Equipamento novoHaltere(String identificador, int quantidade, double peso, List<Equipamento> equipamentos){
       
    	Equipamento equipamento = EquipamentoFactory.verificarExistenciaEquipamento(identificador, equipamentos);
        
        if (equipamento != null) {
        	
        	equipamento.addQuantidade();
            return equipamento;
            
        } else {
        	
        	equipamento = new Haltere(identificador, quantidade, peso); 
            equipamentos.add(equipamento);
            return equipamento;
        } 
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void Treinar() {
        System.out.println("Você está treinando num Haltere");
    }
    
    
}
