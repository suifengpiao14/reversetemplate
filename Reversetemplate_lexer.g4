lexer grammar Reversetemplate_lexer;
LeftDim: '{{';
RightDim: '}}';
Empty:'{{'[\t\r\n\f]*'}}';
Loop:'{{loop'.*?'}}';
End: '{{end}}';
Gjson
:'{{gjson1'.*?'}}' 
| '{{gjson'.*?'}}'
; 
Str:(~[{}])+;
