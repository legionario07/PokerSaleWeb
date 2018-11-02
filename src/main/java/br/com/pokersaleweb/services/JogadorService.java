package br.com.pokersaleweb.services;

import static br.com.pokersaleweb.consumes.WebServiceUtil.getUrlJogadorFindAll;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pokersale.entitys.EntidadeDominio;
import br.com.pokersale.entitys.Jogador;
import br.com.pokersaleweb.consumes.RestTemplatesImpl;

@Service
public class JogadorService {

	private static final Logger logger = LoggerFactory.getLogger(JogadorService.class);
	
	@Autowired
	private RestTemplatesImpl restTemplatesImpl;
	
	private List<Jogador> jogadores;
	
	public List<Jogador> findAll(){
		
		List<EntidadeDominio> lista = null;
		jogadores = new ArrayList<Jogador>();
		
		try {
			lista = restTemplatesImpl.findAll(getUrlJogadorFindAll());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		};
	
		if(lista == null || lista.isEmpty()) {
			return jogadores;
		}
		
		for(EntidadeDominio e : lista) {
			jogadores.add((Jogador) e);
		}
		
		return jogadores;
		
	}
	
}
