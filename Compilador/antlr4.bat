@echo off
SET ANTLR_PATH=C:\Users\vm114\Documents\FEI_Sexto_Semestre\compiladores\ProjetoFinal\antlr-4.12.0-complete.jar
SET CLASSPATH=.;%ANTLR_PATH%;%CLASSPATH%
java org.antlr.v4.Tool %*