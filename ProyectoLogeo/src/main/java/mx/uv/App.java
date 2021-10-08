package mx.uv;


public class App {
    public static void main(String[] args) {

        /*options("/*", (request, response) -> {

            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
            }

            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
            if (accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
            }

            return "OK";
        });*/

       // before((req, res) -> res.header("Access-Control-Allow-Origin", "*"));

        /*<!-- CSS only -->
        System.out.println("Hello World!");
        get("/index.html", (a, b) -> {
            Object req = a.headers("BAR");
            System.out.println(req);
            String h = "<h1>hola</h1>";
            String f = "<form><input type='text'><input type='submit'></form>";
            return req + h + f;
        });*/
        //get("/alma.html", (a, b) -> "alma");
      

       // post("/hola.html", (a, b) -> "hola");
        //get("/hola.html", (a, b) -> "no me llamo así");

        get("/saludar", (req, res) -> {
            String l = req.queryParams("nombre");
            String p = req.queryParams("password");
            String respuesta;

            if (l.equals("root") && p.equals("123"))
                respuesta = "Bienvenido usuario ";
            else
                respuesta = "Usuario equivocado ";
            return respuesta + l + " <a href='http://127.0.0.1:5500/index.html'>volver</a>";
        });

        post("/saludar", (req, res) -> "hola");
        
        post("/saludar", (req, res) -> "hola");

       /* var email=document.login.nombre.value; 
        var pass=document.login.password.value; 
           if (nombre=="usuario" && password=="password") { 
            window.location='http://127.0.0.1:5500/index.html'; 
           } 
           
           if (usuario=="" && password=="") { 
           window.location=""; 
           } */
       


           function validacion()
		{
			var email = document.getElementById("usuario").value;
			var pass = document.getElementById("password").value;	

			if(usuario == "andy" && Contraseña == "1234")
			{
				alert("Usuario y Contraseña validos");
			}
			else
			{
				alert("Verifique sus credenciales");
			}
		}



    }
}