<template>
  <custom-input>
    <label class="label">Surname</label>
  </custom-input>
  <custom-input>
    <label class="label">Email</label>
  </custom-input>
    <label for="courses"  class="label" >Courses</label>
    <ul name="courses">
      <li>dldsjkljdk</li>
      <li>dldsjkljdk</li>
      <li>dldsjkljdk</li>
      <li>dldsjkljdk</li>
    </ul>
</template>

<script>

import CustomInput from "@/components/CustomInput";
export default {
  name: 'ProfessorInfo',
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