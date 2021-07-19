
<h1 align="center">Movie API REST</h1>
<p align="center">Concluído ✅</p>
<p align="center">
 <a href="#Sobre">Sobre</a> •
 <a href="#Executar">Como executar</a>
</p>

<h2 id="Sobre">👀 Mas... o que é?</h2>
<p>É uma aplicação a qual é possível:</p>

- 🗒️ Listar - todos os filmes, por id, por títutlo ou por gênero
- ⌨️ Inserir filmes 
- 🔄 Atualizar filmes
-  ❌ Excluir filmes por id

<h2 id="Executar">▶️ E como executa?</h2>
<p>Você pode ler a documentação e testar a API acessando o Heroku, onde foi feito o deploy, clicando <a href="https://movies-api-tk.herokuapp.com/swagger-ui.html">aqui!</a></p>
<hr>

<h4>GET | Lista todos os filmes</h4>
<p>1. Clique em GET /movies</p>
<p>2. Clique no botão 'Try it out!'</p>
<p>3. Em 'Response Body' serão exibidos todos os filmes listados</p>
<img src="https://media.giphy.com/media/xK8DXNHuqXdk8M6yHq/giphy.gif" alt="Get Todos">
<hr>

<h4>POST | Insere um filme</h4>
<p>1. Clique em POST /movies</p>
<p>2. Em 'Value' insira apenas o título e gênero do filme, como o exemplo abaixo:</p>

```
{
    "title": "Casino (1995)",
	"genres": "Crime|Drama"
}
```

<p>3. Clique no botão 'Try it out!'</p>
<p>4. Em 'Response Body' serão exibidos os dados inseridos do filme</p>
<img src="https://media.giphy.com/media/faNfTWVWGUb8IOc2oZ/giphy.gif" alt="Post">
<hr>

<h4>PUT | Altera um filme</h4>
<p>1. Clique em PUT /movies</p>
<p>2. Em 'Value' informe o id do filme a qual você quer alterar os dados, seguindo o exemplo abaixo:</p>
{
    "movieId": 3,
	"title": "Money Train (1995)",
	"genres": "Action|Comedy|Crime|Drama|Thriller"
}
<p>3. Clique no botão 'Try it out!'</p>
<p>4. Em 'Response Body' serão exibidos os dados alterados do filme</p>
<img src="https://media.giphy.com/media/Nk5KSDwDQVxXjaaEGx/giphy.gif" alt="Put">
<hr>

<h4>GET | Lista os filmes por gênero</h4>
<p>1. Clique em GET /movies/genres/{genres}</p>
<p>2. Em 'Value' informe o gênero ou parte do gênero</p>
<p>3. Clique no botão 'Try it out!'</p>
<p>4. Em 'Response Body' serão exibidos todos os filmes do gênero informado</p>
<img src="https://media.giphy.com/media/u57drkf43N9kOSMM7E/giphy.gif" alt="Get Gênero">
<hr>

<h4>GET | Listar filmes por título</h4>
<p>1. Clique em GET /movies/title/{title}</p>
<p>2. Em 'Value' informe o título ou parte do título</p>
<p>3. Clique no botão 'Try it out!'</p>
<p>4. Em 'Response Body' serão exibidos todos os filmes com o título informado</p>
<img src="https://media.giphy.com/media/efniBdvIOw9STQWT4h/giphy.gif" alt="Get Título">
<hr>

<h4>DELETE | Excluir um filme</h4>
<p>1. Clique em DELETE /movies/{movieId}</p>
<p>2. Em 'Value' informe o id do filme ao qual você deseja excluir</p>
<p>3. Clique no botão 'Try it out!'</p>
<p>4. Em 'Response Code' o status 200 confirma que o filme foi excluído</p>
<img src="https://media.giphy.com/media/u8vLqnDAr5cXU9dDS7/giphy.gif" alt="Delete">
<hr>

<h4>GET | Lista um único filme</h4>
<p>1. Clique em GET /movies/{movieId}</p>
<p>2. Em 'Value' informe o id do filme ao qual você deseja consultar</p>
<p>3. Clique no botão 'Try it out!'</p>
<p>4. Em 'Response Body' serão exibidos os dados do filme consultado</p>
<img src="https://media.giphy.com/media/ftqrCSpvPJfICJOaxj/giphy.gif" alt="Get Filme">

