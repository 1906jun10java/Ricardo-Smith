window.onload = function() {
	populateUser();
}

function populateUser() {
	// send a GET request to SessionServlet to obtain session information
	fetch("http://localhost:8082/P1/reimbursementByUserID")
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
																
								let reason = "Reimbursement for: "+array[i].description+ " ";
								let cost = "Cost : "+array[i].amount+ " ";
								let status = "Status: "+array[i].status+ " ";
								/*if(array[i].managerFirst == null){
									manager = "Manager: NA";
								}*/
								let reimbursements = document.createTextNode(reason+"\n" + cost +"\n"+ status+"\n\n\n")
								
								li.appendChild(reimbursement);
								document.getElementById("info").appendChild(li);
							}

						}
					})

}