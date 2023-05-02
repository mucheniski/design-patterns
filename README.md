# design-patterns  

## Strategy  
Cria uma interface onde os métodos devem ser implementados pelas classes concretas.
É dividido em 3 partes:  
Interface Strategy: Interface que vai estipular os contratos.  
Concret Strategy: Classes concretas que vão implementar a interface.  
Context Strategy: Chamada em si das implementações, classe de serviço que vai efetuar a chamada das classes concretas propriamente dito.  
Para cada classe concreta será implementado seu método específico.  
Como no exemplo das formas de pagamento.  

