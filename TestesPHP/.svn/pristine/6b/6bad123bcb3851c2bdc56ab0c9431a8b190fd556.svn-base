<?php
$host = "localhost";
$user = "postgres";
$pass = "postgres";
$db = "dbgrtp";

$con = pg_connect("host=$host dbname=$db user=$user password=$pass")
				 or die ("Problema ao executar a conexao \n");

$query = "SELECT * FROM usuario ";

$rs = pg_query($con, $query) or die("Erro ao executar a query: $query\n");

// $meta_data = pg_meta_data($con, "usuario");

// foreach ($meta_data as $val) {
// 	echo "<p>----------------------------------------------------------------</p>";
// 	var_dump($val);
// 	foreach ($val as $val2) {
// // 		echo "<p>Valor: $val2</p>";
// 	}
// }

// var_dump($meta_data);

while ($row = pg_fetch_row($rs)) {
 	echo "<p>$row[0] $row[1] $row[2] $row[3] $row[4] $row[4] $row[5] $row[6] $row[7] $row[8] $row[9] $row[10] $row[11] $row[12]</p>";
}

pg_close($con);
?>