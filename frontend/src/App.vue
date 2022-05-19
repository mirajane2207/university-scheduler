<template>
  <navbar></navbar>
  <div class="app">
    <router-view></router-view>
  </div>
</template>

<script>

export default {
}
</script>

<style>
html {
  box-sizing: border-box;
}

*, *::before, *::after {
  box-sizing: inherit;
}

body {
  font-family: 'Montserrat';
  font-style: normal;
  font-size: 20px;
  font-weight: 400;
  color: #E0E0E0;
  background: #181818;
  background-image: url("@/assets/blobs.png");
  background-size: cover;
  background-repeat: no-repeat;
  background-position: bottom;
}
</style>