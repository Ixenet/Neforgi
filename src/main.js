import './assets/main.css'

import { createApp } from 'vue';
import { createRouter, createWebHistory } from 'vue-router';
import App from './App.vue'
import Home from './Home.vue';
import ItemPage from './ItemPage.vue';

const routes = [
    {path: '/', component: Home},
    {path: '/catalog/sweatshirts/2', component: ItemPage},
];

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes,
})

createApp(App).use(router).mount('#app')
