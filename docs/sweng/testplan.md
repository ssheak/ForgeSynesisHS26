---
layout: default
title : Testplan
---
# Testplan template


| Version | Projektname | Autor  | Status | Datum | Kommentar |
| ------- | ----- | ------ | ------ | ----- | --------- |
|  0.1  |  Forge Synesis  | Jasra Mohamed Yousaf, Erind Shima, Shahriar Sheak, Bavan Sivaloganathan| in Bearbeitung | 13.11.2026 | |


# 1. Einführung
Forge Synesis ist eine Erweiterung für JabRef, mit der Benutzer Lernmaterialien aus ihrer JabRef-Bibliothek auswählen und
daraus mithilfe der Gemini API Lernkarten erstellen können. Die generierten Lernkarten können geprüft, bearbeitet und
gespeichert werden. Im Study Mode können Benutzer die Karten durchgehen, Antworten aufdecken und als richtig oder
falsch markieren. Das System erfasst anschliessend die Lernergebnisse und den Lernfortschritt.

## 1.1 Zweck
Der Testplan beschreibt, wie Forge Synesis getestet werden soll. Dabei werden die verschiedenen Testfälle sowie die Voraussetzungen für deren Durchführung festgelegt. Das Dokument richtet sich an das Entwicklungsteam, die betreuenden Personen und externe Tester.

Mit den Tests soll überprüft werden, ob die entwickelten Funktionen wie vorgesehen arbeiten. Dabei wird insbesondere darauf geachtet, dass:

- die geforderten Funktionen korrekt umgesetzt wurden;
- Eingaben und Grenzwerte richtig verarbeitet werden;
- die Verbindung zur Gemini API funktioniert;
- fehlerhafte oder unvollständige Antworten der API abgefangen werden;
- Lernkarten gespeichert und später wieder aufgerufen werden können;
- der Study Mode und die Anzeige des Lernfortschritts richtig funktionieren;
- Fehler nicht dazu führen, dass Forge Synesis oder JabRef abstürzen.
## 1.2 Beziehung zu anderen Dokumenten
| Dokument | Beschreibung | Link |
|---|---|---|
| JabRef Documentation | Dokumentation der Literaturverwaltungssoftware JabRef und ihrer Funktionen | https://docs.jabref.org/ |
| Google Gemini API Documentation | Dokumentation der Gemini API zur KI-gestützten Generierung von Lernkarten | https://ai.google.dev/gemini-api/docs |
| Java Documentation | Offizielle Dokumentation der Programmiersprache Java und ihrer Bibliotheken | https://docs.oracle.com/en/java/ |
| Pflichtenheft Forge Synesis | funktionale Anforderungen /F10/ bis /F70/ , Abnahmekriterien /A10/ bis /A70/ sowie Use Cases |[Pflichtenheft.md](Pflichtenheft.md)|
| Projektplan | zeitliche Planung der Entwicklung und Prüfung |[Projektplan.pdf](Projektplan.pdf)|


## 2. Systemübersicht
Forge Synesis wird als Erweiterung in JabRef eingebunden und öffnet ein eigenes Fenster, in dem Benutzer Lernkarten erstellen können. Dafür wählen sie ein oder mehrere Lernmaterialien aus ihrer JabRef-Bibliothek aus. Anschliessend können sie einstellen, wie viele Karten erstellt werden sollen, in welcher Sprache und mit welchem Schwierigkeitsgrad. Zusätzlich besteht die Möglichkeit, ein bestimmtes Thema anzugeben.

Die ausgewählten Materialien und Einstellungen werden an die Forge-Synesis-Komponente weitergegeben, welche die Anfrage an die Gemini API sendet. Die erhaltenen Fragen und Antworten werden danach verarbeitet und als einzelne Lernkarten angezeigt. Der Benutzer kann die Karten überprüfen, bei Bedarf bearbeiten und anschliessend speichern.

