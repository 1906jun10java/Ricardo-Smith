let array = {};

window.onload = function() {
	populateUser();
}

function populateUser() {
	// send a GET request to SessionServlet to obtain session information
	fetch("http://localhost:8082/P1/viewEmployeesAndManagers")
			.then(function(response) {
				return response.json(); // parsing json data in the response as
										// a JS object
			})
			.then(
					function(data) {
						console.log(data);
						// check whether there is a valid session
						// define behavior for when there is no valid user
						if (data.session === null) {
							window.location = "http://localhost:8082/P1/login"
						} else {
							array = data;
							
							for(i=0; i < array.length; i++){
								let li = document.createElement("li");
								//let employee = `Employee: ${array[i].employeeFirst}${array[i].employeeLast}`;
								//let manager = `Manager: ${array[i].managerFirst} ${array[i].managerLast}`;
								
								let employee = "Employee: "+array[i].employeeFirst+ " "+array[i].employeeLast+", ";
								let manager = "Manager: "+array[i].managerFirst+ " "+array[i].managerLast;
								if(array[i].managerFirst == null){
									manager = "Manager: NA";
								}
								//let employeeAndManager = document.createTextNode(`${employee}, ${manager}`);
								let employeeAndManager = document.createTextNode(employee+"\n" + manager + "\n\n\n")
								
								li.appendChild(employeeAndManager);
								document.getElementById("info").appendChild(li);
							}

						}
					})

}