<template>
  <header id="header_main">
    <Logo/>
    <NavMain/>
  </header>
</template>

<script>
import NavMain from "./NavMain.vue";
import Logo from "@/components/Logo.vue";

export default {
  components: {
    NavMain,
    Logo
  }
};
</script>

<style lang="scss" scoped>
#header_main {
  padding: 10px 20px;
  align-items: center;
  background: #ffffffa6;
  color: white;
  display: flex;
  height: 80px;
  justify-content: space-between;
  position: fixed;
  width: 100%;
  z-index: 10;
}
</style>
