const base = {
    get() {
        return {
            url : "http://localhost:8080/ssms64ag/",
            name: "ssms64ag",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssms64ag/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于Spring的大学生竞赛活动平台"
        } 
    }
}
export default base
