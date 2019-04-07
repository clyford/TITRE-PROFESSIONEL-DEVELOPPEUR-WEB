<!--------------------------------------------------------------------------------------------------------------------------------<template>
  <nav id="nav_admin" class="nav">
    <ul class="list">
      <router-link tag="li" class="link" to="/profile/admin">
        <span>admin</span>
        <ul>
          <router-link tag="li" class="link" to="/profile/admin/users">manage users</router-link>
          <router-link tag="li" class="link" to="/profile/admin/ressources-manager">manage annonces</router-link>
        </ul>
      </router-link>
    </ul>
  </nav>
</template>

<script>
export default {};
</script>

<style scoped lang="scss">
.nav {
  display: flex;
  flex-direction: column;
  padding: 10px 0;
  .list {
    list-style: none;
    text-align: left;
    padding-left: 0;
  }
}
</style>------------------------------------------------------------------------------------------------------------------------------------------>

<template>
  <nav id="nav_admin" class="nav">
    <ul class="list">
      <router-link tag="li" class="link" to="/profile/admin">
        <span>admin</span>
        <ul>
          <router-link
            exact
            tag="li"
            active-class="is-active"
            class="link"
            to="/profile/admin/users-manager"
          >Les utilisateurs</router-link>
          <router-link
            exact
            tag="li"
            active-class="is-active"
            class="link"
            to="/profile/admin/categories-manager"
          >Les categories</router-link>
          <router-link
            exact
            tag="li"
            active-class="is-active"
            class="link"
            to="/profile/admin/articles-manager"
          >Les Annonces</router-link>
        </ul>
      </router-link>
    </ul>
  </nav>
</template>

<script>
export default {};
</script>

<style scoped lang="scss">
.nav {
  display: flex;
  flex-direction: column;
  padding: 0 0 10px;
  .list {
    list-style: none;
    text-align: left;
    padding-left: 0;
    .link.is-active {
      color: darkorange;
    }
  }
}
</style>