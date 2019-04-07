<template>
  <table v-if="users.length" id="tabler">
    <thead class="head">
      <tr>
        <th class="cell" v-for="(val, prop) in users[0]" :key="prop">{{ prop }}</th>
        <th class="cell">
          <button class="btn" @click="setUsersAsAdmin">
            <i class="fas fa-key fa-lg" title="set as admin"></i>
          </button>
        </th>
        <th class="cell">
          <button class="btn" @click="$store.dispatch('users/deleteUsers', selectedUsers)">
            <i class="fa fa-trash fa-lg"></i>
          </button>
        </th>
      </tr>
    </thead>
    <tbody class="body">
      <tr class="row" v-for="(user, n) in users" :key="n" :id="`user_${user.id}`">
        <td class="cell" v-for="(val, prop) in user" :key="prop">{{ val }}</td>
        <td class="cell">
          <input
            title="set as admin"
            type="checkbox"
            class="clickable"
            :value="Number(`${user.id}`)"
            v-model="userToAdmin"
          >
        </td>
        <td class="cell">
          <input
            type="checkbox"
            class="clickable"
            :value="Number(`${user.id}`)"
            v-model="selectedUsers"
          >
        </td>
      </tr>
    </tbody>
  </table>
</template>

<script>
import axios from "axios"

export default {
  beforeCreate() {
    this.$store.dispatch("users/getAll");
  },
  data() {
    return {
      selectedUsers: [],
      userToAdmin: [],
      users: []
    };
  },
  computed: {
    users() {
      return this.$store.getters["users/all"];
    }
  },
  mounted() {
      axios
        .get("/premium")
        .then(res => {
          console.log(res)
          this.users = res.data
        })
        .catch(err => {
          console.error("baaad", err);
        });
        
  },
  methods: {

    /*deleteUsers() {
      console.log("user to delete =>", this.selectedUsers );
    },*/
    deleteUsers() {
            axios.delete("delete" + users.id)
        .then(res => {
          console.log("sucess", res)
        console.log("L utilisateur a été suprimé")
        })
        .catch(err => {
          console.error("error user already here", err);
        });
  },

    setUsersAsAdmin() {
      console.log("user to set as admin =>", this.userToAdmin);
    },

  }
};
</script>

<style scoped lang="scss">
#tabler {
  border-collapse: collapse;
  margin: 20px auto;
  width: 100%;
  height: auto;/* a modifier*/
  .btn {
    border-radius: 0.3rem;
    outline: none;
    padding: 10px;
    width: 48px;
    &:hover {
      background: darkorange;
      color: white;
    }
  }
  .head .row {
    background: #aeb6b6;
  }
  .body .row:nth-child(odd) {
    background: #c0c0c047;
  }
  .cell {
    border: 1px solid;
    padding: 10px;
  }
}


@media screen and (min-width:650px ) and (max-width: 1025px){}
@media screen and (max-width:650px){}
</style>


























