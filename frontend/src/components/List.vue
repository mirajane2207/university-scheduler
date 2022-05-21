<template>
  <div v-if="courses.length > 0">
    <slot></slot>
  </div>
  <h2 v-else>
    List is empty
  </h2>
</template>

<script>

export default {
  props: {
    items: {
      type: Array,
      required: true
    }
  }
}
</script>

<style scoped>
</style>