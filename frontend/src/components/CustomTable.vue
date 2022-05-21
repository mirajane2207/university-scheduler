<template>
  <slot name="table-title" class="table-title"></slot>
  <div class="custom-table-headers">
    <a class="custom-table__id">ID</a>
    <a class="custom-table__name">Name</a>
    <slot name="table-header"></slot>
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
  <div class="courses-table" v-if="items.length > 0"
       v-for="item in items"
       :item="item"
       :key="item.id">
    <a class="custom-table__id">{{ item.id }}</a>
    <a class="custom-table__name">{{ item.name }}</a>
    <slot name="item" v-bind="item"></slot>
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
import CustomButton from "@/components/CustomButton";
import CourseForm from "@/components/CourseForm";
import SideForm from "@/components/SideForm";

export default {
  name: 'CustomTable',
  components: {CustomButton, Course, CourseForm, SideForm},
  props: {
    items: {
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

.custom-table-headers {
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

.custom-table__id {
  grid-column: span 1;
}

.custom-table__name {
  grid-column: span 2;
  max-height: 24px;
  overflow: hidden;
}


.form-btns {
  margin-top: 30px;
  display: flex;

}

.course-create {
  grid-column: span 2;
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
</style>