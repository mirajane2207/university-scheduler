<template>
<div class="side-form" v-if="show"  @click.stop="hideDialog">
  <div @click.stop>
    <slot></slot>
  </div>
</div>
</template>

<script>
export default {
  name: "SideForm",
  props: {
    show: {
      type: Boolean,
      default: false
    }
  },
  methods: {
    hideDialog() {
      this.$emit('update:show', false)
    }
  }
}
</script>

<style scoped>
.side-form {
position: absolute;
  top: 0;
  left: 50%;
  width: 50%;
  height: 100%;
  background: linear-gradient(134.39deg, rgba(72, 72, 72, 0.6) 2.01%, rgba(24, 24, 24, 0) 106.03%);
  box-shadow: inset 0px 0px 10px #404141;
  filter: drop-shadow(2px 4px 4px rgba(0, 0, 0, 0.1));
  backdrop-filter: blur(22px);
  border-radius: 20px;
}

</style>