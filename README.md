Este projeto calcula o rendimento de investimentos em CDB e Taxa Selic utilizando Java.
O programa recebe como entrada:

Valor aplicado

Tempo da aplicação em dias

Tipo de investimento (CDB ou Selic)

Percentual do CDB, quando selecionado

Com esses dados, o sistema calcula:

Rendimento bruto

Imposto de Renda conforme a tabela regressiva

Valor final líquido

Para Selic, utiliza juros compostos com base na taxa anual e conversão para taxa diária

A formatação dos valores é feita no padrão brasileiro, utilizando DecimalFormat.
O objetivo é servir como um simulador simples para estudo de lógica, cálculos financeiros e manipulação de entradas em Java.
