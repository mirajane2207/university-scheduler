import axios from "axios";

export const auditoriumsModule = {
    state: () => ({
        auditoriums: [],
        isLoading: false
    }),
    getters: {
    },
    mutations: {
        setAuditoriums(state, auditoriums) {
            state.auditoriums = auditoriums;
        },
        setLoading(state, isLoading) {
            state.isLoading = isLoading;
        }
    },
    actions: {
        async fetchAuditoriums({state, commit}) {
            try {
                commit('setLoading', true);
                const response = await axios.get('/api/auditoriums');
                commit('setAuditoriums', response.data);
            } catch (e) {
                alert('error')
            } finally {
                commit('setLoading', false);
            }
        }
    },
    namespaced: true
}
