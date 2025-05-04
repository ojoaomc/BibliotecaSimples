# BibliotecaSimples
Projeto de uma biblioteca simples para uma atividade de Versionamento Semântico com Git e Java

## Como Executar o Projeto

1. Clone o repositório:
   git bash
   git clone https://github.com/ojoaomc/BibliotecaSimples.git
Importe o projeto na sua IDE Java (Eclipse, IntelliJ, etc.)

Compile e execute a classe principal com o método main.

Teste as funcionalidades disponíveis diretamente na execução via terminal ou interface que você criou

## VERSÕES

## [2.0.0] - 2025-05-04
- **feat!**: Adiciona suporte a ISBN, alterando a interface de adição dos livros (breaking change).
- **feat**: Adiciona busca por ISBN.

## [1.1.1] - 2025-05-04
- **fix**: Adiciona documentação para busca case-insensitive.

## [1.1.0] - 2025-05-04
- **feat**: Adiciona busca de livros por autor.

## [1.0.0] - 2025-05-04
-- **feat**: Implementa funcionalidade inicial de adicionar e listar livros

## Changelog
v2.0.0
refactor(livro): adiciona suporte a ISBN e altera estrutura do livro (!breaking change)

v1.1.1
fix(biblioteca): corrige busca por autor para ignorar case

v1.1.0
feat(biblioteca): adiciona busca por autor

v1.0.0
chore: commit inicial com estrutura Java e README