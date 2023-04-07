package app.core.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("Herzel")
public class MyBean implements BeanNameAware, InitializingBean, DisposableBean {

	private String myBeanName;

	@Value("${home.address:Tel Aviv}")
	private String homeAdress;

	{
		System.out.println("\t>>>MyBean instanciate: " + myBeanName);
		System.out.println("\t>>>MyBean instanciate: " + homeAdress);
	}

	@Override
	public void setBeanName(String name) {
		this.myBeanName = name;
	}

	public String getMyBeanName() {
		return myBeanName;
	}

	@PostConstruct
	public void myInitMethod() {
		System.out.println("\t @PostConstruct: "+this.myBeanName+" is ready");
		System.out.println("\t @PostConstruct: "+this.homeAdress);
	}

	@PreDestroy
	public void myDestroyMethod() {
		System.out.println("\t @PreDestroy: "+this.myBeanName+" is destroyed");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("\t @InitializingBean: "+this.homeAdress);

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("\t @Destroy: "+this.myBeanName+" is destroyed");

	}

}
