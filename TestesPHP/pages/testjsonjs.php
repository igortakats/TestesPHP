<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script type="text/javascript" src="json/sample.json" ></script>
	<script type="text/javascript">
		function ler() {

			try {
				var obj = eval ("(" + jsFile + ")");
				
				document.getElementById("nome").innerHTML=obj.registro[1].nome;
				document.getElementById("sNome").innerHTML=obj.registro[1].sobreNome;
				document.getElementById("endereco").innerHTML=obj.registro[1].endereco;
		
				alert("Passei");
			} catch (e) {
				alert(e.message);
			}		

		}				
	</script>
</head>

<body>
	<input type="button" value="LeiaJSon" onclick="ler()"/>
	<div>
		Primeiro nome: <span id="nome" /><br /> 
		Sobrenome: <span id="sNome" /><br />
		Endereco: <span id="end" /> <br />
	</div>
</body>



</html>
