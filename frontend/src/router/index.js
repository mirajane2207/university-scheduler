import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '@/views/HomeView.vue'
import CourseView from "@/views/CourseView";

const routes = [
  {
    path: '/',
    component: HomeView
  },
  {
    path: '/students',
    component: CourseView
  },
  {
    path: '/professors',
    component: CourseView
  },
  {
    path: '/groups',
    component: CourseView
  },
  {
    path: '/auditoriums',
    component: CourseView
  },
  {
    path: '/courses',
    component: CourseView
  },
  {
    path: '/lectures',
    component: CourseView
  }
]

const router = createRouter({
  routes,
  history: createWebHistory(process.env.BASE_URL)
})

export default router;
