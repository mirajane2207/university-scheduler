<template>

  <h1 class="table-title">Courses</h1>
  <div class="courses-table-headers">
    <a class="course-id">ID</a>
    <a class="course-name">Name</a>
    <a class="course-desc">Description</a>
    <a class="course-professors">Professors</a>
    <custom-button
        class="course-create"
        @click="showCreate"
    >Create
    </custom-button>
    <side-form v-model:show="createVisible">
      <course-form>
        <div class="form-btns">
          <custom-button
              class="course-update"
              @click="updateCourse"
          >Create
          </custom-button>
        </div>
      </course-form>
    </side-form>
  </div>
  <side-form v-model:show="editVisible">
    <course-form>
      <div class="form-btns">
        <custom-button
            class="course-update"
            @click="updateCourse"
        >Save Changes
        </custom-button>
        <custom-button
            class="course-delete"
            @click="deleteCourse"
        >Delete
        </custom-button>
      </div>
    </course-form>
  </side-form>
  <div class="courses-table" v-if="courses.length > 0"
       v-for="course in courses"
       :course="course"
       :key="course.id">
    <a class="course-id">{{ course.id }}</a>
    <a class="course-name">{{ course.name }}</a>
    <a class="course-desc">{{ course.description }}</a>
    <a class="course-professors">{{ course.professors }}</a>
    <button
        class="course-edit"
        @click="showEdit"
    >Edit
    </button>
  </div>
  <h2 v-else>
    Courses List is empty
  </h2>
</template>

<script>
import Course from "@/components/Course";
import CustomButton from "@/components/UI/CustomButton";
import CourseForm from "@/components/CourseForm";
import SideForm from "@/components/UI/SideForm";

export default {
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
    createCourse(course) {

    },
    updateCourse(course) {

    },
    deleteCourse(course) {

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

.course-id {
  grid-column: span 1;
}

.course-name {
  grid-column: span 2;
  max-height: 24px;
  overflow: hidden;
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

.course-create {
  grid-column: span 2;
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