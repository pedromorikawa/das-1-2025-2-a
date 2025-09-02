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
- __Open/Closed Principle ->__ uma classe deve estar fechada para modificações e aberta para extensões.
- __Liskov Substitution Principle ->__ O Princípio de Substituição de Liskov explicita regras para redefinição de métodos de classes base em classes filhas.
- __Interface Segregation Principle ->__ segregação de interfaces, criar interfaces especificas e coesas, evitando interfaces genéricas que obriguem a implementação de métodos desnecessários.
- __Dependency Inversion Principle ->__ Uma classe deve depender diretamente de uma abstração e não de uma implementação concreta, evita que uma classe converse com a outra

quando se tem uma herança a classe filho herda tudo do pai, é usado mais composição do que uma herança pois a herança tende a introduzir problemas na manutenção e evolução das classes de um sistema. Esses problemas têm sua origem no forte acoplamento que existe entre subclasses e superclasses

## Principio demeter

Principio do menor conhecimento, quando um método que esta sendo utilizado chama outros, mas:
- de sua própria classe (caso 1)
- de objetos passados como parâmetros (caso 2)
- de objetos criados pelo próprio método (caso 3)
- de atributos da classe do método (caso 4)

ELE TENTA ELIMINAR ESTRATÉGIAS GLOBAIS, BASTA UTILIZAR O QUE TEM DISPONIVEL PARA MIM (LOCAL)

# Caracteristicas da arquitetura = Requisitos não funcionais

- Impossivel que um sistema cumpra todos os itens das caracteristicas arquiteturais
- Decisão arquitetural é quando escolho a arquitetura que vou usar

- Tomar decisões de arquitetura -> é a pessoa que vai definir como o processo vai seguir, qual ferramenta utilizar e etc.
- Analisar continuamente a arquitetura -> analisar constantemente se a forma que esta programando antes está sendo eficiente fazendo com que 
- manter - se atualizado com as ultimas tendências
  
- Assegurar a conformidade com as decisões -> assegurar que os papeis estão sendo seguidos, através de uma analise statica de código, (ferramentas que varrem o código fonte na intenção de buscar e encontrar os problemas), levando em consideração que não temos como acompanhar de forma prática tudo que o programador está fazendo.
  
- Exposição e experiencia -> Um arquiteto é contratado para analisar o sistema, ele deve ter muita experiencias em diversas áreas para que ele consiga resolver o problema e principalmente ele deve saber sobre o produto que ele estará trabalhando, precisa saber conversar com o cliente sobre a regra de negócio e precisa saber lidar com seres humanos, praticamente um lider.  
- Exposição e experiência diversificadas
- Ter conhecimento sobre o domínio do negócio
- Ter habilidades interpessoais
- Entender e lidar bem com questões políticas -> Precisa saber como negociar positivament.


# DevOps

- o que é -> é uma medodologia que de alguma maneira entrega valor (Funcionalidades) para o meu cliente da forma mais rápida.
- DevOps como cultura -> todos precisam trabalhar juntos para manter um sistema funcionando
- Equipe DevOps -> quando nem todos os devs tem o conhecimento em infra
- 
