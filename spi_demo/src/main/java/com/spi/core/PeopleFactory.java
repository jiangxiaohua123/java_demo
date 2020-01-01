package com.spi.core;

import java.util.Iterator;
import java.util.ServiceLoader;

import com.spi.service.People;

/**
 * spi-core: 是提供给用户使用的核心jar文件, 同样依赖于interface项目, 
 * 用户使用时需要引入spi-core.jar和厂商具体实现的jar
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
			throw new RuntimeException("未发现具体实现类");
		}
	}
}
