<template>
  <div>
    <h1>work</h1>
    <h1>Course List page</h1>
    <custom-button
        @click="showDialog"
    >
      Create
    </custom-button>
    <custom-dialog v-model:show="dialogVisisble">
      <course-form
          @create="createCourse"
      />
    </custom-dialog>
    <courses-table
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
import axios from "axios"
import CoursesTable from "@/components/CoursesTable";

export default {
  components: {
    CoursesTable,
    CourseForm, CoursesList
  },
  data() {
    return {
      courses: [],
      dialogVisisble: false,
      isLoading: false,
    }
  },
  methods: {
    createCourse(courses) {
      this.courses.push(course);
      this.dialogVisisble = false;
    },
    removeCourse(courses) {
      this.courses = this.courses.filter( c => c.id !== course.id)
    },
    showDialog() {
      this.dialogVisisble = true;
    },
    async fetchCourses() {
      try {
        this.isLoading = true;
        const response = await axios.get('/api/courses');
        this.courses = response.data;
      } catch (e) {
        alert('error')
      } finally {
        this.isLoading = false;
      }
    }
  },
  mounted(){
    this.fetchCourses();
  }
}
</script>

<style>
</style>