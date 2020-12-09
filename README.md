# Autom2Cpp
This is an interpreter to export automatas to cpp code.

You will find a folder that contains:
src folder: where interpreted was definded.
gen folder: files related to interpreter rules.
grammar folder: Contains Autom2c.g4 file, where grammar rules are defined
input folder: Contains test.a2c file, which has a sample automaton declaration to be translated to c++ code.
Other folders & files: Files related to Intellij idea IDE, where the interprer was developed.

To run in your Computer you need to instal and run Intellij Idea IDE https://www.jetbrains.com/idea/download/ and install the ANTLR plugin https://www.antlr.org/tools.html

After open the project, you have to add gen folder to source files of the project and edit run configurations to add input/test.a2c as program arguments to test the interpreter 
