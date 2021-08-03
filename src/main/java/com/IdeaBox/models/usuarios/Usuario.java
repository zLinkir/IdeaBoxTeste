package com.IdeaBox.models.usuarios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.IdeaBox.models.sugestoes.Sugestao;



@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	private String nome;
	private String cpf;
	@Enumerated(EnumType.STRING)
	private Cargo cargo;
	protected boolean isRegistrado;
	private String login;
	private String senha;
	private boolean isLogado;
	private String email;
	@Enumerated(EnumType.STRING)
	private StatusColaborador status;
	@OneToMany
	protected List <Sugestao> sugestoes;
	


	public Usuario(long id, String nome, String cpf, Cargo cargo, String login, String senha, String email) {
		setId(id);
		setNome(nome);
		setCpf(cpf);
		setCargo(cargo);
		setLogin(login);
		setSenha(senha);
		setEmail(email);
		setLogado(false);
		setRegistrado(true);
		setStatus(StatusColaborador.ATIVO);
		sugestoes = new ArrayList<Sugestao>();
	}
	public Usuario() {
		setId(id);
		setNome(nome);
		setCpf(cpf);
		setCargo(cargo);
		setLogin(login);
		setSenha(senha);
		setEmail(email);
		setLogado(false);
		setRegistrado(true);
		setStatus(StatusColaborador.ATIVO);
		sugestoes = new ArrayList<Sugestao>();
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public boolean isRegistrado() {
		return isRegistrado;
	}
	public void setRegistrado(boolean isRegistrado) {
		this.isRegistrado = isRegistrado;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isLogado() {
		return isLogado;
	}
	public void setLogado(boolean isLogado) {
		this.isLogado = isLogado;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public StatusColaborador getStatus() {
		return status;
	}
	public void setStatus(StatusColaborador status) {
		this.status = status;
	}
	
	public List<Sugestao> getSugestoes() {
		return sugestoes;
	}



	public void setSugestoes(List<Sugestao> sugestoes) {
		this.sugestoes = sugestoes;
	}

	
}
