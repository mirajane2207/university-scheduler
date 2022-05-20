<template>
  <div class="log-in-form ">
    <form action="" class="log-in-form__input-form">
      <h1 class="log-in-form__title">log in form</h1>
      <input type="text" class="log-in-form__field" placeholder="login">
      <input type="password" class="log-in-form__field" placeholder="password">
      <button class="log-in-form__submit">log in</button>
    </form>
  </div>
</template>

<script>
export default {
  name: "LoginForm"
}
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Montserrat:wght@400;600&family=Open+Sans&display=swap');

.log-in-form {
  height: 520px;
  width: 700px;
  background: linear-gradient(134.39deg, rgba(72, 72, 72, 0.6) 2.01%, rgba(24, 24, 24, 0) 106.03%);
  box-shadow: inset 0px 0px 10px #404141;
  filter: drop-shadow(2px 4px 4px rgba(0, 0, 0, 0.1));
  backdrop-filter: blur(6px);
  border-radius: 20px;
  display: flex;
  flex-wrap: wrap;

}

.log-in-form__input-form {
  margin: 48px auto;
  max-width: 438px;
  text-align: center;

}

.log-in-form__title {
  margin-bottom: 46px;
  font-family: 'Open Sans';
  font-style: normal;
  font-weight: 600;
  font-size: 48px;
  line-height: 40px;
  text-transform: uppercase;
}

.log-in-form__field {
  margin-bottom: 17px;
  width: 100%;
  height: 61px;
  border: 1px solid #8AC1D9;
  background-color: transparent;
  border-radius: 8px;
  text-align: center;
  font-family: 'Montserrat';
  font-style: normal;
  font-weight: 400;
  font-size: 24px;
  line-height: 26px;
  letter-spacing: 0.1em;
  text-transform: uppercase;
  color: #8AC1D9;
}


.log-in-form__submit {
  border: 0;
  margin-top: 30px;
  margin-bottom: 90px;
  width: 100%;
  height: 61px;
  background: #8AC1D9;
  border-radius: 8px;
  font-family: 'Montserrat';
  font-style: normal;
  font-weight: 400;
  font-size: 24px;
  line-height: 26px;
  letter-spacing: 0.1em;
  font-weight: 400;
  font-size: 24px;
  letter-spacing: 0.1em;
  color: #FFFFFF;
  text-transform: uppercase;
}

</style>