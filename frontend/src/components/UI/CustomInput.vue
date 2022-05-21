<template>
  <slot></slot>
  <input
      type="text"
      class="input"
      :value="modelValue"
      @input="updateInput">
</template>

<script>
export default {
  name: "custom-input",
  props: {
    modelValue: [String, Number]
  },
  methods: {
    updateInput(event){
      this.$emit('update:modelValue', event.target.value)
    }
  }
}
</script>

<style scoped>
.input {
  padding: 4px;
  border: 0;
  background: #181818;
  border-radius: 8px;
  font-family: 'Montserrat';
  font-style: normal;
  font-size: 14px;
  line-height: 17px;
  color: #E0E0E0;
}

</style>