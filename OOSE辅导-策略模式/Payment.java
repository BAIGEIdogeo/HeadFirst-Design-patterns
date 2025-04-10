interface PayStrategy {
    public void pay();
}//支付策略的接口

interface EPaymentStrategy extends PayStrategy{

}//电子支付策略的接口，继承了支付策略的接口

class CreditCardPay implements PayStrategy{
    public void pay(){
        System.out.println("Pay with card.");
    }
}//支付策略接口实现信用卡支付

class CashPay implements PayStrategy{
    public void pay(){
        System.out.println("Pay with cash.");
    }
}//电子支付策略接口实现现金支付

class WechatPay implements EPaymentStrategy{
    public void pay(){
        System.out.println("Pay with Wechat.");
    }
}//电子支付策略接口实现微信支付

class AlipayPay implements EPaymentStrategy{
    public void pay(){
        System.out.println("Pay with Alipay.");
    }
}

class Context{
    private PayStrategy paystrategy;

    public void setStrategy(PayStrategy paystrategy){
        this.paystrategy = paystrategy;
    }

    public void pay(){
        if (paystrategy != null){
            paystrategy.pay();
        }
        else{
            System.out.println("error");
        }
    }
}

class Main{
    public static void main(String[] args){
        Context context = new Context();//创建上下文类对象
        CashPay cashPay = new CashPay();//针对某个支付策略创建对象
        context.setStrategy(cashPay);//调用上下文类setStrategy方法
        context.pay();
    }
}

//策略模式的作用就是通过上下文类(Context Class),帮助解决问题