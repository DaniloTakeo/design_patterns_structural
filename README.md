# 📦 Design Patterns Estruturais em Java

Este repositório contém implementações práticas dos **Design Patterns Estruturais** conforme definidos pelo livro *Design Patterns: Elements of Reusable Object-Oriented Software* (Gang of Four - GoF).

Cada padrão possui exemplos didáticos e comentados para facilitar o entendimento da estrutura e aplicação dos conceitos.

---

## 🧠 O que são Design Patterns?

Design Patterns (Padrões de Projeto) são soluções reutilizáveis para problemas comuns encontrados durante o desenvolvimento de software. Os padrões estruturais são responsáveis por abstrair o processo de **estruturação de objetos**, tornando o sistema mais flexível e desacoplado.

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

### 3. Composite Pattern

#### ✔️ Exemplos:

- **Sistema de arquivos (pastas e arquivos)**  
  Demonstra composição de objetos simples e compostos para formar uma estrutura em árvore.

- **Sistema de menus de interface gráfica (menus e itens de menu)**  
  Mostra como construir hierarquias de menus tratáveis de forma uniforme.

📁 Caminho: `src/composite/`

---

### 4. Decorator Pattern

#### ✔️ Exemplos:

- **Cafeteria com bebidas e complementos (leite, chocolate, etc.)**  
  Permite adicionar funcionalidades (ingredientes) dinamicamente a uma bebida sem modificar a classe original.

- **Sistema de notificações com múltiplos canais (Email, SMS, Log)**  
  Permite encadear dinamicamente notificações por diferentes meios de envio.

📁 Caminho: `src/decorator/`

---

### 5. Facade Pattern

O **Facade Pattern** fornece uma interface unificada e simplificada para um conjunto de interfaces em um subsistema. Ele oculta a complexidade do sistema e provê uma maneira mais simples para os clientes interagirem com ele.

#### ✅ Exemplos implementados:

1. **Sistema de Home Theater**  
   A classe `HomeTheaterFacade` encapsula as operações necessárias para assistir a um filme, coordenando DVD player, projetor, som e luzes com métodos como `assistirFilme()` e `encerrarSessao()`.

   **Classes principais:**
   - `DVDPlayer`, `Projetor`, `Luzes`, `Som`
   - `HomeTheaterFacade`
   - `CinemaApp` (cliente)

2. **Processamento de Pedidos no E-commerce**  
   A classe `PedidoService` age como fachada para processar pedidos, escondendo as chamadas diretas para os serviços de estoque, pagamento, nota fiscal e e-mail.

   **Classes principais:**
   - `Produto`
   - `EstoqueService`, `PagamentoService`, `NotaFiscalService`, `EmailService`
   - `PedidoService`
   - `AppEcommerce` (cliente)

📁 Caminho: `src/facade/`

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
2. Importe no seu IDE preferido (IntelliJ, Eclipse etc.)

3. Navegue até o diretório do padrão que deseja testar

4. Execute a classe Main ou App em cada exemplo

## ✍️ Autor
Desenvolvido por Danilo Takeo Kanizawa — com o objetivo de reforçar os estudos de padrões de projeto e aplicar boas práticas no desenvolvimento com Java.
