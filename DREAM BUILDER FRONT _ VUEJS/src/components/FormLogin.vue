<template>
  <form id="login" 
  @submit="$event.preventDefault();checkForm();">

    <label for="email" class="label">Pick an email</label>
    <input id="email" type="text" class="input" required v-model="user.email" >
    
    <label for="password" class="label">Enter your password</label>

    <div class="wrap">
      <input ref="initial" id="password" type="password" class="input" required v-model="user.password">
      <i class="icon clickable fa fa-eye-slash" @click="toggleEyeIcon($event, 'initial')"></i>
    </div>

     <!--<button class="connexion" @click='handleSubmit'>Connexion</button>-->
    <button class="btn"  @click='handleSubmit'>Connexion</button>
        <p>{{msgError}}</p>
        <p>{{user.email}} {{user.password}}</p>
        <!-- <p>{{user}}</p> -->
        <!-- <p>{{this.$store.token}}</p> -->

  </form>
</template>

<script>

import axios from "axios";
//import auth from "@/utils/auth";

export default {
  data() {
    return {
      msgError: '',
      // user: {},
      user: {
        email: " ",
        password: " "
      }
    };
  },
  methods: {
    checkForm() {
      console.log("user to login =>", this.user);
      let errors = 0;
      if (!errors) {
        this.$store.dispatch("api/premium", this.user);
        this.$store.commit("appEvents/setCurrentMessage", 
         {text: "Login ok", level: "success"});
        
      } else {
        this.$store.commit("appEvents/setCurrentMessage", 
        {text: "Wrong infos sorry", level: "warning"});
        
      }
    },
    toggleEyeIcon(evt, mode) {
      const icon = evt.target;
      icon.classList.toggle("fa-eye");
      icon.classList.toggle("fa-eye-slash");
      const type = this.$refs[mode].type === "password" ? "text" : "password"; // if ... else
      this.$refs[mode].type = type;
    },

    //       btn(log) {
    //         const id = "Mon id";
    //         console.log(log);
    //     axios.post("http://localhost:9999/api/premium", log)
    //       .then(response => {
    //         console.log("sucess", response);
    //         console.log(response.data)
    //         window.sessionStorage.setItem(id, response.data.id);
    //        // this.$router.push('mon-profil');
    //       }).catch(error => {
    //       this.msgError = error.data
    //       console.log("erreur", error);
    //     }
    //  );
    //  },
     /******************************************************  a modifier****************************************************/

     /*connexion*//*btn(log) {
            const id = "Mon id";
            const token = "Mon token";
            const role = "Mes roles";
            console.log(log);
        axios.post("http://localhost:8181/ano/login", log)
          .then(response => {
            console.log("sucess", response);
            console.log(response.data)
            auth.setLocalToken("Bearer "+response.data.jwt)
            window.sessionStorage.setItem(token,"Bearer "+response.data.jwt)
            window.sessionStorage.setItem(id, response.data.id);
            window.sessionStorage.setItem(role, response.data.roles);
           // this.$router.push('mon-profil');
          }).catch(error => {
          this.msgError = error.data
          console.log("erreur", error);
        }
     );
     },*/

    handleSubmit(e) {
    e.preventDefault();
      if (
        !this.user.email ||
        !this.user.password
      ) {
        console.log("error")
      } else this.btn(this.user);
      console.log("methode password");
    }


      /******************************************************  a modifier****************************************************/
  }
};
</script>
<style scoped lang="scss">
#login {
  background-color: grey;
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  max-width: 540px;
  margin: 20px auto 0;
  padding: 10px;
  border: 1px solid;
  border-radius: 0.3rem;
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
}
</style>