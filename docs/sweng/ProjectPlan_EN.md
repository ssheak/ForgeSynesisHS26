# Project Plan

(Disclaimer: this version is based on the original “Projektplan” file. Since it was conceived, in theory, as a literal translation created for the convenience of all team members, any errors should not be taken into account or attributed to the design or implementation of the project. Additionally, external translation and proofreading tools may have been used for certain passages.)

The project plan serves as a guide for the project approach and schedule.
It is not binding and may be adjusted during development if necessary.
It should be taken into account that some tasks may be more challenging than originally anticipated
and may therefore require more time and resources.

### Phases:
- 1: Requirements and Technical Analysis
- 2: Architecture and Project Foundations
- 3: User Interface
- 4: Gemini API and Flashcard Generation
- 5: Integration and Quality Assurance
- 6: Completion and Submission

| ID  | Phase | Tasks                                                                         | Time in Hours | Start Date | Developers      | Status      |
| --- | ----- | ----------------------------------------------------------------------------- | ------------- | ---------- | --------------- | ----------- |
| T01 | 1     | Define functional and non-functional requirements                             | 2             | 07.10.2026 | All             | Completed   |
| T02 | 1     | Define requirements and acceptance criteria in the requirements specification | 4             | 07.10.2026 | All             | Completed   |
| T03 | 1     | Examine the JabRef code, extension points, and build processes                | 6             | 09.10.2026 | All             | Open        |
| T04 | 1     | Investigate the Gemini API, models, and feasibility                           | 2             | 08.10.2026 | Shahriar, Erind | In Progress |
| T05 | 1     | Set up and launch the development environment and project                     | 4             | 10.10.2026 | Shahriar        | Open        |
|     |       |                                                                               |               |            |                 |             |
| T06 | 2     | Design the architecture and modular structure of Forge Synesis                | 4             | 12.10.2026 | All             | In Progress |
| T07 | 2     | Define interfaces and data flow between JabRef, Forge Synesis, and Gemini     | 4             | 14.10.2026 | Erind, Bavan    | Open        |
| T08 | 2     | Define the Git workflow, branches, and integration rules                      | 3             | 10.10.2026 | Shahriar        | In Progress |
| T09 | 2     | Define the basic structure of Forge Synesis and implement it in JabRef        | 6             | 15.10.2026 | Erind, Bavan    | Open        |
| T10 | 2     | Set up the test environment and testing framework                             | 4             | 13.10.2026 | Jasra, Shahriar | Open        |
|     |       |                                                                               |               |            |                 |             |
| T11 | 3     | Design the basic user interface                                               | 4             | 12.10.2026 | All             | In Progress |
| T12 | 3     | Implement a preview window for source materials                               | 6             | 19.10.2026 | Erind           | Open        |
| T13 | 3     | Implement learning material selection                                         | 6             | 19.10.2026 | Bavan           | Open        |
| T14 | 3     | Implement parameter configuration                                             | 4             | 19.10.2026 | Jasra           | Open        |
| T15 | 3     | Implement a loading status indicator                                          | 4             | 22.10.2026 | Shahriar        | Open        |
| T16 | 3     | Display a preview of generated flashcards in the UI                           | 4             | 26.10.2026 | Erind, Jasra    | Open        |
| T17 | 3     | Forward error messages to Forge Synesis and display them correctly            | 4             | 26.10.2026 | Shahriar, Erind | Open        |
|     |       |                                                                               |               |            |                 |             |
| T18 | 4     | Implement secure API key configuration                                        | 3             | 19.10.2026 | Bavan           | Open        |
| T19 | 4     | Implement the connection to Gemini and carry out test requests                | 6             | 19.10.2026 | Shahriar        | Open        |
| T20 | 4     | Prepare learning material for submission to Gemini                            | 3             | 22.10.2026 | Jasra           | Open        |
| T21 | 4     | Develop a prompt for generating flashcards                                    | 3             | 22.10.2026 | Jasra           | Open        |
| T22 | 4     | Process the API response and convert it into flashcard format                 | 6             | 26.10.2026 | Erind, Jasra    | Open        |
| T23 | 4     | Display generated flashcards in the UI                                        | 4             | 29.10.2026 | Erind, Jasra    | Open        |
| T24 | 4     | Handle API failures, invalid responses, or missing parameters                 | 4             | 26.10.2026 | Bavan           | Open        |
| T25 | 4     | Write unit tests                                                              | 6             | 26.10.2026 | Shahriar, Bavan | Open        |
|     |       |                                                                               |               |            |                 |             |
| T26 | 5     | Integrate the learning material selection and preview workflow                | 5             | 02.11.2026 | Bavan           | Open        |
| T27 | 5     | Extend and continue unit testing                                              | 4             | 02.11.2026 | Jasra, Bavan    | Open        |
| T28 | 5     | Perform integration tests for the complete use case                           | 5             | 04.11.2026 | Shahriar        | Open        |
| T29 | 5     | Fix bugs and perform regression tests                                         | 6             | 09.11.2026 | Shahriar, Jasra | Open        |
| T30 | 5     | Test usability and the processing of different materials                      | 4             | 09.11.2026 | Erind           | Open        |
|     |       |                                                                               |               |            |                 |             |
| T31 | 6     | Create installation and user documentation                                    | 4             | 16.11.2026 | Jasra, Bavan    | Open        |
| T32 | 6     | Create technical documentation and document architectural decisions           | 3             | 16.11.2026 | Erind, Shahriar | Open        |
| T33 | 6     | Finalize the project report and evidence of requirements fulfillment          | 5             | 16.11.2026 | All             | Open        |
| T34 | 6     | Verify the final installation, build, and submission                          | 3             | 25.11.2026 | All             | Open        |
| T35 | 6     | Conduct a final review and prepare the submission                             | 2             | 27.11.2026 | All             | Open        |
