<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Iniciativa Butterfly</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600'
	rel='stylesheet' type='text/css'>
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet"
	type="text/css" media="all" />

<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/magnific-popup.css"/>">
<script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
</head>
<body>

	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="slider" />
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />


</body>
</html>