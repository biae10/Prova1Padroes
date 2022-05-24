package prova1.abs;

import java.util.List;

public class Exercicio {
    
    private String nome;
    private TipoExercicio categoria;
    private List<String> gruposMusculares;
    private List<Equipamento> equipamentos;
    
    public Exercicio(String nome, TipoExercicio categoria, String gruposMusculares, List<Equipamento> equipamentos){
        this.categoria = categoria;
        this.gruposMusculares.add(gruposMusculares);
        this.equipamentos = equipamentos;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(TipoExercicio categoria) {
        this.categoria = categoria;
    }

    public void addGruposMusculares(String gruposMusculares) {
    	this.gruposMusculares.add(gruposMusculares);
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
