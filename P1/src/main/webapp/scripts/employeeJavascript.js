let employee = {};

window.onload = function(){
	populateEmployee();
}

function populateEmployee(){
	
	fetch("http://localhost:8082/P1/ empProfile")
		.then(function(response){
			return repsonse.json();
		})
		.then(
				function(data){
					console.log(data);
					
					if(data.session == null){
						window.location = "http://localhost:8082/P1/login"
					}else{
						
						empArray = data;
						
						for(i=0; i < empArray.length; i++){
							document.getElementById("employeeID").innerText = "EmployeeID: "
								+ employee.empID;
							document.getElementById("employeeFirstName").innerText = "Employee First Name: "
								+ employee.firstName;
							document.getElementById("employeeLastName").innerText = "Employee Last Name: "
								+ employee.lastName;
							document.getElementById("employeeEmail").innerText = "Employee Email: "
								+ employee.email;
						}
					}
				})
}