package prova1.abs;

import java.util.ArrayList;

public class EquipamentoFactory {
	
	ArrayList<Equipamento> listaEquipamentos = new ArrayList<Equipamento>();
	private static EquipamentoFactory instancia;
	
	private EquipamentoFactory() {};
	
	public static EquipamentoFactory getInstance() {
		if (instancia == null) {
			instancia = new EquipamentoFactory();
		}
		
		return instancia;
	}
	
	public Equipamento criaEquipamento(TipoEquipamento tipo, String identificador, int quantidade) {
		
		Equipamento equipamento = verificaSeExiste(identificador, tipo);
		
		if (equipamento != null) {
			return equipamento;
		} else {
			switch (tipo) {
			case HALTERE:
				equipamento = new Haltere(identificador, quantidade, 0);
				listaEquipamentos.add(equipamento);
				return equipamento;
			case MAQUINA:
				equipamento =  new Maquina(identificador, quantidade, null, null);
				listaEquipamentos.add(equipamento);
				return equipamento;
			case ACESSORIO:
				equipamento =  new Acessorio(identificador, quantidade, null);
				listaEquipamentos.add(equipamento);
				return equipamento;
			default:
				throw new IllegalArgumentException("Unknown");
			}
		}

	}
	
	private Equipamento verificaSeExiste(String identificador, TipoEquipamento tipo) {
		
		for (Equipamento equipamento : listaEquipamentos) {
			if (equipamento.getIdentificador().equals(identificador) && equipamento.getTipo().equals(tipo)) {
				//System.out.println("Equipamento exisitente");
				equipamento.adicionaEquipamento();
				return equipamento;
			}
		}
		
		return null;
		
		}

}
