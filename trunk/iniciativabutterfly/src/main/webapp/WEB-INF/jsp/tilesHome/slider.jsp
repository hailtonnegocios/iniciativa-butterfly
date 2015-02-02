<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--start-slider---->
	<div class="slider" id="slider">
		<div class="wrap">
			<!---start-da-slider----->
			<div id="da-slider" class="da-slider">
				<div class="da-slide">
					<h2>Iniciativa Butterfly</h2>
					<p>Cadastre-se, é gratuito, aqui você terá todo o apoio para
						entrar no mercado de trabalho de TI</p>
					<a href="#" class="da-link">Saiba Mais</a>
				</div>
				<div class="da-slide">
					<h2>Ambiente Personalizado</h2>
					<p>Tenha um ambiente voltado a seu crescimento profissional</p>
					<a href="#" class="da-link">Saiba Mais</a>
				</div>
				<div class="da-slide">
					<h2>Emprego Garantido</h2>
					<p>Seguindo nosso roteiro de estudos e trabalhando em nossos
						projetos reais, você terá indicações para vagas de trabalho</p>
					<a href="#" class="da-link">Saiba Mais</a>
				</div>
				<nav class="da-arrows">
					<span class="da-arrows-prev"></span> <span class="da-arrows-next"></span>
				</nav>
			</div>
			<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/slider.css"/>" />
			<script type="text/javascript" src="<c:url value="/resources/js/modernizr.custom.28468.js"/>"></script>
			<script type="text/javascript" src="<c:url value="/resources/js/jquery.cslider.js"/>"></script>
			<script type="text/javascript">
				$(function() {

					$('#da-slider').cslider({
						autoplay : true,
						bgincrement : 450
					});

				});
			</script>
			<!---//End-da-slider----->
		</div>
	</div>
