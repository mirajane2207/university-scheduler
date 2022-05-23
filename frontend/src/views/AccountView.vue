<template>
  <div class="wrapper">
    <div class="courses-section">
      <div class="courses">
        <div class="courses__title-wrapper">
          <h2 class="courses__title">courses</h2>
        </div>
        <ul class="courses__list">
          <li class="courses__list-item">English</li>
          <li class="courses__list-item">High math</li>
          <li class="courses__list-item">Artificial intelligense</li>
          <li class="courses__list-item">Computer system</li>
          <li class="courses__list-item">Computer network</li>
          <li class="courses__list-item">Multimedia technology</li>
        </ul>
      </div>
    </div>
    <div class="info-section">
      <section class="main-info">
        <h1 class="main-info__name">{{ user.name }} {{user.surname}}</h1>
        <p class="main-info__role">{{ user.role }}
        <span> <router-link to="/group" class="main-info__group" v-if="user.role === 'student'">{{user.group}}</router-link>
</span>
        </p>
        <div class="edit-form" v-if="editVisible">
          <label for="email" class="label">Email</label>
          <input type="email" id="email" class="input">
          <label for="email" class="label">Password</label>
          <input type="text" id="email" class="input">
        </div>
      </section>
      <section class="side-info">
        <div class="side-info__pic">
          <img src="@/assets/student-photo.jpg" alt="user-pic" class="user-pic">
        </div>

        <div class="info__btns">
          <div class="log-out-btn" v-if="editVisible">
            <a href="#" class="log-out-btn-title" @click="hideEdit" >Save</a>
          </div>
          <custom-button @click="showEdit" v-if="!editVisible">Edit</custom-button>
          <div class="log-out-btn" v-if="!editVisible">
            <a href="log-out-btn" class="log-out-btn-title" >log out</a>
          </div>
        </div>
      </section>
    </div>
  </div>
</template>

<script>
export default {
  name: "AccountView",
  components: {},

  data() {
    return {
      user: {
        id: '1',
        name: 'Oksana',
        surname: 'chernenko',
        role: 'student',
        group: 'SP-437B'
      },
      editVisible: false
    }
  },
  methods: {
    showEdit() {
      this.editVisible = true;
    },
    hideEdit() {
      this.editVisible = false;
    }
  }
}
</script>

<style scoped>
.wrapper {
  display: flex;
  flex-wrap: nowrap;
  max-width: 1200px;
  margin: 50px auto;
}

/* Main styles end*/



/* Courses styles start*/
.courses-section {
  margin: 0 0 0 auto;
  width: 800px;
  height: 634px;
  background: linear-gradient(134.39deg, rgba(72, 72, 72, 0.6) 2.01%, rgba(24, 24, 24, 0) 106.03%);
  box-shadow: inset 0px 0px 4px #808384;
  filter: drop-shadow(2px 4px 4px rgba(0, 0, 0, 0.1));
  backdrop-filter: blur(6px);
  border-radius: 20px;
  /* transform: matrix(-1, 0, 0, 1, 0, 0); */
}

.courses {
  display: flex;
  flex-wrap: wrap;
  width: 500px;
  margin: 100px 0 0 auto;
  justify-content: flex-start;
}

.courses__title-wrapper {
  width: 100%;
}

.courses__title {
  width: 187px;
  height: 38px;
  margin-top: 0px;
  margin-left: 52px;
  margin-bottom: 26px;
  background-image: url(@/assets/account-plane.png);
  background-repeat: no-repeat;
  background-position: right;
  font-family: 'Open Sans';
  font-weight: 700;
  font-size: 36px;
  line-height: 49px;
  text-transform: uppercase;
}

.courses__list {
  margin-left: 120px;
  margin-bottom: 128px;
  list-style-image: url(@/assets/svg/circle.svg);
}

.courses__list-item {
  font-weight: 600;
  font-size: 20px;
  line-height: 24px;
}

.courses__btns {
  margin: 0 auto;
}

.btn {
  margin-right: 10px;
  height: 65.88px;
  width: 193px;
  background: linear-gradient(134.39deg, rgba(72, 72, 72, 0.6) 2.01%, rgba(24, 24, 24, 0) 106.03%);
  box-shadow: inset 0px 0px 4px #808384;
  filter: drop-shadow(2px 4px 4px rgba(0, 0, 0, 0.1));
  backdrop-filter: blur(6px);
  border-radius: 8px;

  font-family: 'Montserrat';
  font-style: normal;
  font-weight: 400;
  font-size: 20px;
  line-height: 26px;
  text-decoration: 0;
  letter-spacing: 0.1em;
  color: #E0E0E0;
  margin-bottom: 10px;
}

/* Courses styles end*/

/* Info styles start*/


.info-section {
  position: absolute;
  top: 70px;
  bottom: 0;
  margin: auto;
  padding-top: 48px;
  width: 700px;
  height: 520px;
  background: linear-gradient(134.39deg, rgba(72, 72, 72, 0.6) 2.01%, rgba(24, 24, 24, 0) 106.03%);
  box-shadow: inset 0px 0px 4px #808384;
  filter: drop-shadow(2px 4px 4px rgba(0, 0, 0, 0.1));
  backdrop-filter: blur(6px);
  border-radius: 20px;
  display: flex;
  flex-wrap: wrap;
}

.main-info {
  width: 364px;
  padding-left: 48px;
  text-transform: uppercase;
}

.main-info__name {
  margin-top: 0px;
  margin-bottom: 5px;
  font-family: 'Open Sans';
  font-weight: 700;
  font-size: 48px;
  line-height: 60px;
}

.main-info__role {
  margin-top: 0px;
  margin-bottom: 88px;
  line-height: 24px;
  letter-spacing: 0.1em;
}

.main-info__group {
  text-decoration: none;
  font-family: 'Open Sans';
  font-style: normal;
  font-weight: 700;
  font-size: 20px;
  line-height: 27px;
  color: #8AC1D9;
}

.main-info__group:hover {
  text-decoration: underline;
}

.side-info {
  padding-bottom: 50px;
  margin-left: 88px;
  display: flex;
  flex-direction: column;
  justify-content: space-between;

}

.side-info__pic {
  width: 190px;
  height: 190px;
  border-radius: 100px;
  overflow: hidden;
  display: flex;
  justify-content: center;
  align-items: center;
}

.user-pic {
  width: 100%;
  height: auto;
}

.log-out-btn {
  width: 192px;
  height: 61px;
  padding-top: 19px;
  background: #8AC1D9;
  border-radius: 8px;
}

.log-out-btn-title {

  text-decoration: none;
  padding-left: 33px;
  font-size: 24px;
  line-height: 26px;
  text-transform: uppercase;

  letter-spacing: 0.1em;

  color: #FFFFFF;
}

/* Info styles end*/

.input {
  margin-bottom: 30px;
  border: 0;
  border-bottom: 3px solid #E0E0E0;
  background: transparent;
  color: #E0E0E0;
  width: 100%;
  padding: 0.35rem 0 0.55rem;
  font-family: 'Montserrat';
  font-size: 20px;
  font-weight: 400;
  color: #E0E0E0;
}

.input:focus, input:active {
  outline: none;
  border-color: #8AC1D9;
}

.label {
  text-transform: none;
  font-family: 'Open Sans SemiBold';
  font-size: 24px;
}
</style>