# das-1-2025-2-a
# Conceito

### Abstração
Pegar um problema real do cliente e transformá-lo em um sistema para suprir a necessidade proposta.

### Ocultamento de informações
Consiste em esconder os detalhes internos da implementação, permitindo que o recurso seja usado sem que seja necessário conhecer seu funcionamento interno. Esse conceito está diretamente relacionado ao encapsulamento.

### Débito Tecnico
Débito técnico são partes do código que foram mal implementadas e que, futuramente, podem causar problemas no sistema.

### Coesão
Codigo que faz uma coisa bem feita, Facilita na implementação, tem apenas conexão com os dados é facil de entender e fazer manutenção, é mais simples de testar isso torna o código coeso.

### Acoplamento
Quando Classe A e B dependem uma da outra, se mexer em um pedaço do código ele da problema em outro.

## UML
- __Herança (SETA VAZADA):__ Uma classe herda de outra. Ex: "Cachorro é um Animal".
- __Associação (SETA FECHADA):__ Uma classe se relaciona com outra. Ex: "Professor ensina Aluno".
- __Implementação (SETA PONTILHADA e vazada):__ Uma classe implementa uma interface. Ex: "Carro implementa Veículo".

Model -> Dados.
View -> Html.
Controler -> Controlador.

## Solid
Aplicar principios de orientação a objetos de forma mais correta e consistente possivel, garantindo um código mais organizado, flexivel e fácil de manter.

- __Single Responsibility Principle ->__ Cada classe deve ter apenas uma responsabilidade, aumentando a coesão e evitando misturar funções como apresentação e regra de negócio.
- __Open/Closed Principle ->__ 
- __Liskov Substitution Principle ->__
- __Interface Segregation Principle ->__ segregação de interfaces, criar interfaces especificas e coesas, vitando interfaces genéricas que obriguem a implementação de métodos desnecessários.
- __Dependency Inversion Principle ->__
