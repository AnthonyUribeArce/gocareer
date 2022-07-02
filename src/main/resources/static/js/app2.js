function demo() {
	var espName = document.getElementById('qnamesp').value;
	var espLName = document.getElementById('qlnamesp').value;
	var espEmail = document.getElementById('emailesp').value;
	var espPass = document.getElementById('passesp').value;
	var espNumber = document.getElementById('nnumesp').value;
	var espCPSP = document.getElementById('cpspesp').value;
	var espDNI = document.getElementById('dniesp').value;
	if (espName == "") {
		alert("El nombre no puede ir vacio");
	}
	if (espLName == "") {
		alert("El apellido no puede estar vacio");
	}
	if (espCPSP == "") {
		alert("La fecha de nacimiento no puede estar vacio");
	}
	if (espEmail == "") {
		alert("El correo no puede estar vacio");
	}
	if (espPass == "") {
		alert("La contraseña no puede estar vacio");
	}
	if (espNumber == "") {
		alert("El telefono no puede estar vacio");
	}
	if (espDNI == "") {
		alert("El telefono no puede estar vacio");
	}
}