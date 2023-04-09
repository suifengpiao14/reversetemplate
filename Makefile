antlr4_exe = java -jar /usr/local/lib/antlr-4.12.0-complete.jar
grun_exe = java org.antlr.v4.gui.TestRig
target = example.txt

all: build

build:
	go build

gen:
	$(antlr4_exe) -Dlanguage=Go -o parser Reversetemplate.g4 

gen_java:
	$(antlr4_exe) Reversetemplate.g4

gui: gen_java
	javac *.java
	$(grun_exe) Reversetemplate parseTpl $(target) -gui

tokens: gen_java
	javac *.java
	$(grun_exe) Reversetemplate parseTpl $(target) -tokens

trace: gen_java
	javac *.java
	$(grun_exe) Reversetemplate parseTpl $(target) -trace

tree: gen_java
	javac *.java
	$(grun_exe) Reversetemplate parseTpl $(target) -tree

diag: gen_java
	javac *.java
	$(grun_exe) Reversetemplate parseTpl $(target) -diagnostics

test: gen
	go run main.go $(target)

clean:
	rm -fr ./reversetemplate