/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1Q2.builder;

import java.util.ArrayList;
import java.util.List;
import prova1.equipamentos.Equipamento;
import prova1Q2.treino.Exercicio;
import prova1Q2.treino.TipoExercicio;

/**
 *
 * @author user
 */
public class ExercicioBuilder implements Builder{
    
    private String nome;
    private List<TipoExercicio> categoria;
    private List<String> gruposMusculares;
    private List<Equipamento> equipamentos;
    
    @Override
    public void reset() {
        this.nome = null;
        this.categoria = new ArrayList<TipoExercicio>();
        this.gruposMusculares = new ArrayList<String>();
        this.equipamentos = new ArrayList<Equipamento>();
    }

    @Override
    public void setNome(String nome) {
      this.nome = nome;
    }

    @Override
    public void addTipoExercicio(TipoExercicio tipo) {
        this.categoria.add(tipo);
    }

    @Override
    public void addGrupoMuscular(String grupo) {
        this.gruposMusculares.add(grupo);
    }

    @Override
    public void addEquipamento(Equipamento equipamento) {
        this.equipamentos.add(equipamento);
    }
    
    public Exercicio build(){
        if(this.nome == null || this.nome == ""){
            throw new IllegalArgumentException("O nome não pode ser vazio");
        } else {
        }
        return new Exercicio(this.nome,this.categoria, this.gruposMusculares, this.equipamentos);
    }

}
