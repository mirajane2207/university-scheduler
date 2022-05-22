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
  methods: {
    ...mapActions({
      fetchAuditoriums: 'auditoriums/fetchAuditoriums'
    }),

    createAuditorium(auditorium) {
      this.auditoriums.push(auditorium);
    },
    removeAuditorium(auditoriums) {
      this.auditoriums = this.auditoriums.filter( c => c.id !== auditorium.id)
    }
  },
  mounted(){
    this.fetchAuditoriums();
  },
  computed: {
    ...mapState({
      auditoriums: state => state.auditoriums.auditoriums,
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