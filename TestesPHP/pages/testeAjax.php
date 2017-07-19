<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	function testeAjax() {

		var xmlhttprequest;
		
		if (window.XMLHttpRequest) {
			xmlhttprequest = new XMLHttpRequest();
		} else {
			alert ("Browser não suportado");
			return;
		}

		/*var param = document.getElementById("id1").value;

		if (param == null) {
			param = "não recebi o devido valor";
		}*/

		try {
			xmlhttprequest.onreadystatechange=function() {
					document.write(xmlhttprequest.responseText);
					document.getElementById("id1").value = xmlhttprequest.responsetext;
			}
		} catch(err) {
			document.write(err.message);
			return;
		}
		
		//xmlhttprequest.open("GET","./testeAjaxRes.php?q="+param, true);
		xmlhttprequest.open("GET","./testeAjaxRes.php", true);
		xmlhttprequest.send();
		return;
		
	}
</script>

<title>Alterei o Trunk e agora vou mergear com o Branch</title>
</head>
<body>
	<form action="">
		<p>Texto: <input type="text" id="id1"> </p><input type="button" onclick="testeAjax();" value="click me" />
	</form>
</body>
