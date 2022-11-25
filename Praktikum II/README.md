# Aufgabe 1: Adventure-Gameboard Kodierung

Speichern Sie das verkleinerte Spielfeld aus den Praktikums-Folien in einem dreidimensionalen Array ab. Arbeiten Sie mit folgender Datenstruktur, die hier als Tabelle dargestellt wird, um das Konzept zu veranschaulichen.

Mit 0 oder 1 kennzeichnen wir die Existenz einer Transition.
Für die sieben Symbole des Chomsky-Adventures legen wir fest:

```
  Dragon,//0 D
  Sword,//1 S
  River,//2 R
  Arch,//3 A
  Dor,//4 O
  Key,//5 K
  Treasure//6 T
```

- Erklärung zu Zeile 1 & Spalte 2: state 0 hat einen Übergang zu state 1 mit Index 0. Index 0 steht für das Übergangs-Symbol Drache.
- Erklärung zu Zeile 2 & Spalte 4: state 1 hat einen Übergang zu state 3 mit Index 5. Index 5 steht für das Übergangs-Symbol Schlüssel.

| state | state 0 | state 1 | state 2 | state 3 |
| ----- | ------- | ------- | ------- | ------- |
| 0     | { }     | {0}     | { }     | { }     |
| 1     | { }     | { }     | {2}     | {5}     |
| 2     | {1}     | { }     | { }     | { }     |
| 3     | { }     | { }     | { }     | { }     |

etc.

Die Kodierung für Endzustand (2), Startzustand (1) oder normaler Zustand (0) erfolgt über eine zusätzliche Zeile am Ende der Tabelle, die dann die entsprechenden Einträge enthält.

| - | {1} | {0} | {0} | {0} | {0} | {2} |

Und hier unsere Beispiele aus dem Praktikum am 9.11.2022 (Korrektur 14.11 von gameAFS_origin):

```java
static int[][][] gameAFS_praII = {
			{{},{0},{},{},{},{}},
			{{},{},{2},{5},{},{}},
			{{1},{},{},{},{},{}},
			{{},{},{},{},{4},{}},
			{{},{},{},{},{},{6}},
			{{},{},{},{4},{},{}},
			{{1},{0},{0},{0},{0},{2}}
	};

static int[][][] gameAFS_origin = {
			{{},{0},{},{},{},{},{},{},{},{},{},{},{1},{},{},{}},
			{{},{},{2},{1},{},{},{},{},{},{},{},{},{},{},{},{}},
			{{1},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{}},
			{{},{},{},{},{4},{},{4},{},{},{5},{3},{},{},{},{},{}},
			{{},{},{},{},{},{6},{},{},{},{},{},{},{},{},{},{}},
			{{},{},{},{4},{},{},{},{},{},{},{},{},{},{},{},{}},
			{{},{},{},{},{},{},{},{6},{},{},{},{},{},{},{},{}},
			{{},{},{},{},{},{},{},{},{1},{},{},{},{},{},{},{}},
			{{},{},{},{5},{},{},{},{},{},{},{},{},{},{},{},{}},
			{{},{},{},{0},{},{},{},{},{},{},{},{},{},{},{},{}},
			{{},{},{},{},{},{},{},{},{},{},{},{2},{},{},{},{}},
			{{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{}},
			{{},{},{},{},{},{},{},{},{},{},{},{},{},{6},{},{}},
			{{},{},{},{},{},{},{},{},{},{},{},{},{},{},{0},{}},
			{{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{4}},
			{{},{},{},{},{},{},{},{},{},{},{},{6},{},{},{},{}},
			{{1},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{2},{0},{0},{0},{0}}
	};
```

# Aufgabe 2: Adventure-Gameboard Ausgabe

a) Erstellen Sie ein Programm, welches ein **beliebiges Spielfeld** als Tabelle in der Konsole ausgibt und dabei die Kodierung aus Aufgabe 1 erwartet.

```java
public static String createTable(int [][][] gameboard, int n, int currentState) {
     Lösung
}
```

Dabei steht `gameboard` für das Adventure-Spielfeld, `n` für die Anzahl der Zustände und `currentState` für den Zustand indem sich der Spieler aktuell befindet (Aufgabenteil d).

Verwenden Sie hierfür die ASCII-Art Grafiken für die einzelnen Symbole, welche die Übergänge zwischen den Zuständen beschreiben. Gehen Sie erstmal davon aus, dass zwischen zwei Zuständen maximal eine Transitions-Option gegeben ist.

Zum Testen Ihres Programms können Sie das Spielfeld aus Aufgabe 1 verwenden. **Für die Abnahme müssen Sie dann live ein neues Spielfeld aus GitLab ziehen uns zwar mit den im Praktikum/Vorlesung vorgestellten `git` Konsolen-Befehlen.**

b) Adaptieren Sie Ihre Lösung aus a) nun auch für den Fall, dass zwischen zwei Zuständen mehrere Übergänge möglich sind. Sie müssen keine gesonderten ASCII-Art Grafiken erstellen. Es reicht wenn Sie mit einzelnen Zeichen pro Symbol arbeiten, um die Zellen-Information zu erstellen.

Für das Testen adaptieren Sie Ihr Array aus Aufgabe 1 wie folgt: Setzen Sie den Eintrag für state 0 zu state 1 auf z.B. {0,1}.

c) Überlegen Sie sich, wie Sie ebenfalls die Start- und Endzustände anzeigen können. Ergänzen Sie Ihre Lösung aus b).

d) Heben Sie den Zustand indem der/die Spieler/in sich gerade befindet hervor. Ergänzen Sie Ihre Lösung aus c).

Hier ein Beispiel für eine derartige Tabelle und den Automaten `gameAFS_praII`:

```
      |       1|       2|       3|       4|       5|       6|
*************************************************************
      |        |        |        |        |        |        |
      |        | /\ /\  |        |        |        |        |
--> 1 |        |  o o   |        |        |        |        |
      |        |  --    |        |        |        |        |
      |        |        |        |        |        |        |
*************************************************************
      |        |        |        |        |        |        |
      |        |        | ~~~~~  |* * *** |        |        |
    2 |        |        |  ~~~~~ |****   *|        |        |
      |        |        | ~~~~~  |    *** |        |        |
      |        |        |        |        |        |        |
*************************************************************
      |        |        |        |        |        |        |
      |   *    |        |        |        |        |        |
    3 |  ***   |        |        |        |        |        |
      |   *    |        |        |        |        |        |
      |   *    |        |        |        |        |        |
*************************************************************
      |        |        |        |        | ****** |        |
      |        |        |        |        | *    * |        |
    4 |        |        |        |        | * *  * |        |
      |        |        |        |        | *    * |        |
      |        |        |        |        | ****** |        |
*************************************************************
      |        |        |        |        |        |        |
      |        |        |        |        |        |  ****  |
    5 |        |        |        |        |        | ****** |
      |        |        |        |        |        | * ** * |
      |        |        |        |        |        | ****** |
*************************************************************
      |        |        |        | ****** |        |        |
      |        |        |        | *    * |        |        |
    6 |        |        |        | * *  * |        |        |
      |        |        |        | *    * |        |        |
      |        |        |        | ****** |        |        |
*************************************************************
      |       1|       0|       0|       0|       0|       2|
```
