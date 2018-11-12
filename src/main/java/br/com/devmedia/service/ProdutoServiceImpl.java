package br.com.devmedia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devmedia.dao.ProdutoDao;
import br.com.devmedia.domain.Produto;

@Service
@Transactional
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoDao produtoDao;

	@Override
	public void salvar(Produto produto) {
		produtoDao.save(produto);
	}

	@Override
	public List<Produto> recuperar() {
		return produtoDao.findAll();
	}

	@Override
	public Produto recuperarPorId(long id) {
		return produtoDao.findById(id).orElse(null);
	}

	@Override
	public void excluir(long id) {
		produtoDao.deleteById(id);
	}

}
