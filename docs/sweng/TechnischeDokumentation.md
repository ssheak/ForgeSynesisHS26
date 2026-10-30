---
layout: default
title : Technische Dokumentation
---
# Technische Dokumentation (Template)

| Version | Projektname   | Autor                                                                            | Status                                         | Datum      | Kommentar |
| ------- |---------------|----------------------------------------------------------------------------------|------------------------------------------------|------------| --------- |
|  0.1    | Forge Synesis | Jasra Mohamed Yousaf <br>Bavan Sivaloganathan <br>Erind Shima <br>Shahriar Sheak | in Bearbeitung | 30.10.2026 | |


# 1 Einführung

# 1.1 Zweck

Diese technische Dokumentation beschreibt den Aufbau und die geplante Funktionsweise der JabRef-Erweiterung „Forge Synesis“. Dabei werden die grundlegenden Designentscheidungen erläutert und die vorgesehenen Funktionen sowie die Struktur des Systems dargestellt. Ausserdem wird beschrieben, wie die einzelnen Komponenten miteinander kommunizieren und wie die Interaktion zwischen dem User und der Erweiterung abläuft.

Das Dokument soll einerseits sicherstellen, dass Auftraggeber und Entwickler ein gemeinsames Verständnis der geplanten Umsetzung haben. Andererseits dient es während der Entwicklung als Orientierung und technische Grundlage für die Implementierung.

# 1.2 Beziehung zu anderen Dokumenten

Als Grundlage für diese Dokumentation dient das Pflichtenheft von Forge Synesis. Zusätzlich wird der Projektplan als Referenz für die geplanten Entwicklungsschritte herangezogen.

# 2. Systemübersicht

„Forge Synesis“ ist eine Erweiterung für das Literaturverwaltungsprogramm JabRef. Ziel des Projekts ist es, Studierende bei der Erstellung von Lernmaterialien zu unterstützen. Obwohl JabRef bereits die Verwaltung wissenschaftlicher Quellen und deren zugehörigen PDF-Dateien ermöglicht, bietet es selbst keine direkte Möglichkeit, daraus automatisch Lernkarten zu erstellen. Die Erweiterung soll diese Lücke schliessen.

Hierfür erhält der User die Möglichkeit, PDF-Dokumente aus seiner JabRef-Bibliothek auszuwählen und für die Generierung von Lernkarten zu verwenden. Vor dem Start können verschiedene Parameter wie Sprache, Schwierigkeitsgrad und gewünschte Anzahl der Karten festgelegt werden. Darüber hinaus besteht die Möglichkeit, durch einen eigenen Prompt zusätzliche Anweisungen für die Generierung zu formulieren.

Die Verarbeitung der ausgewählten Dokumente erfolgt über eine eigens vorgesehene API-Schnittstelle. Diese übernimmt die Kommunikation mit einem externen KI-Modell, welches auf Basis der bereitgestellten Quellen und Einstellungen geeignete Lernkarten erstellt. Das Ergebnis wird anschliessend an die Erweiterung zurückgegeben und dem User zur Verfügung gestellt.

# 3. Designziele

* Die Benutzeroberfläche soll sich optisch und funktional in JabRef einfügen.

* Die Bedienung soll möglichst verständlich und ohne umfangreiche Vorkenntnisse möglich sein.

* Die Softwarestruktur soll zukünftige Erweiterungen und zusätzliche Funktionen unterstützen.

* Die einzelnen Systemkomponenten sollen klar voneinander getrennt sein, um Änderungen zu erleichtern.

* Die Kommunikation mit externen Diensten soll zuverlässig und wartbar gestaltet werden.

# 4. Systemverhalten

Beim Öffnen von Forge Synesis erscheint ein separates Fenster innerhalb von JabRef. Dieses stellt die verschiedenen Einstellungsmöglichkeiten bereit, über welche der User die Erstellung seiner Lernkarten konfigurieren kann.

Zunächst können die in JabRef gespeicherten PDF-Dokumente in einer Vorschau angezeigt und einzeln ausgewählt werden. Anschliessend lassen sich die gewünschten Generierungsparameter festlegen. Dazu gehören insbesondere die Sprache, der Schwierigkeitsgrad und die Anzahl der zu erstellenden Lernkarten. Ein zusätzliches Eingabefeld ermöglicht es, eigene Anweisungen in Form eines Prompts hinzuzufügen.

Sobald der User die Generierung startet, werden die ausgewählten Dokumente und die festgelegten Einstellungen an die Forge-Synesis-API weitergegeben. Diese verarbeitet die Anfrage und nutzt ein externes KI-Modell, um passende Lernkarten aus den bereitgestellten Inhalten zu erstellen. Nach erfolgreicher Verarbeitung werden die Ergebnisse zurück an die Erweiterung übermittelt und dem User angezeigt.
# 5. Design

## 5.1 Statik

(Noch anzufertigen)

## 5.2 Dynamik



![Klassendiagramm](/docs/sweng/diagrams/Klassendiagramm_ForgeSynesis.png)


![Sequenzdiagramm](/docs/sweng/diagrams/Sequenzdiagramm_ForgeSynesis.png)


![Aktivitätsdiagramm](/docs/sweng/diagrams/AktivitaetsDiagramm_ForgeSynesis.png)

## 5.3 Logik

Die Funktionsweise von Forge Synesis basiert auf verschiedenen logischen Bedingungen, welche einen korrekten Ablauf der Lernkartengenerierung sicherstellen sollen.

* Dokumentenauswahl: Für die Generierung müssen mindestens ein PDF-Dokument ausgewählt und dessen Inhalt erfolgreich verarbeitet werden können.

* Eingabevalidierung: Die erforderlichen Einstellungen müssen vor dem Start der Generierung überprüft werden. Dazu gehören insbesondere die Anzahl der gewünschten Lernkarten sowie die ausgewählten Parameter.
