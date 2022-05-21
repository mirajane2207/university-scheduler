import axios from "axios";

export const studentsModule = {
    state: () => ({
        students: [],
        isLoading: false
    }),
    getters: {
    },
    mutations: {
        setStudents(state, students) {
            state.students = students;
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
        }
    },
    namespaced: true
}
