package br.com.fiap.postech.produtomicrosservico.service;

import br.com.fiap.postech.produtomicrosservico.entity.Produto;
import br.com.fiap.postech.produtomicrosservico.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto cadastrarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public ResponseEntity<?> listarProduto(Long id) {
        Produto produto = produtoRepository.findById(id).orElse(null);
        if(produto != null) {
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
        }
    }

}
