<template>
  <div class="wrapper">
<!--    <img src="/img/admin-title.png" alt="" class="admin__title">-->
    <router-link to="/students" class="admin__option">Students</router-link>
    <router-link to="/professors" class="admin__option">Professors</router-link>
    <router-link to="/groups" class="admin__option">Groups</router-link>
    <router-link to="/courses" class="admin__option">Courses</router-link>
    <router-link to="/lectures" class="admin__option">Lectures</router-link>
    <router-link to="/auditoriums" class="admin__option">Auditoriums</router-link>
  </div>
</template>

<script>
export default {
  name: "AdminView"
}
</script>

<style scoped>

</style>