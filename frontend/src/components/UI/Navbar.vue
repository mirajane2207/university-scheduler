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

    <button class="log-in-btn"> Log in</button>
  </div>
</template>

<script>
import CustomButton from "@/components/UI/CustomButton";
export default {
  name: "Navbar",
  components: {CustomButton}
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
  font-family: 'Open Sans';
  font-weight: 400;
  font-size: 16px;
  line-height: 22px;
  text-decoration: none;
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
  padding: 5px 60px;
  background: #8AC1D9;
  border-radius: 8px;
  font-family: 'Montserrat';
  font-style: normal;
  font-weight: 400;
  font-size: 16px;
  line-height: 26px;
  /* identical to box height, or 162% */
  text-transform: uppercase;

  color: #FFFFFF;
}
</style>