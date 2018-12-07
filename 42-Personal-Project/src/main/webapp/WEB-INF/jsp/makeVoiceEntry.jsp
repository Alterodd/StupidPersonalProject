<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">
<form id = "voiceForm" action="makeVoiceEntry" method="POST" novalidate ="novalidate">
<div>
<label>First Name</label>
<input type="text" name="firstName" id = "firstName" placeholder="Johnny">
</div>
<div>
<label>Last Name</label>
<input type="text" name="lastName" id = "lastName" placeholder="Hammersticks">
</div>
<div>
<label>Vocal Range</label>
<input id = "radio" type="radio" name="voiceRange" value="Bass"> Bass
<input id = "radio" type="radio" name="voiceRange" value="Baritone"> Baritone
<input id = "radio" type="radio" name="voiceRange" value="Tenor"> Tenor
<input id = "radio" type="radio" name="voiceRange" value="Alto"> Alto
<input id = "radio" type="radio" name="voiceRange" value="Soprano"> Soprano
<input id = "radio" type="radio" name="voiceRange" value="Castrati"> Castrati
</div>
<br>
<input name = "submit" id="submit" type="submit" value="Submit" style="margin-left: 350px;">

</form>



</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />