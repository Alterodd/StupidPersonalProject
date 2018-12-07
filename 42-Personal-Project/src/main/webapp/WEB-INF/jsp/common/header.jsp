<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>
	Voice Ranges Woop Woop!
	</title>
	<c:url value="/css/voices.css" var="cssHref" />
	 <link rel="stylesheet" href="${cssHref}">
	
	
	<!-- Bootstrap -- -- -- -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<!-- -- -- -- -- -- -- --!>
	
	
	
	
	<!--  -->
    <script src="/42-Personal-Project/js/jquery-3.1.1.js"></script>
    <script src="/42-Personal-Project/js/jquery.validate.js"></script>
	<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.15.0/additional-methods.min.js"></script>
	
	<script src = "/42-Personal-Project/js/personalprojectvalidation.js"></script>
	
	
</head>
<body>
<header>





<c:url var="otherStupidImage" value="/img/smallnote.png"/>

<c:url var="bigCodeLogo" value = "/img/BigCodeLogo.png"/>
<div style="position: relative;"><img style="height:10%; width:10%;" src="${otherStupidImage}"/><img style="height:10%; width:10%;" src="${otherStupidImage}"/><img style="height:10%; width:10%;" src="${otherStupidImage}"/><img style="height:10%; width:10%;" src="${otherStupidImage}"/><img style="height:10%; width:10%;" src="${otherStupidImage}"/><img style="height:10%; width:10%;" src="${otherStupidImage}"/><img style="height:10%; width:10%;" src="${otherStupidImage}"/><img style="height:10%; width:10%;" src="${otherStupidImage}"/><img style="height:10%; width:10%;" src="${otherStupidImage}"/><img style="height:10%; width:10%;" src="${otherStupidImage}"/></div>
</header>

 <div id="nav-menu">
              	<ul style="list-style: none;">
              	<li id = "menuList"><a href="menuList">Main Menu </a></li>
              	<li id = "voicesList"><a href="listOfVoiceEntries">See Voice Entries</a></li>
              	<li id = "forum"><a href="makeVoiceEntry">Make An Entry To The Forum</a>
              	
              	
              	</ul>
              	
              	</div>
