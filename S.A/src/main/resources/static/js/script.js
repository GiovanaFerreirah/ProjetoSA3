const compararSenha = function(){
    senha1 = document.getElementById("senha1").value;
    senha2 = document.getElementById("senha2").value;
    if(senha1!==senha2){
        alert("as senhas não batem")
        $("#salvar").prop('disabled', true);
    }else{
        $("#salvar").prop('disabled', false);
        
    }
 }