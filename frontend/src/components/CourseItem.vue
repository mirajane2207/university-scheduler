<template>
  <div class="wrapper">
  <div class="course">
    <div class="course__info">
      <h1 class="course__name">{{courses.name}}</h1>
      <p class="course__description">
        {{courses.description}}
      </p>
      <h2 class="course__professors">Professors</h2>
      <p class="course__professors-list">
        Primrose Rubio, Aliqua fugiat, nostrud irure, irure cupidatat
      </p>
    </div>
    <div class="course__title-wrapper">
      <h1 class="course__title">{{ courses.name }}</h1>
    </div>
  </div>
  </div>
</template>

<script>

import CustomButton from "@/components/UI/CustomButton";
export default {
  components: {CustomButton},
  props: {
    course: {
      type: Object,
      required: true,
    }
  }
}
</script>

<style scoped>

.course {
  margin-top: 180px;
  margin-bottom: 400px;
  width: 100%;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;

}

.course__name {
  background-image: url("@/assets/courses-line.png");
  background-repeat: no-repeat;
  background-position: 85px;
  margin-bottom: 40px;
  font-family: 'Open Sans';
  font-style: normal;
  font-weight: 700;
  font-size: 48px;
  line-height: 65px;
  text-transform: uppercase;
}

.course__description {
  width: 450px;
  margin-left: 85px;
  margin-bottom: 130px;
}

.course__professors {
  margin-bottom: 30px;
  font-family: 'Open Sans';
  font-style: normal;
  font-weight: 600;
  font-size: 28px;
  line-height: 38px;
  text-transform: uppercase;

  color: #8AC1D9;
}

.course__professors-list {
  width: 450px;
  margin-left: 85px;
}

.course__title-wrapper {
  text-align: center;
}

.course__title {

  margin-top: 250px;
  width: 500px;
  font-family: 'Montserrat';
  font-style: normal;
  font-weight: 300;
  font-size: 64px;
  line-height: 78px;
  text-align: center;
  text-transform: uppercase;

  color: #B3CCD7;

  text-shadow: -2px 9px 27px #8AC1D9;
}

.wrapper {
  max-width: 1180px;
  margin: 0px auto;
  display: flex;
  flex-wrap: wrap;

}

</style>