<template>
  <div class="title-wrapper">
    <h1 class="table-title">Timetable</h1>
    <a class="filter" @click="changeFilterVisible">Filter</a>
  </div>
  <div class="filter-form" v-if="filterVisible">
    <div class="format">
      <a class="filter-label">Date Format</a>
      <input class="radio-option checked" type="radio" id="week"
             name="dateFormat" value="week" checked @click="setDateParam('Week')">
      <label for="week">Week</label>
      <input type="radio" id="date"
             name="dateFormat" value="date" class="radio-option" @click="setDateParam('Date')">
      <label for="date">Date</label>
    </div>
    <div class="format">
      <a class="filter-label">Time Format</a>
      <input type="radio" id="time"
             name="timeFormat" value="time" class="radio-option">
      <label for="time">Time</label>
      <input class="radio-option" type="radio" id="lecture"
             name="timeFormat" value="lecture" checked>
      <label for="week">Lecture Number</label>
    </div>
    <div class="format">
      <a class="filter-label">Group</a>
      <custom-select></custom-select>
    </div>
    <div class="format">
      <a class="filter-label">Course</a>
      <custom-select></custom-select>
    </div>
    <div class="format">
      <a class="filter-label">Professor</a>
      <custom-select></custom-select>
    </div>
    <div class="format">
      <a class="filter-label">Auditorium</a>
      <custom-select></custom-select>
    </div>
    <div class="format">
      <a class="filter-label">Period</a>
      <label for="from" class="label">From</label>
      <input type="datetime-local" id="from" class="input">
      <label for="email" class="label">To</label>
      <input type="datetime-local" id="to" class="input">
    </div>
  </div>

  <div class="lecture-table-headers">
    <a class="lecture-table__week">{{ dateFormat }}</a>
    <a class="lecture-table__week">Weekday</a>
    <a class="lecture-table__lecture">Lecture</a>
    <a class="lecture-table__group">Group</a>
    <a class="lecture-table__course">Course</a>
    <a class="lecture-table__professor">Professor</a>
    <a class="lecture-table__auditorium">Auditorium</a>
    <custom-button v-if="role === 'professor'"
                   class="table-create-btn"
                   @click="showCreate"
    >Plan
    </custom-button>
    <!--    <lecture-form v-model:show="createVisible">-->
    <!--      <div class="form-btns">-->
    <!--        <custom-button-->
    <!--            class="form-create-btn"-->
    <!--            @click="createItem"-->
    <!--        >Create-->
    <!--        </custom-button>-->
    <!--      </div>-->
    <!--    </lecture-form>-->
  </div>

  <div class="lecture-table" v-if="lectures.length > 0"
       v-for="lecture in lectures"
       :key="lecture.id"
  >
    <a class="lecture-table__id" v-if="dateFormat==='Week'">{{ lecture.week }}</a>
    <a class="lecture-table__id" v-else>{{ lecture.date}}</a>
    <a class="lecture-table__lecture">{{ lecture.weekday}}</a>
    <a class="lecture-table__lecture">{{ lecture.lecture }}</a>
    <a class="lecture-table__group">{{ lecture.group }}</a>
    <a class="lecture-table__course">{{ lecture.course }}</a>
    <a class="lecture-table__professor">{{ lecture.professor }} {{ lecture.name }}</a>
    <a class="lecture-table__auditorium-lg">{{ lecture.auditorium }}</a>
    <!--    <button-->
    <!--        class="table-edit-btn"-->
    <!--        @click="showEdit"-->
    <!--    >Edit-->
    <!--    </button>-->
  </div>
  <h2 v-else>
    List is empty
  </h2>
</template>

<script>

import {mapState} from "vuex";

