# Desafio 1👾📝💻

**Letra a)**

Um sistema de controle de versões(VCS) são ferramentas ou métodologias que atuam na função de rastrear arquivos de determinado projeto, exemplo, um arquivo é criado e sofre alterações, o VCS rastreia todas as informações, como quem realizou e o motivo dessas alterações, salvando de tempos em tempos essas informações. Essas atividades são realizadas pelo VCS no repositório.Existem varios tipos de VCS, algun permitem esse rastreio de forma remota e outros necessitam do login na maquina do desenvolvedor. 

**Letra b)**

As vantagens são:

1- Permitir que as equipes de software preservem a eficiência e a agilidade à medida que a equipe é escalonada para incluir mais desenvolvedores;

2- Um histórico de alterações completo;

3- Um histórico de longo prazo de todos os arquivos;

4- Ramificação e mescla no trabalho em equipe;

5- Rastreabilidade dos projetos.



**Letra c)**

 3 Exemplos de de VCS: 
- [Subvision](https://subversion.apache.org/)
- [TFS](https://docs.microsoft.com/pt-br/visualstudio/releasenotes/tfs2017-relnotes)
- [GIT](https://git-scm.com/downloads)



# Desafio 2


**Letra a)** Programação Orientada a Objetos trata se de um paradigma, um modelo de análise, projeto e programação que se baseia em tentar aproximar o mundo real do mundo virtual, através da criação e interação entre objetos, atributos, códigos, métodos, entre outros. O criador da programação orientada a objetos foi Alan Kay, por volta de 1970, segundo Kay, “o computador ideal deveria funcionar como um organismo vivo, isso é, cada célula se relaciona com outras a fim de alcançar um objetivo, mas cada uma funciona de forma autônoma. As células poderiam também reagrupar-se para resolver outro problema, ou desempenhar outras funções”. Durante suas atividades, ele idealizou a criação de um aparelho chamado Dynabook. Era uma espécie de tablet com teclado físico (isso em plena década de 70). Para que o Dynabook se tornasse realidade, era necessário o desenvolvimento de uma linguagem de programação por meio da qual pudesse ser construído o sistema do aparelho.
Foi então que surgiu a primeira linguagem de programação orientada a objetos: o Smalltalk. A linguagem de POO de Alan Kay foi a primeira a contar com os conceitos de classes, objetos, atributos e métodos. a POO estipula que tudo é um objeto.

Seus pilares são: 

1 - Abstração- Responsável por criar a identidade do objeto, que deve ser unica dentro do projeto. Característica do objeto, que se trata das propriedades do objeto e Ações que o objeto irá executar, chamadas de métodos, que são variadas depedendo do tipo de situação ocorrida.

2 - Encapsulamento - O encapsulamento é uma técnica que adiciona segurança à aplicação em uma programação orientada a objetos, o encapsulamento é implementado através de getters e setters, responsáveis por retornar e setar o valor da propriedade, adicionando camadas de proteção ao objeto.

3 - Herança - o reuso de código é uma de suas vantagens de destaque e ela se dá por herança. Essa característica otimiza a produção da aplicação em tempo e linhas de código,por exemplo, a criança herda diretamente do pai e indiretamente do avô e do bisavô. Em programação, a lógica é similar. Assim, os objetos filhos herdam as características e ações de seus ancestrais.

4 - Polimorfismo - O poliformismo permite herdar um método de classe pai e atribuir uma nova implementação para o método pré-definido.


**Letra b)**  A abstração é o ponto inicial para a criação de programas utilizando POO. Nesse momento que extraimos as características para criarmos um objeto. Exemplo: Um software para administrar as contas de clientes em um banco, as propriedades seriam, nome, número da conta, número da agência, cpf, saldo e os métodos seriam sacar dinheiro, depositar, transferir,pagar contas.

**Letra c)** Encapsular os dados significa evitar que estes sofram acessos indevidos. Para isso, é criada uma estrutura que contém métodos que podem ser utilizados por qualquer outra classe, sem causar inconsistências no desenvolvimento de um código, isso é feito por meio de dois métodos: os getters e os setters. O getters tem o objetivo de retornar o valor que lhe foi pedido, mas de forma que não prejudica a integridade do dado em si, já o setters recebe como argumento uma informação, que pode ser qualquer tipo de dado suportado pela linguagem.Exemplo: seguindo com o exemplo da conta bancária, usando os atributos nome e saldo e o método depositar.o novo saldo será o somatório entre o valor atual mais o depósito acrescido de 10%,se os atributos puderem ser acessados diretamente em qualquer trecho do código, haverá o risco de o saldo ser alterado sem passar pelo método de depositar. Para evitar isso, podemos usar os métodos get e set para evitar o acesso direto,para proteger as variáveis nome e saldo, utilizamos os métodos get saldo e set saldo. Antes disso, no entanto, é preciso alterar o nível de acesso das variáveis de pública para privada. 


