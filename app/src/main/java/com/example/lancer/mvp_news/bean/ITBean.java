package com.example.lancer.mvp_news.bean;

import java.util.List;

/**
 * Created by Lancer on 2018/4/9.
 */

public class ITBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2016-11-21 12:42","title":"起拍价2.79亿 浙江德清官员称乐视汽车肯定拿地","description":"移动互联","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/f/f2/f2246f2526fb65a15550710791e79943.jpg","url":"http://tech.163.com/16/1121/12/C6D7EKI700097U7R.html"},{"ctime":"2016-11-21 14:20","title":"京东卖家虚假交易赚积分后变现 涉嫌犯罪被公诉","description":"移动互联","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/f/f2/f2246f2526fb65a15550710791e79943.jpg","url":"http://tech.163.com/16/1121/14/C6DD2MB700097U7R.html"},{"ctime":"2016-11-21 13:54","title":"邮政自取包裹将送上门 价格上调后仍低于快递","description":"移动互联","picUrl":"http://img3.cache.netease.com/photo/0009/2016-11-17/t_C62I0VQI724Q0009.jpg","url":"http://tech.163.com/16/1121/13/C6DBJ41O00097U7R.html"},{"ctime":"2016-11-21 15:52","title":"vivo首谈供应链管理：结款一定不超过第45天","description":"通信行业","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/3/34/34c3b6b339e15f9995fc95bf5be07626.jpg","url":"http://tech.163.com/16/1121/15/C6DIB2NI00097U7S.html"},{"ctime":"2016-11-21 17:32","title":"外媒曝美图赴港IPO进展：已开始接洽投资者","description":"移动互联","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/5/5d/5d230663a517de52170ade0dfb13b148.jpg","url":"http://tech.163.com/16/1121/17/C6DO297700097U7R.html"},{"ctime":"2016-11-21 16:01","title":"打击乱停乱行 北京快递三轮将统一颜色每车编码","description":"移动互联","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/f/f2/f2246f2526fb65a15550710791e79943.jpg","url":"http://tech.163.com/16/1121/16/C6DIRN9G00097U7R.html"},{"ctime":"2016-11-21 19:42","title":"猎豹移动第三季度营收11.28亿元 净利44万元","description":"移动互联","picUrl":"http://cms-bucket.nosdn.127.net/7d42235346be47348eaada56baa510f520161121183940.jpeg","url":"http://tech.163.com/16/1121/19/C6DVGJQ400097U7R.html"},{"ctime":"2016-11-21 18:41","title":"阿里影业公告：俞永福将出任阿里影业董事局主席","description":"移动互联","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/c/c7/c7efdb7f6ec7473f2845a9ee164f8c93.jpg","url":"http://tech.163.com/16/1121/18/C6DS0G0B00097U7R.html"},{"ctime":"2016-11-21 18:16","title":"CEO把人打骨折？饿了么称是私人事件与公司无关","description":"移动互联","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/5/5d/5d230663a517de52170ade0dfb13b148.jpg","url":"http://tech.163.com/16/1121/18/C6DQJC4T00097U7R.html"},{"ctime":"2016-11-21 17:56","title":"易到拖欠供应商5000万？回应称个别公司尾款未结","description":"移动互联","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/f/f2/f2246f2526fb65a15550710791e79943.jpg","url":"http://tech.163.com/16/1121/17/C6DPDFI500097U7R.html"}]
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
         * ctime : 2016-11-21 12:42
         * title : 起拍价2.79亿 浙江德清官员称乐视汽车肯定拿地
         * description : 移动互联
         * picUrl : http://cms-bucket.nosdn.127.net/catchpic/f/f2/f2246f2526fb65a15550710791e79943.jpg
         * url : http://tech.163.com/16/1121/12/C6D7EKI700097U7R.html
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
