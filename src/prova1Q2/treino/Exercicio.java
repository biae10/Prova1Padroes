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
    private TipoExercicio categoria;
    private String gruposMusculares;
    private List<Equipamento> equipamentos;
    
    public Exercicio(String nome, TipoExercicio categoria, String gruposMusculares, List<Equipamento> equipamentos){
        this.categoria = categoria;
        this.gruposMusculares = gruposMusculares;
        this.equipamentos = equipamentos;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(TipoExercicio categoria) {
        this.categoria = categoria;
    }

    public void setGruposMusculares(String gruposMusculares) {
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

    public TipoExercicio getCategoria() {
        return categoria;
    }

    public String getGruposMusculares() {
        return gruposMusculares;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }
    
}
