
# Projektplan 
Der Projektplan dient als Orientierung für das Vorgehen und die zeitliche Planung des Projekts. 
Er ist nicht verbindlich und kann im Verlauf der Entwicklung bei Bedarf angepasst werden. 
Dabei ist zu berücksichtigen, dass einzelne Aufgaben möglicherweise anspruchsvoller sind als ursprünglich angenommen 
und daher mehr Zeit und Ressourcen in Anspruch nehmen können.


### Phasen: 
- 1: Anforderungen und technische Analyse
- 2: Architektur und Projektgrundlagen
- 3: Benutzeroberfläche
- 4: Gemini API und Flashcard Generierung
- 5: Integration und Qualitätssicherung 
- 6: Abschluss und Abgabe



| ID  | Phase | Tasks                                                                                    | Zeit in Stunden | Startdatum | Entwickler      | Status    |
| --- | ----- | ---------------------------------------------------------------------------------------- | --------------- | ---------- | --------------- | --------- |
| T01 | 1     | Funktionale und nicht-funktionale Anforderungen festlegen                                | 2               | 07.10.2026 | Alle            | erledigt  |
| T02 | 1     | Anforderungen und Abnahmekriterien im Pflichtenheft festlegen                            | 4               | 07.10.2026 | Alle            | erledigt  |
| T03 | 1     | JabRef-Code, Erweiterungspunkte und Buildprozesse untersuchen                            | 6               | 09.10.2026 | Alle            | offen     |
| T04 | 1     | Gemini API, Modelle und Machbarkeit untersuchen                                          | 2               | 08.10.2026 | Shahriar, Erind | in Arbeit |
| T05 | 1     | Entwicklungsumgebung und Projekt einrichten und starten                                  | 4               | 10.10.2026 | Shahriar        | offen     |
|     |       |                                                                                          |                 |            |                 |           |
| T06 | 2     | Architektur und Modularaufteilung für Forge Synesis entwerfen                            | 4               | 12.10.2026 | Alle            | in Arbeit |
| T07 | 2     | Schnittstellen und Datenfluss zwischen JabRef, Forge Synesis und Gemini definieren       | 4               | 14.10.2026 | Erind, Bavan    | offen     |
| T08 | 2     | Git-Workflow, Branches und Integrationsregeln festlegen                                  | 3               | 10.10.2026 | Shahriar        | in Arbeit |
| T09 | 2     | Grundstruktur für Forge Synesis festlegen und in JabRef implementieren                   | 6               | 15.10.2026 | Erind, Bavan    | offen     |
| T10 | 2     | Testumgebung und Testframework einrichten                                                | 4               | 13.10.2026 | Jasra, Shahriar | offen     |
|     |       |                                                                                          |                 |            |                 |           |
| T11 | 3     | Grundlegende Benutzeroberfläche entwerfen                                                | 4               | 12.10.2026 | Alle            | in Arbeit |
| T12 | 3     | Previewfenster für Quellen implementieren                                                | 6               | 19.10.2026 | Erind           | offen     |
| T13 | 3     | Auswahl des Lernmaterials implementieren                                                 | 6               | 19.10.2026 | Bavan           | offen     |
| T14 | 3     | Einstellung der Parameter implementieren                                                 | 4               | 19.10.2026 | Jasra           | offen     |
| T15 | 3     | Ladezustandsanzeige implementieren                                                       | 4               | 22.10.2026 | Shahriar        | offen     |
| T16 | 3     | Vorschau der generierten Karten in der UI darstellen                                     | 4               | 26.10.2026 | Erind, Jasra    | offen     |
| T17 | 3     | Fehlermeldung an Forge Synesis weiterleiten und korrekt abbilden                         | 4               | 26.10.2026 | Shahriar, Erind | offen     |
|     |       |                                                                                          |                 |            |                 |           |
| T18 | 4     | Sichere Konfiguration des API Schlüssels implementieren                                  | 3               | 19.10.2026 | Bavan           | offen     |
| T19 | 4     | Verbindung zu Gemini implementieren und Testanfragen durchführen                         | 6               | 19.10.2026 | Shahriar        | offen     |
| T20 | 4     | Lernmaterial für die Übergabe an Gemini vorbereiten                                      | 3               | 22.10.2026 | Jasra           | offen     |
| T21 | 4     | Prompt für die Generierung der Flashcards entwickeln                                     | 3               | 22.10.2026 | Jasra           | offen     |
| T22 | 4     | API Antwort verwerten und in Flashcard-Format übertragen                                 | 6               | 26.10.2026 | Erind, Jasra    | offen     |
| T23 | 4     | Generierte Karten in UI Anzeigen                                                         | 4               | 29.10.2026 | Erind, Jasra    | offen     |
| T24 | 4     | Fehlerbehandlung für API Ausfälle, ungültige Antworten oder fehlende Parameter behandeln | 4               | 26.10.2026 | Bavan           | offen     |
| T25 | 4     | Unit-Tests schreiben                                                                     | 6               | 26.10.2026 | Shahriar, Bavan | offen     |
|     |       |                                                                                          |                 |            |                 |           |
| T26 | 5     | Ablauf von Materialauswahl und Vorschau integrieren                                      | 5               | 02.11.2026 | Bavan           | offen     |
| T27 | 5     | Unit-Tests erweitern und fortführen                                                      | 4               | 02.11.2026 | Jasra, Bavan    | offen     |
| T28 | 5     | Integrationstests für den vollständigen  Anwendungsfall durchführen                      | 5               | 04.11.2026 | Shahriar        | offen     |
| T29 | 5     | Fehler beheben und Regressionstests durchführen                                          | 6               | 09.11.2026 | Shahriar, Jasra | offen     |
| T30 | 5     | Bedienbarkeite und Verarbeitung unterschiedlicher Materialien testen                     | 4               | 09.11.2026 | Erind           | offen     |
|     |       |                                                                                          |                 |            |                 |           |
| T31 | 6     | Installations und Benutzerdokumente erstellen                                            | 4               | 16.11.2026 | Jasra, Bavan    | offen     |
| T32 | 6     | Technische Dokumentation und Architekturentscheidungen erstellen                         | 3               | 16.11.2026 | Erind, Shahriar | offen     |
| T33 | 6     | Projektbericht und Nachweise der Anforderungen fertigstellen                             | 5               | 16.11.2026 | Alle            | offen     |
| T34 | 6     | Finalle installation, Build und Abgabe prüfen                                            | 3               | 25.11.2026 | Alle            | offen     |
| T35 | 6     | Abschlussreview durchführen und Abgabe vorbereiten                                       | 2               | 27.11.2026 | Alle            | offen     |