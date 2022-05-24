import axios from "axios";

export const studentsModule = {
    state: () => ({
        students: [],
        student: {
          type: Object
        },
        isLoading: false
    }),
    getters: {
    },
    mutations: {
        setStudents(state, students) {
            state.students = students;
        },
        setStudent(state, student) {
            state.student = student;
        },
        setLoading(state, isLoading) {
            state.isLoading = isLoading;
        }
    },
    actions: {
        async fetchStudents({state, commit}) {
            try {
                commit('setLoading', true);
                const response = await axios.get('/api/students');
                commit('setStudents', response.data);
            } catch (e) {
                alert('error')
            } finally {
                commit('setLoading', false);
            }
        },
        async fetchStudent({state, commit}) {
            try {
                const response = await axios.get('/api/students/1');
                commit('setStudent', response.data);
            } catch (e) {
                alert('error')
            }
        }
    },
    namespaced: true
}
