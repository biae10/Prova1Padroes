/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1Q2.builder;

import prova1.equipamentos.Equipamento;
import prova1Q2.treino.TipoExercicio;

/**
 *
 * @author user
 */
public interface Builder {
    
    public void reset();
    public void setNome(String nome);
    public void setTipoExercicio(TipoExercicio tipo); 
    public void setGrupoMuscular(String grupo);
    public void addEquipamento(Equipamento equipamento);
    
}
