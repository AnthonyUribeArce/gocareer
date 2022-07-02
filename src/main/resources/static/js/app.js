function demo() {
	var stuName = document.getElementById('qname').value;
	var stuLName = document.getElementById('qlname').value;
	var stuDBirth = document.getElementById('dbirth').value;
	var stuEmail = document.getElementById('email').value;
	var stuPass = document.getElementById('pass').value;
	var stuNumber = document.getElementById('nnum').value;
	if (stuName == "") {
		alert("El nombre no puede ir vacio");
	}
	if (stuLName == "") {
		alert("El apellido no puede estar vacio");
	}
	if (stuDBirth == "") {
		alert("La fecha de nacimiento no puede estar vacio");
	}
	if (stuEmail == "") {
		alert("El correo no puede estar vacio");
	}
	if (stuPass == "") {
		alert("La contraseña no puede estar vacio");
	}
	if (stuNumber == "") {
		alert("El telefono no puede estar vacio");
	}
}