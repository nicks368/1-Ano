function validar() {
    var email = login.email.value;
    var senha = login.senha.value;
    

    if (email == "") {
        alert ('preencha o seu E-mail!');
        login.email.focus();
        return false;
    }

    if (senha == "") {
        alert ('preencha a sua Senha!');
        login.senha.focus();
        return false;
    }
}