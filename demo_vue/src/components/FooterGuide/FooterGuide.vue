<template>
    <div class="footer_guide">
      <a href="javascript:;" class="guide_item" :class="{on:'/home'===$route.path}" @click="goTo('/home')">
        <span class="item_icon">
          <i class="iconfont iconhome"></i>
        </span>
        <span>通知</span>
      </a>
      <a href="javascript:;" class="guide_item" :class="{on:'/middle'===$route.path}" @click="goTo('/middle')">
        <span class="item_icon">
          <i class="iconfont iconhome"></i>
        </span>
        <span>班级</span>
      </a>
      <a href="javascript:;" class="guide_item" :class="{on:'/personal'===$route.path}" @click="goTo('/personal')">
        <span class="item_icon">
          <i class="iconfont iconbolanggu"></i>
        </span>
        <span>个人</span>
      </a>
    </div>
</template>

<script>
    export default {
      methods:{
        goTo(path){
          this.$router.replace(path);
        }
      }
    }
</script>

<style lang="stylus" rel="stylesheet/stylus">
  @import "../../common/stylus/minins.styl"
  .footer_guide
    top-border-1px(#e4e4e4)
    position fixed
    z-index  100
    left 0
    right 0
    bottom 0
    background-color #fff
    width 100%
    height 50px
    display flex
    .guide_item
      display flex
      flex 1
      text-align center
      flex-direction column
      align-items center
      margin 5px
      color #999999
      &.on
        color #02a774
      span
        font-size 12px
        margin-top 2px
        margin-bottom 2px
        .iconfont
          font-size 22px
</style>
