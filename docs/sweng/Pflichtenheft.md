---
layout: default
title : Pflichtenheft
---
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
| XP           | Erfahrungspunkte                                              |
| API          | Kommunikationsschnittstelle zwischen Programmen               |
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
Dokumentiert Einschränkungen, die die Freiheit der Entwicklung reduzieren (Basis-Software, Ziel-Hardware, Gesetzliche Grundlagen, ...)

### 2.5 Annahmen und Abhängigkeiten
Nennt explizit die Annahmen und externen Voraussetzungen, von denen bei der Spezifikation ausgegangen wurde.


## 3. Einzelanforderungen

Beschreibt die Anforderung i so genau, dass bei der Verwendung der Spezifikation (im Entwurf usw.) keine Rückfragen dazu notwendig sind.

Identifizieren Sie jede Funktionale Anforderung mit einer Nummer, so dass diese Nachverfolgbar sind. Zusammengehörende Funktionale Anforderungen können durch geeignete Nummerierung angezeigt werden.

Zur Spezifikation der Software sollen Sprachschablonen benutzt werden.

* /F10/ Funktion 1 des Systems
* /F11/ Weitere Detaillierung Funkion 1
* /F20/ Funktion 2 des Systems


Die Funktionalen Anforderungen sollen mithilfe von Use-cases erhoben werden. Die Use-cases sollen in Anhang A detailliert beschrieben werden.

## 4. Abnahmekriterien

Beschreiben Sie hier, wie die Anforderungen bei der Abnahme auf ihre Realisierung überprüft werden können.

Definieren Sie hier mindestens ein Abnahmekriterium
* /A10/ Abnahmekriterium 1
* /A20/ Abnahmekriterium 2


# Anhang

## Anhang A. Use-cases

An dieser Stelle können detaillierte Use-cases angegeben werden
![Diagram](../../slides/images/use-case.png)

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

#### Sonderfall 1b: Ausnahme 2
* Ablauf Sonderfall 1b
    * Schritt 1
    * Schritt 2


### Use Case 2:
* Name: *Name des Use-cases*
* Akteure: *Akteur1, Akteur2, ...*
* Vorbedingungen: *Was muss vor Beginn des Ablaufs gelten*
* Standardablauf
    * Schritt 1
    * Schritt 2
* Nachbedingungen Erfolg: *Was muss nach dem Ende des erfolgreichen Ablaufs gelten*
* Nachbedingung Sonderfall: *Was gilt nach dem Ende, wenn der Ablauf fehlgeschlagen ist*

#### Sonderfall 2a: Ausnahme 1
* Ablauf Sonderfall 1a
    * Schritt 1
    * Schritt 2
