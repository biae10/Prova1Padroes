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
      
      EquipamentoFactory factoryHalter = EquipamentoFactory.pegarFactory(TipoEquipamento.HALTERE, "Bianca", 10,5, "Supino", "Galvin Klei");
      Equipamento haltere = factoryHalter.gerarEquipamento();
      System.out.println(haltere.getQuantidade());
       //factoryHalter.setIdentificador("Katia");
      factoryHalter.setQuantidade(40);
      Equipamento haltere2 = factoryHalter.gerarEquipamento();
      System.out.println(haltere2.getQuantidade());
      //Equipamento haltere3 = factoryHalter.gerarEquipamento();
      //System.out.println(haltere.getQuantidade());
      
      EquipamentoFactory factoryMaquina = EquipamentoFactory.pegarFactory(TipoEquipamento.MAQUINA, "Bianca", 10,5, "Supino", "Galvin Klei");
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
    }   
}
