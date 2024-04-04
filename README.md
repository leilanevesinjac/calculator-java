Assignment - Metrika, pregled i statička analiza: 


Calculator.java: 188 linija koda
Licence: 21 linija koda
Start.java:  26 linija koda

Zbirno: 235 linija

Analiza slozenosti napravljena upotrebom ekstenzije “Codalyze” u VSC okruzenju: 


Function Name:	Calculator::Operations	
Start Line:	15
End Line:	16
Cyclomatic Complexity (Threshold: 10): 1
Lines of Code (Threshold: 50):	2
Parameter Count (Threshold: 4): 0

Function Name: Calculator::Operations::ToString
Start Line:	18
End Line:	20
Cyclomatic Complexity (Threshold: 10): 1
Lines of Code (Threshold: 50):	3
Parameter Count (Threshold: 4): 0

Function Name:	Calculator::Run
Start Line:	24
End Line:	26
Cyclomatic Complexity (Threshold: 10): 1
Lines of Code (Threshold: 50):	3
Parameter Count (Threshold: 4): 1

Function Name:	Calculator::evaluateExpression
Start Line:	28
End Line:	72
Cyclomatic Complexity (Threshold: 10): 12
Lines of Code (Threshold: 50):	33
Parameter Count (Threshold: 4): 1

Function Name:	Calculator::Calculate
Start Line:	74
End Line:	186
Cyclomatic Complexity (Threshold: 10): 12
Lines of Code (Threshold: 50):	77
Parameter Count (Threshold: 4): 2




Function Name:	Start::main
Start Line:	5
End Line:	24
Cyclomatic Complexity (Threshold: 10): 3
Lines of Code (Threshold: 50):	16
Parameter Count (Threshold: 4): 1



Staticka analiza koda napravljena uz pomoc SonarLint alata: 

Calculator.java - 4 - Dodati private konstruktor
Calculator.java - 18 - Preimenovati metodu "ToString" , moguca kolizija sa drugom metodom iz superklase
Calculator.java - 24 - Preimenovati, bez velikog pocetnog slova, nije u skladu sa konvencijom pisanja koda
Calculator.java - 70 - Doraditi kod, lokalna varijabla je suvisna
Calculator.java - 74 - Preimenovati, bez velikog pocetnog slova
Calculator.java - 183 - Void metoda, moze se izbrisati


Start.java - 6 - Preimenovati varijablu
start.java - 8 i 19 - Lint nudi klasu Logger i logging metode, umjesto System.out
