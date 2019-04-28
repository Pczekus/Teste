package br.pedro;

import java.util.Map;
import java.util.TreeMap;

public class Agenda {
	private Map<String, Contato> agenda = new TreeMap<>();
	
	public void addContato( Contato contato){
		this.agenda.put(contato.getNome(),contato);
	}
	public void addContato(String nome, String telefone){
		this.addContato(new Contato(nome, telefone));
	}
	public void removerContato(String nome) {
		if(!(this.pesquisarContato(nome) == null)) {
			agenda.remove(nome);
		}else {
			System.out.println("Contato não existe!");
		}
	}
	public Contato pesquisarContato(String nome) {
        if(!agenda.containsKey(nome)) {
            return null;
        }
        return agenda.get(nome);
    }
	@Override
	public String toString() {
		return "Contatos: \n" + agenda;
	}
	
	public Map<String, Contato> getAgenda() {
		return agenda;
	}
	public void setAgenda(Map<String, Contato> agenda) {
		this.agenda = agenda;
	}
	
	
	
}
