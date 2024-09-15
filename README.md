# DIO - Trilha Java Básico

# POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        <<interface>>
        +reproduzir() void
        +selecionarMusica() void
        +pausar() void
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar() void
        +atender() void
        +iniciarCorreioDeVoz() void
    }

    class NavegadorInternet {
        <<interface>>
        +pagina() void
        +adicionarNovaAba() void
        +atualiarPagina() void
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
