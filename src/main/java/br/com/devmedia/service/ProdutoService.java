package br.com.devmedia.service;

import java.util.List;

import br.com.devmedia.domain.Produto;

public interface ProdutoService {

	void salvar(Produto produto);

	List<Produto> recuperar();

	Produto recuperarPorId(long id);

	void excluir(long id);

}
