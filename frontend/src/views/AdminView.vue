<template>
  <div class="wrapper">
    <img src="@/assets/admin-title.png" alt="" class="admin__title">
    <router-link to="/admin/students" class="admin__option">Students</router-link>
    <router-link to="/admin/professors" class="admin__option">Professors</router-link>
    <router-link to="/admin/groups" class="admin__option">Groups</router-link>
    <router-link to="/admin/courses" class="admin__option">Courses</router-link>
    <router-link to="/admin/lectures" class="admin__option">Lectures</router-link>
    <router-link to="/admin/auditoriums" class="admin__option">Auditoriums</router-link>
  </div>
</template>

<script>
export default {
  name: "AdminView"
}
</script>

<style scoped>
.wrapper {
  margin: 50px auto;
  display: flex;
  flex-direction: column;
  text-align: center;
  max-width: 820px;
  text-align: center;
}

.admin__title {
  margin-bottom: 50px;
  background-size: cover;
  width: 820px;
  height: 120px;
}

.admin__option {
  margin-bottom: 20px;
  text-decoration: none;
  font-family: 'Open Sans';
  font-style: normal;
  font-weight: 600;
  font-size: 40px;
  line-height: 54px;
  text-align: center;
  text-transform: uppercase;

  /* light gray */

  color: #E0E0E0;
}

.admin__option:hover {
  color: #8AC1D9;
}
</style>