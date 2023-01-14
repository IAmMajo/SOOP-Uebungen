# Hinweis

Die Aufgaben dieses Miniprojekts bewegen sich alle im Kontext derselben
Fachlichkeit (Mensa) und bauen aufeinander auf. Sie sollten die Aufgaben daher
in der gestellten Reihenfolge beginnend mit Aufgabe 1 lösen.

# Aufgabe 1

In einer Mensa werden verschiedene Artikel (Speisen, Getränke, Snacks, etc.)
verkauft. Es soll ein entsprechendes Objektmodell implementiert werden:

## a)

Implementieren Sie die Klasse `Artikel` mit folgenden Eigenschaften:

- private Attribute `String name, double preis, double mwstsatz`

- die zugehörigen Getter und Setter

- einen parameterlosen Konstruktor

- einen Konstruktor, der alle Attribute als Parameter entgegennimmt

- die Methode `berechneMwst`, welche die Mehrwertsteuer entsprechend des
  Mehrwertsteuerersatzes `mwstsatz` berechnet und auf zwei Nachkommastellen
  gerundet zurückliefert

- die Methode `toString`, die die Artikeldaten als `String` zurückliefert:
  `<name> - <preis> Euro (inkl. <berechneter Betrag> Euro Mwst.)`

## b)

Leiten Sie von `Artikel` die Klasse `Getraenk` mit dem privaten Attribut
`double pfand`, das den Pfandbetrag enthält, Getter und Setter, zwei
Konstruktoren, sowie der Methode `toString` ab. `toString` soll die Daten wie
folgt zurückliefern:
`<name> - <preis> Euro (inkl. <pfand> Pfand) (inkl. <berechneter Betrag> Euro Mwst.)`

Modifizieren Sie ggf. Attributsichtbarkeiten, falls die Funktion der
Klassenhierarchie dies erfordert.

## c)

Leiten Sie von `Artikel` die Klasse `Menu`, die ein Essen abbildet, mit
folgenden Eigenschaften ab:

- private Attribute
  `boolean vegetarisch, int kalorien, Getraenk getraenk, String beschreibung`

- Konstruktor mit Parametern für alle Attribute sowie parameterloser Konstruktor

- Getter und Setter

- `toString` mit der Rückgabe
  `<name> - <beschreibung> (vegetarisch) (<preis> Euro)`. Die Zeichenkette
  `(vegetarisch)` soll nur bei vegetarischen Gerichten enthalten sein, sonst
  nichts.

- Methode `String getEmpfehlung`, welche in Abhängigkeit von den Kalorien eine
  der Zeichenketten `rot` (Kalorien > 750), `gelb` (500 < Kalorien <= 750) oder
  `gruen` (Kalorien <= 500) zurückliefert.

Bitte beachten Sie, dass alle erfassten Preise Bruttopreise sind (die
Mehrwertsteuer ist im Preis enthalten) und dass das Getränkepfand ebenfalls
Mehrwertsteuer enthält.

# Aufgabe 2

Schreiben Sie eine Klasse `Rechnung`, welche den Kauf verschiedener Artikel in
der Mensa abbildet. Die Klasse soll folgende Eigenschaften haben:

- privates Attribut `Artikel[] artikel`, bildet die gekauften Artikel ab.

- parameterloser Konstruktor

- Getter und Setter

- Methode `void neuerArtikel(Artikel artikel)`, die einen Artikel zu der
  Rechnung hinzufügt.

- Methode `double getBetrag()`, die den Gesamtbetrag der Rechnung zurückliefert.

Achtung! Sie sollen tatsächlich Arrays verwenden und keine Klassen aus der Java
Collections **API**.

# Aufgabe 3

Schreiben Sie eine Klasse `Kasse`, welche eine Mensakasse abbildet mit den
folgenden Eigenschaften:

- privates Attribut `Rechnung[] rechnungen`

- privates Attribut `double barBestand`

- Getter und Setter

- parameterloser Konstruktor

- Konstruktor mit _einem_ **double**-Parameter, der den initialen Bargeldbestand
  abbildet

- Methode `void neueRechnung()`, die einen neuen Bezahlvorgang beginnt.

- Methode void `neuerArtikel(Artikel)`, die einen neuen Artikel zur aktuellen
  Rechnung hinzufügt.

- Methode `double kassieren()`, welche den Gesamtbetrag der aktuellen Rechnung
  zurückliefert.

- Methode `double bezahlen(double gegeben)`, welche den Bezahlvorgang für die
  aktuelle Rechnung durchführt. Der Parameter `gegeben` stellt den übergebenen
  Barbetrag dar. Die Methode liefert den Rückgabebetrag (das Wechselgeld)
  zurück. Außerdem ändert die Methode den Barbestand der Kasse entsprechend des
  Rechnungsbetrags.

- Methode `double getUmsatz()`, die den Gesamtumsatz aller Rechnungen der Kasse
  zurückgibt.
