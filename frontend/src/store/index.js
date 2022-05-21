import { createStore } from 'vuex'
import {coursesModule} from "@/store/coursesModule";
import {auditoriumsModule} from "@/store/auditoriumsModule";
import {groupsModule} from "@/store/groupsModule";
import {lecturesModule} from "@/store/lecturesModule";
import {professorsModule} from "@/store/professorsModule";
import {studentsModule} from "@/store/studentsModule";


export default createStore({
  modules: {
    auditoriums: auditoriumsModule,
    courses: coursesModule,
    groups: groupsModule,
    lectures: lecturesModule,
    professors: professorsModule,
    students: studentsModule
  }
})
