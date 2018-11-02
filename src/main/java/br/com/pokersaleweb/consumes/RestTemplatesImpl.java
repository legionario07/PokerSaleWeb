package br.com.pokersaleweb.consumes;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import br.com.pokersale.entitys.EntidadeDominio;
import br.com.pokersaleweb.utils.MapTokenTipos;

@Component
public class RestTemplatesImpl {

	private RestTemplate restTemplate;
	List<EntidadeDominio> lista;

	public List<EntidadeDominio> findAll(String url) throws Exception {

		restTemplate = new RestTemplate();
		lista = new ArrayList<EntidadeDominio>();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ResponseEntity<String> data = null;

		try {
			data = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<Object>(headers), String.class);
		} catch (Exception ex) {
			throw ex;
		}

		if (data.getStatusCodeValue() == HttpStatus.NOT_FOUND.value()) {
			throw new Exception();
		}

		String retorno = data.getBody();
		if(retorno==null || retorno.equals("")) {
			return lista;
		}

		Gson gson = new Gson();
		Type listaType = MapTokenTipos.getTokenType(url);

		lista = gson.fromJson(retorno.toString(), listaType);

		return lista;

	}

}
