grammar Reversetemplate;
parseTpl:every;
every : .*?EOF;
LeftDim: '{{';
RightDim: '}}';
Empty:'{{'[\t\r\n\f]*'}}';
Loop:'{{loop'.*?'}}';
End: '{{end}}';
Gjson:'{{gjson'.*?'}}'; 
Segment:(~[{}])+;

