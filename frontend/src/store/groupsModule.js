import axios from "axios";

export const groupsModule = {
    state: () => ({
        groups: [],
        isLoading: false
    }),
    getters: {
    },
    mutations: {
        setGroups(state, groups) {
            state.groups = groups;
        },
        setLoading(state, isLoading) {
            state.isLoading = isLoading;
        }
    },
    actions: {
        async fetchGroups({state, commit}) {
            try {
                commit('setLoading', true);
                const response = await axios.get('/api/groups');
                commit('setGroups', response.data);
            } catch (e) {
                alert('error')
            } finally {
                commit('setLoading', false);
            }
        }
    },
    namespaced: true
}
