<?php
	
	//$data = date("dd/MM/yyy hh:mm:ss", time());
	
// 	$q=$_GET["q"];

	$a = 'PHP';

	$response = "Teste de ajax:  $a";
	
	if($response == null) {
		$response = "php - valor invalido";
	}
			
	echo($response);

?>