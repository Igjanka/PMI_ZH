# A programozás módszertana I. Pót ZH

A dolgozathoz csak és kizárólag a saját, korábban megírt kódok használhatóak. Minden más segítég tilos!

## Feladatok

0. (0 pont) Klónozza jelen repository-t és ossza meg a saját GitHub fiókjában:
    - Code / URL másolása
    - File / New / Project from Version Control...
    - Git / GitHub / Share Project on GitHub (a repository nevét ne változtassa meg)
1. (2 pont) Készítsen egy ***Matrix*** osztályt. Az osztályban írja meg a ***minimum*** és a
   ***numbersDivisibleByThree*** metódusokat. Mindkét metódus meghatározza egy 2-dimenziós egész mátrixban: előbbi a
   mátrix minimumát, utóbbi a 3-mal osztható számokat!
2. (4 pont) Implementálja a ***Dentist*** osztályt, ami páciensek nevét és időpontjait kezeli (patientName, appointment).
   Az osztálynak rendelkeznie kell egy ***newAppointment*** (új elem hozzáadása a páciens nevével és időponttal),
   egy ***resign*** (adott elem törlése a páciens neve alapján) és egy ***getAppointments*** (egy String-ben visszaadja
   az aktuálisan tárolt időpontok adatait: <páciens neve> <időpont> formátumban) metódussal.
3. (2 pont) Származtasson egy ***Assistant*** osztályt a ***Dentist*** osztályból, melynek ***refreshAppointment***
   metódusával lehessen beállítani egy páciens időpontját.

## Beadás módja

A feladatok megoldására 1,5 óra áll rendelkezésre. A megoldásokat az adott határidőn belül fel kell tölteni
a saját GitHub repository-jukba. A commit and push művelet során commit message-ként használja a neptunkódját.

## Értékelés

* 0-4 pont: Elégtelen (1)
* 5 pont: Elégséges (2)
* 6 pont: Közepes (3)
* 7 pont: Jó (4)
* 8 pont: Jeles (5)