**Letra d)** A herança permite criar uma nova classe a partir de uma já existente,também chamada de subclasses, provém da subclasse,classe recém-criada que contém atributos e métodos da "classe mãe". A principal vantagem da herança é a capacidade para definir novos atributos e métodos para a subclasse, que se somam aos atributos e métodos herdados. Exemplo: uma classe base que serviria como um modelo genérico pode ser a classe Conta com os campos Nome e cpf. Já uma classe derivada poderia ser Conta2 com os campos Nome e cpf herdados da classe Conta1, acrescido do campo saldo.


**Letra e)** Polimorfismo como um princípio a partir do qual as classes derivadas de uma única classe base são capazes de invocar os métodos que, embora apresentem a mesma assinatura, comportam-se de maneira diferente para cada uma das classes derivadas. Exemplo: a classe cliente1 e Cliente2 são objetos de um banco, mas o saldo deles podem ser somados de forma diferentes. 

**Letra f)** As vantagens de POO são: 

- POO permite representar melhor o mundo real em  programas. Praticamente tudo no mundo pode ser descrito como um conjunto de propriedades e ações, que é exatamente como os objetos são organizados. Ao representar melhor o mundo, os programas POO podem resolver melhor os problemas reais.

- Os programas POO são mais fáceis de ler e entender. Como não precisa escrever as propriedades e ações para cada personagem, os programas ficam muito mais curtos, isso os torna mais fáceis de ler e entender.

- Pode ser mais rápido programar com POO. POO facilita a reutilização de objetos em outros programas. Em vez de criar código a partir do zero, pode-se usar um objeto ou método existente e alterá-lo para se adequar ao programa.

- É mais fácil criar grandes programas. Como a POO ajuda a eliminar o código desnecessário, é mais fácil criar programas maiores e mais complexos.

- Os programas POO são mais fáceis de modificar e manter. Com a POO é fácil fazer alterações nos objetos existentes,também pode se usar objetos existentes para criar novos objetos com pequenas modificações.



# Desafio 3

**Letra a)**

- HTTP é um protocolo (protocol) que permite a obtenção de recursos, como documentos HTML. É a base de qualquer troca de dados na Web e um protocolo cliente-servidor, o que significa que as requisições são iniciadas pelo destinatário, geralmente um navegador da Web.

- A sigla REST, em português, significa “Transferência de Estado Representacional”. Concebido como uma abstração da arquitetura da web, trata-se de um conjunto de princípios e definições necessários para a criação de um projeto com interfaces bem definidas.

- Uma API é um conjunto de definições e protocolos usado no desenvolvimento e na integração de aplicações. Às vezes, as APIs são descritas como um contrato entre um provedor e um usuário de informações, estabelecendo o conteúdo exigido pelo consumidor (a chamada) e o conteúdo exigido pelo produtor (a resposta).API REST, também chamada de API RESTful, é uma interface de programação de aplicações (API ou API web) que está em conformidade com as restrições do estilo de arquitetura REST, permitindo a interação com serviços web RESTful.


**Letra b)** 
- GET: O método GET solicita a representação de um recurso específico. Requisições utilizando o método GET devem retornar apenas dados.



- HEAD: O método HEAD solicita uma resposta de forma idêntica ao método GET, porém sem conter o corpo da resposta.



- POST: O método POST é utilizado para submeter uma entidade a um recurso específico, frequentemente causando uma mudança no estado do recurso ou efeitos colaterais no servidor.



- PUT: O método PUT substitui todas as atuais representações do recurso de destino pela carga de dados da requisição.



- DELETE : O método DELETE remove um recurso específico.



- CONNECT: O método CONNECT estabelece um túnel para o servidor identificado pelo recurso de destino.



- OPTIONS: O método OPTIONS é usado para descrever as opções de comunicação com o recurso de destino.



- TRACE: O método TRACE executa um teste de chamada loop-back junto com o caminho para o recurso de destino.



- PATCH: O método PATCH é utilizado para aplicar modificações parciais em um recurso.



**Letra i)** O Swagger é um framework composto por diversas ferramentas que, independente da linguagem, auxilia a descrição, consumo e visualização de serviços de uma API REST.No framework Swagger, existem ferramentas para os seguintes tipos de tarefas a serem realizadas para o completo desenvolvimento da API de um serviço WEB: A especificação,a implementação, os testes e para auxiliar na utilização da API, o Swagger dispõe de ferramenta para deixar a visualização mais intuitiva, permitindo também que interajam com a API.
O Swagger permite criar a documentação da API de 3 formas: Automaticamente, manualmente e  Codegen.



# Desafio 4

**Letra a)**

