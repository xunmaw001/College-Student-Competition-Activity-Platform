import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import kejichuangxin from '@/views/modules/kejichuangxin/list'
    import leixing from '@/views/modules/leixing/list'
    import zhiyuanzhezhaomu from '@/views/modules/zhiyuanzhezhaomu/list'
    import wenyileixing from '@/views/modules/wenyileixing/list'
    import chuangyeleixing from '@/views/modules/chuangyeleixing/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import discusszhiyuanzhezhaomu from '@/views/modules/discusszhiyuanzhezhaomu/list'
    import zhiyuanzheshenqing from '@/views/modules/zhiyuanzheshenqing/list'
    import waiyuyuyan from '@/views/modules/waiyuyuyan/list'
    import jingsaibaoming from '@/views/modules/jingsaibaoming/list'
    import jingsaixinwen from '@/views/modules/jingsaixinwen/list'
    import wenyiwenyu from '@/views/modules/wenyiwenyu/list'
    import wenxueleixing from '@/views/modules/wenxueleixing/list'
    import chat from '@/views/modules/chat/list'
    import jingjibisai from '@/views/modules/jingjibisai/list'
    import jingjileixing from '@/views/modules/jingjileixing/list'
    import chuangxinchuangye from '@/views/modules/chuangxinchuangye/list'
    import kejileixing from '@/views/modules/kejileixing/list'
    import discussjingsaixinwen from '@/views/modules/discussjingsaixinwen/list'
    import gudianwenxue from '@/views/modules/gudianwenxue/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/kejichuangxin',
        name: '科技创新',
        component: kejichuangxin
      }
      ,{
	path: '/leixing',
        name: '类型',
        component: leixing
      }
      ,{
	path: '/zhiyuanzhezhaomu',
        name: '志愿者招募',
        component: zhiyuanzhezhaomu
      }
      ,{
	path: '/wenyileixing',
        name: '文艺类型',
        component: wenyileixing
      }
      ,{
	path: '/chuangyeleixing',
        name: '创业类型',
        component: chuangyeleixing
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/discusszhiyuanzhezhaomu',
        name: '志愿者招募评论',
        component: discusszhiyuanzhezhaomu
      }
      ,{
	path: '/zhiyuanzheshenqing',
        name: '志愿者申请',
        component: zhiyuanzheshenqing
      }
      ,{
	path: '/waiyuyuyan',
        name: '外语语言',
        component: waiyuyuyan
      }
      ,{
	path: '/jingsaibaoming',
        name: '竞赛报名',
        component: jingsaibaoming
      }
      ,{
	path: '/jingsaixinwen',
        name: '竞赛新闻',
        component: jingsaixinwen
      }
      ,{
	path: '/wenyiwenyu',
        name: '文艺文娱',
        component: wenyiwenyu
      }
      ,{
	path: '/wenxueleixing',
        name: '文学类型',
        component: wenxueleixing
      }
      ,{
	path: '/chat',
        name: '在线咨询',
        component: chat
      }
      ,{
	path: '/jingjibisai',
        name: '竞技比赛',
        component: jingjibisai
      }
      ,{
	path: '/jingjileixing',
        name: '竞技类型',
        component: jingjileixing
      }
      ,{
	path: '/chuangxinchuangye',
        name: '创新创业',
        component: chuangxinchuangye
      }
      ,{
	path: '/kejileixing',
        name: '科技类型',
        component: kejileixing
      }
      ,{
	path: '/discussjingsaixinwen',
        name: '竞赛新闻评论',
        component: discussjingsaixinwen
      }
      ,{
	path: '/gudianwenxue',
        name: '古典文学',
        component: gudianwenxue
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
