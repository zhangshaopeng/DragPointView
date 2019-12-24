package com.shaopeng.app;



public class DataBean {

    public static final String TEST_JSON = "[{\"username\":\"1\",\"nickname\":\"大领导\",\"avatar\":" +
            "\"https://dss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2394972844,3024358326&fm=26&gp=0.jpg\",\"messageN" +
            "um\":6,\"lastMessage\":\"转账成功！\",\"lastTime\":\"昨天\",\"isRead\":fa" +
            "lse},{\"username\":\"2\",\"nickname\":\"美团666\",\"avatar\":\"http://img4.imgtn.bdimg.com/it/u=134057123,1889531633&fm=26&gp=0.jpg\",\"messa" +
            "geNum\":13,\"lastMessage\":\"今天请假了，我不去了，身体不舒服！\",\"lastTime\":\"下午3:50\",\"isRea" +
            "d\":false},{\"username\":\"3\",\"nickname\":\"大欢乐\",\"avatar\":\"https://dss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2435648396,3879384970&fm=26&gp=0.jpg\",\"messageNum\":52,\"lastMessage\":\"今天又聚餐，去吗？\",\"lastTime\":\"下午3:10\",\"isRead\":false},{\"username\":\"4\"" +
            ",\"nickname\":\"小猴球\",\"avatar\":\"http://img5.imgtn.bdimg.com/it/u=3009190216,1574918141&fm=26&gp=0.jpg\",\"mes" +
            "sageNum\":3,\"lastMessage\":\"明天有事情没，一起打球去呀\"" +
            ",\"lastTime\":\"11月5日\",\"isRead\":false},{\"username\":\"30\",\"nickname\":\"女神。。晓\",\"" +
            "avatar\":\"https://dss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1523571786,2978344344&fm=26&gp=0.jpg\"," +
            "\"messageNum\":116,\"lastMessage\":\"明白，我懂了\",\"lastTime\":\"10月13日\",\"isRead\":fal" +
            "se},{\"username\":\"6\",\"nickname\":\"大兵兵\",\"avatar\":\"https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2243426221,495930131&fm=11&gp=0.jpg\",\"messageNum\":9,\"lastMessage\":\"兄弟，生日快乐！\",\"lastTime\":\"8:20\",\"isRead\":false},{\"username\":\"7\",\"nickname\":" +
            "\"游戏张\",\"avatar\":\"https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2693217877,2082111704&fm=15&gp=0.jpg\"," +
            "\"messageNum\":5,\"lastMessage\":\"今天有时间组个队没，大局农药来！\",\"lastTime\":\"10鱼人14日\"," +
            "\"isRead\":false},{\"username\":\"8\",\"nickname\":\"优衣库\",\"avatar\":\"http://img1.imgtn.bdimg.com/it/u=3675415932,4054970339&fm=26&gp=0.jpg\",\"messageNum\":30,\"lastMessage\":\"嗯嗯，好的。\",\"lastTime\":\"01:10\",\"isRead\":false},{\"username\":\"9\"," +
            "\"nickname\":\"晓洪\",\"avatar\":\"https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3609359006,4193533755&fm=26&gp=0.jpg\",\"messageNum\":58,\"lastMessage\":\"嗯呢，看时间吧！\",\"lastTime" +
            "\":\"12月5日\",\"isRead\":false},{\"username\":\"10\",\"nickname\":\"大张哥\",\"avatar\":\"http://img5.imgtn.bdimg.com/it/u=3784731410,1117417537&fm=26&gp=0.jpg\",\"messageNum\":1,\"las" +
            "tMessage\":\"那我今天就不过去了，你自己可以搞定吗？张哥..\",\"lastTime\":\"12月1日\",\"isRead\":false},{" +
            "\"username\":\"11\",\"nickname\":\"教练王\",\"avatar\":\"https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3718991280,3957443445&fm=26&gp=0.jpg\",\"messageNum\":19,\"lastMessage\":\"嗯嗯，等我\",\"lastTi" +
            "me\":\"前天\",\"isRead\":false},{\"username\":\"12\",\"nickname\":\"刘姐\",\"avatar\":\"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=586296168,3816207601&fm=26&gp=0.jpg\",\"messageNum\":123,\"lastMes" +
            "sage\":\"看我嘴型：g_u_n gun,do you know?\",\"lastTime\":\"11月3日\",\"isRead\":false}," +
            "{\"username\":\"13\",\"nickname\":\"袁老哥\",\"avatar\":\"http://img1.imgtn.bdimg.com/it/u=3347324707,3618329824&fm=26&gp=0.jpg\",\"messageNum\":55,\"lastMessage\":\"行吧，今天看时间喽\",\"lastTime\":\"星期六\",\"isRead\":false}]";

    private String username;
    private String nickname;
    private String avatar;
    private int messageNum;
    private String lastMessage;
    private String lastTime;
    private boolean isRead;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getMessageNum() {
        return messageNum;
    }

    public void setMessageNum(int messageNum) {
        this.messageNum = messageNum;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public void setRead(){
        setRead(true);
        setMessageNum(0);
    }
}
