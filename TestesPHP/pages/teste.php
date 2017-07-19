<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

/*
 * O método onbeforeunload será invocado mesmo quando for um link da mesma aplicação.
 * Para resolver esse problema, toda vez que uma url for chamada, colocar no evento
 * a funcao unhook, com o exemplo abaixo o qual é um link para outra pagina. O mesmo
 * deverá ser feito para outros evento que navegue para outra url.
 *
 * Consulte o link: http://amazing-development.com/archives/2008/11/25/javascript-close-hook-for-browser-window/ 
 *
 */

//<a href="..." onClick="unhook()">Some link within my app</a>

var hook=true;

window.onbeforeunload = function (e) {

	  var e = e || window.event;

	  // IE/Explorer
	  if (e) {
	    e.returnValue = 'Voce vai sair?';
	  }

	  // Safari
	  return 'Voce vai sair?';
	};

	  function unhook() {
		     hook=false;
	}
	
</script>

<script type="text/javascript">
	
	window.onload = setupRefresh;

    function setupRefresh() {
      setTimeout("refreshPage();", 30000); // milliseconds
    }

    function refreshPage() {
       window.location = location.href;
    }

    function verifyRemove() {

    	var remove = document.getElementById("cbUnload");

    	if (remove.checked) {
			alert("Ao selecionar \"Remover dados da Tabela\" as tabelas com dados de aplicações e funções autorizadas serão perdidos, tenha certeza do que vocês está fazendo.");
        }
    }

    function envia() {

    	
    	alert("Hello");
    	
   	}

    function displayResult()   {
    	var x=document.getElementById("button1").type;
    	alert(x);
    }

</script>
</head>
<body>
	<form id="frmApp" action="#" >
		<input type="checkbox" id="cbUnload" /> Unload
		<br/>
		<input type="checkbox" id="cbLoad" /> Load
		<br />
		<input type="button" id="btnSubmit" value="enviar" onclick="envia()"/>
		<input type="button" onclick="submit()" value="Mostra input type" id="btnSubmit">
	</form>
</body>
</html>