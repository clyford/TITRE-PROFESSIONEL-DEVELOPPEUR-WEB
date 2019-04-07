<template>
  <div id="profile" class="page profile">
    <h1 class="title main">My profile</h1>
    <aside id="aside">
      <NavAdmin />
      <hr>
      <NavUser />
    </aside>
    <router-view class="sub-page"></router-view>
  </div>
</template>
<script>
import User from "./partials/NavAdmin.vue";
import NavAdmin from "./partials/NavAdmin.vue";
import NavUser from "./partials/NavUser.vue";
export default {
  components: {
    NavAdmin,
    NavUser
  }
};
</script>

<style scoped lang="scss">
#profile {
  background-color: grey;
  display: grid;
  grid-template-columns: repeat(8, 1fr);
  grid-template-rows: 44px repeat(3, 1fr);
  // height: 100%;
}
.title.main {
  grid-column: 3 / 9;
}
#aside {
  border-right: 2px solid;
  padding-right: 10px;
  grid-column: 1 / 3;
  grid-row: 1 / 5;
}

.sub-page {
  grid-row: 2 / 5;
  grid-column: 3 / 9;
  padding-left: 20px;
}

@media screen and (min-width:650px ) and (max-width: 1025px){}
@media screen and (max-width:650px){}

</style>
