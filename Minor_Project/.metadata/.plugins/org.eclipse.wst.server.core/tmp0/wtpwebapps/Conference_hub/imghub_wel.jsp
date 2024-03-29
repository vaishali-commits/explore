<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Image Hub</title>
<link rel="stylesheet" type="text/css" href="hp.css"/>
<style>
body {
  font-family: Verdana, sans-serif;
  margin: 0;
}

* {
  box-sizing: border-box;
}

.row > .column {
  padding: 0 8px;
}

.row:after {
  content: "";
  display: table;
  clear: both;
}

.column {
  float: left;
  width: 25%;
}

/* The Modal (background) */
.modal {
  display: none;
  position: fixed;
  z-index: 1;
  padding-top: 100px;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  overflow: auto;
  background-color: black;
}

/* Modal Content */
.modal-content {
  position: relative;
  background-color: #fefefe;
  margin: auto;
  padding: 0;
  width: 90%;
  max-width: 1200px;
}

/* The Close Button */
.close {
  color: white;
  position: absolute;
  top: 10px;
  right: 25px;
  font-size: 35px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: #999;
  text-decoration: none;
  cursor: pointer;
}

.mySlides {
  display: none;
}

.cursor {
  cursor: pointer
}

/* Next & previous buttons */
.prev,
.next {
  cursor: pointer;
  position: absolute;
  top: 50%;
  width: auto;
  padding: 16px;
  margin-top: -10px;
  color: white;
  font-weight: bold;
  font-size: 20px;
  transition: 0.6s ease;
  border-radius: 0 3px 3px 0;
  user-select: none;
  -webkit-user-select: none;
}

/* Position the "next button" to the right */
.next {
  right: 0;
  border-radius: 3px 0 0 3px;
}
.prev {
  left: 0;
  border-radius: 3px 0 0 3px;
}

/* On hover, add a black background color with a little bit see-through */
.prev:hover,
.next:hover {
  background-color: rgba(0, 0, 0, 0.8);
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

img {
  margin-bottom: -4px;
}

.caption-container {
  text-align: center;
  background-color: black;
  padding: 2px 16px;
  color: white;
}

.demo {
  opacity: 0.6;
}

.active,
.demo:hover {
  opacity: 1;
}

img.hover-shadow {
  transition: 0.3s
}

.hover-shadow:hover {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19)
}
</style>
</head>
<body>
<center>
<div style="font-size:140%;font-family:Comic Sans MS;">
<header>
<section><a href="welcomeAdmin.jsp"><img src="back.png"></a></section><h1>Image Hub</h1>
</header>

<div class="row">
  <div class="column">
    <img src="g1.jpg" style="width:100%" onclick="openModal();currentSlide(1)" class="hover-shadow cursor">
  </div>
  <div class="column">
    <img src="g2.jpg" style="width:100%" onclick="openModal();currentSlide(2)" class="hover-shadow cursor">
  </div>
  <div class="column">
    <img src="g3.gif" style="width:100%" onclick="openModal();currentSlide(3)" class="hover-shadow cursor">
  </div>
  <div class="column">
    <img src="g4.jpg" style="width:100%" onclick="openModal();currentSlide(4)" class="hover-shadow cursor">
  </div>
  <div class="column">
    <img src="g5.jpg" style="width:100%" onclick="openModal();currentSlide(5)" class="hover-shadow cursor">
  </div>
  <div class="column">
    <img src="g6.jpg" style="width:100%" onclick="openModal();currentSlide(6)" class="hover-shadow cursor">
  </div>
  <div class="column">
    <img src="g7.jpg" style="width:100%" onclick="openModal();currentSlide(7)" class="hover-shadow cursor">
  </div>
  <div class="column">
    <img src="g8.jpg" style="width:100%" onclick="openModal();currentSlide(8)" class="hover-shadow cursor">
  </div>
  <div class="column">
    <img src="g9.jpg" style="width:100%" onclick="openModal();currentSlide(9)" class="hover-shadow cursor">
  </div>
  <div class="column">
    <img src="g10.jpg" style="width:100%" onclick="openModal();currentSlide(10)" class="hover-shadow cursor">
  </div>
