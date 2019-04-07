import Vue from 'vue'
import Vuex from 'vuex'
import appEvents from "./appEvents"
import user from "./user";
import category from "./category";
import article from "./article";

Vue.use(Vuex)

export default new Vuex.Store({
  modules: {
    appEvents,
    article,
    users: user,
    category
  }
});
































/*import Vue from 'vue'
import Vuex from 'vuex'
import appEvents from "./appEvents"
import users from "./users";

Vue.use(Vuex)

export default new Vuex.Store({
  state: {},
  mutations: {},
  actions: {},
  modules: {
    appEvents,
    users
  }
});*/
