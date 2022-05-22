<template>
  <div class="group-table-view">
    <groups-table
        :groups="groups"
        v-if="!isLoading"
    />
    <div v-else>
      Loading data..
    </div>
  </div>
</template>

<script>
import {mapState, mapActions} from 'vuex';

export default {

  data() {
    return {
      groups: [
        {id:'1', name:'english', description: 'fhsjkfchnskdcks', students: 'dfvkldsvmcksdmck'},
        {id:'2', name:'english', description: 'fhsjkfchnskdcks', students: 'dfvkldsvmcksdmck'},
        {id:'3', name:'english', description: 'fhsjkfchnskdcks', students: 'dfvkldsvmcksdmck'},
        {id:'4', name:'english', description: 'fhsjkfchnskdcks', students: 'dfvkldsvmcksdmck'},
        {id:'5', name:'english', description: 'fhsjkfchnskdcks', students: 'dfvkldsvmcksdmck'},
      ]
    }
  },
  methods: {
    ...mapActions({
      fetchCourses: 'groups/fetchCourses'
    }),

    createCourse(group) {
      this.groups.push(group);
    },
    removeCourse(groups) {
      this.groups = this.groups.filter( c => c.id !== group.id)
    }
  },
  mounted(){
    // this.fetchCourses();
  },
  computed: {
    ...mapState({
      // groups: state => state.groups.groups,
      isLoading: state => state.groups.isLoading
    })
  }
}
</script>

<style>
.group-table-view {
  padding: 40px;
}
</style>