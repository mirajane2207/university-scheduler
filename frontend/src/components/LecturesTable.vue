<template>
  <h1 class="table-title">Courses</h1>
  <div class="lecture-table-headers">
    <a class="lecture-table__id">ID</a>
    <a class="lecture-table__week">Week</a>
    <a class="lecture-table__lecture">Lecture</a>
    <a class="lecture-table__auditorium">Auditorium</a>
    <a class="lecture-table__course">Course</a>
    <a class="lecture-table__professor">Professor</a>
    <a class="lecture-table__group">Group</a>
    <custom-button
        class="table-create-btn"
        @click="showCreate"
    >Create
    </custom-button>
    <lecture-form v-model:show="createVisible">
      <div class="form-btns">
        <custom-button
            class="form-create-btn"
            @click="createItem"
        >Create
        </custom-button>
      </div>
    </lecture-form>
  </div>
  <lecture-form v-model:show="editVisible">
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
  </lecture-form>
  <div class="lecture-table" v-if="lectures.length > 0"
       v-for="lecture in lectures"
       :key="lecture.id">
    <a class="lecture-table__id">{{ lecture.id }}</a>
    <a class="lecture-table__id">{{ lecture.week }}</a>
    <a class="lecture-table__lecture">{{ lecture.lecture }}</a>
    <a class="lecture-table__auditorium">{{lecture.auditorium.name}}</a>
    <a class="lecture-table__course">{{ lecture.course.name}}</a>
    <a class="lecture-table__professor">{{ lecture.professor.surname }} {{ lecture.professor.name}}</a>
    <a class="lecture-table__group">{{ lecture.group.name }}</a>
    <button
        class="table-edit-btn"
        @click="showEdit"
    >Edit
    </button>
  </div>
  <h2 v-else>
    Courses List is empty
  </h2>
</template>

<script>

export default {
  name: 'LecturesTable',
  props: {
    lectures: {
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
    }
  },
}
</script>

<style scoped>
.lecture-table {
  display: grid;
  grid-template-columns: repeat(12, 1fr);
  grid-gap: 10px;

}

.lecture-table:only-child{
  display: grid;
  max-height: 24px;
  overflow: hidden;

}
.lecture-table-headers {
  padding-bottom: 10px;
  margin-bottom: 20px;
  display: grid;
  grid-template-columns: repeat(12, 1fr);
  grid-gap: 10px;
  border-bottom: 4px solid #8AC1D9;
  font-family: 'Open Sans';
  font-weight: 600;
  color: #E0E0E0;

}

.lecture-table__course {
  grid-column: span 3;
}

.lecture-table__professor {
  grid-column: span 2;
}

.table-create-btn {
  grid-column-start: 11;
  grid-column-end: 13;
}

.table-edit-btn {
  grid-column-start: 11;
  grid-column-end: 13;
  border: 0;
  padding: 0;
  background: transparent;
  color: #8AC1D9;
  font-family: 'Montserrat';
  font-size: 20px;
}

.form-btns {
  margin-top: 30px;
  display: flex;

}

.form-create-btn {
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
  text-transform: uppercase;
}

</style>