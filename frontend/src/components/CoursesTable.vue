<template>
  <custom-table :items="courses">
    <template v-slot:table-title>
      <h1>Courses</h1>

    </template >
    <template v-slot:table-header>
      <a  class="course-desc">Description</a>
      <a  class="course-professors">Professors</a>
    </template>
    <template #item="{ description, professors}">
      <a  class="course-desc">{{ description }}</a>
      <a  class="course-professors">{{ professors }}</a>
    </template>
  </custom-table>
</template>

<script>
import Course from "@/components/Course";
import CustomButton from "@/components/CustomButton";
import CourseForm from "@/components/CourseForm";
import SideForm from "@/components/SideForm";

export default {
  name: 'CoursesTable',
  components: {CustomButton, Course, CourseForm, SideForm},
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

.courses-table {
  display: grid;
  grid-template-columns: repeat(12, 1fr);
  grid-gap: 10px;

}

.courses-table-headers {
  padding-bottom: 10px;
  margin-bottom: 20px;
  display: grid;
  grid-template-columns: repeat(12, 1fr);
  grid-gap: 10px;
  border-bottom: 4px solid #8AC1D9;
  font-family: 'Open Sans';
  font-weight: 600;
  /* light gray */

  color: #E0E0E0;

}

.course-desc {
  grid-column: span 3;
  max-height: 24px;
  overflow: hidden;
}

.course-professors {
  grid-column: span 4;
  max-height: 24px;
  overflow: hidden;
}



.course-edit {
  border: 0;
  padding: 0;
  background: transparent;
  grid-column: span 2;
  color: #8AC1D9;
  font-family: 'Open Sans';
  font-style: normal;
  font-weight: 400;
  font-size: 20px;
}

.form-btns {
  margin-top: 30px;
  display: flex;

}

.course-update {
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

.course-delete {
  padding: 10px;
}
</style>