<template>
  <div v-if="courses.length > 0">
    <h3>Course List</h3>
    <course
        v-for="course in courses"
        :course="course"
        :key="course.id"
        @remove="$emit('remove', course)"
    />
  </div>
  <h2 v-else>
    Courses List is empty
  </h2>
</template>

<script>
import Course from "@/components/Course";

export default {
  components: {Course},
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