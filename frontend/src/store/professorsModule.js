import axios from "axios";

export const professorsModule = {
    state: () => ({
        professors: [],
        isLoading: false
    }),
    getters: {
    },
    mutations: {
        setProfessors(state, professors) {
            state.professors = professors;
        },
        setLoading(state, isLoading) {
            state.isLoading = isLoading;
        }
    },
    actions: {
        async fetchProfessors({state, commit}) {
            try {
                commit('setLoading', true);
                const response = await axios.get('/api/professors');
                commit('setProfessors', response.data);
            } catch (e) {
                alert('error')
            } finally {
                commit('setLoading', false);
            }
        }
    },
    namespaced: true
}
