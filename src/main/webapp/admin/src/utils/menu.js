const menu = {
    list() {
        return [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除","查看评论","申请志愿者"],"menu":"志愿者招募","menuJump":"列表","tableName":"zhiyuanzhezhaomu"}],"menu":"志愿者招募管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","修改","删除","审核"],"menu":"志愿者申请","menuJump":"列表","tableName":"zhiyuanzheshenqing"}],"menu":"志愿者申请管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除","查看评论"],"menu":"竞赛新闻","menuJump":"列表","tableName":"jingsaixinwen"}],"menu":"竞赛新闻管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["新增","查看","修改","删除"],"menu":"创业类型","menuJump":"列表","tableName":"chuangyeleixing"}],"menu":"创业类型管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除","报名"],"menu":"创新创业","menuJump":"列表","tableName":"chuangxinchuangye"}],"menu":"创新创业管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"科技类型","menuJump":"列表","tableName":"kejileixing"}],"menu":"科技类型管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除","报名"],"menu":"科技创新","menuJump":"列表","tableName":"kejichuangxin"}],"menu":"科技创新管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除"],"menu":"类型","menuJump":"列表","tableName":"leixing"}],"menu":"类型管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除","报名"],"menu":"外语语言","menuJump":"列表","tableName":"waiyuyuyan"}],"menu":"外语语言管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除"],"menu":"文学类型","menuJump":"列表","tableName":"wenxueleixing"}],"menu":"文学类型管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["新增","查看","修改","删除","报名"],"menu":"古典文学","menuJump":"列表","tableName":"gudianwenxue"}],"menu":"古典文学管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除"],"menu":"竞技类型","menuJump":"列表","tableName":"jingjileixing"}],"menu":"竞技类型管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除","报名"],"menu":"竞技比赛","menuJump":"列表","tableName":"jingjibisai"}],"menu":"竞技比赛管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除"],"menu":"文艺类型","menuJump":"列表","tableName":"wenyileixing"}],"menu":"文艺类型管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["新增","查看","修改","删除","报名"],"menu":"文艺文娱","menuJump":"列表","tableName":"wenyiwenyu"}],"menu":"文艺文娱管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除","审核","导出"],"menu":"竞赛报名","menuJump":"列表","tableName":"jingsaibaoming"}],"menu":"竞赛报名管理"},{"child":[{"appFrontIcon":"cuIcon-service","buttons":["新增","查看","修改","删除"],"menu":"在线咨询","tableName":"chat"},{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","申请志愿者"],"menu":"志愿者招募列表","menuJump":"列表","tableName":"zhiyuanzhezhaomu"}],"menu":"志愿者招募模块"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看"],"menu":"竞赛新闻列表","menuJump":"列表","tableName":"jingsaixinwen"}],"menu":"竞赛新闻模块"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","报名"],"menu":"创新创业列表","menuJump":"列表","tableName":"chuangxinchuangye"}],"menu":"创新创业模块"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","报名"],"menu":"科技创新列表","menuJump":"列表","tableName":"kejichuangxin"}],"menu":"科技创新模块"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["报名","查看"],"menu":"外语语言列表","menuJump":"列表","tableName":"waiyuyuyan"}],"menu":"外语语言模块"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["报名","查看"],"menu":"古典文学列表","menuJump":"列表","tableName":"gudianwenxue"}],"menu":"古典文学模块"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","报名"],"menu":"竞技比赛列表","menuJump":"列表","tableName":"jingjibisai"}],"menu":"竞技比赛模块"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["报名","查看"],"menu":"文艺文娱列表","menuJump":"列表","tableName":"wenyiwenyu"}],"menu":"文艺文娱模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","删除"],"menu":"竞赛报名","menuJump":"列表","tableName":"jingsaibaoming"}],"menu":"竞赛报名管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","申请志愿者"],"menu":"志愿者招募列表","menuJump":"列表","tableName":"zhiyuanzhezhaomu"}],"menu":"志愿者招募模块"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看"],"menu":"竞赛新闻列表","menuJump":"列表","tableName":"jingsaixinwen"}],"menu":"竞赛新闻模块"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","报名"],"menu":"创新创业列表","menuJump":"列表","tableName":"chuangxinchuangye"}],"menu":"创新创业模块"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","报名"],"menu":"科技创新列表","menuJump":"列表","tableName":"kejichuangxin"}],"menu":"科技创新模块"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["报名","查看"],"menu":"外语语言列表","menuJump":"列表","tableName":"waiyuyuyan"}],"menu":"外语语言模块"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["报名","查看"],"menu":"古典文学列表","menuJump":"列表","tableName":"gudianwenxue"}],"menu":"古典文学模块"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","报名"],"menu":"竞技比赛列表","menuJump":"列表","tableName":"jingjibisai"}],"menu":"竞技比赛模块"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["报名","查看"],"menu":"文艺文娱列表","menuJump":"列表","tableName":"wenyiwenyu"}],"menu":"文艺文娱模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"}]
    }
}
export default menu;
