<template>
  <footer id="footer_main">
    <span>&copy;2019 - Simplon|Sarcelles</span>
    <ul class="liste">
      <li>instagram</li>
      <li>facebook</li>
      <li>twitter</li>
    </ul>
  </footer>
</template>

<script>
export default {};
</script>

<style scoped>
#footer_main {
  padding: 10px 20px;
  height: 100px;
  color: aqua;
  background-color:#ffffffa6;
  color: black;
  /*top: 80px;*/
  top: 100px;
  position: relative;
  /*position: absolute;*/
  /*width: 100%;*/
 /*overflow: hidden;*/
}
.liste{
  list-style: none; 
}
@media screen and (min-width:650px ) and (max-width: 1025px){
  #footer_main {
background-color:red;
  }
}
@media screen and (max-width:650px){
  #footer_main {
    background-color:green;
  }
}
</style>
