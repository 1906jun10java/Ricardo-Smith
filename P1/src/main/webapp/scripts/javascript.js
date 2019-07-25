let user = {};

window.onload = function() {
	populateUser();
}

/*document.getElementById('new').addEventListener('click', e =>{ ==what jake helped me with.==
	window.location = "http://localhost:8082/P1/login"
})*/

function populateUser() {
	// send a GET request to SessionServlet to obtain session information
	fetch("http://localhost:8082/P1/session")
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
							// define behavior for when a user is returned
							user = data;
							document.getElementById("userID").innerText = "User ID: "
									+ user.userID;
							document.getElementById("mgrID").innerText = "Manager ID: "
									+ user.mgrID;
							document.getElementById("username").innerText = "Username: "
									+ user.username;
							document.getElementById("firstname").innerText = "First Name: "
									+ user.firstName;
							document.getElementById("lastname").innerText = "Last Name: "
									+ user.lastName;
							document.getElementById("email").innerText = "email: "
									+ user.email;

						}
					})

}
