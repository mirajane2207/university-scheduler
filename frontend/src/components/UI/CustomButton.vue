<template>
  <button class="btn">
    <slot></slot>
  </button>
</template>

<script>
export default {
  name: "custom-button"
}
</script>

<style scoped>
.btn {
  border: 0;
  background: linear-gradient(134.39deg, rgba(72, 72, 72, 0.6) 2.01%, rgba(24, 24, 24, 0) 106.03%);
  box-shadow: inset 0px 0px 4px #808384;
  filter: drop-shadow(2px 4px 4px rgba(0, 0, 0, 0.1));
  backdrop-filter: blur(6px);
  border-radius: 8px;
  font-family: 'Montserrat';
  font-style: normal;
  font-weight: 400;
  font-size: 20px;
  line-height: 26px;
  letter-spacing: 0.1em;
  color: #E0E0E0;
}
</style>