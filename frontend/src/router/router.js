import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '@/views/HomeView.vue'
import CoursesView from "@/views/CoursesViewAdmin";
import AccountView from "@/views/AccountView";
import ScheduleView from "@/views/ScheduleView";
import CoursesViewWithStore from "@/views/CoursesViewWithStore";

const routes = [
  {
    path: '/',
    component: HomeView
  },
  {
    path: '/students',
    component: CoursesView
  },
  {
    path: '/professors',
    component: CoursesView
  },
  {
    path: '/groups',
    component: CoursesView
  },
  {
    path: '/auditoriums',
    component: CoursesView
  },
  {
    path: '/admin/courses',
    component: CoursesView
  },
  {
    path: '/lectures',
    component: CoursesView
  },
  {
    path: '/account',
    component: AccountView
  },
  {
    path: '/courses',
    component: CoursesView
  },
  {
    path: '/schedule',
    component: ScheduleView
  },
  {
    path: '/store',
    component: CoursesViewWithStore
  }
]

const router = createRouter({
  routes,
  history: createWebHistory(process.env.BASE_URL)
})

export default router;
