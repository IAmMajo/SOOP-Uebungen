# Zuweisungen, Berechnungen, Bedingte Ausführung, Fallunterscheidung

## Aufgaben

### Aufgabe 1

Legen Sie sich ein neues Eclipse Projekt an. Legen Sie in diesem Projekt eine neue Klasse `RechteckAufgabe` an. Kopieren Sie den folgenden Java-Quelltext in diese Datei:


```java
import java.util.Scanner;

public class RechteckAufgabe {

	public static void main(String[] args) {
		int laenge = 0;
		int breite = 0;
		int flaeche = 0;
		int umfang = 0;

		// Eingabe:


		// Berechnung:
		umfang =
		flaeche =

		// Ausgabe:

	}
}
```

Mit dem Programm sollen Rechteckberechnungen durchgeführt werden. Erweitern Sie das Programm so, dass es die folgenden Aufgaben erfüllt:

* Einlesen der Länge eines Rechtecks von der Konsole
* Einlesen der Breite eines Rechtecks von der Konsole
* Berechnung des Umfangs des Rechtecks
* Berechnung der Fläche des Rechtecks
* Ausgabe der Ergebnisse (Anzeige der Eingabe, des Umfangs und der Fläche)

Achten Sie darauf, dass Sie nur einen einzigen Scanner für beide Eingaben (Länge und Breite) verwenden. Insbesondere in den Miniprojekten kann Jack Ihre Lösung sonst nicht überprüfen und wertet sie als falsch.

Beispiel der Programmausführung:

```
Länge des Rechtecks: 12
Breite des Rechtecks: 5

R: 12 5
Umfang: 34
Fläche: 60
```

Führen Sie Ihr Programm in Eclipse aus und prüfen Sie, ob es korrekt arbeitet. Beseitigen Sie ggf. Fehler. Wiederholen Sie dies, bis Sie der Ansicht sind, dass das Programm korrekt arbeitet

### Aufgabe 2

Schreiben Sie ein Programm, das eine ganze Zahl als Benutzereingabe entgegennimmt und ausgibt, ob die Zahl durch 3 teilbar ist.

Beispiele der Programmausführung:

```
Geben Sie eine ganze Zahl ein: 12
12 ist durch 3 teilbar

Geben Sie eine ganze Zahl ein: 14
14 ist nicht durch 3 teilbar
```

### Aufgabe 3

Schreiben Sie ein Programm, das zwei ganze Zahlen als Benutzereingabe entgegennimmt und geben Sie die größere der beiden Zahlen aus. Falls die Zahlen gleich groß sind geben Sie eine entsprechende Meldung aus.

Beispiele der Programmausführung:

```
Geben Sie eine ganze Zahl ein: 12
Geben Sie eine ganze Zahl ein: 47

47 ist größer als 12


Geben Sie eine ganze Zahl ein: 42
Geben Sie eine ganze Zahl ein: 42

Die Zahlen sind gleich groß.
```


### Aufgabe 4

Schreiben Sie ein Programm, das zwei ganze Zahlen als Benutzereingabe entgegennimmt und ermittelt, ob die erste Zahl durch die zweite Zahl teilbar ist.

Beispiele der Programmausführung:

```
erste Zahl: 12
zweite Zahl: 5
12 ist nicht durch 5 teilbar

erste Zahl: 42
zweite Zahl: 21
42 ist durch 21 teilbar
```

### Aufgabe 5

Schreiben Sie ein Programm, das vom Benutzer zwei Zahlen entgegennimmt und prüft, ob eine dritte eingegebene Zahl im geschlossenen Intervall der ersten beiden Zahlen liegt (recherchieren Sie ggf. was geschlossenes Intervall bedeutet). Das Intervall soll auch "in falscher Reihenfolge" eingegeben werden können.

Beispiele des Programmablaufs:

```
1. Intervallgrenze: 31
2. Intervallgrenze: 40
Zahl: 26

26 liegt nicht im Intervall [31, 40]


1. Intervallgrenze: 17
2. Intervallgrenze: -4
Zahl: 0

0 liegt im Intervall [-4, 17]
```

### Aufgabe 6

Schreiben Sie ein Programm, das eine ganze Zahl im Intervall [0, 9999] als Benutzereingabe entgegennimmt und das deutsche Zahlwort ausgibt.

Die Aufgabe ist ohne Schleife lösbar. Eine Schleife würde die Lösung eher verkomplizieren.

Verwenden Sie keine Arrays, falls Sie schon wissen, was Arrays sind.

Beispiele des Programmablaufs:

```
Zahl [0..9999]: 1
eins

Zahl [0..9999]: 17
siebzehn

Zahl [0..9999]: 116
einhundertsechzehn

Zahl [0..9999]: 341
dreihunderteinundvierzig

Zahl [0..9999]: 1000
eintausend

Zahl [0..9999]: 5234
fünftausendzweihundertvierunddreißig
```


### Aufgabe 7

Schreiben Sie ein Programm, das verschiedene physikalische Berechnungen durchführen kann. Folgende Berechnungen sollen möglich sein:

* (0)  Geschwindigkeit aus Weg und Zeit
* (1) Kraft aus Masse und Beschleunigung
* (2) Widerstand aus Spannung und Stromstärke
* (3) Leistung aus Spannung und Stromstärke

Lesen Sie zuerst eine Benutzereingabe ein, die festlegt, welche Operation ausgeführt werden soll. Verwenden Sie die oben angegebenen Zahlen zwischen 0 und 3.

Lesen Sie danach zwei weitere Zahlen als Benutzereingabe ein. Diese Zahlen repräsentieren die
Eingabe der ausgewählten Berechnung. Berechnen Sie das Ergebnis und geben Sie es aus.

Beispiele des Programmablaufs:

```
Berechnung wählen (0..3): 1
Kraft aus Masse und Beschleunigung

Masse [kg]: 200
Beschleunigung [m/s^2]: 4

Kraft = 800.0 N


Berechnung wählen (0..3): 2
Widerstand aus Spannung und Stromstärke

Spannung [V]: 230
Stromstärke [A]: 4

Widerstand = 57.5 Ohm
```
