# Silmar Ótica - Sistema de Gestão Comercial e Estoque

Este projeto é um software de gestão para óticas desenvolvido como o primeiro projeto integrado prático do curso em Bacharelado em Ciência da Computação. O sistema auxilia no controle de estoque de armações e lentes, cadastro de clientes, emissão de ordens de serviço e gerenciamento de permissões de acesso por perfil.

---

## Principais Funcionalidades

* **Autenticação e Níveis de Acesso:** Controle de sessão com perfis de Administrador (acesso total) e Funcionário (operações do dia a dia).
* **Gestão de Clientes e Responsáveis:** Cadastro de clientes com controle de dependentes para receitas de terceiros e vinculação de responsável legal para menores de 18 anos.
* **Controle de Estoque Detalhado:** 
  * *Armações e Óculos Solares:* Marca, modelo/referência, cor, código de preço e quantidade por loja.
  * *Lentes e Lentes de Contato:* Laboratório, grau, tipo (mono, bifocal, multifocal) e tratamentos (antirreflexo, luz azul, fotossensível, escura).
* **Ordens de Serviço (O.S.):**
  * Vinculação de cliente, vendedor, loja e itens de estoque.
  * Registro completo da receita médica (grau esférico, cilíndrico, eixo, distância pupilar e adição para ambos os olhos).
  * Controle de status (em andamento, entregue, cancelado) e geração de O.S. formatada em folha A4 para impressão.
* **Gerenciamento Multi-lojas:** Cadastro de filiais e controle de distribuição de produtos em estoque por unidade.

---

## Tecnologias Utilizadas

* **Linguagem:** Java (v7.0)
* **Interface Gráfica:** Swing / WindowBuilder (Eclipse)
* **Banco de Dados:** PostgreSQL
* **Conectividade:** Driver JDBC PostgreSQL

---

## Documentação do Projeto

Toda a documentação técnica e de modelagem criada durante o projeto está disponível na pasta `documentacao/`:

* `documentacao/Documento de visão - Sistema para negócio tipo ótica.pdf`
  * *Contém:* Requisitos funcionais e não funcionais, detalhamento dos casos de uso, cenários de exceção, diagrama de classes, protótipo de telas e diagramas de atividades.
* `documentacao/Projeto de Banco de Dados .pdf`
  * *Contém:* Levantamento de requisitos do banco, Dicionário de Dados, Modelo Entidade-Relacionamento (MER) e Esquema Relacional.

---

## 👥 Desenvolvedores

* Leandro Rodrigues
* Rafael Nunes
* Viviani Martins