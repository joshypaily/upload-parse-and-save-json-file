$(document).ready(function () {

	
    $("#btnSubmit").click(function (event) {

    
        var file = $('#uploadedFile')[0].files[0];
        ////////////
        var uploadAttachment = new FormData();
    	uploadAttachment.append("file", file);
    	//uploadAttachment.append('jsonFile', JSON.stringify(message));

    	
    	$.ajax({
    		method : 'POST',
    		url : "/upload",
    		data : uploadAttachment,
    		cache : false,
    		contentType : false,
    		processData : false,
    		success : function(data) {
    			  $("#result").html(data);
    		},
    		error : function(xhr, error) {
    			 $("#result").html(e.responseText);
    		}

    	});
        
        

    });
    
    

});