- No desenvolvimento Java EE, esta é uma tecnologia bem conhecida e comumente utilizada para a implementação da interação do banco de dados. JDBC é uma API de nível de chamada, o que significa que as instruções SQL são transmitidas como sequências para a API que, então, se encarrega de executá-las no RDMS. Consequentemente, o valor dessas sequências pode ser alterado no tempo de execução, tornando o JDBC dinâmico.
- o ORM define uma técnica para realizar a conciliação entre os 2 modelos. Uma das partes centrais é através do mapeamento de linhas para objetos:
  As bibliotecas ou frameworks ORM definem o modo como os dados serão mapeados entre os ambientes, como serão acessados e gravados. Isso diminui o tempo de desenvolvimento, uma vez que não é necessário desenvolver toda essa parte. Outra vantagem está na adaptação de novos membros na equipe, como muitos projetos comerciais utilizam a mesma ferramenta, é possível encontrar membros que já estão acostumados com o padrão de trabalho. Exemplos:
- JPA é um framework leve, baseado em POJOS (Plain Old Java Objects) para persistir objetos Java.JPA provê diversas funcionalidades para os programadores, como:POJOS Persistentes, Consultas em Objetos, Configurações simples e Integração e Teste. Está relacionado com os ORM’s, pois a JPA  é um tipo de framework para Mapeamento Objeto-Relacional (ORM - Object-Relational Mapping).
- O SpringData é um projeto da SpringSource com proposta de unificar e facilitar o acesso a diferentes tecnologias de armazenamento de dados, como bancos de dados relacionais e os NoSQL.

**Letra d)**  CRUD vem do inglês Create Read Update e Delete que em tradução livre para o português seria Criar, Ler, Atualizar, e Excluir. O CRUD é composto pelas operações básicas que uma aplicação faz a um banco de dados.

-Create (criar) - criar um novo registro;

-Read (ler) - ler (exibir) as informações de um registro;

-Update (atualizar) - atualizar os dados do registro;

-Delete (apagar) - apagar um registro;




# Desafio 5

Letra a) 

- Entity é responsável por transformar uma classe em entidade no projeto,além da JPA criar uma ligação entre a classe e uma tabela de mesmo nome para assim os objetos serem persistidos.

- Controller é uma classe responsável pela preparação de um modelo de Map com dados a serem exibidos pela view e pela escolha da view correta. Basicamente ele é o responsável por controlar as requisições indicando quem deve receber as requisições para quem deve responde-las. Também pode mandar diretamente no fluxo do response usando a anotação @ResponseBody e concluir a solicitação.

- Repository tem como objetivo criar beans para a parte de persistência, além de capturar exceções específicas de persistência e repeti-las novamente como uma das exceções não verificadas e unificadas do Spring.

- Service seria uma (Interface) que nada mais é do que um contrato, ou seja uma regra que obriga a classe que irá implementar essa interface a usar os metodos definidos nela, ou seja (Service) tem um conjunto de metodos definidos, mais não implementados.



# Desafio 6

O que é DTO?

Data Transfer Object (DTO) ou simplesmente Transfer Object é um padrão de projetos bastante usado em Java para o transporte de dados entre diferentes componentes de um sistema, diferentes instâncias ou processos de um sistema distribuído ou diferentes sistemas via serialização.

A ideia consiste basicamente em agrupar um conjunto de atributos numa classe simples de forma a otimizar a comunicação.

Basicamente é uma classe com atributos simples, que usamos para otimizar a comunicação entre o client e o servidor.


# Desafio 8

**Letra a)** Uma exception é uma ocorrência anormal que afeta o funcionamento da aplicação,um evento não esperado que ocorre no sistema quando está em tempo de execução (Runtime). Geralmente quando o sistema captura alguma exceção o fluxo do código fica interrompido, o conceito de exceção foi o mecanismo criado para que o seu programa simplesmente não fosse finalizado ao encontrar problemas em sua execução.

**Letra b)** O conjunto de blocos Try-Catch-Finally é o recurso, à nivel de linguagem de programação, criado para tratar exceções. Este conjunto atua capturando as possíveis exceções em seu código e, com o objetivo de impedir fluxos inesperados, ele mesmo determina o que fazer na ocorrência de exceções.O bloco catch,coloca o tratamento para a exceção que eventualmente ocorra no bloco try. Vale destacar que não necessariamente a exceção ocorrerá mas, caso ela ocorra, o seu código tratará a mesma e evitará comportamentos inesperados e o o bloco finally representa o trecho de código que será executado independente do fato de ter ocorrido a exceção ou não.

**Letra c)** A função do throw é lançar a exceção para o método chamador, ou seja, leva o erro adiante.A relação com os métodos  é levar o erro para ser tratado no try, catch e finally.

