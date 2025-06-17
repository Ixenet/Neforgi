import './assets/main.css'

import { createApp } from 'vue';
import { createRouter, createWebHistory } from 'vue-router';
import App from './App.vue'
import Home from './Home.vue';
import ItemPage from './ItemPage.vue';

const routes = [
  { path: '/', component: Home },
  {
    path: '/catalog/sweatshirts/:id',
    component: ItemPage,
    props: true
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

createApp(App).use(router).mount('#app')
export default router