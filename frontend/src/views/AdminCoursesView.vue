<template>
  <div class="course-table-view">
    <courses-table
        :courses="courses"
        v-if="!isLoading"
    />

    <div v-else>
      Loading data..
    </div>
  </div>
</template>

<script>

import {mapState, mapActions} from 'vuex';


export default {

  data() {
    return {
    }
  },
  methods: {
    ...mapActions({
      fetchCourses: 'courses/fetchCourses'
    }),

    createCourse(course) {
      this.courses.push(course);
      this.dialogVisisble = false;
    },
    removeCourse(courses) {
      this.courses = this.courses.filter( c => c.id !== course.id)
    },
    showDialog() {
      this.e = true;
    }

  },
  mounted(){
    this.fetchCourses();
  },
  computed: {
    ...mapState({
      courses: state => state.courses.courses,
      isLoading: state => state.courses.isLoading
    })
  }
}
</script>

<style>
.course-table-view {
  padding: 40px;
}
</style>