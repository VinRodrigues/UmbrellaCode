@echo off
SET ANTLR_PATH=C:\Users\unifvrodrigues\Compiladores\exercicioantlr\antlr-4.12.0-complete.jar
SET CLASSPATH=.;%ANTLR_PATH%;%CLASSPATH%
java org.antlr.v4.gui.TestRig %*