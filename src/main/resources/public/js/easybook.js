var kind=["Business","Computer","Education","History","Medicine","Philosophy","Politics","Psychology","Science"];
var book={id:1,name:"thinking in java",quantity:10,price:" 8 points"};
function bookdisplay(){
  var x;
  var txt="";
  for(x in book){
    txt += book[x];
  }
  document.getElementById("bookdisplay").innerHTML=txt;
}
function buildCatogory(){
  var txt = "";
  for(var i=0;i<kind.length;i++){
    txt += "<li>"+kind[i]+"</li>";
  }
  document.getElementById("catogory").innerHTML="<ul>"+txt+"</ul>";
}

$(function(){
  $('.tab-panels .tabs li').on('click',function(){
    var active = $('.tab-panels .tabs li.active').attr('rel');
    $('#'+active).slideUp(300);
    $('.tab-panels .tabs li.active').removeClass('active');
    $(this).addClass('active');
    active = $('.tab-panels .tabs li.active').attr('rel');
    $('#'+active).slideDown(300);


  });


});

$(function(){

  //configuration
  var width = 1200;
  var animationSpeed = 3000;
  var pause = 1000;
  var currentslide = 1;

  var $slider = $('#slider');
  var $slideContainer = $slider.find('.slides');
  var $slides = $slideContainer.find('.slide');
  var interval;
  //setInterval
function startSlider(){
  interval = setInterval(function(){
    $slideContainer.animate({'margin-left':'-='+width},animationSpeed,function(){
      currentslide++;
      if(currentslide ===$slides.length){
        currentslide = 1;
        $slideContainer.css('margin-left',0);
      }
    });
  },pause);
}
function pauseSlider(){
  clearInterval(interval);
}
  $slider.mouseenter(pauseSlider());
  $slider.mouseleave(startSlider());

});

function validateEmail()
{
var x=document.getElementsByName('email').value;
var y=document.getElementsByName('email2').value;
var atpos=x.indexOf("@");
var dotpos=x.lastIndexOf(".");
var atpos2=y.indexOf("@");
var dotpos2=y.lastIndexOf(".");
if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length)
  {
    document.getElementById("alerte").innerHTML="Sorry, this is an invalid email";
  }
  else{
    document.getElementById("alerte").innerHTML="";
  }
if (atpos2<1 || dotpos2<atpos2+2 || dotpos2+2>=y.length)
  {
    document.getElementById("alerte2").innerHTML="Sorry, this is an invalid email";
  }
  else{
    document.getElementById("alerte2").innerHTML="";
  }
}

function validateForm()
{
var x=document.getElementsByName('password').value;
var y=document.getElementsByName('password2').value;
if (x===null || x==="")
  {
    document.getElementById("alertp").innerHTML="Password must not be null";
  }
  else{
    document.getElementById("alertp").innerHTML="";
  }
if (y===null || y==="")
  {
    document.getElementById("alertp2").innerHTML="Password must not be null";
  }
  else{
    document.getElementById("alertp2").innerHTML="Password must not be null";
  }
}
