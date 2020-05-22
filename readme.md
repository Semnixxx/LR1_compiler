This language provides operating with math objects, creating funcions, loops and vars.

# Run

Go to [tests class](https://github.com/Semnixxx/LR1_compiler/blob/master/src/compiler/MathlangTests.java) and click *Run Tests* on class definition. Then you can 
find compiled results at *compiled* folder; this result will target Java lang (defined 
and evaluated by custom *Visitor* class).

Test grammar texts is placed in *examples* folder. Each file define particular 
case (property) of grammar usage.

# Grammar

Grammar was designed with ANTLR. Grammar base can be found [here](https://github.com/KirillStoma/Special-for-Daniel-and-Alina/blob/master/ChislaLanguage.g4).

This grammar defines basic math operation, loops (while and for), 
conditional statement (if), and var and const integer 
and float values assignment.