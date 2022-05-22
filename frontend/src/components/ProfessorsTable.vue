<template>
  <custom-table :items="professors">
    <template #table-title>
      <h1 class="table-title">Students</h1>
    </template >
    <template #table-header>
      <a  class="professor-surname">Surname</a>
      <a  class="professor-email">Email</a>
      <a  class="professor-courses">Courses</a>
    </template>
    <template #create-form>
      <professor-info>
      </professor-info>
    </template>
    <template #update-form>
      <professor-info>
      </professor-info>
    </template>
    <template #item="{ surname, email, courses }">
      <a  class="professor-surname">{{ surname }}</a>
      <a  class="professor-email">{{ email }}</a>
      <a  class="professor-courses">{{ courses }}</a>
    </template>
  </custom-table>
</template>

<script>

export default {
  name: 'ProfessorsTable',
  props: {
    professors: {
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
    createCourse(professors) {

    },
    updateCourse(professors) {

    },
    deleteCourse(professors) {

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

.professor-surname {
  grid-column: span 2;
}

.professor-email {
  grid-column: span 2;
}
.professor-courses{
  grid-column: span 3;
}
</style>