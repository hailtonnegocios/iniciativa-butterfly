<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
	<!-- start header -->
	<div class="header_bg" id="header">
		<div class="wrap">
			<div id="content">
				<header id="topnav">
					<nav>
						<ul>
							<li class="active"><a class="scroll" href="#home">Home</a></li>
							<li><a class="scroll" href="#ideia">A Ideia</a></li>
							<li><a class="scroll" href="#service">Produtos</a></li>
							<li><a class="scroll" href="#team">Nosso Time</a></li>
							<li><a class="scroll" href="#">Cadastre-se</a></li>
							<li><a class="scroll" href="#contact">Contato</a></li>

						</ul>
					</nav>
					<div class="logo">
						<a href="index.jsp"><img src="<c:url value="/resources/images/logo.png"/>"
							style="width: 40%;"></a>
					</div>
					<a href="#" id="navbtn">Nav Menu</a>
					<div class="clear"></div>
				</header>
				<!-- @end #topnav -->
				<script type="text/javascript" src="<c:url value="/resources/js/menu.js"/>"></script>
			</div>
		</div>
	</div>
