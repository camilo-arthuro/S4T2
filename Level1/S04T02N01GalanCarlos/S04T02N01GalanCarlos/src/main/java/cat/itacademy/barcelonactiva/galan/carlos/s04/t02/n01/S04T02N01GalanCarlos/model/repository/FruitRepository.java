package cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n01.S04T02N01GalanCarlos.model.repository;

import cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n01.S04T02N01GalanCarlos.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {
}
