package br.com.pokersaleweb.utils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import br.com.pokersale.entitys.Bounty;
import br.com.pokersale.entitys.BountyValues;
import br.com.pokersale.entitys.Colocacao;
import br.com.pokersale.entitys.Configuracao;
import br.com.pokersale.entitys.Despesa;
import br.com.pokersale.entitys.Entrada;
import br.com.pokersale.entitys.Jogador;
import br.com.pokersale.entitys.Local;
import br.com.pokersale.entitys.Nota;
import br.com.pokersale.entitys.Partida;
import br.com.pokersale.entitys.Perfil;
import br.com.pokersale.entitys.Pontuacao;
import br.com.pokersale.entitys.Pote;
import br.com.pokersale.entitys.Premiacao;
import br.com.pokersale.entitys.PremiacaoRanking;
import br.com.pokersale.entitys.Retirada;
import br.com.pokersale.entitys.Usuario;
import br.com.pokersaleweb.consumes.WebServiceUtil;

/**
 * Created by PauLinHo on 25/12/2017.
 */

/**
 * Ao receber um get tipo FIND_ALL, Gson nao sabe como criar a lista
 * essa classe util devolve o TYPE corresponde
 */
public class MapTokenTipos {

    private static Map<String, Type> mapTypes = new HashMap<>();


    /**
     * Recebe a url e devolve o TYPE Correspondente
     * @param url
     * @return
     */
    public static Type getTokenType(String url){

        createMap();

        return mapTypes.get(url);

    }

    /**
     * Cria o map baseando nas url que contem FIND_ALL
     */
    private static void createMap(){
        mapTypes.put(WebServiceUtil.getUrlBountyFindAll(), new TypeToken<List<Bounty>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlBountyvaluesFindAll(), new TypeToken<List<BountyValues>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlColocacoesFindAll(), new TypeToken<List<Colocacao>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlConfiguracoesFindAll(), new TypeToken<List<Configuracao>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlDespesasFindAll(), new TypeToken<List<Despesa>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlEntradasFindAll(), new TypeToken<List<Entrada>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlJogadorFindAll(), new TypeToken<List<Jogador>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlLocaisFindAll(), new TypeToken<List<Local>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlNotasFindAll(), new TypeToken<List<Nota>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlPartidaFindAll(), new TypeToken<List<Partida>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlPartidaFindAllByJogador(), new TypeToken<List<Partida>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlPartidaFindAllByJogadorByAno(), new TypeToken<List<Partida>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlPartidaFindAllByAno(), new TypeToken<List<Partida>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlPartidaFindAllByJogadorByAno(), new TypeToken<List<Partida>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlPerfilFindAll(), new TypeToken<List<Perfil>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlPontuacoesFindAll(), new TypeToken<List<Pontuacao>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlPotesFind(), new TypeToken<Pote> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlPremiacoesFindAll(), new TypeToken<List<Premiacao>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlRetiradasFindAll(), new TypeToken<List<Retirada>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlUsuarioFindAll(), new TypeToken<List<Usuario>> (){}.getType());
        mapTypes.put(WebServiceUtil.getUrlPremiacoesRankingFindAll(), new TypeToken<List<PremiacaoRanking>> (){}.getType());
    }
}
