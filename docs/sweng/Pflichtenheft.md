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

Beschreibt, wie das System in seine Umgebung eingebettet ist und wie die Software mit den umgebenden Komponenten und Systemen zusammenspielt. Dazu werden die Schnittstellen, Kommunikationsprotokolle etc. definiert.

### 2.2 Funktionen

Skizziert die wichtigsten Funktionen

### 2.3 Benutzerprofile

Charakterisiert die Benutzergruppen und die Voraussetzungen die diese jeweils mitbringen (Ausbildung, Know-how, Sprache)

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
* Name: *Name des Use-cases*
* Akteure: *Akteur1, Akteur2, ...*
* Vorbedingungen: *Was muss vor Beginn des Ablaufs gelten*
* Standardablauf
    * Schritt 1
    * Schritt 2
* Nachbedingungen Erfolg: *Was muss nach dem Ende des erfolgreichen Ablaufs gelten*
* Nachbedingung Sonderfall: *Was gilt nach dem Ende, wenn der Ablauf fehlgeschlagen ist*


#### Sonderfall 1a: Ausnahme 1
* Ablauf Sonderfall 1a
    * Schritt 1
    * Schritt 2

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
