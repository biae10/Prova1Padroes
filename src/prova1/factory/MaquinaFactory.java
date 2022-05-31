/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1.factory;

import prova1.equipamentos.Equipamento;
import prova1.equipamentos.Maquina;
import prova1.equipamentos.TipoEquipamento;

/**
 *
 * @author user
 */
public class MaquinaFactory extends EquipamentoFactory{

    @Override
    public Equipamento gerarEquipamento() {
    	
        Equipamento maquina = Maquina.novaMaquina(identificador, quantidade, descricao, marca, equipamentos);
        
        return maquina;
    }
    
}
