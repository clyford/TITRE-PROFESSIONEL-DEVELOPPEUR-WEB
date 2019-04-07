import axios from "axios";
// import auth from "../utils/auth";

const defaultUser = {
  id: 123,
  name: "Alphonse",
  lastname: "Elric",
  email: "FullMetalAlchemist"
};

const userStore = {
  namespaced: true,
  state: {
    currentUser: defaultUser,
    allUsers: []
  },
  getters: {
    current(state) {
      return state.currentUser;
    },
    all(state) {
      
      return state.allUsers;
    }
  },
  mutations: {
    setUsers(state, users) {
      state.allUsers = users;
    },
    deleteUsers(state, ids) {
      state.allUsers = state.allUsers.filter(user => user.id != ids);
      // {

      //   // if (!ids.includes(user.id)) {
      //   //   return user;
      //   }
      // };
    },
  },
  actions: {
    register(ctx, user) {
      return axios
        .post("/adduser", user)
        .then(res => {
          console.log("response server", res);

          console.log("Ok cool utilisateur ajouter", Response, location.reload(true))
          window.alert("cool ");
        })
        .catch(err => {
          console.warn("error server", err);
        });
    },
    login(ctx, user) {
      // return console.log(user);
      //axios.post("/login", user, { errorHandle: false })
      axios.post("/premium", user, { errorHandle: false })
      .then(res => {
        console.log(res);
       /* auth.setLocalToken(res.data);*/
      })
      .catch(err => {
        console.error(err); 
      });
    },
    // logout(ctx) {},
    getAll() {
      axios
        .get("/premium")
        .then(res => {
          console.log(res)
        })
        .catch(err => {
          console.error("baaad", err);
        });
    },
    // updateUser(ctx) {},
    deleteUsers(ctx, ids) {
      axios.delete("/delete/" + ids /*, { params: { ids } }*/)
      .then(res => {
        console.log("server result deleting users", res, ctx);
        ctx.commit("deleteUsers", ids);

        
        console.log("DELETE ", Response, location.reload(true));
        window.alert("DELETE");
      }).catch(err => {
        console.log("@store", err);
      })
    },

    update(ctx, ids) {
      axios
        .put("/updateuser/" + ids)
        .then(res => {
          console.log("success editing user", res);
        })
        .catch(err => {
          console.error("error when getting all user nada bouffon ", err);
        });
    }
  }
};

export default userStore;





























































/*import axios from "axios";

const defaultUser = {
  id: 123,
  name: "guillaume",
  lastname: "amg",
  email: "gui@ohm.com"
};

const defaultUsers = [
  {
    id: 13,
    name: "toto",
    lastname: "teteAzero",
    email: "toto@foo.com"
  },
  {
    id: 23,
    name: "titi",
    lastname: "parisien",
    email: "titi@bar.com"
  },
  {
    id: 66,
    name: "tata",
    lastname: "yoyo",
    email: "tata@baz.com"
  }
];

const userStore = {
  namespaced: true,
  state: {
    currentUser: defaultUser,
      allUsers: defaultUsers
  },
  getters: {
    current(state) {
      return state.currentUser;
    },
    all(state) {
      return state.allUsers;
    }
  },
  mutations: {
    setUsers(state, users) {
        state.allUsers = users;
    }
  },
  actions: {
    register(ctx, user) {
      axios
        .post("/recuperation", user)
        .then(res => {
          console.log("response server", res);
        })
        .catch(err => {
          console.error("error server", err);
        });
    },
    login(ctx) {},
    logout(ctx) {},
    getAll(ctx) {
      axios
        .get("/users")
        .then(res => {
          console.log("good", res.data);
          ctx.commit("setUsers", res.data);
        })
        .catch(err => {
          console.error("baaad", err);
        });
    },
    updateUser(ctx) {},
    deleteUser(ctx) {}
  }
};

export default userStore;*/
