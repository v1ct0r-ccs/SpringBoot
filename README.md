# Spring Boot

Spring Boot é um framework Java open source cujo objetivo é facilitar o processo de desenvolvimento em Java. Ele traz mais agilidade para o processo de desenvolvimento, uma vez que _devs_ conseguem reduzir o tempo gasto com as configurações iniciais.

Com ele conseguimos abstrair e facilitar a configuração de:

- Servidores
- Gerenciamento de dependências
- Configurações de bibliotecas
- Métrica & Health checks

## Como funciona o Spring Boot

O Spring Boot utiliza convenção, ou seja, ele utiliza a configuração default e caso seja necessário podemos sobrescrever estas configurações.

Por exemplo, você pode alterar para que ele utilize o ``Jetty`` como servidor ao invés do ``Tomcat`` que é a configuração padrão.

Uma das maiores vantagens que o Spring Boot trouxe ao desenvolvimento é que toda essa configuração não necessita mais ser realizada por ``XMLs``, embora ele ainda suporta esse tipo de configuração. A maioria da configuração pode ser feita de forma programática via anotações.

O Spring Boot permite adicionar a esta estrutura-base o que é chamado de módulo.

Um módulo é, na verdade, uma biblioteca ou ferramenta do ecossistema Spring ue pode ser adicionada a uma aplicação Spring convencional.

Por exemplo: podemos utilizar o Spring Data, que é um framework que provê acesso a basses de dados através da JPA.

O Spring Boot ainda traz uma instância do Tomcat devidamente configurada como um servidor web "embarcado", o que remove a necessidade de configurar até mesmo o servidor onde a aplicação irá ser executada.

Se o projeto for gerado a partir do [Spring Initializr](https://start.spring.io/) , tudo isso fica disponível somente com alguns cliques.

## Spring Boot Starters

São dependências que agrupam outras dependências em comum. Desta forma, somente uma configuração é realizada no seu gerenciador de dependências.

Por exemplo, o spring-boot-starter-web, é um starter que permite a construção de soluções para Web e importa inúmeras bibliotecas por detrás dos panos.

## Spring Boot Autoconfigure

O Autoconfigure é responsável por ler e realizar as configurações necessárias para a aplicação funcione, É ele quem gerencia todo o processo de configuração da aplicação.

## Spring Boot Actuator

É uma ferramenta que gerencia, monitora e disponibiliza as seguintes informações:

- **Métricas:** Obtém e disponibiliza diversos dados da nossa aplicação, como, por exemplo, espaço em disco, memória, tempo de resposta, etc.
- **Logging:** Facilita o acesso ao arquivo de log da aplicação por meio de um endpoint específico.
- **HeathlChecks:** Disponibiliza endpoints de health checks.
- **Informações da Aplicação:** Permite a disponibilização de informações da aplicação. Por exemplo, versão, informações do git, etc.

## Spring Boot Test

Ajuda na escrita e execução dos testes.

## Spring Boot Devtools

DevTools é um módulo do Spring Boot que adiciona algumas ferramentas interessantes em tempo de desenvolvimento, como, por exemplo, o reload da aplicação em tempo de execução, quando alterada.