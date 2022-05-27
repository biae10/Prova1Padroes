/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1.factory;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import prova1.equipamentos.Equipamento;
import prova1.equipamentos.TipoEquipamento;

/**
 *
 * @author user
 */
public abstract class EquipamentoFactory {
    
    protected String identificador;
    protected int quantidade;
    protected double peso;
    protected String descricao;
    protected String marca;
    protected List<Equipamento> equipamentos = ListSingleton.getInstance().getArrayList();
    
    public static EquipamentoFactory pegarFactory(TipoEquipamento tipo, String identificador, int quantidade
                                    , double peso, String descricao, String marca) throws ClassNotFoundException, 
                                NoSuchMethodException, InstantiationException, IllegalAccessException, 
                                IllegalArgumentException, InvocationTargetException {
        
        EquipamentoFactory factory = (EquipamentoFactory)Class.forName(tipo.getClassName()).getConstructor().newInstance();
        
        factory.setIdentificador(identificador);
        factory.setQuantidade(quantidade);
        factory.setDescricao(descricao);
        factory.setPeso(peso);
        factory.setMarca(marca);
        
        return factory;
    } 
    
    public abstract Equipamento gerarEquipamento();

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }
        
    public static Equipamento verificarExistenciaEquipamento(String identificador, List<Equipamento> equipamentos) {
    	
    	for (Equipamento equipamento : equipamentos) {
    		if (equipamento.getIdentificador().equals(identificador)) {
    			return equipamento;
    		}
    	}
    	
    	return null;
    }
    
    
}
