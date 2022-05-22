<template>
  <div class="auditorium-table-view">
    <auditoriums-table
        :auditoriums="auditoriums"
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
      auditoriums: [
        {id:'1', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
        {id:'2', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
        {id:'3', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
        {id:'4', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
        {id:'5', name:'english', description: 'fhsjkfchnskdcks', professors: 'dfvkldsvmcksdmck'},
      ]
    }
  },
  methods: {
    ...mapActions({
      fetchCourses: 'auditoriums/fetchCourses'
    }),

    createCourse(auditorium) {
      this.auditoriums.push(auditorium);
    },
    removeCourse(auditoriums) {
      this.auditoriums = this.auditoriums.filter( c => c.id !== auditorium.id)
    }
  },
  mounted(){
    // this.fetchCourses();
  },
  computed: {
    ...mapState({
      // auditoriums: state => state.auditoriums.auditoriums,
      isLoading: state => state.auditoriums.isLoading
    })
  }
}
</script>

<style>
.auditorium-table-view {
  padding: 40px;
}
</style>