</div>

<div id="myModal" class="modal">
  <span class="close cursor" onclick="closeModal()">&times;</span>
  <div class="modal-content">

    <div class="mySlides">
      <div class="numbertext">1 / 10</div>
      <img src="g1.jpg" style="width:100%">
    </div>

    <div class="mySlides">
      <div class="numbertext">2 / 10</div>
      <img src="g2.jpg" style="width:100%">
    </div>

    <div class="mySlides">
      <div class="numbertext">3 / 10</div>
      <img src="g3.gif" style="width:100%">
    </div>
    
    <div class="mySlides">
      <div class="numbertext">4 / 10</div>
      <img src="g4.jpg" style="width:100%">
    </div>
    
	<div class="mySlides">
      <div class="numbertext">5 / 10</div>
      <img src="g5.jpg" style="width:100%">
    </div>
	<div class="mySlides">
      <div class="numbertext">6 / 10</div>
      <img src="g6.jpg" style="width:100%">
    </div>
	<div class="mySlides">
      <div class="numbertext">7 / 10</div>
      <img src="g7.jpg" style="width:100%">
    </div>
	<div class="mySlides">
      <div class="numbertext">8 / 10</div>
      <img src="g8.jpg" style="width:100%">
    </div>
	<div class="mySlides">
      <div class="numbertext">9 / 10</div>
      <img src="g9.jpg" style="width:100%">
    </div>
	<div class="mySlides">
      <div class="numbertext">10 / 10</div>
      <img src="g10.jpg" style="width:100%">
    </div>
	
    <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
    <a class="next" onclick="plusSlides(1)">&#10095;</a>

    <div class="caption-container">
      <p id="caption"></p>
    </div>


    <div class="column">
      <img class="demo cursor" src="g1.jpg" style="width:100%" onclick="currentSlide(1)" alt="Smarter Cities">
    </div>
    <div class="column">
      <img class="demo cursor" src="g2.jpg" style="width:100%" onclick="currentSlide(2)" alt="Wine Tourism">
    </div>
    <div class="column">
      <img class="demo cursor" src="g3.gif" style="width:100%" onclick="currentSlide(3)" alt="Indian Culture">
    </div>
    <div class="column">
      <img class="demo cursor" src="g4.jpg" style="width:100%" onclick="currentSlide(4)" alt="Playback Theatre">
    </div>
	<div class="column">
      <img class="demo cursor" src="g5.jpg" style="width:100%" onclick="currentSlide(5)" alt="ICT 2015">
    </div>
	<div class="column">
      <img class="demo cursor" src="g6.jpg" style="width:100%" onclick="currentSlide(6)" alt="CCAI">
    </div>
	<div class="column">
      <img class="demo cursor" src="g7.jpg" style="width:100%" onclick="currentSlide(7)" alt="TOURISM FOR PEACE & DEVELOPMENT ">
    </div>
	<div class="column">
      <img class="demo cursor" src="g8.jpg" style="width:100%" onclick="currentSlide(8)" alt="HALAL TOURISM ">
    </div>
	<div class="column">
      <img class="demo cursor" src="g9.jpg" style="width:100%" onclick="currentSlide(9)" alt="HAWAI TOURISM">
    </div>
	<div class="column">
      <img class="demo cursor" src="g10.jpg" style="width:100%" onclick="currentSlide(10)" alt="UNESCO-APIED">
    </div>
  </div>
</div>

<script>
function openModal() {
  document.getElementById('myModal').style.display = "block";
}

function closeModal() {
  document.getElementById('myModal').style.display = "none";
}

var slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
  showSlides(slideIndex += n);
}

function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("demo");
  var captionText = document.getElementById("caption");
  if (n > slides.length) {slideIndex = 1}
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";
  dots[slideIndex-1].className += " active";
  captionText.innerHTML = dots[slideIndex-1].alt;
}
</script>
</div>
</center>
<br/>
<footer>
Conference Hub
</footer>
</body>
</html>