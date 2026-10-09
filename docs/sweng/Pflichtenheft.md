
# Pflichtenheft
#####  (Nach Lichter & Ludwig, Software Engineering: Grundlagen, Menschen, Prozesse, Techniken)


## 1. Einleitung

### 1.1 Zweck

Dieses Pflichtenheft spezifiziert die Anforderungen der Erweiterung "Forge Synesis" für JabRef. 
Es dient als Grundlage für die Entwicklung, Implementierung und Prüfung, sowie Abnahme der Software. 
Zudem richtet sich dieses Dokument insbesondere an das Entwicklungsteam, 
sowie den Betreuern des Software-Engineering-Projekts.   

### 1.2 Einsatzbereich und Ziele
Die Erweiterung richtet sich an JabRef-User und Studenten, die gleichzeitig ihre Dokumente, Scripts und Bibliografien verwalten und darin neues Wissen effektiv mit Gedächtnistraining aneignen möchten. Das Hauptziel besteht darin, bereits in JabRef vorhandenes Lernmaterial
in interaktive Lernkarten umzuwandeln und dadurch einen zusammenhängenden
Workflow vom Lernmaterial bis zum Lernen bereitzustellen.

Funktionen: 
- [ ] Separates Window für Karteikartengenerierung
- [ ] User kann Sprache, Anzahl Karten sowie Thema angeben
- [ ] Karten können nach generierung einzeln bearbeitet werden
- [ ] Karten können umgedreht werden, um Lösungen zu offenbaren 
- [ ] Anzahl richtiger und falschen Antworten werden angezeigt
- [ ] Lernfortschritt anzeigen

Mögliche Erweiterungen: 
- [ ] Punkte System für richtige Antworten
- [ ] Meilensteine im Tausch für "XP"

### 1.3 Definitionen

| Begriff      | Bedeutung                                                     |
|--------------|---------------------------------------------------------------|
| Forge        | Schmiede oder etwas schmieden                                 |
| Synesis      | Griechisch für "Einsicht" oder "Sinn"                         |
| Flashcard    | Karteikarte/ Lernkarte                                        |
| UI           | User-Interface/ Benutzeroberfläche                            |
| XP           | Erfahrungspunkte                                              |
| API          | Kommunikationsschnittstelle zwischen Programmen               |
| Gemini AI    | Gemini als Künstliche Intelligenz                             |
| Shuffle      | Mischen (von z.B Lernkarten)                                  |
| Lernmaterial | Scripts, PDF, Notizen aus denen Karteikarten generiert werden |
| Meilenstein  | Belohnungssystem mit Zwischenzielen                           |


### 1.4 Referenzierte Dokumente

Verzeichnet alle Dokumente, auf die in der Spezifikation verwiesen wird.

Falls ein JabRef Issue bearbeitet wird, bitte diesen hier referenzieren und verlinken.

### 1.5 Überblick

Kapitel 2 beschreibt die allgemeine Einbettung und die Rahmenbedingungen des Systems. 
Kapitel 3 spezifiziert die funktionalen Anforderungen. 
Kapitel 4 definiert die Kriterien zur Abnahme dieser Anforderungen. Die detaillierten Use Cases sind in Anhang A beschrieben.

## 2. Allgemeine Beschreibung

### 2.1 Einbettung

Forge Synesis wird als Erweiterung in die bestehende Anwendung JabRef integriert.
JabRef stellt die vom Benutzer ausgewählten bibliografischen Einträge und die
dazugehörigen Lernmaterialien bereit. Forge Synesis greift auf diese Daten zu
und stellt sie dem Benutzer zur Auswahl für die Flashcard-Generierung bereit.

Die Kommunikation zwischen Forge Synesis und der Gemini API erfolgt über eine
API-Schnittstelle. Darüber werden die vom Benutzer ausgewählten
Lernmaterialien sowie die festgelegten Generierungsparameter übermittelt.
Zu diesen Parametern gehören unter anderem die Anzahl, Sprache und
Schwierigkeit der zu generierenden Flashcards sowie das angegebene Thema.

Die Gemini API verarbeitet diese Informationen und liefert die generierten
Fragen und Antworten an Forge Synesis zurück. Forge Synesis verarbeitet die
Antwort und stellt die daraus erzeugten Flashcards innerhalb von JabRef dar.

