# Requirements Specification
##### (Based on Lichter & Ludwig, *Software Engineering: Fundamentals, People, Processes, Techniques*)
(Disclaimer: this version is based on the original “Pflichtenheft” file. Since it was conceived, in theory, as a literal translation created for the convenience of all team members, any errors should not be taken into account or attributed to the design or implementation of the project. Additionally, external translation and proofreading tools may have been used for certain passages.)

## 1. Introduction

### 1.1 Purpose

This requirements specification defines the requirements for the "Forge Synesis" extension for JabRef.
It serves as the basis for the development, implementation, testing, and acceptance of the software.
Furthermore, this document is intended primarily for the development team
and the supervisors of the Software Engineering project.

### 1.2 Scope and Objectives
The extension is intended for JabRef users and students who want to manage their documents, lecture scripts, and bibliographies while effectively acquiring new knowledge through memory training. The main objective is to transform learning material already available in JabRef
into interactive flashcards, thereby providing a continuous
workflow from learning material to studying.

Features:
- [ ] Separate window for flashcard generation
- [ ] Users can specify the language, number of cards, and topic
- [ ] Cards can be edited individually after generation
- [ ] Cards can be flipped to reveal the answers
- [ ] The numbers of correct and incorrect answers are displayed
- [ ] Display learning progress

Possible Extensions:
- [ ] Points system for correct answers
- [ ] Milestones in exchange for "XP"

### 1.3 Definitions

| Term | Meaning |
|---|---|
| Forge | A forge or the act of forging something |
| Synesis | Greek for "insight" or "meaning" |
| Flashcard | Study card / learning card |
| UI | User interface |
| XP | Experience points |
| API | Communication interface between programs |
| Gemini AI | Gemini as an artificial intelligence system |
| Shuffle | Mixing or randomizing (e.g., flashcards) |
| Learning material | Lecture scripts, PDFs, and notes from which flashcards are generated |
| Milestone | Reward system with intermediate goals |


### 1.4 Referenced Documents

| Document | Description | Link |
|---|---|---|
| JabRef Documentation | Documentation of the JabRef reference management software and its features | https://docs.jabref.org/ |
| Google Gemini API Documentation | Documentation of the Gemini API for AI-assisted flashcard generation | https://ai.google.dev/gemini-api/docs |
| Java Documentation | Official documentation of the Java programming language and its libraries | https://docs.oracle.com/en/java/ |
| Markdown Guide | Reference for formatting the project documentation in Markdown | https://www.markdownguide.org/ |

### 1.5 Overview

Chapter 2 describes the general integration and operating conditions of the system.
Chapter 3 specifies the functional requirements.
Chapter 4 defines the acceptance criteria for these requirements. The detailed use cases are described in Appendix A.

## 2. General Description

### 2.1 Integration

Forge Synesis will be integrated as an extension into the existing JabRef application.
JabRef provides the bibliographic entries selected by the user and the
associated learning materials. Forge Synesis accesses these data
and makes them available for the user to select for flashcard generation.

Communication between Forge Synesis and the Gemini API takes place via an
API interface. The learning materials selected by the user
and the specified generation parameters are transmitted through this interface.
These parameters include, among other things, the number, language, and
difficulty of the flashcards to be generated, as well as the specified topic.

The Gemini API processes this information and returns the generated
questions and answers to Forge Synesis. Forge Synesis processes the
response and displays the resulting flashcards within JabRef.

An active internet connection is required
for communication with the Gemini API.

### 2.2 Features

Forge Synesis provides users with features for creating, editing, and
using AI-generated flashcards.

The main features are:

- Selecting learning material from JabRef
- Specifying generation parameters
- Specifying a topic
- Generating flashcards
- Previewing and editing the generated flashcards
- Using flashcards in Study Mode
- Organizing flashcards by subject or learning material
- Recording learning progress and awarding XP
### 2.3 User Profiles

Forge Synesis is primarily intended for students and academics who use JabRef to manage and organize
scientific texts and other documents.
No special technical knowledge is required to use Forge Synesis.
However, users should have basic knowledge of how to use JabRef and sufficient English language skills.

Three user groups are distinguished:

- **Beginners**: Have little experience with JabRef and may need assistance with basic functions,
  such as importing and grouping documents. Using Forge Synesis should also be as simple
  and intuitive as possible for these users.

- **Intermediate Users**: Are familiar with the main features of JabRef and can import and organize documents independently.
  They can open Forge Synesis on their own and configure the parameters for generating flashcards.

- **Experienced Users**: Have extensive knowledge of JabRef and can organize documents quickly and independently.
  They can use Forge Synesis entirely on their own and subsequently review and edit the flashcards.



### 2.4 Constraints

Forge Synesis is being developed as an extension of the existing open-source application JabRef.
Therefore, its implementation must follow JabRef's existing architecture, technologies, and development conventions.
The extension must be compatible with the JabRef version specified for the project and must not interfere with the application's existing features.

The external Gemini API is used to generate flashcards.
The AI-assisted generation functionality therefore depends on the availability of this service and a working internet connection.
Errors in communication with the Gemini API or in processing its responses must be handled so that they do not cause Forge Synesis or JabRef to crash. Instead, the user should be shown an understandable error message.

Changes to the interfaces or the JabRef version being used must be taken into account during further development to ensure compatibility between the components involved.

### 2.5 Assumptions and Dependencies
It is assumed that the user can access suitable learning materials through JabRef and that an active internet connection
is available for generating flashcards. Furthermore, the implementation and operation of Forge Synesis depend on the current JabRef version
and its interfaces.


