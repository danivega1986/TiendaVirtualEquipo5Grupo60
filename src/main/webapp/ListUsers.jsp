<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="http://cdn.datatables.net/1.10.9/css/jquery.dataTables.min.css" />
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.11.4/themes/flick/jquery-ui.css">
    <link rel="stylesheet" href="css/table.css">
    
	<title>Tienda Generica</title>
	
</head>
<body>
	<table id="tabla">
		<thead>
			<tr>
				<td>CEDULA</td>
				<td>NOMBRE</td>
				<td>CORREO</td>
				<td>PASSWORD</td>
				<td>USUARIO</td>
			</tr>		
		</thead>
		
		<tbody id="cuerpoTabla">
			
		</tbody>
	
	
	</table>



    <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
    <script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
    <script src="https://cdn.datatables.net/1.10.9/js/jquery.dataTables.min.js"></script>
    <script src="scripts/table.js"></script>
</body>
</html>