/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

import org.apache.catalina.core.ApplicationContext
import org.example.bean.UserConfig
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.support.ClassPathXmlApplicationContext

@SpringBootApplication //annotation or boilerPlate
class App {

    static void main(String[] args) {
        SpringApplication.run(App.class, args) // this is how we start/ run our Spring boot and it needs <class primarySource, string>
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        // Get the UserConfig bean from the context
        UserConfig config = (UserConfig) context.getBean("UserConfigBean");

        // Debugging - check the values from the bean
        System.out.println("User Name: " + config.getName());
        System.out.println("Class Name: " + config.getClassName());

    }
}
