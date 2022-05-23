<template>
  <div class="side-form" v-if="show" @click.stop="hideDialog">
    <div @click.stop>
      <form @submit.prevent class="course-form">
        <div class="title-wrapper">
          <a class="course-form__id">ID</a>
          <a class="close" @click.stop="hideDialog">Close</a>
        </div>
        <custom-input>
          <label class="label">Name</label>
        </custom-input>
        <slot></slot>
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
      </form>
    </div>
  </div>
</template>

<script>
export default {
  name: "UpdateForm",
  props: {
    show: {
      type: Boolean,
      default: false
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
.title-wrapper {
  display: flex;
}

.close{
  margin-top: 14px;
  margin-left: 10px;
  font-weight: 400;
  text-decoration: none;
  color: #8AC1D9;
}

.close:hover {
  text-decoration: underline;
}

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
  padding: 10px;
}

</style>