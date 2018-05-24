package com.example.lancer.mvp_news.bean;

import java.util.List;

/**
 * Created by Lancer on 2018/4/9.
 */

public class DriverBean {


    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-05-02 16:32","title":"农民干活时发现头盖骨 警方揭开5年前命案","description":"乱编奇闻","picUrl":"http://www.luanbian.com/d/file/shehui/quwen/2017-04-26/dabfb7a1ba50415dd41cf6cf22877631.jpg","url":"http://www.luanbian.com/shehui/quwen/25006.html"},{"ctime":"2017-05-02 16:32","title":"奇葩!男女在广场喷泉当众洗澡近10分钟","description":"乱编奇闻","picUrl":"http://www.luanbian.com/d/file/shehui/quwen/2017-04-26/1554889cd1b763f24bf8b25c4c83a5d9.png","url":"http://www.luanbian.com/shehui/quwen/25004.html"},{"ctime":"2017-04-26 14:11","title":"奇闻!骡子嫌累不想干活，跳崖自杀","description":"乱编奇闻","picUrl":"http://www.luanbian.com/d/file/shehui/quwen/2017-04-25/76cbcc895bc42830c023149dd60f8c96.jpg","url":"http://www.luanbian.com/shehui/quwen/24997.html"},{"ctime":"2017-05-02 16:32","title":"小伙上山干活，竟发现一活宝，结果出人意料!","description":"乱编奇闻","picUrl":"http://www.luanbian.com/d/file/shehui/quwen/2017-04-25/c83e43f621c0603eb1194e71c7c4b228.png","url":"http://www.luanbian.com/shehui/quwen/24996.html"},{"ctime":"2017-04-26 11:33","title":"幸运!女孩横穿马路,两车从她身上开过受轻伤","description":"乱编奇闻","picUrl":"http://www.luanbian.com/d/file/shehui/quwen/2017-04-25/81f45ab4928b69f9ba7df588ebc12eec.gif","url":"http://www.luanbian.com/shehui/quwen/24980.html"},{"ctime":"2017-05-02 16:32","title":"男子发现一个生锈箱子 拆开之后吓得冒汗","description":"乱编奇闻","picUrl":"http://www.luanbian.com/d/file/shehui/quwen/2017-04-24/a593c7ce589ef08a971d189d055f24c1.png","url":"http://www.luanbian.com/shehui/quwen/24976.html"},{"ctime":"2017-04-25 17:18","title":"吃不起饭菜就吃树 25年来却从未因此生病","description":"乱编奇闻","picUrl":"http://www.luanbian.com/d/file/shehui/quwen/2017-04-24/5e7e259ffd7f86e0d614f7609d37051c.jpg","url":"http://www.luanbian.com/shehui/quwen/24973.html"},{"ctime":"2017-05-02 16:32","title":"大爷自家树上长宝石 得知真相后震惊了","description":"乱编奇闻","picUrl":"http://www.luanbian.com/d/file/shehui/quwen/2017-04-21/fdbcdb625dbccdb04aafd235426f5f2a.png","url":"http://www.luanbian.com/shehui/quwen/24955.html"},{"ctime":"2017-04-25 16:54","title":"女子29年留3米长发 能拖3吨重的船","description":"乱编奇闻","picUrl":"http://www.luanbian.com/d/file/shehui/quwen/2017-04-24/b1287fd732becc41041b2250f2e1c715.jpg","url":"http://www.luanbian.com/shehui/quwen/24961.html"},{"ctime":"2017-05-02 16:32","title":"小伙河边捞出神秘石雕 众人看到后纷纷称奇","description":"乱编奇闻","picUrl":"http://www.luanbian.com/d/file/shehui/quwen/2017-04-21/68732007c5a7de6abfc2864f51ba8194.png","url":"http://www.luanbian.com/shehui/quwen/24954.html"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2017-05-02 16:32
         * title : 农民干活时发现头盖骨 警方揭开5年前命案
         * description : 乱编奇闻
         * picUrl : http://www.luanbian.com/d/file/shehui/quwen/2017-04-26/dabfb7a1ba50415dd41cf6cf22877631.jpg
         * url : http://www.luanbian.com/shehui/quwen/25006.html
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
