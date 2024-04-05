<template>
  <Comp_header />
  <router-view></router-view>
  <Comp_footer />
</template>

<script>
import Comp_header from "@/components/const/Comp_header.vue";
import Comp_footer from "@/components/const/Comp_footer.vue";
// import jquery

// import boostrap
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.bundle.min.js";

export default {
  name: "App",
  components: {
    Comp_header,
    Comp_footer,
  },
};
</script>

<style>
/* #app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
} */
</style>
