/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1Q2.treino;

import java.util.List;

import prova1.equipamentos.Equipamento;

/**
 *
 * @author user
 */
public class Exercicio {
    
    private String nome;
    private List<TipoExercicio> categoria;
    private List<String> gruposMusculares;
    private List<Equipamento> equipamentos;
    
    public Exercicio(String nome, List<TipoExercicio> categoria, List<String> gruposMusculares2, List<Equipamento> equipamentos){
        this.categoria = categoria;
        this.gruposMusculares = gruposMusculares2;
        this.equipamentos = equipamentos;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(List<TipoExercicio> categoria) {
        this.categoria = categoria;
    }

    public void setGruposMusculares(List<String> gruposMusculares) {
        this.gruposMusculares = gruposMusculares;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public Exercicio(String nome){
        this.nome = nome;
    }   
    
    public String getNome() {
        return nome;
    }

    public List<TipoExercicio> getCategoria() {
        return categoria;
    }

    public List<String> getGruposMusculares() {
        return gruposMusculares;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }
}