export default {
  name: 'ScheduleTable',

  props: {
    lectures: {
      type: Array,
      required: true
    }
  },
  data() {
    return {
      createVisible: false,
      filterVisible: false,
      dateFormat: 'Week',
      counter: 0,
      dates: [],
    }
  },

  methods: {
    showCreate() {
      this.createVisible = true;
    },
    changeFilterVisible() {
      this.filterVisible = !this.filterVisible;
    },
    setDateParam(name) {
      this.dateFormat = name;
    },
    generateDate() {
      const options = {month: 'long', day: 'numeric'};
      const date = new Date(Date.now());
      date.set

      this.lectures[0].date = date.toLocaleDateString('en-US', options);
      for (let i = 1; i < this.lectures.length;) {

        if (this.lectures[i].weekday !== this.lectures[i - 1].weekday) {
          date.setDate(date.getDate() + 1);
        }

        this.lectures[i].date = curDate.toLocaleDateString('en-US', options);
        i++;
      }
    }
  },
  watch: {
    dateFormat() {
      this.generateDate();
    }
  },
  computed: {
    ...mapState({
      role: state => state.role
    }),
  }
}
</script>

<style scoped>
.lecture-table {
  display: grid;
  grid-template-columns: repeat(12, 1fr);
  grid-gap: 10px;

}

.title-wrapper {
  display: flex;
}

.table-title {
  margin-bottom: 10px;
  font-family: 'Open Sans';
  font-weight: 700;
  font-size: 48px;
  line-height: 65px;

  text-transform: uppercase;
  color: #8AC1D9;
}

.filter {
  margin-top: 55px;
  margin-left: 10px;
  text-decoration: none;
  color: #8AC1D9;
}

.filter::after {
  content: '▾';
}

.filter:hover {
  text-decoration: underline;
}

.lecture-table {
  display: grid;
  max-height: 24px;
  overflow: hidden;

}

.lecture-table-headers {
  margin-top: 40px;
  padding-bottom: 10px;
  margin-bottom: 20px;
  display: grid;
  grid-template-columns: repeat(12, 1fr);
  grid-gap: 10px;
  border-bottom: 4px solid #8AC1D9;
  font-family: 'Open Sans';
  font-weight: 600;
  color: #E0E0E0;

}

.lecture-table__course {
  grid-column: span 3;
}

.lecture-table__professor {
  grid-column: span 3;
}

.lecture-table__auditorium {
  grid-column: span 2;
}

.lecture-table__auditorium-lg {
  grid-column: span 3;
}

.table-create-btn {
  grid-column-start: 12;
  grid-column-end: 13;
}

.table-edit-btn {
  grid-column-start: 11;
  grid-column-end: 13;
  border: 0;
  padding: 0;
  background: transparent;
  color: #8AC1D9;
  font-family: 'Montserrat';
  font-size: 20px;
}

.form-btns {
  margin-top: 30px;
  display: flex;

}

.form-create-btn {
  padding: 10px;
  margin-right: 10px;
  background: #8AC1D9;
  border-radius: 8px;
  font-family: 'Montserrat';
  font-style: normal;
  font-weight: 400;
  font-size: 24px;
  line-height: 26px;
  letter-spacing: 0.1em;
  text-transform: uppercase;
  color: #FFFFFF;
}

.table-update-btn {
  padding: 10px;
  margin-right: 10px;
  background: #8AC1D9;
  border-radius: 8px;
  font-family: 'Montserrat';
  font-style: normal;
  font-weight: 400;
  font-size: 24px;
  line-height: 26px;
  letter-spacing: 0.1em;
  text-transform: uppercase;
  color: #FFFFFF;
}

.table-delete-btn {
  padding: 10px;
  text-transform: uppercase;
}

.filter-label {
  font-family: "Open Sans SemiBold";
  margin-right: 10px;
}

.format {
  margin-bottom: 20px;
}

input[type=radio] {
  appearance: none;
  margin-left: 20px;
  border-radius: 50%;
  width: 13px;
  height: 13px;

  border: 2px solid #999;
  transition: 0.2s all linear;
  outline: none;
}

input:checked {
  background: #8AC1D9;
  border: 2px solid #8AC1D9;
}

.radio-option:checked + label {
  color: #8AC1D9;
}

.input {
  margin-bottom: 30px;
  margin-left: 10px;
  border: 0;
  border-bottom: 1px solid #8AC1D9;
  background: transparent;
  color: #E0E0E0;
  width: 20%;
  font-size: 16px;
  font-family: 'Montserrat';
  font-weight: 400;
  color: #E0E0E0;
}

.input:focus, input:active {
  outline: none;
}

.label {
  margin-left: 36px;
  text-transform: none;
  color: #8AC1D9;
}

</style>