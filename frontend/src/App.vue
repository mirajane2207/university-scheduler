<template>
  <navbar></navbar>
  <div class="app">
    <router-view></router-view>
  </div>
</template>

<script>
import Navbar from "@/components/UI/Navbar";
export default {
  components: {Navbar}
}
</script>

<style>
</style>