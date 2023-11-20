<h1 align="center"> 🚍Empresa Metropolitana de Transporte Ruim 🚍</h1>

<p align="center">
<img alt="Static Badge" src="https://img.shields.io/badge/STATUS-CONCLU%C3%8DDO-green?style=for-the-badge">
</p>

<br>

<h2 align="left"> 📝 Descrição </h2>
Este projeto foi desenvolvido na <a href="https://www.usf.edu.br">Universidade São Franscisco</a> durante o 6º semestre de Engenharia da Computção na matéria de Programação Orientada a Objetos lecionada pelo <a href="https://github.com/matiasfilho81">Prof. José Matias Lemes Filho</a>. Nosso projeto tem o intuito de realizar uma aplicação backend co a utilização do CRUD. Em nosso caso, criamos este backend para um sistema de uma empresa fictícia de transporte rodoviário, a EMTU, ou melhor, a EMTR. Nosso programa tem o objetivo de cadastrar um cliente com seu nome e CPF, o cpf é verificado, então só é possivel adiciona-lo com um documento válido, coletar e salvar a informação de qual ônibus o cliente irá pegar (por exemplo, Itatiba -> S.P ou Itatiba -> Morungaba) e qual assento ele ocupará, assim não sendo possível duas pessoas ocuparem a mesma cadeira (😏).

 
<br>

<h2 align="left">⏯️ Como funciona?</h2>

[![Assista ao vídeo](https://miro.medium.com/v2/resize:fit:1000/1*XtjiQD35ja0DcA9H-JuM-g.png)](https://youtu.be/7wZsNsnhzCw)
<br>

<h2 align="left">🧮 Tecnologias Empregadas</h2>

- ``Java 11 ☕``
- ``Sprint Tools 4 v3.1.5 🍃``
- ``Postman v10.20 🚶‍♂️ ``

<br>

<h2 align="left">👷‍♂️ Arquitetura</h2>
<h3>Entidades:</h3> 

- `Cliente` 
   - Classe que representa os clientes do EMTR
   - Possui os atributos id, cpf e nome
 
- `Viagem` 
   - Classe que representa as viagens disponíveis da EMTR
   - Possui os atributos id, origem, destino, data e horario

- `Lugar`
   - Classe que representa os lugares que os clientes podem escolher em cada viagem
   - Possui os atributos id, id_viagem e id_cliente

<h3>Controladores:</h3> 
<p>Mapeiam as requisições HTTP e definem métodos especificos para GET, POST, PUT e DELETE</p>

<h4>ClienteController:</h4>

   - `GET`
      - Endpoint: `/clientes`
      - Exemplo de resposta:
      ```bash
      [
         {
             "id": 1,
             "cpf": "36691620038",
             "nome": "Shaolin Matador de Porco"
         }
      ]
      ```

   - `POST`
     - Endpoint: `/clientes`
     - Exemplo de entrada:
     ```bash
     [
        {
            "cpf": "50353283096",
            "nome": "Jeferson Caminhões"
        }
     ]
     ```
  
  - `PUT`
      - Endpoint: `/clientes/{id}`
      - Exemplo de entrada:
      ```bash
      [
         {
             "cpf": "36691620038",
             "nome": "Flavin do Pneu"
         }
      ]
      ```

   - `DELETE`
     - Endpoint: `/clientes/{id}`

<h4>ViagemController:</h4>

   - `GET`
      - Endpoint: `/viagens`
      - Exemplo de resposta:
      ```bash
      [
         {
             "id": 1,
             "origem": "Itatiba",
             "destino": "São Paulo",
             "data": "25/11/2023",
             "horario": "19:30"
         }
      ]
      ```

   - `POST`
     - Endpoint: `/viagens`
     - Exemplo de entrada:
     ```bash
     [
        {
            "origem": "Itatiba",
            "destino": "São Paulo",
            "data": "25/11/2023",
            "horario": "19:30"
        }
     ]
     ```
  
  - `PUT`
      - Endpoint: `/viagens/{id}`
      - Exemplo de entrada:
      ```bash
      [
         {
             "origem": "Itatiba",
             "destino": "São Paulo",
             "data": "26/11/2023",
             "horario": "19:30"
         }
      ]
      ```

   - `DELETE`
     - Endpoint: `/viagens/{id}`

<h4>LugarController:</h4>

   - `GET`
      - Endpoint: `/lugares`
      - Exemplo de resposta:
      ```bash
      [
         {
             "id": 1,
             "id_viagem": "3",
             "id_cliente": "1"
         }
      ]
      ```

   - `POST`
     - Endpoint: `/lugares`
     - Exemplo de entrada:
     ```bash
     [
        {
            "id_viagem": "3",
            "id_cliente": "1"
        }
     ]
     ```
  
  - `PUT`
      - Endpoint: `/lugares/{id}`
      - Exemplo de entrada:
      ```bash
      [
         {
             "id_viagem": "3",
             "id_cliente": "7"
         }
      ]
      ```

   - `DELETE`
     - Endpoint: `/lugares/{id}`

<h3>Repositórios:</h3>

- `ClienteRepository`
- `ViagemRepository`
- `LugarRepository`

<br>

<h2 align="left">🔨 Funcionalidades</h2>

- `Funcionalidade 1` `Cadastro de Clientes`: O programa permite o cadastro do cliente através de seu nome e CPF;
- `Funcionalidade 2` `Verificação de CPF`: O cliente só é cadastrado caso o cpf fornecido seja um doocumento válido, caso contrário é emitido um erro e o cadastro não é realizado;
- `Funcionalidade 3` `Criação de rota/viagem`: É possível criar uma nova viagem, definindo origem, destino, data e horario;
- `Funcionalidade 4` `Seleção de assento`: O cliente pode escolher o assento que desejar na viagem que desejar reservando um lugar, assim não tem conflitos de lugares.

<br>

<h2 align="left">📁 Acesso ao projeto </h2>

- Clonar o Repositório <br>
  `git clone https://github.com/faber-junior/emtr.git`

- Download: <br>
  [![MediaFire](https://cdn2.iconfinder.com/data/icons/metro-ui-icon-set/128/MediaFire.png)](URL_do_seu_link)

<br>

<h2 align="left">🖌️ Autores </h2>

| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/146893811?v=4" width=115><br><sub>Pedro H. Possa<br>RA: 202102625</sub>](https://github.com/pedrohpossa) |  [<img loading="lazy" src="https://avatars.githubusercontent.com/u/145297917?v=4" width=115><br><sub>Faber<br>RA: 202122739</sub>](https://github.com/faber-junior) |
:---: | :---: |

