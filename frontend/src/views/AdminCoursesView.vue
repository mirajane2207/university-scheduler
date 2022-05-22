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
      courses: [
        {id:'1', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
        {id:'2', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
        {id:'3', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
        {id:'4', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
        {id:'5', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
      ]
    }
  },
  methods: {
    ...mapActions({
      fetchCourses: 'courses/fetchCourses'
    }),

    createCourse(course) {
      this.courses.push(course);
    },
    removeCourse(courses) {
      this.courses = this.courses.filter( c => c.id !== course.id)
    }
  },
  mounted(){
    // this.fetchCourses();
  },
  computed: {
    ...mapState({
      // courses: state => state.courses.courses,
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