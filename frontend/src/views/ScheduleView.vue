<template>
  <div class="lecture-table-view">
    <schedule-table
        :lectures="lectures"
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
      lectures: [
        {id:'1', week:'1',  weekday: 'thu', lecture:'1', auditorium: '5555', course: 'dfvkldsvmcksdmck', professor: 'svvsdvsd', group:'dd255'},
        {id:'2', week:'1', weekday: 'thu',lecture:'1', auditorium: '5555', course: 'dfvkldsvmcksdmck', professor: 'svvsdvsd', group:'dd255'},
        {id:'3', week:'1', weekday: 'thu',lecture:'1', auditorium: '5555', course: 'dfvkldsvmcksdmck', professor: 'svvsdvsd', group:'dd255'},
        {id:'4', week:'1', weekday: 'mon', lecture:'1', auditorium: '5555', course: 'dfvkldsvmcksdmck', professor: 'svvsdvsd', group:'dd255'},
        {id:'5', week:'1', weekday: 'mon', lecture:'1', auditorium: '5555', course: 'dfvkldsvmcksdmck', professor: 'svvsdvsd', group:'dd255'},
        {id:'6', week:'1', weekday: 'fri', lecture:'1', auditorium: '5555', course: 'dfvkldsvmcksdmck', professor: 'svvsdvsd', group:'dd255'},
      ]
    }
  },
  methods: {
    ...mapActions({
      fetchLectures: 'lectures/fetchLectures'
    }),

    createLecture(lecture) {
      this.lectures.push(lecture);
    },
    removeLecture(lectures) {
      this.lectures = this.lectures.filter( c => c.id !== lecture.id)
    }
  },
  mounted(){
    // this.fetchLectures();
  },
  computed: {
    ...mapState({
      // lectures: state => state.lectures.lectures,
      isLoading: state => state.lectures.isLoading
    })
  }
}
</script>

<style>
.lecture-table-view {
  padding: 40px;
}
</style>