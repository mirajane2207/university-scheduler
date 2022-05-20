<template>
  <div class="home">
    <div class="wrapper">
      <div class="intro">
        <h1 class="intro__title">Welcome to NAU Scheduler</h1>
      </div>
    </div>
  </div>
</template>

<script>

export default {

}
</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=Open+Sans&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Montserrat&display=swap');

.wrapper {
  max-width: 935px;
  margin: 0 auto;
}

.intro {
  padding-top: 100px;
  height: 100vh;
}

.intro__title {
  height: 275px;
  background-image: url('@/assets/svg/welcome-plane-icon.svg');
  background-repeat: no-repeat;
  background-position: 0 bottom;
  font-weight: 600;
  font-size: 96px;
  line-height: 118.4%;
  text-align: center;
  text-transform: uppercase;
}
.home {
  background-image: url("@/assets/blobs.png");
  background-size: contain;
  background-repeat: no-repeat;
  background-position: right;
}
</style>
