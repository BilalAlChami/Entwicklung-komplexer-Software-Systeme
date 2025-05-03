package de.thkoeln.eks.sensor.datenhaltung.api;

public interface Gateway {
    public Sensor get(Integer id);
    public Integer registriereSensor(Sensor sensor);
    public void setNutzbar(Integer id, boolean nutzbar);
    public boolean istNutzbar(Integer id);
    public boolean exists(String name);
    public int aktuellenWertAbfragen(Integer id);
}
