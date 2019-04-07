<template>
  <div id="page" class="page login">
    <h1>Login</h1>
    <p>
      If you don't have an account yet, please <router-link to="/register">register</router-link>
    </p>
    <FormLogin />
  </div>
</template>

<script>
import FormLogin from "@/components/FormLogin.vue";
export default {
  components: {
    FormLogin
  }
};
</script>

<style lang="scss" scoped>
#page{
  height: 100vh;
  // background-color:#7fb5eb2b;
  background-color:#ffffff82;
}

@media screen and (min-width:650px ) and (max-width: 1025px){}
@media screen and (max-width:650px){}
</style>

