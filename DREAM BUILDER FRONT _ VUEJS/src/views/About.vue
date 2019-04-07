<template>
  <div id="about" class="page about">
    
      <img src="@/assets/img/gentledreamer.jpg" class="dream_wallpaper" alt="dream ">
      <div class="text">
        <h2 class="slogan">Dream builder for you, for us, for everybody !</h2>
        <p class="speech">
              Dream builder for you, for us, for everybody !
              This website was made in order to allow manga 
              fans to get in touch. Lots of us want to create 
              manga or anime projects, but can't because 
              they don't know how to proceed. Thanks to my 
              website this problem is 
              solved, because it will permit knowledge sharing .
              You could find either some talents people to help 
              you to succeed in your project. <br>
            <br> GOOD LUCK !<br>
            <br>THE ADVENTURE BEGINS NOW ...
          </p> 
        
    </div>
  </div>
</template>


<style lang="scss" scoped>
#about {
  display: flex;
  flex-direction: row;
  width: 100%;
  /*align-items: center;*/
  justify-content: center;
  height: 100vh;
  background-color: #2c3e5091;
  
  
}
.dream_wallpaper{
  /*display: flex;
  flex-direction: column;*/
  width: 50%;
  height: 100%;
  background-color: green;
}
.text{
  /*display: flex;
  flex-direction: column;*/
   width: 50%;
  height: 100%;
  margin-left: 2%;
  font-style: italic;
 
}
.text .slogan{
  font-size: 30px;
   color:white;
}
.text .speech{
  color:white;
  margin-top: 1%;
  //font-size: 20px;
  overflow: hidden; 
  word-wrap: break-word; // forcer le retour a la ligner
  text-overflow: ellipsis; //contenu textuel qui dépasse d'une boîte 
}
.slogan{
  //background-color: aqua;
  background-color: #42b98354;
  color:black;
  font-size:30px;
}
.speech{
  //background-color: yellow;
  background-color: #42b98354;
  color:black;
  font-size:20px;
}
@media screen and (min-width:481px ) and (max-width: 1025px){
  video.bg{display: none;}
  
}

@media screen and (max-width:480px){
    video.bg{display: none;}
    #img img{
    height: 100vh;
    width: 100vw;}
    .text .slogan{
      font-size: 18px;
    }
    .text .speech{
     
      font-size: 12px;
    }

    }
</style>

