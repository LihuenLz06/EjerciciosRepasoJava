//window.jsPDF = window.jspdf.jsPDF;

const slidePage = document.querySelector(".slide-page");
const nextBtnFirst = document.querySelector(".firstNext");
const prevBtnSec = document.querySelector(".prev-1");
const nextBtnSec = document.querySelector(".next-1");
const prevBtnThird = document.querySelector(".prev-2");
const nextBtnThird = document.querySelector(".next-2");
const prevBtnFourth = document.querySelector(".prev-3");
const submitBtn = document.querySelector(".submit");
const progressText = document.querySelectorAll(".step p");
const progressCheck = document.querySelectorAll(".step .check");
const bullet = document.querySelectorAll(".step .bullet");
let paginaActual = 1;

nextBtnFirst.addEventListener("click", function(event){ //Se agrega un "event listener" al botón nextBtnFirst que escucha el evento de "click". Cuando se hace clic en el botón, se ejecutará la función de callback que sigue.
  event.preventDefault(); //Se llama al método preventDefault() del objeto event para evitar que la página se recargue después de hacer clic en el botón. Esto se hace para evitar comportamientos inesperados que puedan ocurrir cuando se hace clic en el botón.
  slidePage.style.marginLeft = "-25%";//Se establece el estilo marginLeft del elemento slidePage en "-25%". Esto se hace para mover el contenedor que contiene las páginas del formulario hacia la izquierda, mostrando la siguiente página.
  bullet[paginaActual - 1].classList.add("active");//Se agrega la clase "active" al elemento del marcador (bullet) correspondiente a la página actual (paginaActual). Esto se hace para resaltar el marcador de la página actual.
  progressCheck[paginaActual - 1].classList.add("active");//Se agrega la clase "active" al elemento del progreso (progressCheck) correspondiente a la página actual (paginaActual). Esto se hace para resaltar el progreso de la página actual.
  progressText[paginaActual - 1].classList.add("active");//Se agrega la clase "active" al elemento del texto de progreso (progressText) correspondiente a la página actual (paginaActual). Esto se hace para resaltar el texto de progreso de la página actual.
  paginaActual += 1;//Se incrementa el valor de la variable paginaActual en 1 para que se pueda mostrar la siguiente página en el siguiente evento de "click".
});
nextBtnSec.addEventListener("click", function(event){
  event.preventDefault();
  slidePage.style.marginLeft = "-50%";
  bullet[paginaActual - 1].classList.add("active");
  progressCheck[paginaActual - 1].classList.add("active");
  progressText[paginaActual - 1].classList.add("active");
  paginaActual += 1;
});
nextBtnThird.addEventListener("click", function(event){
  event.preventDefault();
  slidePage.style.marginLeft = "-75%";
  bullet[paginaActual - 1].classList.add("active");
  progressCheck[paginaActual - 1].classList.add("active");
  progressText[paginaActual - 1].classList.add("active");
  paginaActual += 1;
});
submitBtn.addEventListener("click", function(){ //Se agrega un "event listener" al botón submitBtn que escucha el evento de "click". Cuando se hace clic en el botón, se ejecutará la función de callback que sigue.
  bullet[paginaActual - 1].classList.add("active");//Se agrega la clase "active" al elemento del marcador (bullet) correspondiente a la página actual (paginaActual). Esto se hace para resaltar el marcador de la página actual.
  progressCheck[paginaActual - 1].classList.add("active");//Se agrega la clase "active" al elemento del progreso (progressCheck) correspondiente a la página actual (paginaActual). Esto se hace para resaltar el progreso de la página actual.
  progressText[paginaActual - 1].classList.add("active");//Se agrega la clase "active" al elemento del texto de progreso (progressText) correspondiente a la página actual (paginaActual). Esto se hace para resaltar el texto de progreso de la página actual.
  paginaActual += 1;//Se incrementa el valor de la variable paginaActual en 1 para que se pueda mostrar la siguiente página en el siguiente evento de "click".
  setTimeout(function(){ //Se llama a la función setTimeout que permite la ejecución de una función después de un cierto tiempo en milisegundos.
    alert("Your Form Successfully Signed up");//Dentro de la función setTimeout, se llama a la función alert() para mostrar un mensaje de alerta que indica que el formulario se ha enviado correctamente.
    location.reload();//Luego de cerrar la alerta, se recarga la página actual utilizando el método location.reload() para mostrar una página vacía. Esto es opcional y se utiliza para permitir al usuario enviar múltiples formularios en la misma página sin tener que recargar la página manualmente.
  },800);
});

prevBtnSec.addEventListener("click", function(event){
  event.preventDefault();
  slidePage.style.marginLeft = "0%";
  bullet[paginaActual - 2].classList.remove("active");
  progressCheck[paginaActual - 2].classList.remove("active");
  progressText[paginaActual - 2].classList.remove("active");
  paginaActual -= 1;
});
prevBtnThird.addEventListener("click", function(event){
  event.preventDefault();
  slidePage.style.marginLeft = "-25%";
  bullet[paginaActual - 2].classList.remove("active");
  progressCheck[paginaActual - 2].classList.remove("active");
  progressText[paginaActual - 2].classList.remove("active");
  paginaActual -= 1;
});
prevBtnFourth.addEventListener("click", function(event){
  event.preventDefault();
  slidePage.style.marginLeft = "-50%";
  bullet[paginaActual - 2].classList.remove("active");
  progressCheck[paginaActual - 2].classList.remove("active");
  progressText[paginaActual - 2].classList.remove("active");
  paginaActual -= 1;
});

document.getElementById("enviar").addEventListener("click", function() {
  let nombre = document.getElementById("nombre").value;
  let apellido = document.getElementById("apellido").value;
  let email = document.getElementById("email").value;
  let telefono = document.getElementById("telefono").value;
  let nacimiento = document.getElementById("nacimiento").value;
  let edad = document.getElementById("edad").value;
  let usuario = document.getElementById("usuario").value;
  let contraseña = document.getElementById("contraseña").value;
});
  // genera el archivo PDF
  
  /*var doc = new jsPDF("Definido");
  doc.text(10, 10,"Nombre: " + nombre);
  doc.text(10, 20,"Apellido: " + apellido);
  doc.text(10, 30,"Email: " + email);
  doc.text(10, 40,"Número de telefono: " + telefono);
  doc.text(10, 50,"Fecha de nacimiento: " + nacimiento);
  doc.text(10, 60,"Edad: " + edad);
  doc.text(10, 70,"Usuario: " + usuario);
  doc.text(10, 80,"Contraseña: " + contraseña);
  doc.save("datos.pdf");
});*/