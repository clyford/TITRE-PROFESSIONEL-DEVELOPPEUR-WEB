<template>
  <form id="register" @submit="$event.preventDefault();checkForm();">

    <!-- <label for="login" class="label">Your login</label>
    <input id="login" type="text" class="input" required v-model="user.login" > -->

    <label for="lastname" class="label">Your lastname</label>
    <input id="lastname" type="text" class="input" required v-model="user.prenom" >
    
    <label for="name" class="label">Your firstname</label>
    <input id="name" type="text" class="input" required v-model="user.nom" >

     <!-- <label for="article" class="clickable label">Annonce</label>
    <input id="article" class="input" type="text" v-model="article.id"> -->

    <label for="metier" class="label">Choisi un metier</label>
    <select name="metier" id="metier"  required v-model="user.metiers">
      <option value="MangaArtist">MangaArtist</option>
      <option value="StoryBoarder">StoryBoarder</option>
      <option value="Ecrivain">Ecrivain</option>
    </select>
    <!-- <input id="work" type="" class="input" required v-model="user.metiers"> -->
    
    <label for="email" class="label">Pick an email</label>
    <input id="email" type="email" class="input" required v-model="user.email" >
    
    <label for="password" class="label">Choose a password</label>
    <div class="wrap">
      <input ref="initial" id="password" type="password" class="input" required v-model="user.password" >
      <i class="icon clickable fa fa-eye-slash" @click="toggleEyeIcon($event, 'initial')"></i>
    </div>

    <label for="pass_confirm" class="label">Please confirm password</label>
    <div class="wrap">
      <input ref="confirm" id="pass_confirm" type="password" class="input" required value="">
      <i class="icon clickable fa fa-eye-slash" @click="toggleEyeIcon($event, 'confirm')"></i>
    </div>

    <!-- <label for="pass_confirm" class="label">Please confirm password</label>
    <div class="wrap">
      <input ref="confirm" id="pass_confirm" type="password" class="input" required value="123Soleil" v-model="user.passwordTwo">
      <i class="icon clickable fa fa-eye-slash" @click="toggleEyeIcon($event, 'confirm')"></i>
    </div> -->

    <button class="btn"  id="contact-submit" @click="handleSubmit">ok</button>
  </form>
</template>

<script>
import axios from "axios";
export default {
  data() {
    return {
      user: {
        prenom: " ",
        nom: " ",

        // article:[],

        metiers:"",
        email: " ",
        password: " ",
        
        is_admin: false
      }
    };
  },
  methods: {

    
    /************************************************************************************************************************************** */
    checkAllFields() {
        const tester = (accu, val) => { // parse each val
            accu += !val ? 1 : 0; // if val falsy => increment accu
            return accu; // returns new value of accu
        };
        // get all user val as an array
        const userInfos = Object.values(this.user);
        // reduc ethis array !!! accumulator starts at 0
        const errors = userInfos.reduce(tester, 0); 
        return errors === 0; // if 0 zero errors, we're good to go
    },
    checkIsEmail() {},
    checkPassword() {},
    checkPasswordConfirm() {
      return this.user.password === this.$refs.confirm.value;
    },
    checkForm() {
      console.log("user to register =>", this.user);
      let errors = 0;
      errors += this.checkPasswordConfirm() ? 0 : 1;
      console.log("how many errors ? => ", errors);
      if (!errors) {this.$store.dispatch("users/register", this.user );
  
      }
      
    },
    toggleEyeIcon(evt, mode) {
      const icon = evt.target;
      icon.classList.toggle("fa-eye");
      icon.classList.toggle("fa-eye-slash");
      const type = this.$refs[mode].type === "password" ? "text" : "password"; // if ... else
      this.$refs[mode].type = type;
    }, 




   
  }
};
</script>
<style scoped lang="scss">

#register {
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  max-width: 540px;
  margin: 20px auto 0;
  padding: 10px;
  border: 1px solid;
  border-radius: 0.3rem;
  background-color: grey;
  
  & .wrap {
    width: 100%;
    display: flex;
    justify-content: space-between;
    align-items: center;
  }
  & .label {
    margin: 5px 0;
  }
  & .input {
    height: 32px;
    padding: 3px 0 3px 20px;
    border: 1px solid;
    width: 90%;
    border-radius: 0.3rem;
  }
  & .btn {
    height: 32px;
    max-width: 120px;
    width: 100%;
    outline: none;
    border: 1px solid;
    margin-top: 20px;
    align-self: center;
    border-radius: 0.3rem;
  }

  #metier{
    height: 32px;
    padding: 3px 0 3px 20px;
    border: 1px solid;
    width: 90%;
    border-radius: 0.3rem;
  }
}
</style>