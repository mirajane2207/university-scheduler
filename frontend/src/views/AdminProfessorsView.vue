<template>
  <div className="professor-table-view">
    <professors-table
        :professors="professors"
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
      professors: [
        {id: '1', name: 'english', surname: 'fhsjkfchnskdcks', group: 'dfvkldsv', email: 'fvdfdcdsc', courses: "dfvercdedc" },
        {id: '1', name: 'english', surname: 'fhsjkfchnskdcks', group: 'dfvkldsv', email: 'fvdfdcdsc', courses: "dfvercdedc" },
        {id: '1', name: 'english', surname: 'fhsjkfchnskdcks', group: 'dfvkldsv', email: 'fvdfdcdsc', courses: "dfvercdedc" },
        {id: '1', name: 'english', surname: 'fhsjkfchnskdcks', group: 'dfvkldsv', email: 'fvdfdcdsc', courses: "dfvercdedc" },
        {id: '1', name: 'english', surname: 'fhsjkfchnskdcks', group: 'dfvkldsv', email: 'fvdfdcdsc', courses: "dfvercdedc" },
      ]
    }
  },
  methods: {
    ...mapActions({
      fetchCourses: 'professors/fetchCourses'
    }),

    createCourse(professor) {
      this.professors.push(professor);
    },
    removeCourse(professors) {
      this.professors = this.professors.filter(c => c.id !== professor.id)
    }
  },
  mounted() {
    // this.fetchCourses();
  },
  computed: {
    ...mapState({
      // professors: state => state.professors.professors,
      isLoading: state => state.professors.isLoading
    })
  }
}
</script>

<style>
.professor-table-view {
  padding: 40px;
}
</style>