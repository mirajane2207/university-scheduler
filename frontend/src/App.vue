<template>
  <div>
    <h1>Course List page</h1>
    <custom-button @click="fetchCourses">
      get courses
    </custom-button>
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
    <courses-list
        :courses="courses"
        @remove="removeCourse"
    />
  </div>
</template>

<script>
import CourseForm from "@/components/CourseForm";
import CoursesList from "@/components/CoursesList";
import axios from "axios"

export default {
  components: {
    CourseForm, CoursesList
  },
  data() {
    return {
      courses: [],
      dialogVisisble: false,
    }
  },
  methods: {
    createCourse(course) {
      this.courses.push(course);
      this.dialogVisisble = false;
    },
    removeCourse(course) {
      this.courses = this.courses.filter( c => c.id !== course.id)
    },
    showDialog() {
      this.dialogVisisble = true;
    },
    async fetchCourses() {
      try {
        const response = await axios.get('/courses');
        console.log(response);
        this.courses = response.data;
      } catch (e) {
        alert('error')
      }
    }
  }
}
</script>

<style>
</style>