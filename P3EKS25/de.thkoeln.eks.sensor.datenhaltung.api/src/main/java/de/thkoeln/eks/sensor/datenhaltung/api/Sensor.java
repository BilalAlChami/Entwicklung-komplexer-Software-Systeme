package de.thkoeln.eks.sensor.datenhaltung.api;

public class Sensor {
    private Integer id;
    private String name;

    public Sensor(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