Die gespeicherten Lernkarten werden einer Sammlung oder dem entsprechenden Lernmaterial zugeordnet. Im Study Mode kann der Benutzer die Karten einzeln durchgehen und die jeweilige Antwort aufdecken. Danach gibt er an, ob er die Antwort richtig oder falsch hatte. Am Ende der Lernsitzung werden die Ergebnisse und der bisherige Lernfortschritt angezeigt.

Die Tests konzentrieren sich hauptsächlich auf folgende Bereiche:

1. Einbindung von Forge Synesis in JabRef und Anzeige des eigenen Fensters;
2. Auswahl und Anzeige der Lernmaterialien;
3. Überprüfung der Einstellungen für die Kartengenerierung;
4. Verbindung zur Gemini API und Verarbeitung der zurückgegebenen Daten;
5. Überprüfung, Bearbeitung und Speicherung der Lernkarten;
6. Funktion des Study Modes sowie Anzeige der Ergebnisse und des Lernfortschritts;
7. Behandlung von Fehlern, beispielsweise bei einer nicht verfügbaren API oder einer leeren Sammlung.

## 3. Merkmale

### 3.1 Zu testende Merkmale (Features / Funktionen)

#### 3.1.1 Funktionale Anforderungen
| Anforderung | Zu prüfendes Merkmal |
|---|---|
| /F10/ | Ein oder mehrere Lernmaterialien aus JabRef auswählen |
| /F11/ | Ausgewählte Lernmaterialien vor der Generierung anzeigen |
| /F12/ | Forge Synesis in einem eigenen JabRef-Fenster öffnen |
| /F20/ | Anzahl, Sprache und Schwierigkeit festlegen |
| /F21/ | Zulässige Werte validieren: Deutsch/Englisch, Leicht/Mittel/Schwer und 5–20 Karten |
| /F22/ | Optionales Thema eingeben |
| /F23/ | Ausgewählte Materialien und Einstellungen vor dem Start anzeigen |
| /F30/ | Materialien und Einstellungen an die Gemini API übermitteln |
| /F31/ | Nicht erreichbare API oder unbrauchbare Antwort behandeln, ohne dass JabRef abstürzt |
| /F32/ | Gültige API-Antwort verarbeiten und einzelne Lernkarten anzeigen |
| /F33/ | Gewünschte Anzahl sowie Sprache, Schwierigkeit und Thema berücksichtigen |
| /F34/ | Nur Lernkarten mit Frage und Antwort zulassen bzw. speichern |
| /F40/ | Generierte Lernkarten einzeln prüfen und bearbeiten |
| /F41/ | Lernkarten speichern und dem ausgewählten Lernmaterial zuordnen |
| /F42/ | Gespeicherte Lernkarten nach Fach oder Lernmaterial finden |
| /F50/ | Lernkartensammlung auswählen und Lernsitzung starten |
| /F51/ | Karten einzeln anzeigen und Antwort aufdecken |
| /F52/ | Antwort als richtig oder falsch markieren und nächste Karte anzeigen |
| /F60/ | Anzahl richtiger und falscher Antworten nach der Sitzung anzeigen |
| /F61/ | Lernfortschritt pro Sammlung speichern und anzeigen |
| /F70/ | Leere Sammlung melden und Lernfortschritt unverändert lassen |

### 3.2 Nicht zu testende Merkmale (Features / Funktionen)
Folgende Punkte werden in diesem Testplan nicht als eigenständige Funktionen getestet:

- **Punktesystem und Meilensteine (XP):** Diese werden im Pflichtenheft nur als mögliche Erweiterungen erwähnt und sind keine festen funktionalen Anforderungen.

- **Fachliche Richtigkeit der KI-generierten Inhalte:** Die Tests überprüfen, ob die Lernkarten richtig aufgebaut sind, die gewünschte Anzahl enthalten und die gewählten Einstellungen berücksichtigt werden. Ob die Antworten fachlich korrekt sind, kann jedoch nicht vollständig durch automatisierte Tests geprüft werden. Dafür ist bei Bedarf eine zusätzliche Überprüfung durch eine Person notwendig.

