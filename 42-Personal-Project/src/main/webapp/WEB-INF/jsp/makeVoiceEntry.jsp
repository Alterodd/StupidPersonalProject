<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">
<form action="makeVoiceEntry" method="POST">
<div>
<label>First Name</label>
<input type="text" name="firstName">
</div>
<div>
<label>Last Name</label>
<input type="text" name="lastName">
</div>
<div>
<label>Vocal Range</label>
<input type="radio" name="voiceRange" value="Bass"> Bass
<input type="radio" name="voiceRange" value="Baritone"> Baritone
<input type="radio" name="voiceRange" value="Tenor"> Tenor
<input type="radio" name="voiceRange" value="Alto"> Bass
<input type="radio" name="voiceRange" value="Soprano"> Soprano
<input type="radio" name="voiceRange" value="Castrati"> Castrati
</div>
<br>
<input name = "submit" id="submit" type="submit" value="Submit" style="margin-left: 350px;">

</form>



</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />