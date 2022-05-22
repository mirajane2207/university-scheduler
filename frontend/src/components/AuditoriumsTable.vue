<template>
  <custom-table :items="auditoriums">
    <template #table-title>
      <h1 class="table-title">Auditoriums</h1>
    </template >
  </custom-table>
</template>

<script>

export default {
  name: 'AuditoriumsTable',
  props: {
    auditoriums: {
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
</style>