package com.qianfeng.mytx;

import org.aspectj.lang.ProceedingJoinPoint;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.qianfeng.utils.HibernateUtils;

@Component
public class TxAop {

	//切面类就是代理跟代理的功能非常的相似都是实现功能的拓展
	public void txAround(ProceedingJoinPoint pjp){
		Session session = HibernateUtils.getSession();
		Transaction transaction = session.beginTransaction();
		try {
			// 执行目标对象中方法,内部会将相关的参数传给切入点对应的方法
			pjp.proceed();//相当于 pjp.addInfo(null), pjp.addInfo("abc")
			// 二次设置需要给目标方法传递的参数
//			pjp.proceed(new Object[]{session}); // pjp.addInfo(session);
			// 添加和删除都成功，提交
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// 某一个操作失败，回滚
			transaction.rollback();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 如果使用getCurrentSession，不用手动关闭
//		session.close();
	}
}
