<template>
  <custom-table :items="groups">
    <template #table-title>
      <h1 class="table-title">Groups</h1>
    </template >
    <template #table-header>
      <a  class="group-students">Students</a>
    </template>
    <template #create-form>
      <group-info>
      </group-info>
    </template>
    <template #update-form>
      <group-info>
      </group-info>
    </template>
    <template #item="{students}">
      <a  class="group-students">{{ students }}</a>
    </template>
  </custom-table>
</template>

<script>

export default {
  name: 'GroupsTable',
  props: {
    groups: {
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
    createCourse(auditoriums) {

    },
    updateCourse(auditoriums) {

    },
    deleteCourse(auditoriums) {

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
    grid-column: span 6;
}
</style>