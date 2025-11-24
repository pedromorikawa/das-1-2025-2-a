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

## 2° Bimestre


https://learn.microsoft.com/pt-br/azure/architecture/patterns/circuit-breaker?wt.mc_id=AZ-MVP-5003638

Circuit Breaker

  A ideia dele é protejer a relação com o sistema, das seguintes formas:
  
- (Close) Quando o circuito está correto, ele fica no estado fechado
  
- (Open) Quando ele falha ele fica em estado aberto
  
- (Half-Open) meio aberto ele tenta fazer a conexão e verifica se da certo, se estiver correto ele retorna para o fechado, caso esteja errado ele retorna para o estado aberto e é testado novamente

---
## CQRS (Command Query Responsibility Segregation)

É um padrão arquitetural que separa as operações de leitura (Query) das de escrita (Command).  
Essa separação permite otimizar cada parte de forma independente — o modelo de leitura pode ser mais rápido, enquanto o de escrita garante as regras de negócio e a consistência dos dados.  

Pode usar bancos de dados diferentes ou apenas separar a lógica internamente.  
O principal desafio é a complexidade maior, pois pode haver um pequeno atraso entre o que foi gravado e o que aparece nas consultas.

---

## Retry Pattern

Padrão usado para **tratar falhas temporárias**, como erros em conexões de rede ou chamadas para serviços externos.  
Ele tenta **executar novamente** a operação que falhou, após um tempo de espera definido (delay).  

É importante definir:
- Quantas tentativas serão feitas.  
- O tempo de espera entre as tentativas.  
- O que fazer se todas falharem (por exemplo, registrar o erro ou enviar um alerta).  

Esse padrão ajuda a tornar o sistema mais **confiável e resiliente** a falhas momentâneas.

---

## Grande Bola de Lama (Big Ball of Mud)

É o nome dado a um sistema mal estruturado, onde tudo está muito conectado e sem organização clara.  
O código costuma ter muitas dependências, responsabilidades misturadas e pouca separação de partes.  

Esse tipo de arquitetura torna o sistema difícil de entender, modificar e evoluir, pois qualquer mudança pode causar problemas em outras partes.  
Geralmente surge por falta de planejamento ou acúmulo de dívidas técnicas.

---

## Arquitetura Unitária

É um tipo de arquitetura onde todo o sistema funciona como uma única unidade, com todos os componentes muito integrados.  
Um exemplo é uma aplicação desktop que acessa diretamente um banco de dados central.  

**Vantagens:**  
- Estrutura simples e fácil de iniciar.  
- Menor complexidade técnica.  

**Desvantagens:**  
- Dificulta o crescimento e a manutenção.  
- Pouca flexibilidade e escalabilidade, já que todas as partes estão acopladas.  

---
## Estilo de arquitetura em camadas

A arquitetura em camadas (ou **n-tier**) é um dos estilos mais comuns por ser simples, barata e fácil de entender. Ela organiza o sistema em camadas horizontais, cada uma com uma função específica como apresentação, negócio, persistência e banco de dados. Essa estrutura reflete a divisão natural das equipes de desenvolvimento e permite separar responsabilidades, o que facilita o entendimento e a manutenção inicial do sistema.

Cada camada deve lidar apenas com sua parte da lógica, o que garante a chamada separação de preocupações. Quando as camadas são fechadas, a comunicação precisa passar de uma para outra de forma ordenada, mantendo o isolamento e evitando dependências diretas. Já as camadas abertas permitem pular níveis, o que dá mais flexibilidade, mas aumenta o acoplamento entre partes do sistema.

Esse estilo é muito usado em aplicações pequenas e médias, especialmente quando ainda não se sabe qual arquitetura será adotada no futuro. No entanto, conforme o sistema cresce, surgem desvantagens como baixa agilidade, dificuldade de manutenção e testes, além de problemas de desempenho e escalabilidade por causa da estrutura monolítica. Um problema comum é o antipadrão sinkhole, quando as camadas apenas repassam dados sem realizar processamento real, tornando o sistema ineficiente.

Apesar dessas limitações, a arquitetura em camadas continua sendo uma boa escolha inicial para projetos simples, com prazos e recursos limitados. Suas principais forças estão na simplicidade e no baixo custo, mas ela perde eficiência em sistemas grandes ou que precisam de alta modularidade e escalabilidade.

## Estilo de arquitetura em Pipeline

O estilo arquitetural Pipeline organiza o sistema como uma sequência de etapas independentes, onde cada uma recebe dados, realiza uma transformação específica e envia o resultado para a próxima. Esse formato cria um fluxo linear e previsível, permitindo alta coesão em cada estágio e baixo acoplamento entre eles. Uma das principais vantagens é que cada etapa pode ser desenvolvida, testada, substituída ou até paralelizada separadamente, favorecendo escalabilidade e reutilização de componentes. Porém, esse estilo também apresenta desafios: um único estágio lento pode se tornar um gargalo, o fluxo é menos flexível para lógicas complexas que exigem ramificações e a latência pode aumentar devido ao encadeamento de várias etapas. O Pipeline é mais adequado quando o problema pode ser claramente dividido em fases sequenciais, como em processamento de dados, ETL ou compiladores, e quando as transformações dependem apenas da saída da etapa anterior.

## Estilo de arquitetura Microkernel

O estilo arquitetural Microkernel é voltado para sistemas que precisam de um núcleo mínimo e estável, responsável apenas pelas funções essenciais, enquanto outras capacidades são adicionadas por meio de plugins ou módulos externos. O núcleo fornece os serviços básicos e o ciclo de vida do sistema, e os plugins estendem o comportamento sem alterar o coração da aplicação. Essa separação torna o sistema altamente flexível e facilita evoluções, já que novos recursos podem ser introduzidos ou removidos sem impactar o núcleo. Esse estilo é especialmente útil em produtos que precisam oferecer diferentes versões, variações ou personalizações, como IDEs, servidores de aplicação e sistemas operacionais simplificados. Entre as vantagens estão a facilidade de extensão, boa modularidade e isolamento entre funcionalidades. Porém, ele também traz desafios, como a complexidade na criação de mecanismos de comunicação entre o núcleo e os plugins, além da necessidade de gerenciar compatibilidade e possíveis impactos de desempenho ao carregar muitos módulos. O Microkernel é ideal quando o sistema exige estabilidade no núcleo e grande capacidade de adaptação por meio de extensões.

## Estilo de arquitetura Microsserviços

O estilo arquitetural Microsserviços divide o sistema em serviços pequenos, independentes e focados em responsabilidades específicas, cada um com seu próprio ciclo de vida e, muitas vezes, sua própria tecnologia ou banco de dados. Eles se comunicam por interfaces bem definidas, geralmente APIs, o que permite que cada serviço seja implantado, escalado e atualizado de forma isolada. Esse modelo oferece grande flexibilidade e agilidade, mas aumenta a complexidade operacional, exigindo boas práticas de monitoramento, comunicação entre serviços e tolerância a falhas. É indicado para sistemas que precisam crescer de forma rápida e contínua, com equipes autônomas trabalhando em partes diferentes da aplicação.
