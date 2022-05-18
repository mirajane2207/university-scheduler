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
  border: 1px solid red;
}
</style>