import { createRouter, createWebHistory } from "vue-router";
import Comp_home from "../components/Comp_home.vue";
import Comp_about from "../components/Comp_about.vue";

const routes = [
  { path: "/", component: Comp_home },
  { path: "/about", component: Comp_about },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
