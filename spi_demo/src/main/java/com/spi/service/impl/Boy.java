package com.spi.service.impl;

import com.spi.service.People;

/**
 * 分别是两个厂商对interface的不同实现，所以他们会依赖于interface项目
 * @author 
 *
 */
public class Boy implements People{

	public void pepole() {
		System.out.println("我是个男孩");
		
	}

}
