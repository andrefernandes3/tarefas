
<%@page import="br.com.usjt.model.Livro"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.usjt.dao.LivroDAO"%>
<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Cadastro de Livros</title>
</head>
<body>
	<a href="index.html">Início</a>
	<br />

	<h2>Cadastrar Novo Livro</h2>
	<label for="descricao_id">Titulo:</label>
	<input id="descricao_id" type="text"
		placeholder="Digite a descrição do chamado" name="descricao" />
	<br />
	<label for="descricao_id">Numero de Páginas:</label>
	<input id="descricao_id" type="text"
		placeholder="Digite a descrição do chamado" name="descricao" />
	<br />
	<label for="descricao_id">Autor:</label>
	<input id="descricao_id" type="text"
		placeholder="Digite a descrição do chamado" name="descricao" />
	<br />
	
	<input type="submit" value="Cadastrar"/>

</body>
</html>