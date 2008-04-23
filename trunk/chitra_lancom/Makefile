ANTLR_HOME=/home/sambuddho/antlrworks
CP=.:$(ANTLR_HOME)/lib/antlr-2.7.7.jar:$(ANTLR_HOME)/lib/antlr-3.0.1.jar:$(ANTLR_HOME)/antlrworks/lib/stringtemplate-3.1.jar:$(ANTLR_HOME)/antlrworks/lib/jgoodies.jar

all: generate build

generate:
	java -classpath $(CP) $(ANTLR_TOOL) html.g
build:
	javac -classpath $(CP) *.java
run:
	java -classpath $(CP) Main test.html
clean:
	rm -f *.tokens
	rm -f *.class
	rm -f htmlParser*.java
	rm -f *~
	rm -f *.lexer.g
