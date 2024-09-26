# Projeto Docker Básico

Este projeto demonstra como configurar um servidor Apache (httpd) usando Docker.

## Passos

### 1. Criar um arquivo YML com as definições de um servidor Apache (httpd)

Crie um arquivo chamado `docker-compose.yml` com o seguinte conteúdo:

```yaml
version: '3'
services:
  web:
    image: httpd:latest
    ports:
      - "80:80"
    volumes:
      - ./app:/usr/local/apache2/htdocs/
```

### 2. Especificar no arquivo YML o local onde os arquivos da aplicação estarão

Crie uma pasta chamada `app` no mesmo diretório do arquivo `docker-compose.yml`. Dentro da pasta `app`, crie um arquivo `index.html` com o seguinte conteúdo:

```html
<!DOCTYPE html>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
    <h1>Hello World</h1>
    <p>Esta é uma aplicação web simples executada em um contêiner Docker.</p>
</body>
</html>
```

### 3. Subir o arquivo YML e a aplicação para um repositório no GitHub

1. Inicialize um repositório Git na pasta do projeto:
    ```sh
    git init
    ```

2. Adicione os arquivos ao repositório:
    ```sh
    git add .
    ```

3. Faça o commit das alterações:
    ```sh
    git commit -m "Initial commit"
    ```

4. Crie um novo repositório no GitHub e siga as instruções para adicionar o repositório remoto. Em seguida, envie os arquivos para o GitHub:
    ```sh
    git remote add origin <URL_DO_REPOSITORIO_GITHUB>
    git push -u origin master
    ```

## Executar a aplicação

Para executar a aplicação, use o comando:

```sh
docker-compose up
```

Acesse `http://localhost` no seu navegador para ver a aplicação em execução.