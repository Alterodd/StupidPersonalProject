<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section id = "main-content">

<h2> Check out these dope voice entries!</h2>

<c:forEach items ="${voiceList}" var="voice">
 <div>

<table id = "voiceList" class ="table table-bordered table-striped">

<tbody>
<tr>


<td><div><b id ="firstName">First Name |  </b></div>${voice.firstName}		| </td>
<td><div><b>Last Name | </b></div>${voice.lastName}		| </td>
<td><div><b>Vocal Range </b></div>${voice.voiceRange}</td>
</tr>
</tbody>
</table>
</div>

</c:forEach>
</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />