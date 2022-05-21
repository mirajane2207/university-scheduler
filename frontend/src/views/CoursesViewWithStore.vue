<template>
  <div class="course-view">
    <div class="side-bar"></div>
    <courses-list-items
        :courses="courses"
        @remove="removeCourse"
        v-if="!isLoading"
    />
  </div>
</template>

<script>
import CourseForm from "@/components/CourseForm";
import CoursesList from "@/components/CoursesTable";
import {mapState, mapActions} from 'vuex';
import CoursesListItems from "@/components/CoursesListItems";

export default {
  components: {
    CoursesListItems,
    CourseForm, CoursesList
  },
  data() {
    return {
      dialogVisisble: false
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
      this.dialogVisisble = true;
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

.course-view {
  background-image: url("@/assets/courses-bg.png");
  background-position: bottom;
  background-position-y: -100px;
  background-repeat: repeat-y;
}

body {
  font-family: 'Montserrat';
  font-style: normal;
  font-size: 20px;
  font-weight: 400;
  color: #E0E0E0;
  background: #181818;
}

.side-bar {
  position: absolute;
  top: 63px;
  left: 70px;
  height: 1200vh;
  width: 45px;
  background-image: url("@/assets/courses-side-bar.png");
  background-repeat: repeat-y;
}
</style>