- **Verfügbarkeit von Google Gemini:** Es wird getestet, wie Forge Synesis reagiert, wenn die Gemini API funktioniert, Fehler zurückgibt oder nicht erreichbar ist. Die Zuverlässigkeit des externen Dienstes selbst wird jedoch nicht getestet.
## 4. Vorgehensweise

### 4.1 Modul- und Integrationstests

Die Modultests sollen möglichst automatisch ausgeführt werden. Dabei wird jede Komponente einzeln geprüft. Wir testen zum Beispiel, ob Eingaben richtig geprüft werden, ob die PDF-Dateien korrekt verarbeitet werden und ob die Antworten des KI-Dienstes richtig in Lernkarten umgewandelt werden. Die Namen der Testklassen und Testfälle stehen in Abschnitt 6.1.

Bei der Auswahl der Testdaten achten wir auf verschiedene Arten von Eingaben und auf wichtige Grenzwerte. Wir testen zum Beispiel gültige und ungültige Eingaben, leere und ausgefüllte Prompts, gültige und beschädigte PDF-Dateien sowie die kleinste und grösste erlaubte Anzahl an Karten. Falls weitere Dateiformate unterstützt werden, testen wir diese ebenfalls.

Für die Modultests wird der externe KI-Dienst durch einen Test-Dienst ersetzt. So können die Tests wiederholt werden, ohne dass eine Internetverbindung nötig ist. Ausserdem erhalten die Tests dadurch immer die gleichen Antworten.

Danach prüfen wir, wie die einzelnen Komponenten zusammenarbeiten. Dabei testen wir den ganzen Ablauf: von der Auswahl der PDF-Dateien über deren Verarbeitung bis zur Anzeige der Lernkarten. Auch Fehler werden geprüft, zum Beispiel wenn der KI-Dienst nicht antwortet.

Die automatischen Tests werden mit Gradle ausgeführt. JaCoCo zeigt, welcher Teil des Codes durch die Tests geprüft wird. Der Bericht wird sowohl für das ganze Projekt als auch für die Forge-Synesis-Erweiterung ausgewertet.

### 4.2 Funktionstests

Die Funktionstests prüfen, ob die Anwendung die Anforderungen aus dem Pflichtenheft erfüllt. Dabei wird die Anwendung über ihre Benutzeroberfläche getestet, ohne den Quellcode zu prüfen. Für jede Anforderung wird mindestens ein Testfall erstellt. Die Kennung der Anforderung aus dem Pflichtenheft wird beim Testfall angegeben. Alle Tests und Ergebnisse werden dokumentiert.

Zuerst wird der normale Ablauf geprüft. Der Tester wählt die vorgesehenen PDF-Dateien aus, gibt einen Prompt ein, wählt die Anzahl der Karten, den Schwierigkeitsgrad und die Sprache. Danach startet er die Erstellung der Karten. Anschliessend wird geprüft, ob die richtige Anzahl an Karten angezeigt wird und ob die Karten zu den gewählten Einstellungen und zum Pflichtenheft passen.

Zusätzlich testen wir ungültige oder besondere Eingaben. Dazu gehören zum Beispiel ein leerer Prompt, keine ausgewählte Datei, eine beschädigte PDF-Datei und die kleinste sowie grösste erlaubte Kartenanzahl. Auch Fehler bei der Erstellung der Karten werden geprüft. Die Anwendung soll den Fehler verständlich anzeigen. Sie soll keine unvollständigen Ergebnisse als erfolgreich erstellte Karten zeigen.

