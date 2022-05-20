<template>
  <div class="app">
    <navbar></navbar>
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
  font-weight: 400;
  color: #E0E0E0;
  background: #181818;
}

</style>