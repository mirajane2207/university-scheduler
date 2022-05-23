<template>
  <custom-input>
    <label class="label">Surname</label>
  </custom-input>
  <custom-select
      :items="groups">
    Group
  </custom-select>
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

import {mapActions, mapState} from "vuex";

export default {
  name: 'StudentInfo',
  data() {
    return {
      course: {
        title: '',
        body: ''
      }
    }
  },
  methods: {
    ...mapActions({
      fetchGroups: 'groups/fetchGroups'
    }),
    createCourse() {
      this.course.id = Date.now();
      this.$emit('create', this.course);
      this.course = {
        title: '',
        body: ''
      }
    }
  },
  mounted() {
    this.fetchGroups();
  },
  computed: {
    ...mapState({
      groups: state => state.groups.groups
    })
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