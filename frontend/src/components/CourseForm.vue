<template>
  <form @submit.prevent>
    <h4>Create course</h4>
    <custom-input
        v-model="course.title"
        type="text"
    ></custom-input>
    <custom-input
        v-model="course.body"
        type="text"
    ></custom-input>
    <custom-button
        @click="createCourse"
    >
      Create
    </custom-button>
  </form>
</template>

<script>

export default {
  data() {
    return {
      course: {
        title: '',
        body: ''
      }
    }
  },
  methods: {
    createCourse() {
      this.course.id = Date.now();
      this.$emit('create', this.course);
      this.course = {
        title: '',
        body: ''
      }
    }
  }
}
</script>

<style scoped>

</style>