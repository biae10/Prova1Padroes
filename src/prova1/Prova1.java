/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.lang.reflect.InvocationTargetException;
import prova1.equipamentos.Equipamento;
import prova1.equipamentos.TipoEquipamento;
import prova1.factory.EquipamentoFactory;
import prova1Q2.builder.ExercicioBuilder;
import prova1Q2.treino.Exercicio;
import prova1Q2.treino.TipoExercicio;

/**
 *
 * @author user
 */
public class Prova1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
                                                  InstantiationException, IllegalAccessException, 
                                                  IllegalArgumentException, InvocationTargetException {
      
      System.out.println("*** Testes dos tipos de equipamentos gerados ***");  
      
      EquipamentoFactory factoryHalter = EquipamentoFactory.pegarFactory(TipoEquipamento.HALTERE, "Bianca", 10, 5, "Supino", "Galvin Klei");
      Equipamento haltere = factoryHalter.gerarEquipamento();
      
      System.out.println(haltere);
      //System.out.println(haltere.getIdentificador());
      //System.out.println(haltere.getQuantidade());
      //haltere.setQuantidade(40);
      //System.out.println(haltere.getQuantidade());
      
       //factoryHalter.setIdentificador("Katia");
      
      Equipamento haltere2 = factoryHalter.gerarEquipamento();
      System.out.println(haltere2);
      System.out.println(haltere2.getQuantidade());
      //Equipamento haltere3 = factoryHalter.gerarEquipamento();
      //System.out.println(haltere.getQuantidade());
      
      EquipamentoFactory factoryMaquina = EquipamentoFactory.pegarFactory(TipoEquipamento.MAQUINA, "Bianca", 10, 5, "Supino", "Galvin Klei");
      Equipamento maquina1 = factoryMaquina.gerarEquipamento();
      factoryMaquina.setIdentificador("Katia");
      Equipamento maquina2 = factoryMaquina.gerarEquipamento();
      System.out.println(maquina1);
      System.out.println(maquina2);
      
      EquipamentoFactory factoryAcessorio = EquipamentoFactory.pegarFactory(TipoEquipamento.ACESSORIO, "Bianca", 10,5, "Supino", "Galvin Klei");
      Equipamento acessorio1 = factoryAcessorio.gerarEquipamento();
      System.out.println(acessorio1);
      //factoryAcessorio.setIdentificador("Teste13");
      Equipamento acessorio2 = factoryAcessorio.gerarEquipamento();
      System.out.println(acessorio2);
      
      ExercicioBuilder builder = new ExercicioBuilder();
      builder.reset();
      builder.setNome("Treino de perna");
      builder.setGrupoMuscular("Pernas");
      builder.setTipoExercicio(TipoExercicio.FUNCIONAL);
      builder.addEquipamento(maquina1);
      builder.addEquipamento(maquina2);
      builder.addEquipamento(haltere);
      Exercicio exercicioBianca = builder.build();
      
      System.out.println("\n*** Exercicios Construidos ***");
      System.out.println("Nome: " + exercicioBianca.getNome());
      System.out.println("Lista de equipamentos usados: " + exercicioBianca.getEquipamentos());
      System.out.println("Categoria: " + exercicioBianca.getCategoria());
      System.out.println("Grupos Musculares: " + exercicioBianca.getGruposMusculares());
      
      builder.reset();
      builder.setNome("Treino de barriga");
      builder.setGrupoMuscular("Barriga e Abdômen");
      builder.addEquipamento(haltere2);
      builder.addEquipamento(acessorio2);
      Exercicio exercicioDaniel = builder.build();
      
      System.out.println("\nNome: " + exercicioDaniel.getNome());
      System.out.println("Lista de equipamentos usados: " + exercicioDaniel.getEquipamentos());
      System.out.println("Categoria: " + exercicioDaniel.getCategoria());
      System.out.println("Grupos Musculares: " + exercicioDaniel.getGruposMusculares());
      
    }   
}
