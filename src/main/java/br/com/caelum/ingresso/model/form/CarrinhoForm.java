package br.com.caelum.ingresso.model.form;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.ingresso.dao.LugarDao;
import br.com.caelum.ingresso.dao.SessaoDao;
import br.com.caelum.ingresso.model.Ingresso;

public class CarrinhoForm {
	
	@Autowired
	private SessaoDao sessaoDao;
	
	@Autowired
	private LugarDao lugarDao;
	
	private List<Ingresso> ingressos = new LinkedList<>();

	public List<Ingresso> getIngressos() {
		return ingressos;
	}

	public void setIngressos(List<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}
	
	public List<Ingresso> toIngressos(SessaoDao sessaoDao, LugarDao lugarDao){
		return this.ingressos.stream().map(ingresso -> {
			
		});
		
	}
} 