Die Texte der erstellten Karten können sich bei jedem Test unterscheiden. Deshalb vergleichen wir nicht immer den genauen Wortlaut. Stattdessen prüfen wir wichtige Eigenschaften: die Anzahl der Karten, die Sprache, den Schwierigkeitsgrad und den Bezug zu den ausgewählten Unterlagen. Nach Änderungen führen wir die passenden Funktionstests erneut aus. So können wir feststellen, ob eine Änderung andere Funktionen beeinträchtigt.

### 5. Hardware- und Softwareanforderungen

Für die Tests wird ein Desktop-Computer oder Laptop benötigt. Darauf müssen das Betriebssystem und die Java- sowie JabRef-Version installiert sein, die das Projekt verlangt. Die genauen Versionsnummern werden vor dem Test im Repository und in den Projektvorgaben nachgesehen.

Für die automatischen Tests werden das Repository mit dem zu testenden Branch, der Gradle Wrapper und die Testdaten benötigt. Für die Funktionstests brauchen wir die vorgesehenen PDF-Beispieldateien. Dazu gehört mindestens eine gültige Datei. Falls es die Anforderungen vorsehen, werden auch beschädigte Dateien und weitere Testdateien verwendet.

Wenn ein Test den echten KI-Dienst verwendet, sind eine Internetverbindung und eine passende Testkonfiguration nötig. Zugangsdaten werden sicher gespeichert und nicht ins Repository eingecheckt. Bei automatischen Tests wird der externe Dienst durch einen Test-Dienst ersetzt. So bleiben die Testergebnisse besser wiederholbar.

Falls Forge Synesis als Webseite und nicht direkt in JabRef getestet wird, müssen auch der unterstützte Browser und seine Version angegeben werden.
## 6 Testfälle

### 6.1 Modultests
| Name der Klasse       | Name des Testfalls                                         |
|-----------------------|------------------------------------------------------------|
| ForgeSynesisViewModel | Überprüfung der Parameter- und Prompteingabe               |
| ForgeSynesisViewModel | Überprüfung der Standardwerte und Konfigurationsänderungen |
| ForgeSynesisService   | Überprüfung der Flashcard-Generierung                      |
| ForgeSynesisService   | Überprüfung der Eingabevalidierung und Fehlerbehandlung    |
| ForgeSynesisAPIClient | Überprüfung der API-Anfrage und Parametereingabe           |
| ForgeSynesisAPIClient | Überprüfung der Verarbeitung von API-Antworten             |


##### Testfall: /TM10/
*Testziel:*
Überprüfung der korrekten Darstellung und Bedienbarkeit der Forge-Synesis-Oberfläche. <br> 
*Voraussetzung:*
JabRef ist gestartet und eine Bibliothek wurde geöffnet <br>
*Eingabe:*
Der Benutzer öffnet Forge Synesis über den Knopf in der Toolbar, oder der Tasteneingabe "Alt+2" <br>
*Erwartete Ausgabe:*
Das Forge-Synesis-Panel wird geöffnet. Alle vorhergesehen UI-Elemente werden korrekt dargestellt und sind bedienbar
<br>  *Abhängigkeiten:*
JabRef, JavaFX, ForgeSynesisView und ForgeSynesis.fxml


### 6.2 Funktionstests
##### Testfall: /TF10/
*Testziel:* Überprüfung der Auswahl und Anzeige von Lernmaterialien sowie des Öffnens von Forge Synesis in einem eigenen Fenster.

*Voraussetzung:* JabRef wurde gestartet und eine Bibliothek mit mindestens einem geeigneten Lernmaterial ist geöffnet.

*Eingabe:* Der Benutzer öffnet Forge Synesis über den entsprechenden Menüeintrag und wählt ein oder mehrere Lernmaterialien aus.

*Erwartete Ausgabe:* Forge Synesis öffnet sich in einem eigenen Fenster. Die ausgewählten Lernmaterialien werden in der Oberfläche angezeigt.

*Abhängigkeiten:* JabRef, ForgeSynesisView, JabRef-Auswahlmechanismus.

