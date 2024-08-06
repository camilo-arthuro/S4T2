package cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n01.S04T02N01GalanCarlos.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Fruits")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int fruitId;

    @Column(name = "name")
    private String name;

    @Column(name = "quantityInKilos")
    private int quantityInKilos;

    public Fruit() {
    }

    public Fruit(String name, int quantityInKilos){
        this.name = name;
        this.quantityInKilos = quantityInKilos;
    }

    public int getFruitId() {
        return fruitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityInKilos() {
        return quantityInKilos;
    }

    public void setQuantityInKilos(int quantityInKilos) {
        this.quantityInKilos = quantityInKilos;
    }
}
