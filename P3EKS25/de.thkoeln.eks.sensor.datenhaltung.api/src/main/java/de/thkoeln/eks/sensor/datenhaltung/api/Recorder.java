package de.thkoeln.eks.sensor.datenhaltung.api;

public interface Recorder {
    public int gespeicherterWert(Integer id);
    public boolean setzeWert(Integer id, int wert);
    public boolean anmeldenRecorder(Integer id);
}
