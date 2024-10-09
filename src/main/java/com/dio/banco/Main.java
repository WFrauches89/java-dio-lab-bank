package com.dio.banco;

import com.dio.banco.Banco;
import com.dio.banco.Cliente;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);


		Cliente venilton2 = new Cliente();
		venilton2.setNome("VB");

		Conta cc2 = new ContaCorrente(venilton2);
		Conta poupanca2 = new ContaPoupanca(venilton2);


		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc2.depositar(200);
		cc2.transferir(150, poupanca);
		
		cc.imprimirExtrato();
		cc2.imprimirExtrato();
		poupanca.imprimirExtrato();

		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();

		banco.saveConta(cc);
		banco.saveConta(poupanca);

		banco.saveConta(cc2);
		banco.saveConta(poupanca2);

		banco.getClientes();
	}

}
