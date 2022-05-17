/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1.factory;

import prova1.equipamentos.Acessorio;
import prova1.equipamentos.Equipamento;

/**
 *
 * @author user
 */
public class AcessorioFactory extends EquipamentoFactory{

    @Override
    public Equipamento gerarEquipamento() {
        
       Equipamento acessorio = Acessorio.novoAcessorio(identificador, quantidade, descricao, equipamentos);
       boolean EquipamentoRetornadoExiste = EquipamentoFactory.verificarExistenciaEquipamento(identificador, equipamentos);
       if(EquipamentoRetornadoExiste == false){
            this.equipamentos.add(acessorio);
        }
       return acessorio;
    }
    
}
