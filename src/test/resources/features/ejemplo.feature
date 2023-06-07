#autor: simonoh6@gmail.com / Simon Otalvaro Hernandez

Feature: Create a rich text note with bold font

    Background: Open the web page
        Given that the user is logged in the web


    Scenario: As an user I need to create a note whit rich text
        When The user enter the note whit rich text
        Then The user see the note whit rich text saved