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
export default {
  name: "LectureForm",
  components: {},

  props: {
    show: {
      type: Boolean,
      default: false
    }
  },

  data() {
    return {
      courses: [
        {id:'1', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
        {id:'2', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
        {id:'3', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
        {id:'4', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
        {id:'5', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
      ]
    }
  },

  methods: {

    hideDialog() {
      this.$emit('update:show', false)
    },
    createItem() {

    }
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

  /* blue */

  color: #8AC1D9;
}

.label {
  margin-top: 40px;
  margin-bottom: 13px;
  font-family: 'Open Sans';
  font-style: normal;
  font-weight: 700;
  font-size: 24px;
  line-height: 33px;

  text-transform: uppercase;
  color: #E0E0E0;
}

.form-btns {
  margin-top: 30px;
  display: flex;

}

.table-create-btn {
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
  text-transform: uppercase;
  padding: 10px;
}

</style>