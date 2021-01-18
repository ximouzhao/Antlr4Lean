grammar FunctionStatement;

ID:( 'A'..'Z' | 'a'..'z' | '_' | '$') ( 'A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9' )*;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

fragment DEC_DIGIT: [0-9]|[0-9]'.'[0-9];
DECIMAL_LITERAL: DEC_DIGIT+;
TEXT_STRING :    (  '\'' ( ('\\' '\\') | ('\'' '\'') | ('\\' '\'') | ~('\'') )* '\''  )
                |(  '"' ( ('\\' '\\') | ('"' '"') | ('\\' '"') | ~('"') )* '"'  );

functionStatement: functionName = ID'(' parameter? (',' parameter)* ')';
parameter: functionStatement | value;

value
    : ID
    | textLiteral
    | decimalLiteral
    ;
decimalLiteral
    : DECIMAL_LITERAL
    ;
textLiteral
    : TEXT_STRING
    ;