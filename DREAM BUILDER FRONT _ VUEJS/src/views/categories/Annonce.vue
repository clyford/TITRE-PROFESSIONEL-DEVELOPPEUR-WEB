<template>
  <div id="page" class="page mangaArtist" >
    <!-- <h2>Annonce</h2>   
        <section class="photo">
        <article>
        <figure> -->
        <!--<a href="#profil" class="nom">PIERRE HENRY<img src="asset/img/profil/kanye.jpg" alt="photo de profil" role="img"></a>-->
         <!----------------------------rajouter srcset----------------------------------------------------------------------------------------------> 
        <!-- <figcaption class="txt" aria-describedby="info"><h2 class="firstname">Eckichi</h2><h2 class="name">Blabav</h2></figcaption>
        <h4>PARIS</h4>
        <h4>27 ans</h4>
        <p>"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?"</p>
        </figure>
        
        </article>
        </section> -->
 <!-- <ul class="list" >
        <li>{{article.ville}}</li>
        <li>{{article.metier}}</li>
        <li>{{article.texte}}</li>
</ul> -->

     <!-- <label for="city" class="clickable label">VILLE: {{article.ville}}</label> -->
    <!-- <input id="city" class="input" type="text" v-model="article.ville"> -->

    <!-- <label for="job" class="clickable label">Metier : {{article.metier}}</label> -->
    <!-- <input id="job" class="input" type="text" v-model="article.metier"> -->

<!-- 
   <label for="texte" class="clickable label">Content: {{article.texte}} </label> -->
    <!-- <textarea id="texte" class="textarea" v-model="article.texte"></textarea> -->

    <tbody class="body">
      <ul class="row" v-for="(article, n) in articles" :key="n" :id="`article_${article.id}`">
        <li class="cell" v-for="(val, prop) in article" :key="prop">{{ val }}</li>

        <!-- <li class="cell">
          <input
           
      
            :value="Number(`${article.id}`)"
            
          >
        </li> -->
        <!-- <td class="cell">
          <input
            :value="Number(`${article.id}`)"
            
          >
        </td> -->
      </ul>
    </tbody>
  </div>
</template>
<style  lang="scss" scoped >
#page{
  height: 100vh;
  width: 100%;
  background-color:#ffffff82;
  // background-color: green;

}

.body ul {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  align-items: flex-start;
  flex-wrap: wrap;
//  background-color:#42b98394;
 background-color:grey;
//  color: #81c0ff;
 height: auto;
 list-style: none;
 margin: 1px;



}
</style>

<script>
// @ is an alias to /src

import axios from "axios";
// import { Script } from 'vm';
export default {
  // data(){
  //   return{
  //     article:{
  //       ville:"",
  //       metier:"",
  //       texte:""
  //     }
  //     // article :{}
  //   }
  // },
  // methods:{
    
  // },
  //   mounted(){
  //     console.log(" it's oaky for you")
  //     axios.get("http://localhost:9999/api/annonce",this.article,
  // ).then(Response=>{
  //       console.log("cool guy",this.article=Response.data);
  //     }).catch(err=>{
  //       console.log("hey something is missing dude", err)
      
  //     });
  //   }

// beforeCreate() {
//     this.$store.dispatch("articles/annonce");
//   },
  data() {
    return {
      articles:{}
      
    };
  },
  // computed: {
  //   articles() {
  //     return this.$store.getters["articles/annonce"];
  //   }
  // },
  mounted() {
      axios
        .get("/annonce")
        .then(res => {
          console.log(res)
          this.articles = res.data
        })
        .catch(err => {
          console.error("baaad", err);
        });
        
  },
}


</script>