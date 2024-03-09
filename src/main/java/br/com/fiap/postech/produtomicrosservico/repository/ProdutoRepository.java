package br.com.fiap.postech.produtomicrosservico.repository;

import br.com.fiap.postech.produtomicrosservico.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