##### Testfall: /TF11/
*Testziel:* Überprüfung der Einstellungsmöglichkeiten für die Generierung.

*Voraussetzung:* Forge Synesis wurde geöffnet.

*Eingabe:* Der Benutzer wählt eine Sprache (Deutsch oder Englisch), eine Schwierigkeitsstufe (Leicht, Mittel oder Schwer) und eine Anzahl zwischen 5 und 20 Lernkarten. Zusätzlich kann ein Thema eingegeben werden.

*Erwartete Ausgabe:* Alle ausgewählten Einstellungen und das optionale Thema werden korrekt übernommen. Ungültige Werte für die Anzahl werden verhindert.

*Abhängigkeiten:* ForgeSynesisView, ForgeSynesisViewModel.

##### Testfall: /TF12/
*Testziel:* Überprüfung der Anzeige der ausgewählten Lernmaterialien und Generierungseinstellungen vor dem Start der Generierung.

*Voraussetzung:* Mindestens ein Lernmaterial wurde ausgewählt und die Generierungsparameter wurden festgelegt.

*Eingabe:* Der Benutzer überprüft die Konfiguration vor dem Start der Generierung.

*Erwartete Ausgabe:* Die ausgewählten Lernmaterialien, die Sprache, die Schwierigkeitsstufe, die Anzahl der Lernkarten und das optionale Thema werden korrekt angezeigt.

*Abhängigkeiten:* ForgeSynesisView, ForgeSynesisViewModel.

##### Testfall: /TF13/
*Testziel:* Überprüfung der Generierung und Verarbeitung von Lernkarten anhand der ausgewählten Lernmaterialien und Einstellungen.

*Voraussetzung:* Mindestens ein geeignetes Lernmaterial wurde ausgewählt. Eine Internetverbindung und ein gültiger API-Zugang sind vorhanden.

*Eingabe:* Der Benutzer startet die Generierung mit den zuvor festgelegten Einstellungen.

*Erwartete Ausgabe:* Die Lernmaterialien und Einstellungen werden an die Gemini API übermittelt. Die gültige API-Antwort wird verarbeitet und die festgelegte Anzahl an Lernkarten wird in der gewählten Sprache und Schwierigkeit sowie unter Berücksichtigung des angegebenen Themas angezeigt. Jede Karte enthält eine Frage und eine Antwort. Unvollständige Karten werden nicht gespeichert.

*Abhängigkeiten:* ForgeSynesisView, ForgeSynesisViewModel, ForgeSynesisService, ForgeSynesisAPIClient, Gemini API.

##### Testfall: /TF14/
*Testziel:* Überprüfung der Fehlerbehandlung bei fehlgeschlagener Kommunikation mit der Gemini API.

*Voraussetzung:* Forge Synesis ist geöffnet.

*Eingabe:* Der Benutzer startet eine Generierung, während die Internetverbindung unterbrochen ist, der API-Zugang ungültig ist oder die API keine verwendbare Antwort liefert.

*Erwartete Ausgabe:* Eine verständliche Fehlermeldung wird angezeigt. JabRef bleibt weiterhin bedienbar und stürzt nicht ab.

*Abhängigkeiten:* ForgeSynesisService, ForgeSynesisAPIClient, Gemini API.

##### Testfall: /TF15/
*Testziel:* Überprüfung der Bearbeitung und Speicherung generierter Lernkarten.

*Voraussetzung:* Es wurden erfolgreich Lernkarten generiert.

*Eingabe:* Der Benutzer überprüft die generierten Lernkarten, bearbeitet einzelne Fragen oder Antworten und speichert die Lernkartensammlung.

*Erwartete Ausgabe:* Die Änderungen werden übernommen und die Lernkarten werden gespeichert. Sie werden dem ausgewählten Lernmaterial zugeordnet.

*Abhängigkeiten:* ForgeSynesisView, ForgeSynesisService, Speichermechanismus von JabRef.

