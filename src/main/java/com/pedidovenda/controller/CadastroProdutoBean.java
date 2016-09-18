package com.pedidovenda.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.pedidovenda.model.Produto;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {
	
	private Produto produto;
	
	private static final long serialVersionUID = 1L;
	
	public CadastroProdutoBean(){
		produto = new Produto();
	}
	
	public void salvar(){
		
	}
	
	public Produto getProduto(){
		return produto;
	}

}
