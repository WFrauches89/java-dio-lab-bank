package com.dio.banco;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
public class Banco {

	private String nome;
	private List<Conta> contas;
	private List<Cliente> clientes = new ArrayList<>();

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void saveConta(Conta conta) {
		if (!clientes.contains(conta.getCliente())) {
			clientes.add(conta.getCliente());
		}
	}

	public void getClientes() {
		System.out.println("Clientes: ");
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}
	}

}
