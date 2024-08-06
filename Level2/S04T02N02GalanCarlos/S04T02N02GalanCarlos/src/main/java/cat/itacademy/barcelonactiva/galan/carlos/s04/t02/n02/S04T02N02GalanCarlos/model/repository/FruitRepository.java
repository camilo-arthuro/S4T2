package cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n02.S04T02N02GalanCarlos.model.repository;

import cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n02.S04T02N02GalanCarlos.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {
}
