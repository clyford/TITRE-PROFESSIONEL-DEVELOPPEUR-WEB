<template>
  <section id="home" class="page home">
    <h1 class="slogan">WE CAN MAKE YOUR DREAM COME TRUE</h1>
    <h2 class="secong_slogan">Share yours skills with us</h2>
     <img id="logo" src="@/assets/img/japon.png" alt="logo de mon super projet">
    <!---<p>
      upload file java =>
      https://www.youtube.com/watch?v=y_ER3xlMFpE
    </p>--->
  </section> 
</template>

<script>
// @ is an alias to /src

export default {
  name: 'home',
  components: {
  }
}
</script>

<style lang="scss" scoped>
#home{
 background-color:#ffffff82;
  height: 100vh;
  
}
section{
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  height: 100%;
}
#logo{
  width: 50%;
  height: 50%;
 
}

@media screen and (min-width:481px ) and (max-width: 1025px){
  #logo{
  width: 40vw;
  height: 40vh;
  /*background-color:green;*/
}
  
  /*#app{background-color: cadetblue;}*/
}

@media screen and (max-width:480px){
    #logo{
  width: 10vw;
  height: 10vh;
  /*background-color: yellow;*/
}

    }
</style>