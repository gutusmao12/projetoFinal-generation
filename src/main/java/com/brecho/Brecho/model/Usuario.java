package com.brecho.Brecho.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Usuario {
    //atributos

    @Id @NotNull private Long cpf;

    @NotNull @Size(min = 4 , max = 15,  message = "Mínimo de 4 caracteres e máximo de 15." ) private String nome;

    @NotNull @Size(min = 4 , max = 15, message = "Mínimo de 4 caracteres e máximo de 15." ) private String sobrenome;

    @NotNull private String email;

    @NotNull @Size(min = 6 , max = 12,  message = "Mínimo de 6 caracteres e máximo de 12." ) private String senha;

    @Deprecated 
    public Usuario(){

    }

    //METODOS DE ACESSO

    public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}    
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}