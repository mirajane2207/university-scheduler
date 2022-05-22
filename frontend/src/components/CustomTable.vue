<template>
  <slot name="table-title"></slot>
  <div class="custom-table-headers">
    <a class="custom-table__id">ID</a>
    <a class="custom-table__name">Name</a>
    <slot name="table-header"></slot>
    <custom-button
        class="table-create-btn"
        @click="showCreate"
    >Create
    </custom-button>
    <side-form v-model:show="createVisible">
      <slot name="create-form"></slot>
    </side-form>
  </div>
  <side-form v-model:show="editVisible">
    <slot name="update-form"></slot>
  </side-form>
  <div class="custom-table" v-if="items.length > 0"
       v-for="item in items"
       :item="item"
       :key="item.id">
    <a class="custom-table__id">{{ item.id }}</a>
    <a class="custom-table__name">{{ item.name }}</a>
    <slot name="item" v-bind="item"></slot>
    <button
        class="table-edit"
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
    }
  }
}
</script>

<style scoped>
.custom-table {
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
  color: #E0E0E0;

}

.custom-table__name {
  grid-column: span 3;
  max-height: 24px;
  overflow: hidden;
}

.table-create-btn {
  grid-column: span 2;
}

.table-edit {
  border: 0;
  padding: 0;
  background: transparent;
  grid-column: span 2;
  color: #8AC1D9;
  font-family: 'Montserrat';
  font-size: 20px;
}
</style>