package cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n01.S04T02N01GalanCarlos.controllers;

import cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n01.S04T02N01GalanCarlos.model.domain.Fruit;
import cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n01.S04T02N01GalanCarlos.model.services.FruitService;
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
    private FruitService fruitService;

    @PostMapping("/addFruit")
    public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit){
        try {
            Fruit newFruit = fruitService.addFruit(fruit);
            return new ResponseEntity<>(newFruit, HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getOneFruit/{fruitId}")
    public ResponseEntity<Fruit> getOneFruit(@PathVariable("fruitId") int fruitId){
        Optional<Fruit> fruitData = fruitService.getOneFruit(fruitId);

        if (fruitData.isPresent()){
            return new ResponseEntity<>(fruitData.get(),HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getAllFruits")
    public ResponseEntity<List<Fruit>> getAllFruits(){
        try {
            List<Fruit> fruits = fruitService.getAllFruits();
            return new ResponseEntity<>(fruits, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/updateFruit/{fruitId}")
    public ResponseEntity<Fruit> updateFruit(@PathVariable("fruitId") int fruitId, @RequestBody Fruit newFruit){
        Optional<Fruit> fruitData = fruitService.getOneFruit(fruitId);

        if (fruitData.isPresent()){
            Fruit updatedFruit = fruitData.get();
            updatedFruit.setName(newFruit.getName());
            updatedFruit.setQuantityInKilos(newFruit.getQuantityInKilos());
            return new ResponseEntity<>(fruitService.updateFruit(updatedFruit), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteFruit/{fruitId}")
    public ResponseEntity<HttpStatus> deleteFruit(@PathVariable("fruitId") int fruitId) {
        try {
            fruitService.deleteFruit(fruitId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
