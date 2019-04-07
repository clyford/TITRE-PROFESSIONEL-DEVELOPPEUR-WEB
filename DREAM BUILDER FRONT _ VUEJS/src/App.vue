<template>
  <div id="app">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    <!-- <Wallpaper /> -->
    <Burger />
    <HeaderMain/>
    <NavMobile />
    <!-- router-view représente toutes les routes de premiers niveaux -->
    <main id="content_main">
      <AppMessage />
      <router-view/>
      
      <video id="videobg" autoplay loop muted class="bg">

            <source src="@/assets/video/Office-Day.mp4" type="video/mp4"> 
            <source src="@/assets/video/Office-Day.webm" type="video/webm">
            
    </video>
    

    </main>
    <FooterMain class="monfooter"/>
  </div>
</template>
<script>
import Burger from "@/components/Burger.vue";
import AppMessage from "@/components/AppMessage.vue";
// import Wallpaper from "@/components/Wallpaper.vue";
import HeaderMain from "@/views/partials/Header.vue";
import NavMobile from "@/views/partials/NavMobile.vue";
import FooterMain from "@/views/partials/Footer.vue";

export default {
  components: {
    AppMessage,
    HeaderMain,
    FooterMain,
    NavMobile,
    Burger,
    // Wallpaper
  }
};
</script>

<style lang="scss">
* {
  margin: 0;
  box-sizing: border-box;
}

a {
  text-decoration: none;
}

body {
  font-size: 16px;
}

.clickable, .btn, .link {
    cursor: pointer;
}

#app {
  
  font-family: 'Montserrat', sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  //color: #2c3e50;
  color:black;
  position: relative;
  height: 100vh;
  // background-color:#ffffff82;
  // background-size: cover;
  /*background-repeat: no-repeat;*/
}

@media screen and (min-width:650px ) and (max-width: 1025px){
  #app {
  background-image: url('./assets/img/img.jpeg')
  }
}

@media screen and (max-width:650px){
    #app {
      background-image: url('./assets/img/ordi.png')
    }
}


#content_main {
  position: relative;
  top: 80px;

}
.page {
  padding: 40px 20px;
  min-height: calc(100vh - (80px + 200px));
}


#videobg {
	width: 100%;
	/*height: 100%;*/
  min-height: 100vh;
	position: fixed;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
	object-fit: cover; /* c'est pour mettre une image de fond c'est l'equivalent de background-size:cover */
	z-index: -1; /* c'est pour jouer avec la profondeur*/
   
}
// .monfooter{
//   height: 100vh;
// }

@media screen and (max-width: 1025px) {
  #videbg {
    display: none;
  }
}

@media screen and (min-width:481px ) and (max-width: 1025px){
  video.bg{display: none;}
  /*#app{background-color: cadetblue;}*/
}

@media screen and (max-width:480px){
    video.bg{display: none;}
    /*#app{background-color: red;}*/

    }
</style>
