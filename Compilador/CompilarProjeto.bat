@echo off

echo +----------------------------------+
echo ^|    BEM VINDO AO UMBRELLA CODE    ^|
echo ^|   Por favor, Aguarde...          ^|
echo ^|                                  ^|
echo ^|                                  ^|
echo +----------------------------------+
echo.

FOR /R %%G IN (antlr-4.12.0-complete.jar) DO SET "ANTLR_PATH=%%~dpG"
SET CLASSPATH=.;%ANTLR_PATH%\antlr-4.12.0-complete.jar;%CLASSPATH%
java org.antlr.v4.Tool %* gramatica.g4
javac *.java

entrada.txt
java Compilador < entrada.txt > main.c

gcc main.c -o teste1 && teste1.exe

echo.
echo Compilação Concluída.
echo.
echo Pressione Enter para sair...
pause > nul
