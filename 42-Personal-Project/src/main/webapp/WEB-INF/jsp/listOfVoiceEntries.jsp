<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section id = "main-content">

<h2> Check out these dope voice entires!</h2>
<table>
<tr>
<td></td><td></td><td></td>
</tr>



</table>


<c:forEach items ="${voiceList}" var="voice">
<table id = "voiceList">
<tr>


<td><div><b id ="firstName">First Name |  </b></div>${voice.firstName}		| </td>
<td><div><b>Last Name | </b></div>${voice.lastName}		| </td>
<td><div><b>Vocal Range </b></div>${voice.voiceRange}</td>
</tr>

</table>


</c:forEach>
</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />