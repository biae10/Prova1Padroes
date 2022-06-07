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
      
      EquipamentoFactory factoryHalter = EquipamentoFactory.pegarFactory(TipoEquipamento.HALTERE, "Emborrachado", 10, 5, null, null);
      Equipamento haltere = factoryHalter.gerarEquipamento();
      
      System.out.println(haltere);
      System.out.println(haltere.getIdentificador());
      System.out.println(haltere.getQuantidade());
      
      //Deve gerar o mesmo halter
      Equipamento haltere2 = factoryHalter.gerarEquipamento();
      
      System.out.println(haltere2);
      System.out.println(haltere2.getIdentificador());
      System.out.println(haltere2.getQuantidade());
      
      //Deve retornar a mesma maquina
      EquipamentoFactory factoryMaquina = EquipamentoFactory.pegarFactory(TipoEquipamento.MAQUINA, "Graviton", 1, 0, "Membros superiores e inferiores", "Galvin Klei");
      Equipamento maquina1 = factoryMaquina.gerarEquipamento();
     
      EquipamentoFactory factoryMaquina2 = EquipamentoFactory.pegarFactory(TipoEquipamento.MAQUINA, "Graviton", 1, 0, "Membros superiores e inferiores", "Galvin Klei");
      Equipamento maquina2 = factoryMaquina2.gerarEquipamento();
      
      System.out.println(maquina1);
      System.out.println(maquina2);
      
      EquipamentoFactory factoryMaquina3 = EquipamentoFactory.pegarFactory(TipoEquipamento.MAQUINA, "Voador", 1, 0, "Musculo superior", "Galvin Klei");
      Equipamento maquina3 = factoryMaquina3.gerarEquipamento();
      
      EquipamentoFactory factoryMaquina4 = EquipamentoFactory.pegarFactory(TipoEquipamento.MAQUINA, "Les Press 45", 1, 0, "Musculo inferior", "Galvin Klei");
      Equipamento maquina4 = factoryMaquina4.gerarEquipamento();
      
      EquipamentoFactory factoryMaquina5 = EquipamentoFactory.pegarFactory(TipoEquipamento.MAQUINA, "Smith Machine", 1, 0, "Membros superiores e inferiores", "Galvin Klei");
      Equipamento maquina5 = factoryMaquina5.gerarEquipamento();
      
      EquipamentoFactory factoryAcessorio = EquipamentoFactory.pegarFactory(TipoEquipamento.ACESSORIO, "Luva", 12 , 0, "Supino", "Galvin Klei");
      Equipamento acessorio1 = factoryAcessorio.gerarEquipamento();
      
      System.out.println(acessorio1);
      System.out.println(acessorio1.getIdentificador());
      System.out.println(acessorio1.getQuantidade());
     
      acessorio1.setIdentificador("Cone");
      
      Equipamento acessorio2 = factoryAcessorio.gerarEquipamento();
      System.out.println(acessorio2);
      
      System.out.println(acessorio2.getIdentificador());
      System.out.println(acessorio1.getIdentificador());
      
      
      
      
      ExercicioBuilder builder = new ExercicioBuilder();
      builder.reset();
      builder.setNome("Circuito");
      builder.addGrupoMuscular("Quadriceps");
      builder.addGrupoMuscular("Gluteos");
      builder.addTipoExercicio(TipoExercicio.RESISTIDO);
      builder.addTipoExercicio(TipoExercicio.FUNCIONAL);
      builder.addEquipamento(maquina4);
      builder.addEquipamento(maquina5);
      Exercicio exercicioBianca = builder.build();
      
      System.out.println("\n*** Exercicios Construidos ***");
      System.out.println("Nome: " + exercicioBianca.getNome());
      System.out.println("Lista de equipamentos usados: " + exercicioBianca.getEquipamentos().stream().map(e -> e.getIdentificador()));
      System.out.println("Categoria: " + exercicioBianca.getCategoria());
      System.out.println("Grupos Musculares: " + exercicioBianca.getGruposMusculares());
      
      builder.reset();
      builder.setNome("DropSet");
      builder.addGrupoMuscular("Costa");
      builder.addTipoExercicio(TipoExercicio.RESISTIDO);
      builder.addEquipamento(maquina1);
      builder.addEquipamento(maquina3);
      Exercicio exercicioDaniel = builder.build();
      
      System.out.println("\nNome: " + exercicioDaniel.getNome());
      System.out.println("Lista de equipamentos usados: " + exercicioDaniel.getEquipamentos().stream().map(e -> e.getIdentificador()));
      System.out.println("Categoria: " + exercicioDaniel.getCategoria());
      System.out.println("Grupos Musculares: " + exercicioDaniel.getGruposMusculares());
      
    }   
}
