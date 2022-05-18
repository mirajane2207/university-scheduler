<template>
  <div>
    <div>
      <div><strong>Name: </strong>{{ course.name }}</div>
      <div><strong>Desc: </strong>{{ course.description }}</div>
    </div>
    <div>
      <custom-button
        @click="$emit('remove', course)"
      >Delete</custom-button>
    </div>
  </div>

</template>

<script>

import CustomButton from "@/components/UI/CustomButton";
export default {
  components: {CustomButton},
  props: {
    course: {
      type: Object,
      required: true,
    }
  }
}
</script>

<style scoped>

</style>