## 3. Individual Requirements

### 3.1 Functional Requirements

#### Selection and Display of Learning Material
* /F10/ The user must be able to select one or more learning materials from JabRef.
* /F11/ The system must display the selected learning materials in Forge Synesis before generation.
* /F12/ Forge Synesis must be able to open in its own window within JabRef.
#### Generation Settings
* /F20/ The user must be able to specify the number, language, and difficulty of the flashcards.
* /F21/ The user must be able to select German or English and one of the difficulty levels Easy, Medium, or Hard. The number of cards must be between 5 and 20.
* /F22/ The user must be able to enter a topic. Specifying a topic is optional.
* /F23/ The system must display the selected learning materials and settings before generation starts.

#### Flashcard Generation
* /F30/ The system must send the selected learning materials and settings to the Gemini API.
* /F31/ If the Gemini API is unreachable or does not return a usable response, the system must display an understandable error message. JabRef must not crash.
* /F32/ The system must process a valid response from the Gemini API and display the questions and answers as individual flashcards in JabRef.
* /F33/ The system must create the number of flashcards specified by the user. The cards must take into account the selected language and difficulty, as well as the specified topic.
* /F34/ Each flashcard must contain a question and an answer. The system must not save incomplete cards.
Reviewing, Editing, and Saving
* /F40/ The user must be able to review and individually edit the generated flashcards before saving them.
* /F41/ The user must be able to save the flashcards and associate them with the selected learning material.
* /F42/ The user must be able to find saved flashcards by subject or learning material.
#### Study Mode
* /F50/ The user must be able to select a saved flashcard collection and start a study session.
* /F51/ The system must display flashcards one at a time. It first displays the question. The user can then reveal the answer.
* /F52/ The user must be able to mark each answer as correct or incorrect. The system must then display the next flashcard.

#### Study Results and Learning Progress
* /F60/ After a study session, the system must display the number of correct and incorrect answers.
* /F61/ The system must save and display learning progress for each flashcard collection. It must display the number of reviewed cards, as well as the numbers of correct and incorrect answers.

#### Empty Flashcard Collection
* /F70/ If the user selects an empty flashcard collection, the system must display a message. The user can then select another collection. Learning progress must remain unchanged.

## 4. Acceptance Criteria
* /A10/ Generate flashcards: The user selects learning material and specifies the number, language, difficulty, and topic. Forge Synesis creates the desired number of flashcards based on the selected material and displays them in JabRef.
* /A20/ Check flashcards: Each flashcard contains a question and an answer. Both fields are filled in. The cards are in the selected language and match the selected topic.
* /A30/ Review and save cards: The user can read and edit each card before saving it. Saved cards are associated with the selected learning material and can be found later.
* /A40/ Use Study Mode: The user first sees the question and can then display the answer. The user can subsequently mark the answer as correct or incorrect. The system then displays the next card.
* /A50/ Display study results: After the study session, the system displays the number of correct and incorrect answers and updates learning progress.
* /A60/ Handle an empty collection: If the user selects a collection without flashcards, the system displays a clear message. The user can select another collection. Learning progress is not changed.
* /A70/ Handle Gemini API errors: If the Gemini API is unavailable or returns an unusable result, the system displays an understandable error message. Incomplete cards are not saved, and JabRef does not crash.


# Appendix

## Appendix A. Use Cases

### Use Case 1:
* **Name:** Generate Flashcards from Learning Material
* **Actors:** Student / JabRef User
* **Preconditions:**
  * JabRef is running.
  * The user has learning material that can be selected
    in JabRef.
  * The Gemini API is configured.
  * A network connection is available.
* **Main Flow**
  1. The user opens Forge Synesis.
  2. The user selects learning material.
  3. The system displays the selected learning material.
  4. The user opens the flashcard generation settings.
  5. The user enters the desired number of cards.
  6. The user starts the generation.
  8. The system sends the learning material and selected parameters
     to the Gemini API.
  9. The Gemini API generates questions and answers.
  10. The system processes the API response.
  11. The system displays the generated flashcards.
  12. The user can review and edit the cards.

* **Success Postconditions:**
  * The generated flashcards are associated with the selected learning material.
  * The cards can be edited and saved by the user.

* **Exception Postconditions:**
  * In the event of an error, no incomplete cards are saved.
  * The user receives an understandable error message.


### Exception 1a: Gemini API Unreachable

* **Exception Flow 1a**
  1. The user starts the generation.
  2. The system attempts to reach the Gemini API.
  3. The API is unreachable.
  4. The system terminates the generation in a controlled manner.
  5. The system displays an error message.


### Use Case 2:
* **Name:** *Study Flashcards*
* **Actors:** *Student / JabRef User*
* **Preconditions:**
  * JabRef is running.
  * At least one flashcard collection exists.
* **Main Flow**
  1. The user opens Study Mode.
  2. The user selects a flashcard collection.
  3. The system displays the first flashcard question.
  4. The user reveals the answer and marks it as correct or incorrect.
  5. The system updates learning progress and displays the next flashcard.
  6. Steps 3–5 are repeated until all flashcards have been reviewed.
  7. The system displays the study results.
* **Success Postconditions:**
  * The study session is completed.
  * The user's learning progress has been updated.
* **Exception Postconditions:**
  * No study session has been completed.
  * The user's progress remains unchanged.

#### Exception 2a: Empty Flashcard Collection
* Exception Flow 2a
    * The user selects an empty flashcard collection.
    * The system detects that no flashcards are available.
    * The system displays an informative message.
    * The user can select another collection.
