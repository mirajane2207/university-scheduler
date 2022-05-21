import axios from "axios";

export const coursesModule = {
    state: () => ({
        courses: [],
        isLoading: false
    }),
    getters: {
    },
    mutations: {
        setCourses(state, courses) {
            state.courses = courses;
        },
        setLoading(state, isLoading) {
            state.isLoading = isLoading;
        }
    },
    actions: {
        async fetchCourses({state, commit}) {
            try {
                commit('setLoading', true);
                const response = await axios.get('/api/courses');
                commit('setCourses', response.data);
            } catch (e) {
                alert('error')
            } finally {
                commit('setLoading', false);
            }
        }
    },
    namespaced: true
}
