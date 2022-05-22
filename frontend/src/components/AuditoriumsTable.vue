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

.form-btns {
  margin-top: 30px;
  display: flex;

}

.table-update-btn {
  padding: 10px;
  margin-right: 10px;
  background: #8AC1D9;
  border-radius: 8px;
  font-family: 'Montserrat';
  font-style: normal;
  font-weight: 400;
  font-size: 24px;
  line-height: 26px;
  letter-spacing: 0.1em;
  text-transform: uppercase;
  color: #FFFFFF;
}

.table-delete-btn {
  padding: 10px;
}
</style>