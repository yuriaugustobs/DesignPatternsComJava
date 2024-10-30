# Projeto Demonstração Singleton

Este projeto demonstra a implementação de três variações do padrão de projeto Singleton em Java.

## Descrição

O projeto contém exemplos práticos das seguintes implementações do Singleton:

- **Singleton Lazy (Preguiçoso)**: Inicialização sob demanda
- **Singleton Eager (Antecipado)**: Inicialização imediata
- **Singleton LazyHolder**: Inicialização thread-safe usando holder class

## Estrutura do Projeto

src/
└── one/
└── digitalinovation/
├── Test.java
├── SingletonLazy.java
├── SingletonEager.java
└── SingletonLazyHolder.java

## Implementações

### SingletonLazy
- Inicialização preguiçosa
- Instância criada apenas quando necessário
- Requer verificação de thread-safety

### SingletonEager
- Inicialização antecipada
- Instância criada na carga da classe
- Thread-safe por natureza

### SingletonLazyHolder
- Inicialização thread-safe
- Usa classe estática interna (holder)
- Combina benefícios das abordagens lazy e eager

## Como Executar

1. Clone o repositório
2. Compile os arquivos Java
3. Execute a classe Test
 bash
javac src/one/digitalinovation/.java
java -cp src one.digitalinovation.Test


## Tecnologias Utilizadas
- Java
- Padrão de Projeto Singleton

## Autor
Yuri Augusto Bernardes de Sousa

## Licença
Este projeto está sob a licença MIT.


