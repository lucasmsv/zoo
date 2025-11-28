# Zoo System

<p>
  Um sistema simples de console desenvolvido em Java para cadastrar e gerenciar dois tipos de animais: Lobos e Leões.
  Apesar da simplicidade da interface, o projeto foi estruturado para demonstrar conhecimento em POO, separação de responsabilidades e boa organização de código.
</p>

### 🚀 Funcionalidades
<ul>
  <li>Cadastrar Lobo</li>
  <li>Cadastrar Leão</li>
  <li>Listar Animais Cadastrados</li>
</ul>

### 🛠 Tecnologias Utilizadas
- Java 17+

### 🧠 Arquitetura e Princípios Aplicados
Esse projeto foi desenhado para demonstrar o uso consciente de conceitos fundamentais de OO:

### ✔️ Abstração
A classe animal é abstrata, porque não faz sentido instanciar um "animal genérico".
Ela define atributos e comportamentos comuns a todos os animais, como:
- nome
- sexo
- método abstrato <code>fazerSom()</code> 
Isso força cada animal específico a definir seu próprio comportamento.

### ✔️ Herança
As classes:
- LoboModel
- LeaoModel

herdam de <strong>Animal</strong>

### ✔️ Encapsulamento
Todos os atributos são privados, acessando apenas através de getters e setters.
Isso impede acesso direto aos dados e garante integridade.

### ✔️ Polimorfismo
A lista em <code>AnimalService</code> armazena objetos do tipo <code>Animal</code>, mas cada elemento pode ser um:
- LoboModel
- LeaoModel

Quando o programa exibe os animais ou executa <code>fazerSom()</code>, o método correto é chamado de forma dinâmica, sem precisar saber o tipo exato em tempo de compilação.

### ✔️ Separação de Responsabilidades (Single Responsability Principle)
- <code>Main</code> <br>
  > Interação com o usuário (entrada e saída)
- <code>AnimalService</code> <br>
  > Armazena e gerencia a lista de animais
- <code>model/</code> <br>
  > Só define estrutura e comportamento dos objetos do domínio

Nada de lógica interna misturada com display de console.

### Estrutura do Projeto
<pre>
src/
 ├── service/
 │    └── AnimalService.java      # Regras de negócio
 │
 ├── model/
 │    ├── Animal.java             # Classe abstrata base
 │    ├── LoboModel.java          # Modelo de Lobo
 │    └── LeaoModel.java          # Modelo de Leão
 │
 └── Main.java                    # Menu e fluxo principal
</pre>

### ▶️ Como Executar
<ol>
  <li>Clone o repositório <code>git clone https://github.com/lucasmsv/zoo</code></li>
  <li>Abra o projeto na sua IDE de preferência</li>
  <li>Execute a classe <code>Main</code></li>
</ol>
