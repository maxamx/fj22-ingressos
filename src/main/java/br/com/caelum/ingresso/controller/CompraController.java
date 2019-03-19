package br.com.caelum.ingresso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.ingresso.dao.IngressoDao;
import br.com.caelum.ingresso.dao.LugarDao;
import br.com.caelum.ingresso.dao.SessaoDao;
import br.com.caelum.ingresso.model.Carrinho;

@Controller
public class CompraController {
	
	@Autowired
	private SessaoDao sessaoDao;
	
	@Autowired
	private LugarDao lugarDao;
	
	@Autowired
	private Carrinho carrinho;
	
	@Autowired
	private IngressoDao ingressoDao;

	public ModelAndView comprar(){
		synchronized (this) {
			
		}
		
		return null;
	}
}
