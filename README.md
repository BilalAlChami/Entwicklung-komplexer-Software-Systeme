## 📁 Projektübersicht

### 🔹 P1EKS25 – Einführung in Entwurfsmuster
**Ziel: Implementierung von Entwurfsmustern**  

Dieses Projekt enthält zwei Aufgaben mit Fokus auf objektorientiertes Design:

- **Aufgabe 1 – Würfelsimulation mit Strategiemuster**  
  Eine Würfelklasse verwendet das **Strategie-Pattern**, um verschiedene Würfelverhaltensweisen (zufällig, fest, zyklisch) zur Laufzeit auszutauschen.  
  Dies fördert die Offen-Geschlossenheit und flexible Erweiterbarkeit.

- **Aufgabe 2 – Zustandsautomat für eine Waschmaschine**  
  Modelliert eine Waschmaschine als endlichen Automaten mit Zuständen wie *Aus*, *StandBy*, *InBetrieb* etc.  
  Das **State-Pattern** kommt hier zur Anwendung, um das Verhalten der Waschmaschine in den verschiedenen Zuständen zu kapseln.

### 🔹 P2EKS25 – Dependency Injection und Reflections
**Ziel: Anwendung Reflection, Annotationen und DI-Framework Guice**

Dieses Projekt ist in zwei Aufgaben unterteilt:

- **Aufgabe 1 – Preisberechnung mit Guice**  
  Demonstriert die Verwendung von **Google Guice** für Dependency Injection.  
  Unterschiedliche Preisberechner (z. B. für einen bestimmten Monat) werden konfigurierbar eingebunden.  
  Ziel ist es, hohe Testbarkeit und Flexibilität zu erreichen.

- **Aufgabe 2 – Annotationen und Reflektion**  
  Behandelt das Thema **Java-Annotationen** und wie sie mit Reflections zur Laufzeit ausgewertet werden.  
  Annotierte Methoden werden automatisch erkannt und verarbeitet – ein Einstieg in Framework-Konzepte.

### 🔹 P3EKS25 – Sensor-Simulator-System (Hauptprojekt)
**Ziel: Erstellung von Mockito-Testfällen**

Ein modular aufgebautes Softwaresystem zur Simulation und Verarbeitung von Sensordaten. Hier liegt der Fokus auf:

- **Klarer Trennung von Modulen:**
  - `datenhaltung.api`: Schnittstellen zur Datenhaltung
  - `fachlogik`: Umsetzung einer konkreten Anwendung mit fachlicher Logik (`AnwFall56Impl`)
- **Verwendung von Java Modules (JPMS)**
- **Clean-Code-Prinzipien und Testbarkeit mit  Mockito-Testfällen**

Beispielhafte Anwendung:  
Ein Sensor erfasst Daten, diese werden gespeichert und verarbeitet. Die Kommunikation erfolgt über sauber definierte Schnittstellen, sodass Implementierung und Schnittstelle unabhängig voneinander entwickelt und getestet werden können.

## 🛠️ Verwendete Technologien

- Java 17+
- Maven als Build-Tool
- Java Platform Module System (JPMS)
- JUnit 5 für Tests
- Clean Architecture Ansätze

## 🚀 Lokale Ausführung

### Voraussetzungen

- Java JDK 17 oder höher
- Maven installiert

### Schritte

1. Repository klonen:
   ```bash
   git clone <repo-url>
   cd "Entwicklung komplexer Software-Systeme/P3EKS25"
   ```

2. Projekt bauen:
   ```bash
   mvn clean install
   ```

3. Anwendung ausführen (z. B. Unit-Tests in der Fachlogik starten):
   ```bash
   mvn test
   ```

> Hinweis: Die Module sind eigenständig – sie lassen sich separat bauen und testen.

## 👨‍💻 Autoren

Studierende der TH Köln im Rahmen des Moduls *Entwicklung komplexer Softwaresysteme*.
