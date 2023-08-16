grammar gramatica;

init: bloco+;
bloco: atribuicao|declaracao|condicao|condicaoI|escrever|escreverP|ler|operacao|loopfor|loopwhile|incrementacao|atribuicaodeclaracao;

declaracao: tipo variavel fim;
atribuicao: operacao;
atribuicaodeclaracao: tipo variavel chaveD* numero* chaveE*  operador (numero|escrita)fim;
condicaoI: se ap condicao fp ac bloco+ fc senao* ac* bloco* fc*;
condicao: (variavel|numero) comparacao (numero|variavel);
escrever: progenitor ap  escrita  fp fim;
escreverP: progenitor ap aa escrita* (leituraT|leituraG|leituraC)aaf vir variavel fp fim;
ler: plagas ap aa (leituraT|leituraG|leituraC) aaf vir conec variavel fp fim;
loopfor: uroboros ap variavel operador numero separador variavel comparacao (numero|variavel) separador variavel incremento fp ac bloco+ fc; 
loopwhile: mutamiceto ap variavel comparacao (numero|variavel) fp ac bloco+ fc;
incrementacao: variavel incremento fim;
operacao: variavel operador expressao fim;
expressao: termo (operador_simples termo)* ;
termo: fator (operador_complexo fator)*;
fator: variavel | numero | ap expressao fp | operador_tipo fator;

tipo: 'Tvirus'|'Gvirus'|'Cvirus';
se: 'alexia';
senao: 'alfred';
operador: '=';
comparacao:'<'|'>'|'=>'|'<='|'==';
incremento:'++'|'--';
operador_simples: '+' | '-';
operador_complexo: '*' | '/' | '?';
operador_tipo: '-' | '+';
ac: '[';
fc: ']';
fim:';';
separador: ';';
vir:',';
conec:'&';
chaveD:'[';
chaveE:']';
variavel: ID;
numero: NU;

progenitor: 'progenitor';
plagas: 'plagas';
uroboros:'uroboros';
mutamiceto:'mutamiceto';
ap: '(';
fp: ')';
aa: '{';
aaf: '}';

escrita:(ID|NU | SIMBULOS|SEARCH_TYPE)+; 
leituraT: '%T';
leituraG: '%G';
leituraC: '%C';

ID: [a-zA-Z]+[0-9]*;
NU: [0-9]+('.'[0-9]*)? | '.'[0-9]+;
SIMBULOS: [!@#$^&*_+:<>,?];
SEARCH_TYPE: '"' (~["\\] | '\\' .)* '"';

Ws: [ \t\r\n]+ -> skip;
