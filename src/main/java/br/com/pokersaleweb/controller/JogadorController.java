package br.com.pokersaleweb.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.pokersale.entitys.Jogador;
import br.com.pokersaleweb.services.JogadorService;

@Controller
@RequestMapping("/jogadores")
public class JogadorController {
	
	@Autowired
	private JogadorService jogadorService;
	
	private ModelAndView mv;
	private String mensagem;
	private String numMemorando;
	private Calendar dataEnvio;
	private List<Jogador> jogadores = new ArrayList<Jogador>();
	
	private static final String CADASTRO_VIEW = "jogador";
	
	@RequestMapping("/novo")
	public ModelAndView novo() {

		mv = new ModelAndView(CADASTRO_VIEW);
		mv.addObject(new Jogador());
		return mv;
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView add(Jogador jogador) {
		
//		mensagem = solicitacaoService.save(solicitacao);

		mv.addObject("mensagem", mensagem);
		mv.addObject(new Jogador());

		return mv;
	}
	
	@ModelAttribute("jogadores")
	public List<Jogador> jogadores() {
		return jogadorService.findAll();
	}
	
	
	
	/*@RequestMapping("/adicionar")
	public ModelAndView adicionar(@Validated Jogador jogador, Errors errors) {
		
		
		mv = new ModelAndView(CADASTRO_VIEW);
		if (errors.hasErrors() || 
				solicitacao.getPaciente().getSIS().length()<1||
				solicitacao.getPaciente().getNome().length()<1) {
			mv.addObject("mensagem", "SIS ou NOME inválido");
			return mv;
		}

		solicitacao.setUnidadeDeSaude(new UnidadeDeSaude(6l));
		solicitacoes.add(solicitacao);
		mv.addObject("solicitacoes", solicitacoes);
		
		//salva o ultimo memorando e a data de Envio para agilizar a digitação
		numMemorando = solicitacao.getNumeroMemorando();
		dataEnvio = solicitacao.getDataEnvio();
		
		solicitacao = new Solicitacao();
		solicitacao.setNumeroMemorando(numMemorando);
		solicitacao.setDataEnvio(dataEnvio);
		
		mv.addObject(solicitacao);
		return mv;
		
	}
	*/
	/*@RequestMapping("{SIS}/{especialidade}")
	public ModelAndView edit(@PathVariable("SIS") String SIS, @PathVariable("especialidade") String especialidade ) {

		List<Solicitacao> tempSolicitacoes = new ArrayList<Solicitacao>();
		tempSolicitacoes = solicitacoes;

		for(int i = 0; i<solicitacoes.size();i++) {
			if(solicitacoes.get(i).getEspecialidade().getNomeEspecialidade().equals(especialidade) && 
					solicitacoes.get(i).getPaciente().getSIS().equals(SIS)) {
				tempSolicitacoes.remove(i);
				continue;
			}
		}
		
		solicitacoes = tempSolicitacoes;
		
		mv = new ModelAndView(CADASTRO_VIEW);
		mv.addObject("solicitacoes", solicitacoes);
		
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.setNumeroMemorando(numMemorando);
		solicitacao.setDataEnvio(dataEnvio);
		
		mv.addObject(solicitacao);
		
		return mv;

	}*/
	
	@GetMapping()
	public ModelAndView all() {
		
		List<Jogador> jogadores = new ArrayList<Jogador>();
		jogadores = jogadorService.findAll();
		mv = new ModelAndView("jogadores");
		mv.addObject("jogadores", jogadores);
		return mv;
		
	}
	
	
}