package cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n03.S04T02N03GalanCarlos.model.repository;

import cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n03.S04T02N03GalanCarlos.model.domain.Fruit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends MongoRepository<Fruit, Integer> {
}
