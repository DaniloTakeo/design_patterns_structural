# 📦 Design Patterns Estruturais em Java

Este repositório contém implementações práticas dos **Design Patterns Estruturais** conforme definidos pelo livro *Design Patterns: Elements of Reusable Object-Oriented Software* (Gang of Four - GoF).

Cada padrão possui exemplos didáticos e comentados para facilitar o entendimento da estrutura e aplicação dos conceitos.

---

## 🧠 O que são Design Patterns?

Design Patterns (Padrões de Projeto) são soluções reutilizáveis para problemas comuns encontrados durante o desenvolvimento de software. Os padrões criacionais são responsáveis por abstrair o processo de **criação de objetos**, tornando o sistema mais flexível e desacoplado.

---

## ✅ Padrões Estruturais Implementados

### 1. Adapter Pattern

#### ✔️ Exemplos:

- **Tomada de 3 pinos e tomada de 2 pinos**
  - Demonstra adaptação entre interfaces incompatíveis simulando um adaptador elétrico.
- **Logger legado e novo sistema de logging**
  - Exemplo realista de integração de sistema legado com nova arquitetura.

📁 Caminho: `src/adapter/`

---

### 2. Bridge Pattern

#### ✔️ Exemplos:

- **Formas geométricas com renderização vetorial e raster**
  - Mostra a separação entre abstração (formas) e implementação (tipos de render).
- **Sistema de envio de mensagens por múltiplos canais**
  - Demonstra a separação entre tipos de mensagens e meios de envio (Email, SMS).

📁 Caminho: `src/bridge/`

---

## 📌 Objetivo

Este repositório serve como material de estudo e consulta para desenvolvedores que desejam:

- Compreender padrões de projeto na prática
- Melhorar o design de sistemas orientados a objetos
- Ter exemplos prontos e organizados por padrão

---

## 🚀 Como executar os exemplos

1. Clone o repositório:
   ```bash
   git clone git@github.com:DaniloTakeo/design_patterns_structural.git
2. Importe no seu IDE preferido (IntelliJ, Ecli2pse etc.)

3. Navegue até o diretório do padrão que deseja testar

4. Execute a classe Main ou App em cada exemplo

## ✍️ Autor
Desenvolvido por Danilo Takeo Kanizawa — com o objetivo de reforçar os estudos de padrões de projeto e aplicar boas práticas no desenvolvimento com Java.
