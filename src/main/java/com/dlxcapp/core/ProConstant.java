package com.dlxcapp.core;

public final class ProConstant {

    public static final String DOMAIN_NAME ="https://app.dlxc6.com";
    public static final String BASE_PACKAGE = "com.dlxcapp";//项目基础包名称，根据自己公司的项目修改

    public static final String MODEL_PACKAGE = BASE_PACKAGE + ".model";//Model所在包
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".dao";//Mapper所在包
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";//Service所在包
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";//ServiceImpl所在包
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".web";//Controller所在包

    public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.Mapper";//Mapper插件基础接口的完全限定名

    public final static String SESSION_KEY = "user";

    public static class Image{
        public static final String IMG_DOMIAN = "http://dimg.dlxc6.com/";//缩略图
        public static final String IMG_PRE_URL = "?imageView2/1/w/180/h/140";//缩略图
        public static final String IMG_URL = "?imageView2/1/w/400/h/225";//大图
        public static final String IMG_HEAD = "http://www.dlxc6.com/";//大图

        //public static final String SERVER_LINUX_DIR="/web/app/attachment";
        //public static final String SERVER_WIN_DIR="";
    }
    public static class TradeState{
        public static final String SUCCESS = "SUCCESS";//支付成功
        public static final String REFUND = "REFUND";//转入退款
        public static final String NOTPAY = "NOTPAY";//未支付
        public static final String CLOSED = "CLOSED";//已关闭
        public static final String REVOKED = "REVOKED";//已撤销（刷卡支付）
        public static final String USERPAYING = "USERPAYING";//用户支付中
        public static final String PAYERROR = "PAYERROR";//支付失败(其他原因，如银行返回失败)
    }
    public static class RedPack{
        public static final int VIEW_1 = 1;//附近人员可见
        public static final int VIEW_2 = 2;//同城
        public static final int VIEW_3 = 3;//不限
    }
    public static class PayType{
        public static final String INFO = "info";//发布信息支付
        public static final String SHARE = "share";//发布信息支付
        public static final String TOP = "top";//发布信息支付
    }
    public static class OrderState{
        public static final int STATE_0=0;//生成预付单
        public static final int STATE_1=1;//交易成功，后续业务还未处理
        public static final int STATE_2=2;//交易成功，后续业务处理完毕
        public static final int STATE_100=100;//金额不等
        public static final int STATE_101=101;//微信通知支付失败
    }

    public static class MemberAcount{
        public static final int ACOUNT_STATE_1=1;//账户正常
        public static final int ACOUNT_STATE_3=3;//提现中
        public static final int ACOUNT_STATE_100=100;//账户冻结
    }
    public static class MemberAcountLog{
        public static final int OPERATION_TYPE_1=1;//收益
        public static final int OPERATION_TYPE_2=2;//充值
        public static final int OPERATION_TYPE_3=3;//申请提现
        public static final int OPERATION_TYPE_4=4;//提现成功
        public static final int OPERATION_TYPE_5=5;//提现失败
        public static final int OPERATION_TYPE_100=100;//冻结操作
        public static final int OPERATION_TYPE_200=200;//解冻操作
    }
    public static class Cache{
        public static final String NAMESPACE="dbcache";
        public static final String KEY_CITY_ALL="'city_all'";
    }
}
