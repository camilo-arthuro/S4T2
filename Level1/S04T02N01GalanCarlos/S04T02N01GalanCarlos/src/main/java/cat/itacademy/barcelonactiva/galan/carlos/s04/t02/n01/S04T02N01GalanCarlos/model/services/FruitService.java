package cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n01.S04T02N01GalanCarlos.model.services;

import cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n01.S04T02N01GalanCarlos.model.domain.Fruit;
import cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n01.S04T02N01GalanCarlos.model.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    public Fruit addFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public Optional<Fruit> getOneFruit(int fruitId) {
        return fruitRepository.findById(fruitId);
    }

    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }

    public Fruit updateFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public void deleteFruit(int fruitId) {
        fruitRepository.deleteById(fruitId);
    }
}
