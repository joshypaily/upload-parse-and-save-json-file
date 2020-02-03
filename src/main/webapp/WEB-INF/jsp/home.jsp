<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
            
  <h1>Upload json file</h1>
    
    <div class="box">
		<input type="file" 
			value="" name="file-11[]"
			id="uploadedFile" class="inputfile inputfile-1"
			data-multiple-caption="{count} files selected" multiple /> 
		</div>
	<br>					
    <input type="button" value="Submit" id="btnSubmit"/>
    <br>
    <p id="result"></p>



<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script src="resources/js/custom.js"></script>
</div>

</body>
</html>