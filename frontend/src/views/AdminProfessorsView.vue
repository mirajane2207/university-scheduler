<template>
  <div class="course-table-view">
    <courses-list
        :courses="courses"
        @remove="removeCourse"
        v-if="!isLoading"
    />
    <div v-else>
      Loading data..
    </div>
  </div>
</template>

<script>
import CourseForm from "@/components/CourseInfo";
import CoursesList from "@/components/CoursesTable";
import {mapState, mapActions} from 'vuex';

export default {
  components: {
    CourseForm, CoursesList
  },
  data() {
    return {
      editVisisble: false,
    }
  },
  methods: {
    ...mapActions({
      fetchCourses: 'courses/fetchCourses'
    }),

    createCourse(courses) {
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