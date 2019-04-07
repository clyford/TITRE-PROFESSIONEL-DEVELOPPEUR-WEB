<template>
    <div id="page" class="admin-panel">
        <h1 class="title">Admin panel</h1>
        <router-view></router-view>
    </div>
</template>

<script>
export default {

}
</script>
<style lang="scss" scoped>
#page{
  height: 80vh;
}

@media screen and (min-width:650px ) and (max-width: 1025px){}
@media screen and (max-width:650px){}
</style>
