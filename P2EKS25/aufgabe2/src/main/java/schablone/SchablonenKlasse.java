package schablone;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

import annotationen.Bearbeite1;
import annotationen.Bearbeite2;
import annotationen.Bearbeite3;

public class SchablonenKlasse {
    private Class<?>[] klassen;

    public SchablonenKlasse(Class<?>[] klassen) {
        this.klassen = klassen;
    }

    public void schablonenMethode() throws InvocationTargetException, IllegalAccessException,
            InstantiationException {
        int prim = findePrimzahl();
        int bearbeite1 = bearbeite1(prim);
        ausgabe(bearbeite1);
        int bearbeite2 = bearbeite2(bearbeite1);
        ausgabe(bearbeite2);
        int restmod5 = restMod5(bearbeite2);
        int bearbeite3 = bearbeite3(restmod5);
        ausgabe(bearbeite3);
    }

    private int findePrimzahl() {
        int min = 1;
        int max = 25; //Anzahl an Primzahlen im Array primzahlen
        int[] primzahlen = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        Random random = new Random();
        int zufaelligePrimzahl = min + random.nextInt(max - min + 1);
        System.out.println("Primzahl = " + zufaelligePrimzahl);
        return zufaelligePrimzahl;
    }

    private void ausgabe(int zahl) {
        System.out.println("Zahl = " + zahl);
    }

    private int restMod5(int zahl) {
        int rest = zahl % 5;
        System.out.println("Rest = " + rest);
        return rest;
    }

    private int bearbeite1(int zahl1)
            throws InvocationTargetException, IllegalAccessException, InstantiationException {
        return editNumberWithAnnotatedMethod(zahl1, Bearbeite1.class);
    }
    private int bearbeite2(int zahl2)
            throws InvocationTargetException, IllegalAccessException, InstantiationException {
        return editNumberWithAnnotatedMethod(zahl2, Bearbeite2.class);
    }

    private int bearbeite3(int zahl3)
            throws InvocationTargetException, IllegalAccessException, InstantiationException {
        return editNumberWithAnnotatedMethod(zahl3, Bearbeite3.class);
    }
    private int editNumberWithAnnotatedMethod(int zahl, Class<? extends Annotation> annotation)
            throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Optional<Class<?>> classWithMethod = Arrays.stream(klassen)
                .filter(aClass -> Arrays.stream(aClass.getDeclaredMethods())
                        .anyMatch(method -> method.isAnnotationPresent(annotation)))
                .findFirst();
        if (classWithMethod.isEmpty()) {
            throw new UnsupportedOperationException("No class with expected annotation " + annotation + "found");
        }
        Optional<Method> possibleMethod =
                Arrays.stream(classWithMethod.get().getDeclaredMethods()).filter(method -> method.isAnnotationPresent(annotation))
                        .findAny();
        if (possibleMethod.isEmpty()) {
            throw new UnsupportedOperationException("No class with expected annotation " + annotation + "found");
        }
        possibleMethod.get().setAccessible(true);
        Object classInstance = classWithMethod.get().newInstance();
        return (int) possibleMethod.get().invoke(classInstance, zahl);
    }
}