##### Testfall: /TF16/
*Testziel:* Überprüfung der Suche nach gespeicherten Lernkarten.

*Voraussetzung:* Es existieren gespeicherte Lernkartensammlungen zu verschiedenen Lernmaterialien oder Fächern.

*Eingabe:* Der Benutzer sucht nach einer Lernkartensammlung anhand eines Fachs oder eines zugeordneten Lernmaterials.

*Erwartete Ausgabe:* Die passenden Lernkartensammlungen werden angezeigt.

*Abhängigkeiten:* Suchfunktion, Speichermechanismus, ForgeSynesisService.

##### Testfall: /TF17/
*Testziel:* Überprüfung des Starts einer Lernsitzung und der Anzeige einzelner Lernkarten.

*Voraussetzung:* Es existiert mindestens eine gespeicherte Lernkartensammlung mit Lernkarten.

*Eingabe:* Der Benutzer wählt eine Lernkartensammlung aus und startet eine Lernsitzung. Anschliessend lässt er sich die Antwort einer angezeigten Karte einblenden.

*Erwartete Ausgabe:* Die Frage der ersten Lernkarte wird angezeigt. Die Antwort bleibt zunächst verborgen und wird erst nach entsprechender Benutzeraktion eingeblendet.

*Abhängigkeiten:* Lernmodus, ForgeSynesisView, Speichermechanismus.

##### Testfall: /TF18/
*Testziel:* Überprüfung der Bewertung von Lernkarten während einer Lernsitzung.

*Voraussetzung:* Eine Lernsitzung wurde gestartet und eine Lernkarte wird angezeigt.

*Eingabe:* Der Benutzer blendet die Antwort ein und markiert diese als richtig oder falsch.

*Erwartete Ausgabe:* Die Bewertung wird übernommen und die nächste Lernkarte wird angezeigt.

*Abhängigkeiten:* Lernmodus, Fortschrittsverwaltung.

##### Testfall: /TF19/
*Testziel:* Überprüfung der Anzeige des Lernergebnisses nach einer abgeschlossenen Lernsitzung.

*Voraussetzung:* Eine Lernsitzung wurde vollständig abgeschlossen und die Lernkarten wurden bewertet.

*Eingabe:* Der Benutzer beendet die Lernsitzung.

*Erwartete Ausgabe:* Das System zeigt die Anzahl der richtig und falsch beantworteten Lernkarten an.

*Abhängigkeiten:* Lernmodus, Fortschrittsverwaltung.

##### Testfall: /TF20/
*Testziel:* Überprüfung der Speicherung und Anzeige des Lernfortschritts.

*Voraussetzung:* Es wurde mindestens eine Lernsitzung mit einer gespeicherten Lernkartensammlung durchgeführt.

*Eingabe:* Der Benutzer öffnet die Übersicht des Lernfortschritts einer Lernkartensammlung.

*Erwartete Ausgabe:* Das System zeigt die Anzahl der bearbeiteten Lernkarten sowie die Anzahl der richtigen und falschen Antworten an. Die gespeicherten Werte bleiben auch nach einem Neustart von JabRef erhalten.

*Abhängigkeiten:* Fortschrittsverwaltung, Speichermechanismus.

##### Testfall: /TF21/
*Testziel:* Überprüfung des Verhaltens bei der Auswahl einer leeren Lernkartensammlung.

*Voraussetzung:* Es existiert eine gespeicherte, aber leere Lernkartensammlung sowie mindestens eine weitere Lernkartensammlung.

*Eingabe:* Der Benutzer wählt die leere Lernkartensammlung aus.

*Erwartete Ausgabe:* Das System zeigt eine entsprechende Meldung an und ermöglicht die Auswahl einer anderen Sammlung. Der bestehende Lernfortschritt bleibt unverändert.

*Abhängigkeiten:* Lernmodus, Speichermechanismus, Fortschrittsverwaltung.