package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWhitDependency;
import com.fundamentosplatzi.springboot.fundamentos.bean.myBean;
import com.fundamentosplatzi.springboot.fundamentos.components.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private com.fundamentosplatzi.springboot.fundamentos.bean.myBean myBean;
	private MyBeanWhitDependency myBeanWhitDependency;


	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, myBean myBean, MyBeanWhitDependency myBeanWhitDependency){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWhitDependency = myBeanWhitDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args){

		componentDependency.saludar();
		myBean.print();
		myBeanWhitDependency.printWhitDependency();
	}
}
