package br.com.course.coursesb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.course.coursesb.model.entities.Produto;

public interface ProdutoRepository extends  CrudRepository<Produto, Integer> {

}
