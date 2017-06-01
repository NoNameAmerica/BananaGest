<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0 user-scalable=no">
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <!-- meta http-equiv="X-UA-Compatible" content="ie=edge" -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Banana Gest</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style2.css">
</head>
<body>
    <header>
        <div>
            <h1>Banana Gest</h1>
        </div>

        <div class="container">
            <nav class="navbar navbar-default row">
                <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <p>
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
                                aria-expanded="false">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>     
                            </button>
                        </p>
                    </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                            <div class="btn-group" id="accordion" role="group" aria-multiselectable="true">
                            
                                <form action="FormPry.html" class="btn-group" role="tab" method="get">
                                    <input type="hidden" name="acceso" value="alta">
                                    <input type="submit" class="btn btn-default" value="Ver Proyecto" />
                                </form>
                                
                                <!-- >form action="formusuario.html" class="btn-group" role="tab" method="get">
                                    <input type="hidden" name="acceso" value="alta">
                                    <input type="submit" class="btn btn-default" value="Nuevo Empleado" />
                                </form -->
                            </div>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
    </header>







<% if (session.getAttribute("user")!=null) { %>
<h3>hola <%= session.getAttribute("user")!=null?((String)session.getAttribute("user")):"" %>, Login correcto.</h3>
<img src="<%= session.getAttribute("foto")!=null?((String)session.getAttribute("foto")):"" %>" alt="Smiley face" height="142" width="142">
<% } %>
<form action="logout_servlet" method="get">
<input type="submit" value="Logout" >
</form>
<br>
</body>
</html>