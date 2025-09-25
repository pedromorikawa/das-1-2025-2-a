# das-1-2025-2-a

## Conceitos

### Abstração
É o processo de **pegar um problema real** e transformá-lo em uma solução dentro do sistema.  
Com a abstração, conseguimos focar apenas no que é essencial para o cliente, sem se preocupar com todos os detalhes do mundo real.  

---

### Ocultamento de Informações
Consiste em **esconder os detalhes internos da implementação**, deixando disponível apenas o que é necessário para uso.  
O usuário ou outro sistema consegue utilizar a funcionalidade sem precisar saber como ela foi construída.  

Esse conceito está ligado ao **encapsulamento**, que organiza e protege o código.

---

### Débito Técnico
É quando escolhemos um caminho mais rápido e fácil na programação, mas que gera problemas no futuro.  
Pode ser causado por prazos curtos, falta de conhecimento ou má implementação.  

Consequências: mais erros, manutenções difíceis e necessidade de reescrever trechos do sistema.  
---

### Coesão
Significa que um código ou classe deve **fazer apenas uma coisa bem feita**.  
Quanto maior a coesão, mais simples será entender, testar e dar manutenção.  
---

### Acoplamento
É o grau de **dependência entre duas classes ou módulos**.  
Se estão muito acoplados, mudar um pode causar problemas no outro.  

- Alto acoplamento: Classe A depende diretamente do código interno da Classe B.  
- Baixo acoplamento: Classe A usa apenas uma interface para se comunicar com a Classe B.  

Quanto menor o acoplamento, mais fácil é dar manutenção e evoluir o sistema.

---

## UML (Diagramas)

A UML (Unified Modeling Language) é usada para representar graficamente sistemas.  
Ajuda a visualizar como classes e objetos se relacionam.

- **Herança (seta vazada):** uma classe herda características de outra.   
- **Associação (seta cheia):** uma classe se relaciona com outra.  
- **Implementação (seta pontilhada e vazada):** uma classe implementa uma interface.  

**MVC:**  
- **Model:** gerencia os dados.  
- **View:** mostra a interface para o usuário.  
- **Controller:** controla o fluxo e regras do sistema.  

---

## SOLID

Princípios que ajudam a manter o código mais limpo, organizado, flexível e de fácil manutenção.  
Eles orientam como estruturar classes, interfaces e dependências em um sistema orientado a objetos.

- **S (Single Responsibility Principle):**  
  Uma classe deve ter apenas um motivo para mudar. Isso significa que ela deve ser responsável por apenas uma parte específica da funcionalidade do sistema.  

- **O (Open/Closed Principle):**  
  O código deve estar aberto para receber novas funcionalidades sem precisar modificar o que já existe, reduzindo riscos de introduzir erros.  

- **L (Liskov Substitution Principle):**  
  Objetos de classes derivadas devem poder ser usados no lugar de objetos da classe base, mantendo o comportamento esperado do sistema.  

- **I (Interface Segregation Principle):**  
  É melhor criar várias interfaces pequenas e específicas do que uma interface grande e genérica, para que classes implementem apenas o que realmente precisam.  

- **D (Dependency Inversion Principle):**  
  Classes de alto nível não devem depender de classes de baixo nível. Ambas devem depender de abstrações, garantindo menor acoplamento e maior flexibilidade.  

---

## Princípio de Demeter
Também chamado de **Lei do Menor Conhecimento**.  
Ele recomenda que uma classe/método conheça apenas o necessário para executar sua função.  

Um método deve usar apenas:  
- sua própria classe  
- objetos recebidos como parâmetro  
- objetos criados dentro do método  
- atributos da própria classe  

Exemplo ruim: `pedido.getCliente().getEndereco().getCidade()` (muitas chamadas encadeadas).  
Exemplo bom: `pedido.getCidadeCliente()` (a classe Pedido expõe apenas o que é necessário).

---

## Características da Arquitetura

São requisitos não funcionais que definem qualidade e comportamento do sistema.  
Exemplo: desempenho, segurança, escalabilidade, manutenção.  

- Nenhum sistema consegue atender a todas as características ao mesmo tempo.  
- **Decisão arquitetural:** escolher a arquitetura mais adequada para o contexto.  

### Papel do Arquiteto
- **Tomar decisões:** define como o sistema será desenvolvido e quais ferramentas usar.  
- **Analisar continuamente:** verifica se as escolhas continuam eficientes.  
- **Manter-se atualizado:** acompanha tendências e melhores práticas.  
- **Assegurar conformidade:** garante que as regras arquiteturais sejam seguidas (ex: uso de ferramentas de análise estática).  
- **Experiência:** precisa conhecer várias áreas, entender o negócio e ter habilidades interpessoais.  

---

## DevOps

- **O que é:** prática que integra desenvolvimento (Dev) e operações (Ops) para entregar valor mais rápido e com qualidade.  
- **Cultura DevOps:** todos trabalham juntos, não apenas devs ou equipe de infraestrutura.  
- **Equipe DevOps:** formada quando nem todos têm conhecimento em infraestrutura, exigindo colaboração.
  
---
## Pensamento Arquitetônico

- **Arquitetura:** foca em requisitos do negócio, padrões e componentes principais.  
- **Design:** trata da implementação prática do sistema (diagramas, telas e código).  

**Arquiteto em T:**  
- Conhecimento **amplo em várias áreas**.  
- Conhecimento **profundo em uma especialidade**.  
---

## Trade-Off

Toda decisão de arquitetura traz benefícios e desvantagens.  
Não existe escolha perfeita, mas sim a mais adequada ao cenário.

- **Tópicos:** padrão *1 para muitos*. O evento é copiado e enviado a vários interessados.  
   Exemplo: grupo de WhatsApp, onde uma mensagem chega a todos os membros.  
- **Stream:** permite recuperar mensagens antigas (backup).  
- **Protocolos usados:** AMQP, MQTT, WebSocket, Redis, RabbitMQ.  

---

## Fila (FIFO)

Fila é uma estrutura onde a primeira mensagem a entrar é a primeira a sair (**First In, First Out**).  

- **ENQUEUE:** adicionar mensagem.  
- **DEQUEUE:** retirar mensagem.  
- **Sender e Receiver:** quem envia e quem recebe.  
- **Mensagens em ordem:** sempre entregues na sequência recebida.  
- **Buffer:** armazena as mensagens até que sejam entregues.  
- **Pooling:** processo de buscar mensagens na fila.  

Implementações: RabbitMQ, AWS SQS, Azure ServiceBus.

---

## Conceitos Importantes

- **Desacoplamento do tópico:** adicionar um novo elemento não afeta o processo, pois quem envia não precisa saber quem recebe.  
- **Fila:** ao adicionar novas funcionalidades, pode exigir mudanças no sistema.  
- **Tópicos:** permitem adicionar novas funcionalidades sem alterar a infraestrutura.  
- **Fan-out:** uma mensagem enviada é **distribuída para vários consumidores ao mesmo tempo**, permitindo que diferentes sistemas recebam e processem em paralelo.  
