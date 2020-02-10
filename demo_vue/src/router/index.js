/*
路由器对象模块
 */
import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../pages/Home/Home'
import Middle from "../pages/Middle/Middle";
import Personal from "../pages/Personal/Personal";

// 声明使用插件
Vue.use(VueRouter)

export default new VueRouter({
  // 所有路由：
  routes:[
    {
      path:'/home',
      component:Home
    },
    {
      path:'/middle',
      component:Middle
    },
    {
      path:'/personal',
      component:Personal
    },
    {
      path:'/',
      redirect:'/home'
    }
  ]
})
