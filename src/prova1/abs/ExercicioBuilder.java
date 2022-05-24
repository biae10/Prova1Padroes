package prova1.abs;

import java.util.ArrayList;
import java.util.List;

import prova1.equipamentos.Equipamento;
import prova1Q2.builder.Builder;
import prova1Q2.treino.Exercicio;
import prova1Q2.treino.TipoExercicio;

public class ExercicioBuilder implements Builder{
    
    private String nome;
    private TipoExercicio categoria;
    private String gruposMusculares;
    private List<Equipamento> equipamentos;
    
    @Override
    public void reset() {
        this.nome = null;
        this.categoria = null;
        this.gruposMusculares = null;
        this.equipamentos = new ArrayList<Equipamento>();
    }

    @Override
    public void setNome(String nome) {
      this.nome = nome;
    }

    @Override
    public void setTipoExercicio(TipoExercicio tipo) {
        this.categoria = tipo;
    }

    @Override
    public void setGrupoMuscular(String grupo) {
        this.gruposMusculares = grupo;
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