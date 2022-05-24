package prova1.abs;

import java.util.List;

public class Exercicio {
    
    private String nome;
    private TipoExercicio categoria;
    private List<String> gruposMusculares;
    private List<Equipamento> equipamentos;
    
    public Exercicio(String nome, TipoExercicio categoria, List<String> gruposMusculares, List<Equipamento> equipamentos){
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

    public TipoExercicio getCategoria() {
        return categoria;
    }

    public List<String> getGruposMusculares() {
        return gruposMusculares;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }
    
}
