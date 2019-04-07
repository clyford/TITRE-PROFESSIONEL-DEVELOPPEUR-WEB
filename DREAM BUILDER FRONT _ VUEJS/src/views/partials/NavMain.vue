<template>
  <nav id="nav_main" role="navigation">
    <router-link class="link" to="/" exact>Home</router-link>
    <router-link class="link" to="/about">About</router-link>
    <!-- <router-link class="link" to="/categories/storyboarder">Storyboarder</router-link>
    <router-link class="link" to="/categories/mangaArtist">MangaArtist</router-link>
    <router-link class="link" to="/categories/writer">Writer</router-link> -->
    <router-link class="link" to="/categories/Annonce">Annonce</router-link>
    <router-link class="link" to="/login">Login</router-link>
    <router-link class="link" to="/profile/infos">Profile</router-link>
  </nav>
</template>

<script>
export default {};
</script>

<style lang="scss" scoped>
#nav_main {
  padding: 30px;
  .link {
    font-weight: bold;
    color:black;
    margin-right: 10px;
    &.router-link-exact-active,
    &:hover {
      color: red;
    }
    &::after {
      content: " | ";
    }
    &:last-of-type {
      margin-right: 0;
      &::after {
        content: "";
      }
    }
  }
}
@media(max-width: 520px) {
  #nav_main {
    display: none;
  }
}
</style>
