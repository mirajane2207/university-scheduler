<template>
  <custom-table :items="courses">
    <template #table-title>
      <h1 class="table-title">Courses</h1>
    </template >
    <template #table-header>
      <a  class="course-desc">Description</a>
      <a  class="course-professors">Professors</a>
    </template>
    <template #create-form>
      <course-form>
        <div class="form-btns">
          <custom-button
              class="table-update-btn"
              @click="createCourse"
          >Create
          </custom-button>
        </div>
      </course-form>
    </template>
    <template #update-form>
      <course-form>
        <div class="form-btns">
          <custom-button
              class="table-update-btn"
              @click="updateCourse"
          >Save Changes
          </custom-button>
          <custom-button
              class="table-delete-btn"
              @click="deleteCourse"
          >Delete
          </custom-button>
        </div>
      </course-form>
    </template>
    <template #item="{ description, professors}">
      <a  class="course-desc">{{ description }}</a>
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

.course-desc {
  grid-column: span 3;
  max-height: 24px;
  overflow: hidden;
}

.course-professors {
  grid-column: span 3;
  max-height: 24px;
  overflow: hidden;
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