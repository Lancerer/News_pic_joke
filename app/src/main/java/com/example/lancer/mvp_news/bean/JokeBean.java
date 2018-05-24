package com.example.lancer.mvp_news.bean;

import java.util.List;

/**
 * Created by Lancer on 2018/4/11.
 */

public class JokeBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"id":35820,"title":"官价","content":"问：\u201c预制的空心楼板几元一块？\u2019<br/>答：\u201c三十元。\u201d<br/>问：\u201c大队长来买，怎么只要十五元？\u201d<br/>答：\u201c主任来买只要三元。\u201d<br/>问：\u201c为什么？\u201d<br/>答：\u201c这是官价。\u201d<br/>"},{"id":35820,"title":"取消婚姻","content":"卡特夫人家的小猫在外面乱窜，一会屋顶，一会地窖。受扰的邻居敲开卡特夫人 的门：\u201c你家的猫怎么这么疯跑？\u201d <br/>\u201c是这样，\u201d卡特夫人解释：\u201c我让兽医刚给他做了手术，最近正忙着到处取 消原先订好的婚姻。\u201d <br/>"},{"id":35820,"title":"心语绝话","content":"一天，在大嫂家里。大嫂：\u201c小玲我那天去你家居然用蟑螂迎接我？？？？过份!!!!!!\u201d小玲：\u201c哪里嘛!\u201d大嫂：\u201c向我爬了过来，而且人家那天穿的是裙子呢。\u201d小玲：\u201c没事没事，把裙子脱下来打就是了。\u201d "},{"id":35820,"title":"到底想干什么？","content":"儿子：爸爸给你猜一个问题，有一个人只有三根头发，突然有一天他用剪刀剪掉一根，这是为什么呢？<br/>父亲：不知道。为什么呢？<br/>儿子：你怎么那么笨呢，他想留中分呗！ <br/>"},{"id":35820,"title":"不许抱我","content":"某美国留学生整天追中国女孩子。 有一天终于有一女孩子同意约会。他见到那女孩便疯狂地扑上去，没想到那女孩的一句话吓得他楞了半天。原来，那女孩一见他的举动，急忙叫喊：\u201c不许抱我！\u201d他一听傻了，以为女孩子在喊\u201cBUSH(布什)、BOWELL(鲍威尔)\u201d，那可是美国总统和国务卿啊！ <br/>"},{"id":35820,"title":"傻瓜","content":"约翰叔叔来住了几天，临走时，掏出100先令对侄子汤姆说：\u201d这钱你留着零花吧。记住，钱要放好，丢了可就白送人了。\u201d <br/>汤姆激动地说；\u201c知道，傻瓜才把钱白送人！\u201d <br/>约翰叔叔想了想，说：\u201c你说得有道理，我看这钱你还是不要的好。\u201d <br/>"},{"id":35820,"title":"是男是女","content":"产妇临盆在即，亲友们焦急地等候在产房外。 <br/>护士小姐终于把婴儿抱了出来，大伙儿一拥而上。 <br/>\u201c是男孩还是女孩?\u201d做父亲的最关心这个问题。 <br/>他迫不及待的把手伸进襁褓中摸索了一下，然后高兴地大叫：\u201c是男孩!是男孩!\u201d <br/>\u201c什么男孩?\u201d护士小姐生气地骂道：\u201c快把我的手指头放开。\u201d <br/>"},{"id":35820,"title":"不脱衣裳不行","content":"一只鹦鹉好斗。主人在笼中放入一只麻雀。<br/>结果被鹦鹉打死。鹦鹉说：\u201c不过瘾！\u201d<br/>主人放入一只老鹰。结果老鹰被打死了。鹦鹉的毛却没了。鹦鹉说：\u201c靠。不脱衣裳还真打不过他！\u201d<br/>"},{"id":35820,"title":"猫知道吗","content":"有一位精神病患者，总认为自己是老鼠，在医生的帮助下，终于康复了，出院的那天，这名患者，刚刚走到门口，突然有一只猫出现在他的面前，令他目瞪口呆。医生说:\"你现在已经好了，为什么还那样?\"<br/>患者说:\"我知道我已经不是老鼠了，但猫知道吗?\" <br/>"},{"id":35820,"title":"不必结婚","content":"汤姆碰见自己的朋友鲁提斯，只见他垂头丧气，闷闷不乐。<br/>\u201c啊，我亲爱的朋友，您出事了？\u201d<br/>\u201c还是为了那婚姻的事！哎，您说说看，男子究竟在什么时候结婚合适呢？\u201d<br/>\u201c因为是您，我才对您说句老实话：如果还年轻的话，那就不忙结婚；如果年纪大了，那就不必结婚了！\u201d "}]
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
         * id : 35820
         * title : 官价
         * content : 问：“预制的空心楼板几元一块？’<br/>答：“三十元。”<br/>问：“大队长来买，怎么只要十五元？”<br/>答：“主任来买只要三元。”<br/>问：“为什么？”<br/>答：“这是官价。”<br/>
         */

        private int id;
        private String title;
        private String content;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
