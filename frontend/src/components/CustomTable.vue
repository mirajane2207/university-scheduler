<template>
  <div class="title-wrapper">
    <slot name="table-title"></slot>
    <router-link to="/admin" class="back-link">Back</router-link>
  </div>
  <div class="custom-table-headers">
    <a class="custom-table__id">ID</a>
    <a class="custom-table__name">Name</a>
    <slot name="table-header"></slot>
    <custom-button
        class="table-create-btn"
        @click="showCreate"
    >Create
    </custom-button>
    <create-form v-model:show="createVisible">
      <slot name="create-form"></slot>
    </create-form>
  </div>
  <update-form v-model:show="editVisible">
    <slot name="update-form"></slot>
  </update-form>
  <div class="custom-table" v-if="items.length > 0"
       v-for="item in items"
       :item="item"
       :key="item.id">
    <a class="custom-table__id">{{ item.id }}</a>
    <a class="custom-table__name">{{ item.name }}</a>
    <slot name="item" v-bind="item"></slot>
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
import UpdateForm from "@/components/UpdateForm";
export default {
  name: 'CustomTable',
  components: {UpdateForm},
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
.title-wrapper {
  display: flex;
}

.custom-table {
  display: grid;
  grid-template-columns: repeat(12, 1fr);
  grid-gap: 10px;

}

.back-link{
margin-top: 55px;
  margin-left: 10px;
  text-decoration: none;
  color: #8AC1D9;
}

.back-link:hover{
  text-decoration: underline;
}

.custom-table:only-child{
  display: grid;
  max-height: 24px;
  overflow: hidden;

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
  grid-column: span 2;
  max-height: 24px;
  overflow: hidden;
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
</style>