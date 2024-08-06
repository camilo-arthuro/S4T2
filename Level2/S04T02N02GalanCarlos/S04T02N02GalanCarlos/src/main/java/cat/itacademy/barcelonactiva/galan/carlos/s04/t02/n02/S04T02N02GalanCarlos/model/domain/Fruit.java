package cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n02.S04T02N02GalanCarlos.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Fruits")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private int kilos;

    public Fruit() {
    }

    public Fruit(String name, int kilos) {
        this.name = name;
        this.kilos = kilos;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }
}
