<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<title>Calcular IMC</title>
		
		<link rel="stylesheet"
			href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
			integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
			crossorigin="anonymous">
		<link rel="stylesheet" href="calculo-imc.css">
	</head>
	<body>
		<div class="col-md-12">
			<div class="modal-dialog" style="margin-bottom: 0px">
				<div class="modal-content">
					<div class="panel-heading">
						<h3 class="panel-title">Calcular IMC</h3>
					</div>
					<div class="panel-body">
						<form name="formulario" action="calcularIMC" method="POST">
							<fieldset>
								<div class="form-group">
									<input class="form-control" placeholder="Altura" name="altura"
										type="text" autofocus="" required="true"> (m)
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="Peso" name="peso"
										type="text" autofocus="" required="true"> (KG)
								</div>
								<div class="form-group">
									<label>
										<select name="sexo" autofocus="" required="true">
											<option value="F">Feminino</option>
											<option value="M">Masculino</option>
										</select>
									</label>
								</div>
								<button class="btn btn-sm btn-success">Calcular</button>
							</fieldset>
						</form>
										
						<c:if test="${not empty resultado}">
							<br/><label>Resultado: </label><br/>
							<div class="alert alert-success" role="alert">${resultado}</div>
						</c:if>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>