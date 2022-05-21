import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '@/views/HomeView.vue'
import AccountView from "@/views/AccountView";
import ScheduleView from "@/views/ScheduleView";
import CoursesViewWithStore from "@/views/CoursesViewWithStore";
import AdminView from "@/views/AdminView";
import AdminStudentsView from "@/views/AdminStudentsView";
import AdminProfessorsView from "@/views/AdminProfessorsView";
import AdminGroupsView from "@/views/AdminGroupsView";
import AdminAuditoriumsView from "@/views/AdminAuditoriumsView";
import AdminCoursesView from "@/views/AdminCoursesView";
import AdminLecturesView from "@/views/AdminLecturesView";
import GroupView from "@/views/GroupView";

const routes = [
  {
    path: '/',
    component: HomeView
  },
  {
    path: '/admin/students',
    component: AdminStudentsView
  },
  {
    path: '/admin/professors',
    component: AdminProfessorsView
  },
  {
    path: '/admin/groups',
    component: AdminGroupsView
  },
  {
    path: '/admin/auditoriums',
    component: AdminAuditoriumsView
  },
  {
    path: '/admin/courses',
    component: AdminCoursesView
  },
  {
    path: '/admin/lectures',
    component: AdminLecturesView
  },
  {
    path: '/account',
    component: AccountView
  },
  {
    path: '/courses',
    component: CoursesViewWithStore
  },
  {
    path: '/schedule',
    component: ScheduleView
  },
  {
    path: '/admin',
    component: AdminView
  },
  {
    path: '/group',
    component: GroupView
  },
]

const router = createRouter({
  routes,
  history: createWebHistory(process.env.BASE_URL)
})

export default router;
