package br.usjt.veiculospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.veiculospringboot.model.Veiculo;

public interface VeiculosRepository extends JpaRepository<Veiculo, Long>{

}
