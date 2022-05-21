<template>
  <form @submit.prevent class="course-form">
    <a class="course-form__id">ID</a>

    <custom-input type="text" >
      <label class="label">Name</label>
    </custom-input>

    <custom-input type="text">
      <label class="label">Description</label>
    </custom-input>

    <label for="professors"  class="label" >Professors</label>
    <ul name="professors">
      <li>dldsjkljdk</li>
      <li>dldsjkljdk</li>
      <li>dldsjkljdk</li>
      <li>dldsjkljdk</li>
    </ul>
    <slot></slot>
  </form>
</template>

<script>

import CustomInput from "@/components/CustomInput";
export default {
  name: 'CourseForm',
  components: {CustomInput},
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
.course-form {
  padding: 40px;
  display: flex;
  flex-direction: column;
}

.course-form__id {
  font-family: 'Open Sans';
  font-style: normal;
  font-weight: 700;
  font-size: 40px;
  line-height: 54px;
  text-transform: uppercase;

  /* blue */

  color: #8AC1D9;
}

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
</style>