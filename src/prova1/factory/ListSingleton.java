package prova1.factory;

import java.util.ArrayList;

import prova1.equipamentos.Equipamento;

public class ListSingleton {

	private ArrayList<Equipamento> arrayList = new ArrayList<Equipamento>();
	private static ListSingleton instance;

	private ListSingleton(){
	    arrayList = new ArrayList<Equipamento>();
	}

	public static ListSingleton getInstance(){
	    if (instance == null){
	        instance = new ListSingleton();
	    }
	    
	    return instance;
	}

	public  ArrayList<Equipamento> getArrayList() {
	    return arrayList;
	}
	
}
