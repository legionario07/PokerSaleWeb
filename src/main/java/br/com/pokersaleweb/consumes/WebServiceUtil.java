package br.com.pokersaleweb.consumes;

/**
 * Created by PauLinHo on 10/08/2017.
 */

public class WebServiceUtil {

    //bountys
    private static final String URL_BOUNTY_FIND_ALL = getUrl()+"bounty/findAll";
    
    //bountyValues
    private static final String URL_BOUNTYVALUES_FIND_ALL = getUrl()+"bountyValues/findAll";
    private static final String URL_BOUNTYVALUES_SAVE = getUrl()+"bountyValues/save";
    private static final String URL_BOUNTYVALUES_DELETE = getUrl()+"bountyValues/delete";

    //colocações
    private static final String URL_COLOCACOES_FIND_ALL = getUrl()+"colocacao/findAll";
    private static final String URL_COLOCACOES_SAVE = getUrl()+"colocacao/save";
    private static final String URL_COLOCACOES_DELETE = getUrl()+"colocacao/delete";

    //Configurações
    private static final String URL_CONFIGURACOES_FIND_ALL = getUrl()+"configuracao/findAll";
    private static final String URL_CONFIGURACOES_SAVE = getUrl()+"configuracao/save";
    private static final String URL_CONFIGURACOES_DELETE = getUrl()+"configuracao/delete";

    //despesas
    private static final String URL_DESPESAS_FIND_ALL = getUrl()+"despesa/findAll";

    //entradas
    private static final String URL_ENTRADAS_FIND_ALL = getUrl()+"entrada/findAll";
    private static final String URL_ENTRADAS_SAVE = getUrl()+"entrada/save";
    private static final String URL_ENTRADAS_DELETE = getUrl()+"entrada/delete";

    //JOGADORES
    private static final String URL_JOGADOR_SAVE = getUrl()+"jogador/save/";
    private static final String URL_JOGADOR_DELETE = getUrl()+"jogador/delete";
    private static final String URL_JOGADOR_FIND_ALL = getUrl()+"jogador/findAll";
    private static final String URL_JOGADOR_LOGIN = getUrl()+"jogador/login";

    //locais
    private static final String URL_LOCAIS_FIND_ALL = getUrl()+"local/findAll";
    private static final String URL_LOCAIS_SAVE = getUrl()+"local/save";
    private static final String URL_LOCAIS_DELETE = getUrl()+"local/delete";

    //notas
    private static final String URL_NOTAS_FIND_ALL = getUrl()+"nota/findAll";
    private static final String URL_NOTAS_SAVE = getUrl()+"nota/save";
    private static final String URL_NOTAS_DELETE = getUrl()+"nota/delete";

    //Partidas
    private static final String URL_PARTIDA_SAVE = getUrl()+"partida/save/";
    private static final String URL_PARTIDA_FIND_ALL = getUrl()+"partida/findAll";
    private static final String URL_PARTIDA_FIND_ALL_BY_ANO = getUrl()+"partida/findAllByAno";
    private static final String URL_PARTIDA_FIND_ALL_BY_JOGADOR = getUrl()+"partida/findAllPartidasByJogador";
    private static final String URL_PARTIDA_FIND_ALL_BY_JOGADOR_BY_ANO = getUrl()+"partida/findAllPartidasByJogadorByAno";


    //Perfis
    private static final String URL_PERFIL_SAVE = getUrl()+"perfil/save/";
    private static final String URL_PERFIL_DELETE = getUrl()+"perfil/delete/";
    private static final String URL_PERFIL_FIND_ALL = getUrl()+"perfil/findAll";

    //potes
    private static final String URL_POTES_SAVE = getUrl()+"pote/save";
    private static final String URL_POTES_FIND = getUrl()+"pote/find";

    //pontuações
    private static final String URL_PONTUACOES_FIND_ALL = getUrl()+"pontuacao/findAll";

    //premiacoes
    private static final String URL_PREMIACOES_FIND_ALL = getUrl()+"premiacao/findAll";

    //Premiação Ranking
    private static final String URL_PREMIACOES_RANKING_FIND_ALL = getUrl()+"premiacaoRanking/findAll";
    private static final String URL_PREMIACOES_RANKING_SAVE = getUrl()+"premiacaoRanking/save";
    private static final String URL_PREMIACOES_RANKING_DELETE = getUrl()+"premiacaoRanking/delete";

    //retiradas
    private static final String URL_RETIRADAS_FIND_ALL = getUrl()+"retirada/findAll";
    private static final String URL_RETIRADAS_SAVE = getUrl()+"retirada/save";
    private static final String URL_RETIRADAS_DELETE = getUrl()+"retirada/delete";

    //Usuarios
    private static final String URL_USUARIO_SAVE = getUrl()+"usuario/save/";
    private static final String URL_USUARIO_UPDATE_NO_KEY = getUrl()+"usuario/updateNoKey/";
    private static final String URL_USUARIO_DELETE = getUrl()+"usuario/delete";
    private static final String URL_USUARIO_FIND_ALL = getUrl()+"usuario/findAll";

