
<?php

	if(isset($_POST["altura"])){
		
		$operacao = "getImc";
		
		$client = new SoapClient("http://localhost:8000/Imsc?WSDL");
				
		$parametros = array($operacao =>
		                        array(
							        'altura' => $_POST["altura"],
							        'peso'=>$_POST["peso"]));
		
		
		$result = $client->__soapCall($operacao, $parametros);

        $resultado = $result->return;		
		
	}	

?>

<html>

<head>
   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
   integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
   <link href="styles/style.css" rel="stylesheet">
</head>


<body>

   <div class="container">
       
	   <div class="jumbotron">
	     <h1 id="h1">Calculadora IMC</h1>
	   </div>
	   
		<form action="form.php" method="POST">
           
		    <div class="form-group">
				<label for="altura">Digite Sua Altura</label>
		        <input type="text" name="altura" id="altura" class="form-control">
		    </div>
		   
		    <div class="form-group">
			     <label for="peso">Digite Seu Peso</label>
				 <input type="text" name="peso" id="peso"class="form-control">
		    </div>
			<button type="submit">Calcular</button>
		</form>
		
		<h4>Seu IMC é: <?php echo number_format( $resultado, 2)?></h4>
		
	</div>
	
</body>

<style type="text/css">
 #h1{
	 text-align:center;
 }

</style>

</html>

