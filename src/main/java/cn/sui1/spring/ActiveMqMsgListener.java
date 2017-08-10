package cn.sui1.spring;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class ActiveMqMsgListener implements MessageListener {

	public void onMessage(Message msg) {
		TextMessage textMessage = (TextMessage) msg;
		//消息内容
		String text = null;
		try {
			text = textMessage.getText();
			System.out.println("ActiveMq Consumer接收： " + text );
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