**Letra d)** Serve para poder manipular exceções disparadas por métodos de mapeamento (@RequestMapping) do mesmo controller. Tais métodos podem:

-Tratar exceções sem a anotação @ResponseStatus (tipicamente exceções pré-definidas que você não criou)

-Redirecionar o usuário para uma página de erro própria

-Criar uma resposta ao erro totalmente personalizada.


**Letra e)** Serve para repassar a mesma exceção para frente e, dessa forma, outro trecho de código poderá capturar e saber o que vai fazer com a exceção original retendo todas as informações necessárias com o stack trace.


**Letra f)** A annotation serve para permitir usar exatamente as mesmas técnicas de manipulação de exceções mas aplica-las por toda a aplicação, não apenas à controllers individuais.Qualquer classe anotada com @ControllerAdvice torna-se um avido de controller e três tipos de métodos são suportados:

-Método de manipulação de anotações anotados com @ExceptionHandler.

-Método de melhoramento do Modelos (para adicionar dados adicionais ao modelo), anotados com
@ModelAttribute. 

-Método de inicialização de capa (binder – usados para configuração da manipulação de formulários) anotados com
@InitBinder.


# Desafio 9

**Letra a)** Trata se de uma solução geral para um problema que ocorre com frequência dentro de um determinado contexto no projeto de software. Um padrão de projeto não é um projeto finalizado que pode ser diretamente transformado em código fonte ou de máquina, ele é uma descrição ou modelo (template) de como resolver um problema que pode ser usado em muitas situações diferentes.

**Letra b)**

- Os padrões de criação são aqueles que abstraem e/ou adiam o processo criação dos objetos.
  Um exemplo: Builder é um padrão de projeto de software criacional que permite a separação da construção de um objeto complexo da sua representação, de forma que o mesmo processo de construção possa criar diferentes representações.

- Os padrões estruturais se preocupam com a forma como classes e objetos são compostos para formar estruturas maiores.
  Exemplo:  Um proxy, em sua forma mais geral, é uma classe que funciona como uma interface para outra coisa. O proxy pode fazer interface com qualquer coisa: uma conexão de rede, um grande objeto na memória, um arquivo ou algum outro recurso caro ou impossível de duplicar.

- Os padrões de comportamento se concentram nos algoritmos e atribuições de responsabilidades entre os objetos.
  Exemplo:Em Orientação a Objetos, é um padrão GOF cuja principal função é evitar a dependência entre um objeto receptor e um objeto solicitante.

**Letra c)** A arquitetura de software representa a estrutura ou as estruturas do sistema, que consiste em componentes de software, propriedades externamente visíveis dos componentes e os relacionamentos entre eles.Essa estruturação, apesar de parecer trabalhosa para profissionais não habituados a ela, visa facilitar a organização dos componentes e melhorar a flexibilidade e portabilidade do sistema, gerando muito mais facilidade de manutenção,um código bem estruturado e organizado facilita a criação de interfaces bem definidas com componentes e funcionalidades já testados, permitindo o reúso de código e melhorando a assistência, já que possíveis alterações tendem a ficar restritas àquele trecho de código.

**Letra d)** Nesse projeto até o momento estamos utilizando a arquitetura em camadas, pois os componentes de uma  são organizados em camadas horizontais onde cada uma desempenha um papel específico na aplicação.

**Letra g)** SOLID é um acrônimo dos cinco primeiros princípios da programação orientada a objetos e design de código identificados por Robert C. Martin (ou Uncle Bob) por volta do ano 2000. O acrônimo SOLID foi introduzido por Michael Feathers, após observar que os cinco princípios poderiam se encaixar nesta palavra.

S = SRP = Principio da Responsabilidade Única, Uma classe deve ter um, e somente um, motivo para mudar.

O = OCP= Princípio Aberto-Fechado, Você deve ser capaz de estender um comportamento de uma classe, sem modificá-lo.

L = LSP	= Princípio da Substituição de Liskov, As classes base devem ser substituíveis por suas classes derivadas.

I = ISP = Princípio da Segregação da Interface, Muitas interfaces específicas são melhores do que uma interface única.

D = DIP = Princípio da inversão da dependência, Dependa de uma abstração e não de uma implementação.

**Letra h)** Foram usados os principios, single Responsability Principle, já que cada classe no projeto tem apenas uma razão para alterar seu estado, ou seja, cumpre uma única função, services implementam a lógica da aplicação, repositório geram a herança das propriedades necessárias para persistência no banco de dados, controllers expõe os endpoints e assim por diante. Também utilizamos o princípio da substituição de Liskov, já que os DTOs, classes drevidas das nossas entidades, foram passados ao invés das entidades elas mesmas durante o desafio 6 sem maiores problemas.No caso das nossas interfaces estendendo o JPA repository estamos instanciando o principio aberto-fechado.
