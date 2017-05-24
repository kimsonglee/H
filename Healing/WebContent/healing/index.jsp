<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Site made with Mobirise Website Builder v3.8.1, https://mobirise.com -->
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="generator" content="Mobirise v3.8.1, mobirise.com">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href="assets/images/logo.png"
	type="image/x-icon">
<meta name="description" content="">

<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic&amp;subset=latin">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Montserrat:400,700">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i">
<link rel="stylesheet"
	href="/Healing/assets/et-line-font-plugin/style.css">
<link rel="stylesheet"
	href="/Healing/assets/bootstrap-material-design-font/css/material.css">
<link rel="stylesheet" href="/Healing/assets/tether/tether.min.css">
<link rel="stylesheet"
	href="/Healing/assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="/Healing/assets/socicon/css/socicon.min.css">
<link rel="stylesheet"
	href="/Healing/assets/animate.css/animate.min.css">
<link rel="stylesheet" href="/Healing/assets/dropdown/css/style.css">
<link rel="stylesheet" href="/Healing/assets/theme/css/style.css">
<link rel="stylesheet" href="/Healing/assets/mobirise-gallery/style.css">
<link rel="stylesheet"
	href="/Healing/assets/mobirise/css/mbr-additional.css" type="text/css">



</head>
<body>
	<section
		class="mbr-section mbr-section-hero mbr-section-full mbr-parallax-background mbr-section-with-arrow"
		id="header1-1" style="background-image: url(/Healing/img/main.jpg);">



	<div class="mbr-table-cell">
		<div class="container">
			<button class="navbar-toggler pull-xs-right hidden-md-up"
				type="button" data-toggle="collapse"
				data-target="#exCollapsingNavbar">
				<div class="hamburger-icon"></div>
			</button>

			<ul
				class="nav-dropdown collapse pull-xs-right nav navbar-nav navbar-toggleable-sm"
				id="exCollapsingNavbar">
				<li class="nav-item"><a class="nav-link link" href="#">Music</a></li>
				<li class="nav-item nav-btn"><a
					class="nav-link btn btn-white btn-white-outline"
					href="/Healing/index?path=login">LOGIN</a></li>
			</ul>
			<button hidden="" class="navbar-toggler navbar-close" type="button"
				data-toggle="collapse" data-target="#exCollapsingNavbar">
				<div class="close-icon"></div>
			</button>
		</div>

		<div class="container">
			<c:choose>
				<c:when test="${include.equals(\"main\") }">
					<jsp:include page="main.jsp" />
				</c:when>
				<c:when test="${include.equals(\"coloring\") }">
					<jsp:include page="coloring.jsp" />
				</c:when>
				<c:when test="${include.equals(\"login\") }">
					<jsp:include page="login.jsp" />
				</c:when>
				<c:when test="${include.equals(\"join\") }">
					<jsp:include page="join.jsp" />
				</c:when>
				<c:when test="${include.equals(\"joincheck\") }">
					<jsp:include page="joinCheck.jsp" />
				</c:when>
				<c:when test="${include.equals(\"anonymous\") }">
					<jsp:include page="board.jsp" />
				</c:when>
				<c:when test="${include.equals(\"recommend\") }">
					<jsp:include page="board.jsp" />
				</c:when>
				<c:when test="${include.equals(\"counseling\") }">
					<jsp:include page="counseling.jsp" />
				</c:when>
				<c:when test="${include.equals(\"testing\") }">
					<jsp:include page="testing.jsp" />
				</c:when>
				<c:when test="${include.equals(\"music\") }">
					<jsp:include page="music.jsp" />
				</c:when>
				<c:otherwise>
					<jsp:include page="main.jsp" />
				</c:otherwise>
			</c:choose>



			<div class="mbr-section-btn">
				<a class="btn btn-lg btn-white btn-white-outline"
					href="/Healing/index?path=coloring">Coloring</a> <a
					class="btn btn-lg btn-white btn-white-outline"
					href="/Healing/index?path=anonymous">Anonymous</a> <a
					class="btn btn-lg btn-white btn-white-outline"
					href="/Healing/index?path=recommend">Recommend</a> <a
					class="btn btn-lg btn-white btn-white-outline"
					href="/Healing/index?path=counseling">Counseling</a> <a
					class="btn btn-lg btn-white btn-white-outline"
					href="/Healing/index?path=testing">Testing</a> <a
					class="btn btn-lg btn-white btn-white-outline"
					href="/Healing/index?path=music">Music</a>
			</div>

		</div>
	</div>


	</section>

	<script src="/Healing/assets/web/assets/jquery/jquery.min.js"></script>
	<script src="/Healing/assets/tether/tether.min.js"></script>
	<script src="/Healing/assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="/Healing/assets/smooth-scroll/SmoothScroll.js"></script>
	<script src="/Healing/assets/viewportChecker/jquery.viewportchecker.js"></script>
	<script src="/Healing/assets/dropdown/js/script.min.js"></script>
	<script src="/Healing/assets/touchSwipe/jquery.touchSwipe.min.js"></script>
	<script src="/Healing/assets/jarallax/jarallax.js"></script>
	<script src="/Healing/assets/masonry/masonry.pkgd.min.js"></script>
	<script src="/Healing/assets/imagesloaded/imagesloaded.pkgd.min.js"></script>
	<script
		src="/Healing/assets/bootstrap-carousel-swipe/bootstrap-carousel-swipe.js"></script>
	<script src="/Healing/assets/theme/js/script.js"></script>
	<script src="/Healing/assets/mobirise-gallery/script.js"></script>


	<input name="animation" type="hidden">
</body>
</html>
