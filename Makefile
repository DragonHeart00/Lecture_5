ANTLRJAR = /usr/local/lib/antlr-4.8-complete.jar

###export CLASSPATH := .:$(ANTLRJAR):${CLASSPATH}
antlr4 = java -jar $(ANTLRJAR)
grun = java org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = simpleCalcListener.java simpleCalcBaseListener.java simpleCalcParser.java simpleCalcBaseVisitor.java simpleCalcVisitor.java simpleCalcLexer.java

all:
	make main.class

main.class:	$(SRCFILES) $(GENERATED) simpleCalc.g4
	javac  $(SRCFILES) $(GENERATED)

simpleCalcListener.java:	simpleCalc.g4
	$(antlr4) -visitor simpleCalc.g4

test:	main.class
	java main input.txt

grun:	main.class
	$(grun) simpleCalc start -gui -tokens input.txt
