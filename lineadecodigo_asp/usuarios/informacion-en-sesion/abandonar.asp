<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Abandonar</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>

<body>
<h1>Abandonar</h1>
<p> 
<%
  Session.Abandon()

  Response.Write("Usuario:" + Session("usuario") + "<br>")
  Response.Write("Paginas vistas:" + CStr(Session("paginas")))
%>
</p>

<p>
   <a href="pagina-Uno.asp">Pagina Uno</a> |
   <a href="pagina-Dos.asp">Pagina Dos</a> |
   <a href="abandonar.asp">Abandonar Sesion</a>
</p>

</body>
</html>