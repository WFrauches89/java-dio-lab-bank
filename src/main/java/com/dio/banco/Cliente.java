package com.dio.banco;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Cliente {

	private String nome;

	public void setNome(String nome) {
		this.nome = nome;
	}
}
