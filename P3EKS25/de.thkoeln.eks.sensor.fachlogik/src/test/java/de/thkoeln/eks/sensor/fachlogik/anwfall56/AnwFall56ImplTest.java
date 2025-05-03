package de.thkoeln.eks.sensor.fachlogik.anwfall56;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import de.thkoeln.eks.sensor.datenhaltung.api.Gateway;
import de.thkoeln.eks.sensor.datenhaltung.api.Recorder;
import de.thkoeln.eks.sensor.datenhaltung.api.Sensor;

public class AnwFall56ImplTest {

	private static final String TEST_NAME = "test";
	@Mock
	private Gateway gateway;
	@Mock
	private Recorder recorder;
	@InjectMocks
	private AnwFall56Impl anwFall56;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testAnwFall56Imp() {
		Mockito.when(gateway.exists(TEST_NAME)).thenReturn(false);
		ArgumentCaptor<Sensor> argumentCaptor = ArgumentCaptor.forClass(Sensor.class);

		Mockito.when(gateway.registriereSensor(argumentCaptor.capture())).thenReturn(1);
		Sensor testSensor = new Sensor(TEST_NAME+ "MeinSensor");
		testSensor.setId(1);
		Mockito.when(gateway.get(1)).thenReturn(testSensor);
		Mockito.when(gateway.aktuellenWertAbfragen(1)).thenReturn(0);
		Mockito.when(gateway.istNutzbar(1)).thenReturn(false);
		Mockito.when(gateway.istNutzbar(1)).thenReturn(true);
		Mockito.when(recorder.anmeldenRecorder(1)).thenReturn(true);
		Mockito.when(gateway.istNutzbar(1)).thenReturn(true);
		Mockito.when(recorder.gespeicherterWert(1)).thenReturn(2);
		Mockito.when(gateway.aktuellenWertAbfragen(1)).thenReturn(2);
		Mockito.when(recorder.setzeWert(1, 2)).thenReturn(true);
		Mockito.when(recorder.gespeicherterWert(1)).thenReturn(2);

		anwFall56.anmeldenSensorSpeichern(TEST_NAME);

		Mockito.verify(gateway).exists(TEST_NAME);
		Mockito.verify(gateway, Mockito.times(1)).registriereSensor(argumentCaptor.capture());
		Sensor sensor = argumentCaptor.getValue();
		String actualSensorName = sensor.getName();
		String expectedSensorName = TEST_NAME + "MeinSensor";
		Integer actualId = sensor.getId();
		Assert.assertEquals(actualSensorName, expectedSensorName);
		Assert.assertNull(actualId);

		Mockito.verify(gateway, Mockito.atLeastOnce()).get(1);
		Mockito.verify(gateway, Mockito.times(2)).aktuellenWertAbfragen(1);
		Mockito.verify(gateway, Mockito.times(3)).istNutzbar(1);
		Mockito.verify(gateway).setNutzbar(1, true);
		Mockito.verify(recorder, Mockito.atLeastOnce()).anmeldenRecorder(1);
		Mockito.verify(recorder, Mockito.times(2)).gespeicherterWert(1);
		Mockito.verify(recorder).setzeWert(1, 2);

	}
}