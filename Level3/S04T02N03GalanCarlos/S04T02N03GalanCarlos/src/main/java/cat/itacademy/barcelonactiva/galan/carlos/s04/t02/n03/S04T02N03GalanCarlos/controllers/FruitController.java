package cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n03.S04T02N03GalanCarlos.controllers;

import cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n03.S04T02N03GalanCarlos.model.domain.Fruit;
import cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n03.S04T02N03GalanCarlos.model.services.FruitServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    @Autowired
    private FruitServices fruitServices;

    @PostMapping("/addFruit")
    public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit){
        try {
            Fruit newFruit =fruitServices.addFruit(fruit);
            return new ResponseEntity<>(newFruit, HttpStatus.CREATED);
        } catch (Exception ex){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Fruit> getById(@PathVariable("id") int id){
        Optional<Fruit> fruitData = fruitServices.getById(id);

        if (fruitData.isPresent()){
            return new ResponseEntity<>(fruitData.get(),HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getAllFruits")
    public ResponseEntity<List<Fruit>> getAllFruits(){
        try {
            List<Fruit> fruits = fruitServices.getAllFruits();
            return new ResponseEntity<>(fruits, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/updateFruit/{id}")
    public ResponseEntity<Fruit> updateFruit(@PathVariable("id") int id, @RequestBody Fruit newFruit){
        Optional<Fruit> fruitData = fruitServices.getById(id);

        if (fruitData.isPresent()){
            Fruit updatedFruit = fruitData.get();
            updatedFruit.setName(newFruit.getName());
            updatedFruit.setKilos(newFruit.getKilos());
            return new ResponseEntity<>(fruitServices.updateFruit(updatedFruit), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteFruit/{id}")
    public ResponseEntity<HttpStatus> deleteFruit(@PathVariable("id") int id) {
        try {
            fruitServices.deleteFruit(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
