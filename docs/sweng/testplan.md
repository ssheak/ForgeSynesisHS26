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

Hier kann auf andere Dokumente referenziert werden die
für den Testplan relevant sind. Das kann zum Beispiel eine Anforderungsspezifikation oder ein Designdokument sein.
Stellen sie sich vor, dass die Tests typischerweise von einem eigenen Testteam durchgeführt werden.

## 2. Systemübersicht

Hier sollte eine kurze Übersicht über das System gegeben werden, mit besonderem Fokus auf die zu testenden Komponenten.


## 3. Merkmale

### 3.1 Zu testende Merkmale (Features / Funktionen)

#### 3.1.1 Funktionale Anforderungen

Welche spezifizierten funktionalen Anforderungen werden getestet? Referenzieren sie auch mittels dem Identifier (z.B. /LF10/ ) im Pflichtenheft.

### 3.2 Nicht zu testende Merkmale (Features / Funktionen)

Welche Aspekte werden explizit nicht getestet? Bitte begründen weshalb nicht.

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

Ihre Module sollten wenn immer möglich über automatisierte Unittests getestet werden.
Diese können Sie hier kurz (tabellarisch) auflisten. Es reicht, wenn Sie den Klassennamen und den Namen des Testfalls anschreiben.

| Name der Klasse | Name des Testfalls |
|-----------------|--------------------|
|   Testklasse 1  |   Testfall 1       |


Falls Sie ein Modul nicht automatisiert Testen können, müssen Sie den manuellen Testablauf nachfolgend beschreiben.

##### Testfall: /TM10/
*Testziel:*

*Voraussetzung:*

*Eingabe:*

*Erwartete Ausgabe:*

*Abhängigkeiten:*

### 6.2 Funktionstests
Beschreiben sie für die spezifizierten Anforderungen wie sie diese Testen. Für jede Anforderung sollten sie mindestens einen Test schreiben, der das gewünschte Verhalten überprüfen.

##### Testfall: /TF10/
*Testziel:*

*Voraussetzung:*

*Eingabe:*

*Erwartete Ausgabe:*

*Abhängigkeiten:*

