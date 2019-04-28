package br.pedro;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		String nome = "", telefone = "";


		int excluir = Integer.parseInt(JOptionPane.showInputDialog("\n Deseja excluir contato? (1) \n Deseja adicionar contato? (2) "));

		switch (excluir) {
		case 1:
			nome = JOptionPane.showInputDialog(null, "\n Digite o nome do contato :");
			telefone = JOptionPane.showInputDialog(null, "\n Digite o numero do contato :");
			agenda.addContato(nome, telefone);
			break;
		case 2: 
			nome = JOptionPane.showInputDialog(null, "\n Digite o nome do contato a ser excluido :");
			agenda.removerContato(nome);
			break;
		default:
			break;
		}

		Contato c1 = new Contato("Mithrandir", "2222-2222");
		Contato c2 = new Contato("Aragorn", "9999-9999");
		Contato c3 = new Contato("Eowyn", "3333-3333");
		Contato c4 = new Contato("Nazgûl", "4444-4444");
		Contato c5 = new Contato("Samwise", "5555-5555");
		Contato c6 = new Contato("Saruman", "6666-6666");

		agenda.addContato(c1);
		agenda.addContato(c2);
		agenda.addContato(c3);
		agenda.addContato(c4);
		agenda.addContato(c5);
		agenda.addContato(c6);
		agenda.addContato("Legolas", "7777-7777");

		agenda.removerContato("Teste");

		System.out.println(agenda);

	}

}
