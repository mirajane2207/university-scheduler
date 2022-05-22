<template>
  <custom-table :items="students">
    <template #table-title>
      <h1 class="table-title">Students</h1>
    </template >
    <template #table-header>
      <a  class="student-surname">Surname</a>
      <a  class="student-group">Group</a>
      <a  class="student-email">Email</a>
      <a  class="student-courses">Courses</a>
    </template>
    <template #create-form>
      <student-info>
      </student-info>
    </template>
    <template #update-form>
      <student-info>
      </student-info>
    </template>
    <template #item="{ surname, group, email, courses }">
      <a  class="student-surname">{{ surname }}</a>
      <a  class="student-group">{{ group }}</a>
      <a  class="student-email">{{ email }}</a>
      <a  class="student-courses">{{ courses }}</a>
    </template>
  </custom-table>
</template>

<script>

export default {
  name: 'StudentsTable',
  props: {
    students: {
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
    createCourse(students) {

    },
    updateCourse(students) {

    },
    deleteCourse(students) {

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

.student-surname {
  grid-column: span 2;
}

.student-email {
  grid-column: span 2;
}
.student-courses{
  grid-column: span 2;
}
</style>