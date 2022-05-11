package tacos.data;

import org.springframework.stereotype.Repository;

import tacos.Taco;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository

public interface TacoRepository extends JpaRepository<Taco, Long>{

}
