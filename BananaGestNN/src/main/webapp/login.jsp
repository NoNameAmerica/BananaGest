<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Acceso a los usuarios de bananagest">
    <meta name="keywords" content="HTML,CSS,XML,JavaScript">
    <meta name="author" content="Equipo NoName: Arismar y Gabriel">
    <meta name="viewport" content="width=device-width, initial-scale=1.0 user-scalable=no">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Banana Gest</title>
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
    <link rel="stylesheet" href="estilo/style.css">
</head>

<body>
    <header>
        <h1>Banana Gest</h1>
    </header>
    <section>
        <p>Acceso de Usuario</p>
        <form id="formlogin" action="login_servlet" method="post" novalidate>

            <div>
                <span id="err_1" class="oculto error">El formato del email no es correcto</span>
                <span id="err_2" class="oculto error">El password es demasiado corto</span>
                <span id="err_3" class="oculto error">Introduce el email y password</span>
            </div>

            <div class="form-input">
                <label id="emailLb" for="email">Email</label>
                <input id="email" type="text" placeholder="Email" name="email" pattern="\S+@\S+\.\S+" required/>
            </div>
            <div class="form-input">
                <label id="passLb" for="pass">Password</label>
                <input id="pass" type="password" placeholder="Contraseña" name="pass" minlength="6" required/>
            </div>

            <div class="form-input-accept">
                <span><a>¿Recuperar Contraseña?</a></span>
            </div>

            <div class="boton-inf">
                <input id="boton_entrar" type="submit" value="Iniciar Secion" />
            </div>
        </form>
    </section>

</body>
<script src="scripts/login.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- script src="bootstrap-3.3.7-dist\js\bootstrap.js"></script>  -->
</html>