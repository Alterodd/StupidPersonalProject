<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section id = "main-content">

<h2> Check out these dope voice entires!</h2>



<c:forEach items ="${voiceList}" var="voice">

<br>
<div> ${voice.firstName}</div>
<div> ${voice.lastName}</div>
<div> ${voice.voiceRange}</div>

</c:forEach>
</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />