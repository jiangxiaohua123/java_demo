package com.spi.core;

import java.util.Iterator;
import java.util.ServiceLoader;

import com.spi.service.People;

/**
 * spi-core: ���ṩ���û�ʹ�õĺ���jar�ļ�, ͬ��������interface��Ŀ, 
 * �û�ʹ��ʱ��Ҫ����spi-core.jar�ͳ��̾���ʵ�ֵ�jar
 * @author 
 *
 */
public class PeopleFactory {

	public void invoker() {
		ServiceLoader<People> services = ServiceLoader.load(People.class);
		Iterator<People> peoples = services.iterator();
		boolean notFound = true;
		while(peoples.hasNext()) {
			notFound=false;
			People people = peoples.next();
			people.pepole();
		}
		
		if(notFound) {
			throw new RuntimeException("δ���־���ʵ����");
		}
	}
}
