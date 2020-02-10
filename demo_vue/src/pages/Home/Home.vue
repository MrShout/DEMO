<template>
    <div>Home
    <button @click="testGet">wwwwww</button>
      <!--<div v-if="!repoUrl">loadingggg</div>
      <div v-else>mmmmmmmmmmm is <a :href="repoUrl">{{repoName}}</a></div>-->
      <div>{{studentArr}}</div>
    </div>
</template>

<script>
  import axios from 'axios'

  export default {
    data(){
      return{
        repoUrl: '',
        repoName: '',
        studentArr: []
      }
    },
    name: "FooterGuide",
    methods:{
      testGet(){
        debugger
        let _this = this;
        axios.get('/getUserAll').then(function(res){
          const result = res;
          _this.studentArr = res.data.data;
          console.log(res.data);
        },function (res) {
          var result = res;
          console.log("error:"+res);
        })
      }
    },
    mounted() {
    }
  }
</script>

<style lang="stylus" rel="stylesheet/stylus">

</style>
