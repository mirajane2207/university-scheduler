import axios from "axios";

export const lecturesModule = {
    state: () => ({
        lectures: [],
        isLoading: false
    }),
    getters: {
    },
    mutations: {
        setLectures(state, lectures) {
            state.lectures = lectures;
        },
        setLoading(state, isLoading) {
            state.isLoading = isLoading;
        }
    },
    actions: {
        async fetchLectures({state, commit}) {
            try {
                commit('setLoading', true);
                const response = await axios.get('/api/lectures');
                commit('setLectures', response.data);
            } catch (e) {
                alert('error')
            } finally {
                commit('setLoading', false);
            }
        }
    },
    namespaced: true
}
