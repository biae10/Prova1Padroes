/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1.factory;

import prova1.equipamentos.Equipamento;
import prova1.equipamentos.Haltere;

/**
 *
 * @author user
 */
public class HaltereFactory extends EquipamentoFactory{

    @Override
    public Equipamento gerarEquipamento() {
        
        Equipamento haltere = Haltere.novoHaltere(identificador, quantidade, peso, equipamentos);  
        
        return haltere;
    }
    
}
