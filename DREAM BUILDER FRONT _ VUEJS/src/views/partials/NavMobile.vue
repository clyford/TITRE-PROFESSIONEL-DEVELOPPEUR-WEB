<template>
  <nav id="nav_mobile" :class="{'is-active': isActive}"  role="navigation">
    <router-link class="link" to="/">Home</router-link>
    <router-link class="link" to="/about">About</router-link>
    <!-- <router-link class="link" to="/categories/Storyboarder">Storyboarder</router-link> -->
    <router-link class="link" to="/categories/Annonce">Annonce</router-link>
    <router-link class="link" to="/login">Login</router-link>
    <router-link class="link" to="/profile">Profile</router-link>
  </nav>
</template>

<script>
export default {
  computed: {
    isActive() {
      return this.$store.getters["appEvents/navMobileStatus"];
    }
  }
};
</script>

<style scoped lang="scss">
#nav_mobile {
  display: flex;
  flex-direction: column;
  width: 100vw;
  height: 100vh;
  background: black;
  opacity: 0.8;
  position: absolute;
  justify-content: center;
  align-items: center;
  top: 0;
  left: -100vw;
  transition: left 0.3s linear;
  z-index: 11;
  &.is-active {
    left: 0;
  }
  & .link {
    color: white;
    &:hover {
        color: #42b983;
    }
  }
}

@media(min-width: 521px) {
  #nav_mobile {
    display: none;
  }
}
@media screen and (min-width:650px ) and (max-width: 1025px){}
@media screen and (max-width:650px){}
</style>
