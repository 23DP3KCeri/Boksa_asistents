# Boksa Asistents

Šī ir vienkārša Java programma, kas paredzēta boksa iesācējiem. Tā ļauj pievienot un pārvaldīt bokserus, reģistrēt treniņus, kā arī piedāvā tehnikas padomus un fiziskās sagatavotības uzdevumus.

---

## Programmas nolūks bokseriem

Šī programma ir domāta iesācējiem bokseriem kā vienkāršs digitāls asistents, kas palīdz uzsākt un strukturēt savus treniņus.

Tās mērķis ir palīdzēt:

- **Sekot līdzi progresam** – katrs bokseris var reģistrēt savu vārdu, vecumu un trenēšanās dienas, lai pārraudzītu treniņu biežumu un uzlabojumus.
- **Saņemt ieteikumus tehnikas uzlabošanai** – pēc katra treniņa bokseris saņem padomu, kā uzlabot savu sitienu tehniku, kājas darbu vai aizsardzību.
- **Veicināt motivāciju** – treniņu uzdevumi un fiziskie izaicinājumi palīdz uzturēt disciplīnu un progresēt soli pa solim.
- **Plānot fizisko sagatavotību** – programmā ir iekļauti arī vienkārši uzdevumi izturības, spēka un koordinācijas uzlabošanai.

Šis rīks ir īpaši noderīgs tiem, kas trenējas patstāvīgi vai vēl tikai sāk iepazīt boksa pasauli.

---

## Funkcionalitāte

- Pievienot jaunu bokseri
- Trenēt bokseri un saņemt padomus
- Attēlot visus bokserus tabulā
- Meklēt bokseri pēc vārda
- 🗑Dzēst bokseri
- Sakārtot bokserus pēc uzvaru procenta
- Saglabāt un ielādēt datus no faila (`boxers.txt`)

---

## Programmas palaišana

1. Pārliecinies, ka Java ir instalēta (`java -version`)
2. Kompilē visas `.java` klases:
   ```bash
   javac BoxingAssistant.java BoxerManager.java Boxer.java TechniqueTip.java WorkoutPlan.java
