package br.com.fiap.postech.produtomicrosservico.controller;

import br.com.fiap.postech.produtomicrosservico.entity.Produto;
import br.com.fiap.postech.produtomicrosservico.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoService.listarProdutos();
    }

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        return this.produtoService.cadastrarProduto(produto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listarProduto(@PathVariable(name = "id") Long id) {
        return produtoService.listarProduto(id);
    }
    
    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable(name = "id") Long id, @RequestBody Produto produto) {
    	return produtoService.atualizarProduto(id, produto);
    }

}
