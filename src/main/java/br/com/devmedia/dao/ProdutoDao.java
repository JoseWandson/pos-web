package br.com.devmedia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devmedia.domain.Produto;

@Repository
public interface ProdutoDao extends JpaRepository<Produto, Long> {

}