    /**
     * Method that returns the beginning of the webservice URL
     * @return
     */
    public static String getUrl(){

        String URL = "http://omniatechnology.com.br/PokerSaleWS/webresources/";
        //String URL = "http://192.168.0.104:8080/PokerSaleWS/webresources/";

        return URL;

    }

    public static String getUrlJogadorSave() {
        return URL_JOGADOR_SAVE;
    }


    public static String getUrlJogadorFindAll() {
        return URL_JOGADOR_FIND_ALL;
    }


    public static String getUrlJogadorLogin() {
        return URL_JOGADOR_LOGIN;
    }

    public static String getUrlPartidaSave() {
        return URL_PARTIDA_SAVE;
    }

    public static String getUrlPartidaFindAll() {
        return URL_PARTIDA_FIND_ALL;
    }

    public static String getUrlPerfilSave() {
        return URL_PERFIL_SAVE;
    }

    public static String getUrlPerfilFindAll() {
        return URL_PERFIL_FIND_ALL;
    }

    public static String getUrlUsuarioSave() {
        return URL_USUARIO_SAVE;
    }

    public static String getUrlUsuarioDelete() {
        return URL_USUARIO_DELETE;
    }

    public static String getUrlUsuarioFindAll() {
        return URL_USUARIO_FIND_ALL;
    }


    public static String getUrlJogadorDelete() {
        return URL_JOGADOR_DELETE;
    }


  public static String getUrlUsuarioUpdateNoKey() {
        return URL_USUARIO_UPDATE_NO_KEY;
    }

    public static String getUrlLocaisFindAll() {
        return URL_LOCAIS_FIND_ALL;
    }

    public static String getUrlColocacoesFindAll() {
        return URL_COLOCACOES_FIND_ALL;
    }

    public static String getUrlConfiguracoesSave() {
        return URL_CONFIGURACOES_SAVE;
    }


    public static String getUrlConfiguracoesDelete() {
        return URL_CONFIGURACOES_DELETE;
    }

    public static String getUrlConfiguracoesFindAll() {
        return URL_CONFIGURACOES_FIND_ALL;
    }

    public static String getUrlBountyFindAll() {
        return URL_BOUNTY_FIND_ALL;
    }

    public static String getUrlBountyvaluesFindAll() {
        return URL_BOUNTYVALUES_FIND_ALL;
    }

    public static String getUrlBountyvaluesSave() {
        return URL_BOUNTYVALUES_SAVE;
    }


    public static String getUrlBountyvaluesDelete() {
        return URL_BOUNTYVALUES_DELETE;
    }

    public static String getUrlDespesasFindAll() {
        return URL_DESPESAS_FIND_ALL;
    }

    public static String getUrlEntradasFindAll() {
        return URL_ENTRADAS_FIND_ALL;
    }

    public static String getUrlEntradasSave() {
        return URL_ENTRADAS_SAVE;
    }


    public static String getUrlEntradasDelete() {
        return URL_ENTRADAS_DELETE;
    }

    public static String getUrlLocaisSave() {
        return URL_LOCAIS_SAVE;
    }


    public static String getUrlLocaisDelete() {
        return URL_LOCAIS_DELETE;
    }

    public static String getUrlNotasFindAll() {
        return URL_NOTAS_FIND_ALL;
    }

    public static String getUrlNotasSave() {
        return URL_NOTAS_SAVE;
    }


    public static String getUrlNotasDelete() {
        return URL_NOTAS_DELETE;
    }


    public static String getUrlPerfilDelete() {
        return URL_PERFIL_DELETE;
    }


    public static String getUrlPotesSave() {
        return URL_POTES_SAVE;
    }


    public static String getUrlPontuacoesFindAll() {
        return URL_PONTUACOES_FIND_ALL;
    }

    public static String getUrlPremiacoesFindAll() {
        return URL_PREMIACOES_FIND_ALL;
    }

    public static String getUrlRetiradasFindAll() {
        return URL_RETIRADAS_FIND_ALL;
    }

    public static String getUrlRetiradasSave() {
        return URL_RETIRADAS_SAVE;
    }


    public static String getUrlRetiradasDelete() {
        return URL_RETIRADAS_DELETE;
    }

    public static String getUrlColocacoesSave() {
        return URL_COLOCACOES_SAVE;
    }

    public static String getUrlColocacoesDelete() {
        return URL_COLOCACOES_DELETE;
    }

    public static String getUrlPotesFind() {
        return URL_POTES_FIND;
    }

    public static String getUrlPartidaFindAllByJogador() {
        return URL_PARTIDA_FIND_ALL_BY_JOGADOR;
    }

    public static String getUrlPartidaFindAllByAno() {
        return URL_PARTIDA_FIND_ALL_BY_ANO;
    }

    public static String getUrlPartidaFindAllByJogadorByAno() {
        return URL_PARTIDA_FIND_ALL_BY_JOGADOR_BY_ANO;
    }

    public static String getUrlPremiacoesRankingFindAll() {
        return URL_PREMIACOES_RANKING_FIND_ALL;
    }

    public static String getUrlPremiacoesRankingSave() {
        return URL_PREMIACOES_RANKING_SAVE;
    }

    public static String getUrlPremiacoesRankingDelete() {
        return URL_PREMIACOES_RANKING_DELETE;
    }
}
