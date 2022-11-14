# Aufgabe 1

Schreiben Sie ein Programm, welches eine Zahlenpyramide mit fortlaufenden Zahlen
wie im Beispiel ausgibt. Programmieren Sie die **main-Methode** der Klasse
**Aufgabe01.java** so, dass die Zahlenpyramide dynamisch ausgegeben wird.
Implementieren Sie die Methoden nach eigenem Dafürhalten.

Beispiele des Programmablaufs:

```
Geben Sie die Höhe des Dreiecks an: 14

                                       +++1**
                                    +++2**+++3**
                                 +++4**+++5**+++6**
                              +++7**+++8**+++9**++10**
                           ++11**++12**++13**++14**++15**
                        ++16**++17**++18**++19**++20**++21**
                     ++22**++23**++24**++25**++26**++27**++28**
                  ++29**++30**++31**++32**++33**++34**++35**++36**
               ++37**++38**++39**++40**++41**++42**++43**++44**++45**
            ++46**++47**++48**++49**++50**++51**++52**++53**++54**++55**
         ++56**++57**++58**++59**++60**++61**++62**++63**++64**++65**++66**
      ++67**++68**++69**++70**++71**++72**++73**++74**++75**++76**++77**++78**
   ++79**++80**++81**++82**++83**++84**++85**++86**++87**++88**++89**++90**++91**
++92**++93**++94**++95**++96**++97**++98**++99**++100*++101*++102*++103*++104*++105*
```

```
Geben Sie die Höhe des Dreiecks an: 5

        ++1*
      ++2*++3*
    ++4*++5*++6*
  ++7*++8*++9*+10*
+11*+12*+13*+14*+15*
```

# Aufgabe 2

Schreiben Sie eine Methode **summe**, welche eine Zahl *n* entgegennimmt und die
Summe aller Ziffern der Zahl ohne die erste und ohne die letzte Ziffer
zurückgibt.

Beispiele:

| Eingabe | Rückgabe |
|--------:|----------|
|    72451|        11|
|       13|         0|
|     3689|        14|

# Aufgabe 3

Die folgenden Teilaufgaben beschäftigen sich mit Fragestellungen im Umfeld einer
Kantine oder Mensa.

## a)

Schreiben Sie die Methode **isValidTransaction**, die bei einer gültigen
Transaktion einen `boolean` mit dem Wert *true* zurückgibt. Falls die
Transaktion ungültig ist, soll die Methode *false* zurückgeben. Eine Transaktion
ist genau dann gültig, wenn das Guthaben ausreichend ist.

## b)

Schreiben Sie eine weitere Methode **recommendation**, die eine Empfehlung je
nach Ernährungstyp zurück gibt.

|    Eingabe    | Rückgabe |
|--------------:|----------|
|    Vegetarisch|  Salatbar|
|       Low Carb|    Menü 2|
| Kleiner Hunger|    Menü 1|
|         Hunger|     Grill|

## c)

Schreiben Sie eine dritte Methode **price**, welche den Preis für ein Menü
zurück gibt.

| Eingabe | Rückgabe |
|--------:|----------|
| Salatbar|       2.5|
|   Menü 1|       1.0|
|   Menü 2|       1.2|
|    Grill|       3.8|

# Aufgabe 4
Schreiben Sie eine Methode **convertMillisec**, die Millisekunden in Stunden,
Minuten und Sekunden umwandelt.

Die Methode gibt einen String im folgenden Format zurück:
*stunden:minuten:sekunden*.

Beispiele:

| Eingabe | Rückgabe |
|--------:|----------|
|     5500|  00:00:05|
|   100000|  00:01:40|
|123456789|  34:17:36|
