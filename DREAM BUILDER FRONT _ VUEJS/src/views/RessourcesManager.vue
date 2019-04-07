<template>
<div>
    <h1 class="title">JE SUIS RESSOURCES MANAGER</h1>
    <hr>
    <!-----une route pour aller au formulaire de creation------------->
    <router-link tag="button" class="clikable fa fa-plus" to="/profile/admin/ressources-manager/create"></router-link>
    <!-----une route pour aller au tableur listant vos ressources------------->
    <router-link tag="button" class="clikable fa fa-plus" to="/profile/admin/ressources-manager/list"></router-link>
    <router-view></router-view>
</div>
</template>

<script>
export default {

}
</script>

<style>

</style>
