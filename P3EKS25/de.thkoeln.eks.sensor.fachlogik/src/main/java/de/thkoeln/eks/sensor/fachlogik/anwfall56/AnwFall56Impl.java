package de.thkoeln.eks.sensor.fachlogik.anwfall56;

import de.thkoeln.eks.sensor.datenhaltung.api.Gateway;
import de.thkoeln.eks.sensor.datenhaltung.api.Recorder;
import de.thkoeln.eks.sensor.datenhaltung.api.Sensor;

public class AnwFall56Impl {
    private Gateway diesesGateway;
    private Recorder dieserRecorder;

    public void anmeldenSensorSpeichern(String name){
        if (diesesGateway.exists(name)) {
            return;
        }
        String neuerName = name + "MeinSensor";
        Sensor neuerSensor = new Sensor(neuerName);
        Integer id = diesesGateway.registriereSensor(neuerSensor);
        Sensor testAbfrage = diesesGateway.get(id);
        if (testAbfrage.getName().equals(neuerName)){
            diesesGateway.aktuellenWertAbfragen(id);
            diesesGateway.istNutzbar(id);
            diesesGateway.setNutzbar(id, true);
            if (diesesGateway.istNutzbar(id)) {
                dieserRecorder.anmeldenRecorder(id);
            }
        }
        if (diesesGateway.istNutzbar(id)){
            int gespeicherterWert = dieserRecorder.gespeicherterWert(id);
            int aktuellerWert = diesesGateway.aktuellenWertAbfragen(id);
            boolean erfolg = dieserRecorder.setzeWert(id, aktuellerWert);
            if (erfolg) {
                int neuerwert = dieserRecorder.gespeicherterWert(id);
                if (!(neuerwert == aktuellerWert) ) {
                    diesesGateway.setNutzbar(id, false);
                }
            }
        }
        return;
    }

}
