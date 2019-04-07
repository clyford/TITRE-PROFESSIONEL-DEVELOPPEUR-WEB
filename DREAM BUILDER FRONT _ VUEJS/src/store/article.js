import axios from "axios";

const articleStore = {
  namespaced: true,
  state: {
    currentArticle: null,
    articles: []
  },
  getters: {
    all(state) {
      return state.articles;
    },
    byId(state) {
      return function(id) {
        return state.articles.filter(article => {
          return article.id === id;
        });
      };
    },
    current(state) {
      return state.currentArticle;
    }
  },
  mutations: {
    addArticle(state, article) {
      state.articles.push(article);
    },
    deleteArticles(state, ids) {
      state.articles = state.articles.filter(article => {
        if (!ids.includes(article.id)) {
          return article;
        }
      });
    },
    setArticles(state, articles) {
      state.articles = articles;
    },
    setCurrentArticle(state, article) {
      state.currentArticle = article;
    }
  },
  actions: {
    create(ctx, article) {
      return axios
        .post("/postannonce", article)
        .then(res => {
          console.log("@post article response", res, ctx);
          ctx.commit("addArticle", article);

          console.log( location.reload(true));
          window.alert("L'annonce a été crée");
        })
        .catch(err => {
          console.error("error when creating article", err);
        });
    },
    get(ctx, id) {
      axios
        .get("/annonce/" + id)
        .then(res => {
          console.log("response server getting one article", res);
          ctx.commit("setCurrentArticle", res.data);
        
        })
        .catch(err => {
          console.error("error when get one category", err);
        });
    },
    getAll() {
      axios
        .get("/annonce")
        .then(res => {
          console.log(res.data);
          
         /*.commit("setArticles", res.data);*/

         
         
        })
        .catch(err => {
          console.error("error when getting articles", err);
        });
    },
    deleteArticles(ctx, ids) {
      // return console.log(ids)
      axios
        .delete("/deleteAd/" + ids /*, { params: { ids } }*/)
        .then(res => {
          console.log(res, ids);
          ctx.commit("deleteArticles", ids);

          console.log("Votre annonce a été supprimer", Response, location.reload(true));
          window.alert("Votre annonce a été supprimmer");
        })
        .catch(err => {
          console.error("error when deleting articles", err);
        });
    },
    update(ctx, ids) {
      axios
        .put("/updateannonce/" + ids)
        .then(res => {
          console.log("success editing article", res);

          console.log("Votre annonce a été modifier", Response, location.reload(true));
          window.alert("Votre annonce a été modifier");
        })
        .catch(err => {
          console.error("error when getting all categories nada bouffon ", err);
        });
    }
    // update(ctx, article) {
    //   axios
    //     .patch("/updateannonce/" + article.id, article)
    //     .then(res => {
    //       console.log("success editing article", res);
    //     })
    //     .catch(err => {
    //       console.error("error when getting all categories", err);
    //     });
    // }
  }
};

export default articleStore;