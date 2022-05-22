<template>
  <div class="side-form" v-if="show" @click.stop="hideDialog">
    <div @click.stop>
      <form @submit.prevent class="course-form">
        <a class="course-form__id">ID</a>
        <custom-select :items="weeks">Week</custom-select>
        <custom-select :items="lectureNumbers">Lecture</custom-select>
        <custom-select :items="auditoriums">Auditorium</custom-select>
        <custom-select :items="courses">Course</custom-select>
        <custom-select :items="professors">Professor</custom-select>
        <custom-select :items="groups">Group</custom-select>
        <slot></slot>
      </form>
    </div>
  </div>
</template>

<script>
import {mapActions, mapState} from "vuex";

export default {
  name: "LectureForm",

  props: {
    show: {
      type: Boolean,
      default: false
    }
  },

  // data() {
  //   return {
  //     courses: [
  //       {id:'1', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
  //       {id:'2', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
  //       {id:'3', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
  //       {id:'4', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
  //       {id:'5', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
  //     ]
  //   }
  // },

  methods: {
    ...mapActions({
      fetchCourses: 'courses/fetchCourses',
      fetchAuditoriums: 'auditoriums/fetchAuditoriums',
      fetchProfessors: 'professors/fetchProfessors',
      fetchGroups: 'groups/fetchGroups'
    }),
    hideDialog() {
      this.$emit('update:show', false)
    },
    createItem() {

    }
  },
  mounted(){
    this.fetchCourses();
    this.fetchAuditoriums();
    this.fetchProfessors();
    this.fetchGroups();

  },
  computed: {
    ...mapState({
      courses: state => state.courses.courses,
      auditoriums: state => state.auditoriums.auditoriums,
      weeks: state => state.lectures.weeks,
      lectureNumbers: state => state.lectures.lectureNumbers,
      professors: state => state.professors.professors,
      groups: state => state.groups.groups
    })
  }
}
</script>

<style scoped>
.side-form {
  position: absolute;
  top: 0;
  left: 50%;
  width: 50%;
  height: 100%;
  background: linear-gradient(134.39deg, rgba(72, 72, 72, 0.6) 2.01%, rgba(24, 24, 24, 0) 106.03%);
  box-shadow: inset 0px 0px 10px #404141;
  filter: drop-shadow(2px 4px 4px rgba(0, 0, 0, 0.1));
  backdrop-filter: blur(22px);
  border-radius: 20px;
}
.course-form {
  padding: 40px;
  display: flex;
  flex-direction: column;
}

.course-form__id {
  font-family: 'Open Sans';
  font-style: normal;
  font-weight: 700;
  font-size: 40px;
  line-height: 54px;
  text-transform: uppercase;
  color: #8AC1D9;
}

</style>