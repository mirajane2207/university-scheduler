<template>
  <div class="header">
    <div class="header__logo">
      <a href="/" class="header__logo-link">
        <img src="@/assets/svg/logo.svg" alt="NAU Scheduler" class="header__logo-pic">
      </a>
    </div>

      <nav class="header__nav">
        <ul class="header__list">
          <li class="header__item">
            <router-link to="/account" class="header__link">Account</router-link>
          </li>
          <li class="header__item">
            <router-link to="/courses" class="header__link">courses</router-link>
          </li>
          <li class="header__item">
            <router-link to="/schedule" class="header__link">schedule</router-link>
          </li>
        </ul>
      </nav>
    <custom-button
        class="log-in-btn"
        @click="showDialog"
    >
      Log in
    </custom-button>
    <custom-dialog v-model:show="dialogVisisble">
      <login-form>

      </login-form>
    </custom-dialog>
  </div>
</template>

<script>

import LoginFrom from "@/components/LoginFrom";

export default {
  name: "Navbar",
  components: {LoginFrom},

  data() {
    return {
      dialogVisisble: false,
    }
  },
  methods: {
    showDialog() {
      this.dialogVisisble = true;
    }
  }
}
</script>

<style scoped>
.header {
  padding: 20px 40px;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
}

.header__list {
  padding: 0;
  list-style: none;
  display: flex;
  flex-wrap: wrap;
}

.header__item {
  margin-right: 230px;
}

.header__item:last-child {
  margin-right: 0;
}

.header__link {
  text-decoration: none;
  font-family: 'Open Sans';
  font-weight: 400;
  font-size: 16px;
  line-height: 22px;
  text-transform: uppercase;
  color: #E0E0E0;
}

.header__link:hover {
  opacity: .75;
}

.header__item.active>a {
  color: #8AC1D9;
}

.log-in-btn {
  border-color: transparent;
  padding: 0px 60px;
  background: #8AC1D9;
  border-radius: 8px;
  font-family: 'Montserrat';
  font-size: 16px;
  /* identical to box height, or 162% */
  text-transform: uppercase;

  color: #FFFFFF;
}

.header__logo{
  width: 180px;
}
</style>