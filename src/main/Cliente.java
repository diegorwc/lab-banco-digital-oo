package main;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	
	private String nome;
	private LocalDate dataNascimento;
	private String cpf;
	
	public Cliente(String nome, LocalDate dataNascimento, String cpf) {
		super();		
		if(!nome.matches("^[a-zA-Z ]*$")) {
			throw new IllegalArgumentException("Nome inválido");
		}
		if(!cpf.matches("^[0-9]*$") || cpf.length() != 11) {
			throw new IllegalArgumentException("CPF inválido");
		}
		int idadeAtual = Period.between(dataNascimento, LocalDate.now()).getYears();
		if(idadeAtual < 18) {
			throw new IllegalArgumentException("Menor de 18 anos");
		}
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
