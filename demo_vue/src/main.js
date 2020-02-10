// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'

Vue.config.productionTip = false
Vue.prototype.$axios = axios

// axiosÅäÖÃ
//axios.defaults.timeout = 5000;
axios.defaults.headers.post['Content-Type'] = 'application/json;charset=UTF-8';
axios.defaults.baseURL = '/api'
// axios.defaults.baseURL = 'http://192.168.31.35:8080/'

/* eslint-disable no-new */
new Vue({
  el: '#app',
  render: h => h(App),
  router
  // router,
  // components: { App },
  // template: '<App/>'
})
