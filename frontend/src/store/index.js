import { createStore } from 'vuex'
import {courseModule} from "@/store/courseModule";

export default createStore({
  modules: {
    course: courseModule
  }
})
