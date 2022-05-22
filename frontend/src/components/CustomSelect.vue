<template>
  <label class="label">
    <slot></slot>
  </label>
  <select name="" id="" class="custom-select">
    <option v-for="item in items" :key="item.id">{{item.name}}</option>
  </select>
</template>
<script>
export default {
  name: "CustomSelect",
  props: {
    items: {
      type: Array,
      required: true
    }
  }
}
</script>

<style scoped>
.label {
  margin-top: 40px;
  margin-bottom: 13px;
  font-family: 'Open Sans';
  font-style: normal;
  font-weight: 700;
  font-size: 24px;
  line-height: 33px;

  text-transform: uppercase;
  color: #E0E0E0;
}

.custom-select{
  background: #181818;
  border-radius: 5px;
  border-color: #181818;
  color: #E0E0E0;
}
</style>