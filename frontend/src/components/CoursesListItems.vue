<template>
  <div v-if="courses.length > 0">
    <course-item
        v-for="course in courses"
        :course="course"
        :key="course.id"
    />
  </div>
  <h2 v-else>
    Courses List is empty
  </h2>
</template>

<script>

export default {
  name: 'CoursesListItems',
  props: {
    courses: {
      type: Array,
      required: true
    }
  }
}
</script>

<style scoped>


</style>