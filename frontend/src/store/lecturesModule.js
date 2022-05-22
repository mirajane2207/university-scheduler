import axios from "axios";

export const lecturesModule = {
    state: () => ({
        lectures: [],
        weeks: [
            {id:'1', name: '1'},
            {id:'2', name: '2'}
        ],
        lectureNumbers: [
            {id:'1', name: '1'},
            {id:'2', name: '2'},
            {id:'3', name: '3'},
            {id:'4', name: '4'},
            {id:'5', name: '5'},
            {id:'6', name: '6'},
            {id:'7', name: '7'},
        ],
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
