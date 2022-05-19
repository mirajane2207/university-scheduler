<template>
  <div>
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
import CourseForm from "@/components/CourseForm";
import CoursesList from "@/components/CoursesList";
import {mapState, mapGetters, mapActions, mapMutations} from 'vuex';

export default {
  components: {
    CourseForm, CoursesList
  },
  data() {
    return {
      dialogVisisble: false,
    }
  },
  methods: {
    ...mapActions({
      fetchCourses: 'course/fetchCourses'
    }),
    ...mapMutations({
    }),
    createCourse(course) {
      this.courses.push(course);
      this.dialogVisisble = false;
    },
    removeCourse(course) {
      this.courses = this.courses.filter( c => c.id !== course.id)
    },
    showDialog() {
      this.dialogVisisble = true;
    }

  },
  mounted(){
    this.fetchCourses();
  },
  computed: {
    ...mapState({
      courses: state => state.course.courses,
      isLoading: state => state.course.isLoading
    })
  }
}
</script>

<style>
</style>