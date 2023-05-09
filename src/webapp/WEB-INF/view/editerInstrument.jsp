<%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Modifier un Instrument</title>
</head>
<body>
<div class="container">
<div class="card-body">
<form action="updateInstrument" method="post">
<div class="form-group">
<label class="control-label">ID Instruments :</label>
<input type="text" name="idInstrument" value="${Instrument.idInstrument}"
readonly class="form-control"/>
</div>
<div class="form-group">
<label class="control-label">Nom Instruments :</label>
<input type="text" name="nomInstrument" value="${Instrument.nomInstrument}"
class="form-control"/>
</div>
<div class="form-group">
<label class="control-label">Prix Instruments :</label>
<input type="text" name="prixInstrument" value="${Instrument.prixInstrument}"
class="form-control"/>
</div>
<div class="form-group">
<label class="control-label"> Date cr�ation :</label>
<fmt:formatDate pattern="yyyy-MM-dd" value="${Instrument.dateCreation}"
var="formatDate" />
<input type="date" name="date" value="${formatDate}" class="formcontrol"/>
</div>
<div>
<button type="submit" class="btn btn-primary">Modifier</button>
</div>
</form>
</div>
<br/>
<br/>
<a href="ListeInstruments">Liste Instruments</a>
</div>
</body>
</html>