Für die Kommunikation mit der Gemini API ist eine aktive Internetverbindung
erforderlich.

### 2.2 Funktionen

Forge Synesis bietet dem Benutzer Funktionen zur Erstellung, Bearbeitung und
Verwendung von AI-generierten Flashcards.

Die wichtigsten Funktionen sind:

- Auswahl von Lernmaterial aus JabRef
- Festlegung der Generierungsparameter
- Festlegung eines Themas
- Generierung von Flashcards
- Vorschau und Bearbeitung der generierten Flashcards
- Verwendung der Flashcards im Study Mode
- Organisation der Flashcards nach Fach bzw. Lernmaterial
- Erfassung des Lernfortschritts und Vergabe von XP
### 2.3 Benutzerprofile

Forge Synesis richtet sich Hauptsächlich an Studierende und Akademiker, die JabRef zur Verwaltung und Organisierung 
wissenschaftlicher Texte und anderen Dokumenten verwenden. 
Für die Nutzung von Forge Synesis sind keine besonderen technischen Kenntnisse erforderlich.
Die Benutzer sollten jedoch über grundlegende Kenntnisse im Umgang mit JabRef sowie über ausreichende Englischkenntnisse verfügen.

Es werden zwischen drei Benutzergruppen unterschieden:

- **Anfänger**: Verfügen über geringe Erfahrung mit JabRef und benötigen gegenfalls Unterstützung bei grundlegenden Funktionen
  wie beim Importieren und Gruppieren von Dokumenten. Die Bedienung von Forge Synesis sollte auch für diese Benutzer möglichst einfach
  und ersichtlich sein.

- **Fortgeschrittener Benutzer**: Beherrschen die wichtigsten Funktionen von JabRef und können Dokumente selbstständig importiere und organisieren.
  Sie können Forge Synesis selbstständig öffnen und die Parameter für die Erstellung von Flashcards einstellen.

- **Erfahrener Benutzer**: Verfügen über umfangreiche Kenntnisse in JabRef und können Dokumente schnell und selbstständig organisieren. 
  Sie können Forge Synesis vollständig selbst bedienen und die Flashcards anschließend überprüfen und bearbeiten. 



### 2.4 Einschränkungen

Forge Synesis wird als Erweiterung der bestehenden Open-Source-Anwendung JabRef entwickelt. 
Daher muss sich die Implementierung an der vorhandenen Architektur, den verwendeten Technologien und den Entwicklungskonventionen von JabRef orientieren. 
Die Erweiterung muss mit der für das Projekt festgelegten JabRef-Version kompatibel sein und darf die bestehenden Funktionen der Anwendung nicht beeinträchtigen.

Für die Generierung der Flashcards wird die externe Gemini API verwendet. 
Die Funktionalität der KI-gestützten Generierung ist daher von der Verfügbarkeit dieses Dienstes sowie einer funktionierenden Internetverbindung abhängig. 
Fehler bei der Kommunikation mit der Gemini API oder bei der Verarbeitung ihrer Antworten müssen abgefangen werden, sodass sie nicht zum Absturz von Forge Synesis oder JabRef führen. Stattdessen soll dem Benutzer eine verständliche Fehlermeldung angezeigt werden.

Änderungen an den Schnittstellen oder an der verwendeten JabRef-Version müssen bei der Weiterentwicklung berücksichtigt werden, um die Kompatibilität der beteiligten Komponenten sicherzustellen.

### 2.5 Annahmen und Abhängigkeiten
Es wird davon ausgegangen, dass der Benutzer über JabRef auf die geeigneten Lernmaterialien zugreifen kann und für die Generierung der Flashcards 
eine aktive Internetverbindung besteht. Darüber hinaus hängt die Implementierung und Betrieb von Forge Synesis von der aktuellen JabRef Version
sowie den Schnittstellen ab.


## 3. Einzelanforderungen

### 3.1 Funktionale Anforderungen

#### Auswahl und Anzeige des Lernmaterials
* /F10/ Der Benutzer muss ein oder mehrere Lernmaterialien aus JabRef auswählen können.
* /F11/ Das System muss die ausgewählten Lernmaterialien vor der Generierung in Forge Synesis anzeigen.
* /F12/ Forge Synesis muss sich in einem eigenen Fenster in JabRef öffnen lassen.
#### Einstellungen für die Generierung
* /F20/ Der Benutzer muss die Anzahl, Sprache und Schwierigkeit der Lernkarten festlegen können.
* /F21/ Der Benutzer muss Deutsch oder Englisch und eine der Schwierigkeitsstufen Leicht, Mittel oder Schwer auswählen können. Die Anzahl der Karten muss zwischen 5 und 20 liegen.
* /F22/ Der Benutzer muss ein Thema eingeben können. Die Angabe eines Themas ist freiwillig.
* /F23/ Das System muss die ausgewählten Lernmaterialien und Einstellungen vor dem Start der Generierung anzeigen.
  
#### Generierung der Lernkarten
* /F30/ Das System muss die ausgewählten Lernmaterialien und Einstellungen an die Gemini API senden.
* /F31/ Wenn die Gemini API nicht erreichbar ist oder keine verwendbare Antwort liefert, muss das System eine verständliche Fehlermeldung anzeigen. JabRef darf dabei nicht abstürzen.
* /F32/ Das System muss eine gültige Antwort der Gemini API verarbeiten und die Fragen und Antworten als einzelne Lernkarten in JabRef anzeigen.
* /F33/ Das System muss die vom Benutzer festgelegte Anzahl an Lernkarten erstellen. Die Karten müssen die gewählte Sprache und Schwierigkeit sowie das angegebene Thema berücksichtigen.
* /F34/ Jede Lernkarte muss eine Frage und eine Antwort enthalten. Das System darf unvollständige Karten nicht speichern.
Prüfen, Bearbeiten und Speichern
* /F40/ Der Benutzer muss die generierten Lernkarten vor dem Speichern prüfen und einzeln bearbeiten können.
* /F41/ Der Benutzer muss die Lernkarten speichern und dem ausgewählten Lernmaterial zuordnen können.
* /F42/ Der Benutzer muss gespeicherte Lernkarten nach Fach oder Lernmaterial finden können.
#### Lernmodus
* /F50/ Der Benutzer muss eine gespeicherte Lernkartensammlung auswählen und eine Lernsitzung starten können.
* /F51/ Das System muss die Lernkarten einzeln anzeigen. Zuerst zeigt es die Frage an. Der Benutzer kann danach die Antwort einblenden.
* /F52/ Der Benutzer muss jede Antwort als richtig oder falsch markieren können. Danach muss das System die nächste Lernkarte anzeigen.

#### Lernergebnis und Lernfortschritt
* /F60/ Nach einer Lernsitzung muss das System die Anzahl der richtigen und falschen Antworten anzeigen.
* /F61/ Das System muss den Lernfortschritt für jede Lernkartensammlung speichern und anzeigen. Dazu zeigt es die Anzahl der bearbeiteten Karten sowie die Anzahl der richtigen und falschen Antworten an.
  
#### Leere Lernkartensammlung
* /F70/ Wenn der Benutzer eine leere Lernkartensammlung auswählt, muss das System eine Meldung anzeigen. Der Benutzer kann dann eine andere Sammlung auswählen. Der Lernfortschritt darf sich dabei nicht ändern.

## 4. Abnahmekriterien
* /A10/ Lernkarten generieren: Der Benutzer wählt Lernmaterial aus und legt die Anzahl, Sprache, Schwierigkeit und das Thema fest. Forge Synesis erstellt die gewünschte Anzahl Lernkarten auf Grundlage des ausgewählten Materials und zeigt sie in JabRef an.
* /A20/ Lernkarten prüfen: Jede Lernkarte enthält eine Frage und eine Antwort. Beide Felder sind ausgefüllt. Die Karten sind in der gewählten Sprache und passen zum gewählten Thema.
* /A30/ Karten prüfen und speichern: Der Benutzer kann jede Karte vor dem Speichern lesen und bearbeiten. Gespeicherte Karten sind dem ausgewählten Lernmaterial zugeordnet und später auffindbar.
* /A40/ Lernmodus verwenden: Der Benutzer sieht zuerst die Frage und kann danach die Antwort anzeigen. Anschließend kann er die Antwort als richtig oder falsch markieren. Danach zeigt das System die nächste Karte.
* /A50/ Lernergebnis anzeigen: Nach der Lernsitzung zeigt das System die Anzahl richtiger und falscher Antworten an und aktualisiert den Lernfortschritt.
* /A60/ Leere Sammlung behandeln: Wählt der Benutzer eine Sammlung ohne Lernkarten aus, zeigt das System eine klare Meldung an. Der Benutzer kann eine andere Sammlung auswählen. Der Lernfortschritt wird nicht verändert.
* /A70/ Fehler der Gemini API behandeln: Ist die Gemini API nicht verfügbar oder liefert sie ein nicht verwendbares Ergebnis, zeigt das System eine verständliche Fehlermeldung an. Unvollständige Karten werden nicht gespeichert, und JabRef stürzt nicht ab.


# Anhang

## Anhang A. Use-cases

### Use Case 1:
* **Name:** Lernkarten aus Lernmaterial generieren
* **Akteure:** Studierender / JabRef-Benutzer
* **Vorbedingungen:**
  * JabRef ist gestartet.
  * Der Benutzer verfügt über Lernmaterial, das in JabRef ausgewählt
    werden kann.
  * Die Gemini API ist konfiguriert.
  * Eine Netzwerkverbindung ist verfügbar.
* **Standardablauf**
  1. Der Benutzer öffnet Forge Synesis.
  2. Der Benutzer wählt ein Lernmaterial aus.
  3. Das System zeigt das ausgewählte Lernmaterial an.
  4. Der Benutzer öffnet die Einstellungen zur Karteikartengenerierung.
  5. Der Benutzer gibt die gewünschte Anzahl an Karten ein.
  6. Der Benutzer startet die Generierung.
  8. Das System übermittelt das Lernmaterial und die gewählten Parameter
     an die Gemini API.
  9. Die Gemini API generiert Fragen und Antworten.
  10. Das System verarbeitet die API-Antwort.
  11. Das System zeigt die generierten Lernkarten an.
  12. Der Benutzer kann die Karten überprüfen und bearbeiten.

* **Nachbedingungen Erfolg:**
  * Die generierten Lernkarten werden dem ausgewählten Lernmaterial
    zugeordnet.
  * Die Karten können vom Benutzer bearbeitet und gespeichert werden.

* **Nachbedingung Sonderfall:**
  * Bei einem Fehler werden keine unvollständigen Karten gespeichert.
  * Der Benutzer erhält eine verständliche Fehlermeldung.


### Sonderfall 1a: Gemini API nicht erreichbar

* **Ablauf Sonderfall 1a**
  1. Der Benutzer startet die Generierung.
  2. Das System versucht, die Gemini API zu erreichen.
  3. Die API ist nicht erreichbar.
  4. Das System bricht die Generierung kontrolliert ab.
  5. Das System zeigt eine Fehlermeldung an.


### Use Case 2:
* **Name:** *Study Flashcards*
* **Akteure:** *Studierender / JabRef-Benutzer*
* **Vorbedingungen:**
  * JabRef läuft.
  * Es gibt mindestens eine Flashcards-Sammlung.
* **Standardablauf**
  1. Der Benutzer öffnet den Lernmodus.
  2. Der Benutzer wählt eine Flashcards-Sammlung aus. 
  3. Das System zeigt die erste Flashcard-Frage an.
  4. Der Benutzer deckt die Antwort auf und markiert sie als richtig oder falsch.
  5. Das System aktualisiert den Lernfortschritt und zeigt die nächste Flashcard an.
  6. Die Schritte 3–5 wiederholen sich, bis alle Flashcards durchgegangen sind.
  7. Das System zeigt die Lernergebnisse an.
* **Nachbedingungen Erfolg:** 
  * Die Lernsitzung ist abgeschlossen.
  * Der Lernfortschritt des Benutzers wurde aktualisiert.
* **Nachbedingung Sonderfall:** 
  * Keine Lernsitzung wurde abgeschlossen. 
  * Der Fortschritt des Benutzers bleibt unverändert.

#### Sonderfall 2a: Leere Flashcards-Sammlung
* Ablauf Sonderfall 2a
    * Der Benutzer wählt eine leere Flashcards-Sammlung aus.
    * Das System erkennt, dass keine Flashcard verfügbar sind.
    * Das System zeigt eine informative Nachricht an.
    * Der Benutzer kann eine andere Sammlung auswählen.
