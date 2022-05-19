import { createApp } from 'vue'
import App from './App'
import components from '@/components/UI'
import router from "@/router/router";
import store from "@/store";
import LoginFrom from "@/components/LoginFrom";

const  app = createApp(App)

app.component("LoginForm", LoginFrom)

components.forEach(component => {
    app.component(component.name, component)
})

app
    .use(store)
    .use(router)
    .mount('#app');
