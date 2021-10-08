var btnNoSubmit = document.getElementById("btnNoSubmit");
btnNoSubmit.addEventListener('click',function () {
    let email = document.getElementById('exampleInputEmail1').value;
    let pass  = document.getElementById('exampleInputPassword1').value;
    var params = new URLSearchParams();
    params.append('nombre', email);
    params.append('password', pass);
  
   
});