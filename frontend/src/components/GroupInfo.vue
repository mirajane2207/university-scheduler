<template>
    <label for="students"  class="label" >Students</label>
    <ul name="students">
      <li>dldsjkljdk</li>
      <li>dldsjkljdk</li>
      <li>dldsjkljdk</li>
      <li>dldsjkljdk</li>
    </ul>
</template>

<script>

import CustomInput from "@/components/CustomInput";
export default {
  name: 'GroupInfo',
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