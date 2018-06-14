package com.pp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.pp.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator wish=null;
		res=new FileSystemResource("src/com/pp/cfgs/applicationContext.xml");
		//create IOC Container (BeanFactory)
        factory=new XmlBeanFactory(res);
      wish=(WishMessageGenerator)factory.getBean("wish");
      System.out.println("-----------------------------------------------");
     System.out.println("Wish Message : "+wish.generateWishMessage("Ram")); 
	}

}
