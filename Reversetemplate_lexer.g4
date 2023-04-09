lexer grammar Reversetemplate_lexer;
LeftDim: '{{';
RightDim: '}}';
Empty:LeftDim ?Space*?RightDim;
Loop:'{{loop'.*?'}}';
End: '{{end}}';
Gjson
:'{{gjson1'.*?'}}' 
| '{{gjson'.*?'}}'
; 
Str:(~[{}])+;
Path: [a-zA-Z0-9_.]+;
Space:[\t\r\n\f]+;
