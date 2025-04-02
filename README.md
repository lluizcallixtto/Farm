# 📌 Sistema de Controle de Animais da Fazenda

## 📖 Visão Geral
O **Sistema de Controle de Animais da Fazenda** é um aplicativo mobile desenvolvido para otimizar a gestão de estoque de alimentos e vacinas em uma grande fazenda. O sistema facilita o monitoramento, reduz desperdícios e melhora a eficiência do manejo animal.

Este projeto foi desenvolvido utilizando **Android Studio** com **Java** para a lógica de programação e **XML** para a criação das interfaces gráficas.

## 🎯 Objetivo
O sistema visa solucionar os desafios enfrentados pelo administrador da fazenda, proporcionando um controle eficiente dos estoques de alimentos e vacinas, garantindo a saúde e o bem-estar dos animais.

## ⚠️ Problemas Identificados
- **Dificuldade na gestão de estoques**: Controle manual ineficiente e propenso a erros.
- **Falta de visibilidade**: Produtos vencidos e desperdício de insumos.
- **Impactos negativos**: Perdas financeiras e problemas de saúde nos animais.

## ✅ Funcionalidades Implementadas
- 📊 **Sistema de Monitoramento**: Registro e acompanhamento de alimentos e vacinas.
- 🔔 **Alertas Automáticos**: Notificações para produtos próximos do vencimento.
- 📄 **Geração de Relatórios**: Análises detalhadas do consumo e movimentações.
- 🐄 **Controle de Distribuição**: Gestão inteligente da alimentação e imunização dos animais.

## 🏗️ Arquitetura do Código
O código foi estruturado seguindo boas práticas de desenvolvimento:

### 📂 **Estrutura de Pastas**
```
📦 app/src/main/java/com/example/fazenda
│── 📂 models/       # Classes principais (POJOs)
│── 📂 interfaces/   # Interfaces para definir comportamentos
│── 📂 database/     # Gerenciamento de banco de dados (futuro)
│── 📂 ui/           # Lógica das telas do app
│   │── 📂 activities/ # Activities do aplicativo
│   │── 📂 adapters/   # Adapters para RecyclerViews
└── 📦 res/layout    # Arquivos XML das interfaces
```

### 🔹 **Classes Principais**
- **`Produto`** (Classe Abstrata) → Define características comuns a todos os produtos.
- **`Alimento` e `Vacina`** → Herdam de `Produto` e implementam características específicas.
- **`Estoque`** → Gerencia os produtos e implementa `GerenciadorEstoque`.
- **`Relatorio`** → Gera relatórios detalhados do estoque.
- **`MainActivity`** → Tela principal do aplicativo.

### 🔹 **Interfaces Implementadas**
- **`GerenciadorEstoque`** → Define métodos para adicionar, remover e listar produtos.
- **`DistribuicaoAnimais`** → Responsável pela distribuição eficiente dos insumos.

## 🔧 Tecnologias Utilizadas
- **Linguagem:** Java ☕
- **IDE:** Android Studio 🏗️
- **Design de Interface:** XML 🎨
- **Arquitetura:** Padrão MVC 🏛️

## 🚀 Melhorias Futuras
- 📲 **Banco de Dados**: Implementação de SQLite ou Firebase para persistência de dados.
- 📅 **Previsão de Consumo**: Algoritmos para prever necessidades futuras.
- 📡 **Sincronização na Nuvem**: Backup e acesso remoto aos dados.

## 📝 Conclusão
Este projeto proporciona uma solução eficiente para a gestão da fazenda, trazendo **organização, automação e inteligência na administração dos recursos**. Futuras melhorias podem expandir ainda mais sua funcionalidade, garantindo um sistema robusto e confiável.

---
📌 *Desenvolvido por Luiz Eduardo*

