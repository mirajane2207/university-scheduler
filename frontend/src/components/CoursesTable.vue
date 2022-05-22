<template>
  <custom-table :items="courses">
    <template #table-title>
      <h1 class="table-title">Courses</h1>
    </template >
    <template #table-header>
      <a  class="group-students">Description</a>
      <a  class="course-professors">Professors</a>
    </template>
    <template #create-form>
      <course-info>
      </course-info>
    </template>
    <template #update-form>
      <course-info>
      </course-info>
    </template>
    <template #item="{ description, professors}">
      <a  class="group-students">{{ description }}</a>
      <a  class="course-professors">{{ professors }}</a>
    </template>
  </custom-table>
</template>

<script>

export default {
  name: 'CoursesTable',
  props: {
    courses: {
      type: Array,
      required: true
    }
  },
  data() {
    return {
      createVisible: false,
      editVisible: false
    }
  },
  methods: {
    showCreate() {
      this.createVisible = true;
    },
    showEdit() {
      this.editVisible = true;
    },
    createCourse(courses) {

    },
    updateCourse(courses) {

    },
    deleteCourse(courses) {

    }
  }
}
</script>

<style scoped>
.table-title {
  margin-bottom: 50px;
  font-family: 'Open Sans';
  font-weight: 700;
  font-size: 48px;
  line-height: 65px;

  text-transform: uppercase;
  color: #8AC1D9;
}

.group-students {
  grid-column: span 3;
  max-height: 24px;
  overflow: hidden;
}

.course-professors {
  grid-column: span 4;
  max-height: 24px;
  overflow: hidden;
}

.form-btns {
  margin-top: 30px;
  display: flex;

}

</style>