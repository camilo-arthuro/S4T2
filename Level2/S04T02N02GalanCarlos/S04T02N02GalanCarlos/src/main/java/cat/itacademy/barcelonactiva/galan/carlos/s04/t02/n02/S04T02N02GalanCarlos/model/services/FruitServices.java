package cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n02.S04T02N02GalanCarlos.model.services;

import cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n02.S04T02N02GalanCarlos.model.domain.Fruit;
import cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n02.S04T02N02GalanCarlos.model.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitServices {

    @Autowired
    private FruitRepository fruitRepository;

    public Fruit addFruit(Fruit fruit){
        return fruitRepository.save(fruit);
    }

    public Optional<Fruit> getFruitById(int id){
        return fruitRepository.findById(id);
    }

    public List<Fruit> getAllFruits(){
        return fruitRepository.findAll();
    }

    public Fruit updateFruit(Fruit fruit){
        return fruitRepository.save(fruit);
    }

    public void deleteFruit(int id){
        fruitRepository.deleteById(id);
    }
}
