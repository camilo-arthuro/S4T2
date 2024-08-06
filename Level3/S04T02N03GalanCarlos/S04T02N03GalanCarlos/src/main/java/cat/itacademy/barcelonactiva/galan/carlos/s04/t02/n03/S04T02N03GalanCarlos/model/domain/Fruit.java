package cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n03.S04T02N03GalanCarlos.model.domain;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Fruits")
public class Fruit {

    @Id
    private int id;
    private String name;
    private int kilos;

    public Fruit() {
    }

    public Fruit(int id, String name, int kilos) {
        this.id = id;
        this.name = name;
        this.kilos = kilos;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getKilos() {
        return kilos;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }
}
