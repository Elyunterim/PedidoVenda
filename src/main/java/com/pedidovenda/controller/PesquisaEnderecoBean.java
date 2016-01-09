package com.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaEnderecoBean {

	private List<Integer> enderecosFiltrados;
	
		public PesquisaEnderecoBean()
		{
			enderecosFiltrados = new ArrayList<>();
			for(int i = 0; i < 50; i ++){
				enderecosFiltrados.add(i);
			}				
		}
		
		public List<Integer> getEnderecosFiltrados()
		{
			return enderecosFiltrados;
		}		
		
}
