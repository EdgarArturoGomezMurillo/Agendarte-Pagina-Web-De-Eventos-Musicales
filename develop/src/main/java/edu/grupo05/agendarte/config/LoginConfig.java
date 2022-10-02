//package edu.grupo05.agendarte.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class LoginConfig extends WebSecurityConfigurerAdapter {
//
//    // Adding the roles
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("yon")
//                .password("1234")
//                .roles("admin_role")
//                .and()
//                .withUser("andru")
//                .password("123456")
//                .roles("student_role");
//    }
//
//    // Configuring the api
//    // according to the roles.
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.
//                httpBasic()
//                .and()
//                .authorizeRequests()
//                .antMatchers("/delete").hasRole("admin_role")
//                .and()
//                .formLogin();
//    }
//
//    // Function to encode the password
//    // assign to the particular roles.
//    @Bean
//    public PasswordEncoder getPasswordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }
//}


