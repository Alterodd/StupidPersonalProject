/// <reference path="../jquery-3.1.1.js" />
/// <reference path="../jquery.validate.js" />

$(document).ready(function () {
	
	$("#voiceForm").validate({
		
		debug: false,
		rules: { 
			firstName: { 
				required: true,
				lettersonly: true
			},
			lastName: {
				required: true,
				lettersonly: true,
			},
			
		},
		
		 messages: {
			 
			 firstName: { 
				 required: "Please enter a first name"
			 },
			lastName: { 
				required: "Please enter a last name"
			}
		
		 }

	});
$.validator.addMethod("lettersonly", function(value, index) 
			{
			return this.optional(index) || /^[a-z ]+$/i.test(value);
			}, "Please do not enter any special characters or numbers");		
		

	
	
	
	
});