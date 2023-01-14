# Aufgabe 1

Schreiben Sie die Methode **summeDiagonale**, die ein quadratisches,
zweidimensionales Array _a_ mit **double**-Werten entgegennimmt und die Summe
der Werte der beiden Diagonalen als **double**-Wert zurückgibt.

Beispiele:

|                                                                              Eingabe (double[][]) | Rückgabe |
| ------------------------------------------------------------------------------------------------: | -------- |
|                                                       [[1.0 2.0 3.0] [4.0 5.0 6.0] [7.0 8.0 9.0]] | 30.0     |
| [[1.13 2.26 3.83 4.94] [5.5 6.66 34.3 24.64] [12.21 52.25 34.37 24.84] [165.21 287.2 3.73 44.49]] | 343.35   |

# Aufgabe 2

Schreiben Sie die Methode **wieOftWort**, die einen **String** _s_ und ein
**String**-Array _a_ entgegennimmt und die Häufigkeit des Vorkommens des
**Strings** _s_ im **String**-Array _a_ als **int**-Wert zurückgibt.

_Hinweis: Groß- und Kleinschreibung wird **nicht** berücksichtigt._

Beispiele:

| Eingabe (String) |                    Eingabe (String[])                     | Rückgabe |
| ---------------: | :-------------------------------------------------------: | -------- |
|            Mensa | [_Mensa_,_mensa_,_Informatik_,_Keks_,_Informatik_,_Info_] | 2        |
|             Keks | [_Mensa_,_mensa_,_Informatik_,_Keks_,_Informatik_,_Info_] | 1        |
|             Holz | [_Mensa_,_mensa_,_Informatik_,_Keks_,_Informatik_,_Info_] | 0        |

# Aufgabe 3

Implementieren Sie das Spiel Vier Gewinnt, bei dem zwei Spieler abwechselnd
farbige Scheiben in ein sieben Spalten breites und sechs Reihen hohes Gitter
werfen.

Schreiben Sie die Methode **erzeugeSpielfeld**, die ein leeres zweidimensionales
**String**-Array nach folgendem Muster zurückgibt:

```
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
---------------
```

Schreiben Sie die Methode **druckeSpielfeld**, die das obengenannte Spielfeld
entgegennimmt und auf der Konsole ausgibt.

Schreiben Sie die Methode **legeRot**, die das obengenannte Spielfeld
entgegennimmt und über eine Konsoleneingabe einliest in welche Spalte die rote
Scheibe gelegt werden soll. Daraufhin soll ein `'R'` an der korrekten Stelle im
Spielfeld platziert werden.

Schreiben Sie ebenfalls die Methode **legeBlau**, mit dem Unterschied, dass
dieses Mal `'B'` in das Spielfeld geschrieben wird.

Schreiben Sie die Methode **pruefeSieger**, die das Spielfeld entgegennimmt und
einen **String** mit der Farbe des Siegers (`'R'` oder `'B'`) zurückgibt, falls
ein Sieger bestimmt werden kann.

Es gibt folgende Gewinnmöglichkeiten:

- Horizontale Linie aus vier roten bzw. blauen Scheiben.

- Vertikale Linie aus vier roten bzw. blauen Scheiben.

- Diagonale Linie aus vier roten bzw. blauen Scheiben.

Nachdem ein Sieger ermittelt wurde, soll das Programm beendet werden.

Beispiel des Programmablaufs:

```
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
---------------
Spieler Rot: Welche Spalte? [0-6]: 0

| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
|R| | | | | | |
---------------
Spieler Blau: Welche Spalte? [0-6]: 0

| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
|B| | | | | | |
|R| | | | | | |
---------------
Spieler Rot: Welche Spalte? [0-6]: 1

| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
|B| | | | | | |
|R|R| | | | | |
---------------
Spieler Blau: Welche Spalte? [0-6]: 0

| | | | | | | |
| | | | | | | |
| | | | | | | |
|B| | | | | | |
|B| | | | | | |
|R|R| | | | | |
---------------
Spieler Rot: Welche Spalte? [0-6]: 2

| | | | | | | |
| | | | | | | |
| | | | | | | |
|B| | | | | | |
|B| | | | | | |
|R|R|R| | | | |
---------------
Spieler Blau: Welche Spalte? [0-6]: 0

| | | | | | | |
| | | | | | | |
|B| | | | | | |
|B| | | | | | |
|B| | | | | | |
|R|R|R| | | | |
---------------
Spieler Rot: Welche Spalte? [0-6]: 3

| | | | | | | |
| | | | | | | |
|B| | | | | | |
|B| | | | | | |
|B| | | | | | |
|R|R|R|R| | | |
---------------
Spieler Rot hat gewonnen!
```
