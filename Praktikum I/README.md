Alle Aufgaben sollen in Eclipse mit Java bearbeitet werden:

# Aufgabe 1: ASCII-Art für Anfänger

Erstellen Sie mit Java eine Grafik im ASCII-Art Stil. Das Thema oder Objekt können Sie hierbei frei wählen, jedoch sollte die Anzahl der Zeichen (ohne Leerzeichen) nicht unter 50 liegen.

# Aufgabe 2: ASCII-Art für das Adventure

a) Erstellen Sie mit Java für drei von fünf Symbolen (Drache, Schwert, Tür, Schlüssel und Schatztruhe) aus dem Chomsky-Hierarchie angelehnten Spiel _The Theory of Finite-State Adventures_ (2003, Bauer, Holzer und König) Grafiken im ASCII-Art Stil.

b) Erstellen Sie für die Darstellung der Zustände (inkl. Label) auch eine Grafik im ASCII-Art Stil.

# Aufgabe 3: ASCII-Art für Fortgeschrittene

a) Konstruieren Sie zunächst auf dem Blatt Papier ein eigenes Adventure-Gameboard, welches einen Lösungspfad für Level 1 besitzt. Dabei soll Ihr Pfad mindestens einen Drachen enthalten.

b) Versuchen Sie Ihr Gameboard als ASCII-Art Grafik darzustellen. Es reicht auch nur ein Ansatz, wie z.B.

```
	String gameboardOne=
		     "   " +"  ***  "+"   "+"      "+"   "+"  ***  "  +"   "+" * "+"\n"
			+"   " +"*     *"+"   "+"/\\  /\\"+"   "+"*     *"+"   "+"***"+"\n"
			+"-->" +"*  1  *"+"-->"+" o o /"+"-->"+"*  2  *"  +"-->"+" * "+"\n"
			+"   " +"*     *"+"   "+" -- / "+"   "+"*     *"  +"   "+" * "+"\n"
			+"   " +"  *** " +"   "+"  ''   "+"   "+"  ***  " +"   "+" * ";
```

Welche Schwierigkeiten stellen Sie fest?

# Aufgabe 4: ASCII-Art Input

a) Arbeiten Sie mit dem `Java Scanner` um dem User die Eingabe einer ASCII-Art Grafik über die Konsole zu ermöglichen. Die Eingabe soll zeilenweise eingelesen werden und im Anschluss als Grafik ausgegeben werden.

Ihr Programm soll auf eine feste Anzahl von ASCII-Art Zeilen ausgelegt sein. Dies bedeutet, wenn Ihre Grafik z.B. aus 9 Zeilen besteht, dann benötigen Sie auch 9 Zeilen Programmcode mit einer der Scanner-Methoden (`next(), nextLine()`), um Ihre Grafik vollständig einzulesen.

Untersuchen Sie den Unterschied zwischen `next(), nextLine()` oder auch `nextDouble()`. Welche Methode eignet sich für diese Aufgabe am besten und warum?

Beispiel:

```
Geben Sie Ihre ASCII-Art zeilenweise ein:
Geben Sie die 1. Zeile ein:
             /\   /\
Geben Sie die 2. Zeile ein:
	    |  o o  |
Geben Sie die 3. Zeile ein:
	    \ = T = /
Geben Sie die 4. Zeile ein:
	     /     \
Geben Sie die 5. Zeile ein:
      /    /      /
Geben Sie die 6. Zeile ein:
usw.
```

Ihre finale Eingabe lautet:

```
	       /\   /\
	      |  o o  |
	      \ = T = /
	       /     \
         /    /      /
        //   /      /
        \\  /      ||
         \\  _     |
          \ ______)|_)
```

b)[optional-fortgeschritten] Erweitern Sie Ihre Lösung aus 4a), so dass nur ASCII-Zeichen akzeptiert werden. Die ASCII-Art Eingabe soll daraufhin überprüft werden, ob Zeichen enthalten sind, welche nicht den 128-ASCII-Symbolen entsprechen. Für den Fall, dass die Eingabe ein solches Zeichen enthält, soll anstatt der ASCII-Art Grafik folgende Information ausgegeben werden:

_Ihre Eingabe enthält mind. ein Zeichen (fehlerhafte Eingabe: ö), das kein ASCII-Zeichen ist._

Die Ausgabe enthält also auch das falsche Zeichen, welches bei der Überprüfung gefunden worden ist.
Hinweis: Recherchieren Sie die Methode `charAt(...)` und arbeiten Sie u.a. mit der Anzahl der ASCII-Zeichen, die Ihre statische Grafik ausmacht.

[optional: Aufgabe kann gegen eine andere Teilaufgabe (außer 4a) getauscht werden.]
