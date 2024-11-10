const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootq9413/",
            name: "springbootq9413",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootq9413/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "艺术品网络展示系统"
        } 
    }
}
export default base
