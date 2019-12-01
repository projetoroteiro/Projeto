<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="atv.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet" />
<title>Insert title here</title>
</head>
<body class="body2">

	<br />
	<a class="btn btn-default" href="./AdministradorForm">Novo Administrador</a>
	<br />

	<div class="container body-content ">
		<div class="row">
			<div class="col-lg-1"></div>

			<div class="col-lg-10">
				<div class="container centered" id="conteudo">
					<table class="table">
						<thead>
							<tr>
								<th scope="col">Id</th>
								<th scope="col">Nome</th>
								<th scope="col">Email</th>
								<th scope="col">CPF</th>
								<th scope="col"></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="a" items="${adms}">
								<tr>
									<td scope="row">${a.id}</td>
									<td>${a.nome}</td>
									<td>${a.email}</td>
									<td>${a.cpf}</td>
									<td><a href='./AdministradorForm?id=${a.id}'><i class="material-icons">edit</i></a> 
									<a href='./AdministradorExcluir?id=${a.id}'><i class="material-icons">delete</i></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>