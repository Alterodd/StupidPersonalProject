/// <reference path="../jquery-3.1.1.js" />
/// <reference path="../jquery.validate.js" />
$(document).ready(function () {
	
	$("#voiceEntry").validate({
		
		debug: false,
		rules: { 
			firstName: { 
				required: true,
				minlength: 8,
				maxlength: 8
			},
			lastName: {
				required: true,
				minlength: 8,
				maxlength: 8
			}	
		},
		
		 messages: {
			 
			 firstName: { 
				 required: "Please enter a first name",
			 },
			lastName: { 
				required: "Please enter a last name",
			}
		
		 }

	
	});
	
	
});