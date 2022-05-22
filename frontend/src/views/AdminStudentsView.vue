<template>
  <div className="student-table-view">
    <students-table
        :students="students"
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

  // data() {
  //   return {
  //     students: [
  //       {id: '1', name: 'english', surname: 'fhsjkfchnskdcks', group: 'dfvkldsv', email: 'fvdfdcdsc', courses: "dfvercdedc" },
  //       {id: '1', name: 'english', surname: 'fhsjkfchnskdcks', group: 'dfvkldsv', email: 'fvdfdcdsc', courses: "dfvercdedc" },
  //       {id: '1', name: 'english', surname: 'fhsjkfchnskdcks', group: 'dfvkldsv', email: 'fvdfdcdsc', courses: "dfvercdedc" },
  //       {id: '1', name: 'english', surname: 'fhsjkfchnskdcks', group: 'dfvkldsv', email: 'fvdfdcdsc', courses: "dfvercdedc" },
  //       {id: '1', name: 'english', surname: 'fhsjkfchnskdcks', group: 'dfvkldsv', email: 'fvdfdcdsc', courses: "dfvercdedc" },
  //     ]
  //   }
  // },
  methods: {
    ...mapActions({
      fetchStudents: 'students/fetchStudents'
    }),

    createCourse(student) {
      this.students.push(student);
    },
    removeCourse(students) {
      this.students = this.students.filter(c => c.id !== student.id)
    }
  },
  mounted() {
    this.fetchStudents();
  },
  computed: {
    ...mapState({
      students: state => state.students.students,
      isLoading: state => state.students.isLoading
    })
  }
}
</script>

<style>
.student-table-view {
  padding: 40px;
}
</style>