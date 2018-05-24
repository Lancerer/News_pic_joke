package com.example.lancer.mvp_news.bean;

import java.util.List;

/**
 * Created by Lancer on 2018/4/9.
 */

public class HappyBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-06-05 16:00","title":"杭州一男子眼睛痒，睫毛里竟爬出3条虫","description":"明星花边","picUrl":"http://www.luanbian.com/d/file/lishi/yiyu/2017-06-02/smallad1f109c9413af9dbe3409d95853f2f81496375782.jpg","url":"http://www.luanbian.com//lishi/yiyu/25318.html"},{"ctime":"2017-06-06 15:00","title":"一条鱼抵一辆保时捷 标价268万元惊呆了网友","description":"明星花边","picUrl":"http://www.luanbian.com/d/file/lishi/yiyu/2017-06-05/small535838c27374b6be43a7ec865d2974281496650726.jpg","url":"http://www.luanbian.com//lishi/yiyu/25330.html"},{"ctime":"2017-06-06 15:00","title":"破洞牛仔裤隐藏巨大的危险，工人付出惨痛代价","description":"明星花边","picUrl":"http://www.luanbian.com/d/file/lishi/yiyu/2017-06-05/d85c3437f009bee056a06a8a7bcd0fb9.jpg","url":"http://www.luanbian.com//lishi/yiyu/25328.html"},{"ctime":"2017-06-06 14:41","title":"入赘豪门做女婿的8大男星，刘德华周润发均在列","description":"明星花边","picUrl":"http://www.luanbian.com/d/file/lishi/yiyu/2017-06-02/fba8bd9a885bc13cfcfc3454f3d0889f.jpg","url":"http://www.luanbian.com//lishi/yiyu/25319.html"},{"ctime":"2017-06-06 15:00","title":"流浪狗叼着刚出生的弃婴向路人求救，感动落泪","description":"明星花边","picUrl":"http://www.luanbian.com/d/file/lishi/yiyu/2017-06-06/small7c1f47cd2a87c73bcf9ab9352e5d25fd1496729645.jpg","url":"http://www.luanbian.com//lishi/yiyu/25336.html"},{"ctime":"2017-06-06 14:39","title":"村中寻一座明代古石桥，竟被告知在墙上?","description":"明星花边","picUrl":"http://www.luanbian.com/d/file/lishi/yiyu/2017-06-06/small0ba83f51849d3c9fbd73cc99fa2017a11496721103.jpg","url":"http://www.luanbian.com//lishi/yiyu/25335.html"},{"ctime":"2017-06-06 15:00","title":"\u201c国际明星\u201d英达父亲去世，不让亲儿子巴图参加","description":"明星花边","picUrl":"http://www.luanbian.com/d/file/lishi/yiyu/2017-06-06/smalla64e8251141b3ca2ac158247952993721496719684.jpg","url":"http://www.luanbian.com//lishi/yiyu/25334.html"},{"ctime":"2017-06-06 14:14","title":"安以轩嫁入千亿豪门，大S微博发酸这样说","description":"明星花边","picUrl":"http://www.luanbian.com/d/file/lishi/yiyu/2017-06-06/smalle2a960a265d59f8786c9e2f713266dc91496717348.jpg","url":"http://www.luanbian.com//lishi/yiyu/25333.html"},{"ctime":"2017-06-06 15:00","title":"香港四大天王谁居首？年轻时张学友颜值最低，老了却成功逆袭","description":"明星花边","picUrl":"http://www.luanbian.com/d/file/lishi/yiyu/2017-06-05/5da421cae36b825d7c19e00522c78654.jpg","url":"http://www.luanbian.com//lishi/yiyu/25332.html"},{"ctime":"2017-06-06 14:08","title":"一曲成名红过刀郎，花200元赚得一亿利润！","description":"明星花边","picUrl":"http://www.luanbian.com/d/file/lishi/yiyu/2017-06-05/c7b6e163ab0cd2e73d73fa22d269cceb.jpg","url":"http://www.luanbian.com//lishi/yiyu/25331.html"}]
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
         * ctime : 2017-06-05 16:00
         * title : 杭州一男子眼睛痒，睫毛里竟爬出3条虫
         * description : 明星花边
         * picUrl : http://www.luanbian.com/d/file/lishi/yiyu/2017-06-02/smallad1f109c9413af9dbe3409d95853f2f81496375782.jpg
         * url : http://www.luanbian.com//lishi/yiyu/25318.html
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
