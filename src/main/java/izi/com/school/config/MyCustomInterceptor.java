package izi.com.school.config;

import izi.com.school.dao.UtilisateurDAO;
import izi.com.school.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class MyCustomInterceptor implements HandlerInterceptor {
    //unimplemented methods comes here. Define the following method so that it
    //will handle the request before it is passed to the controller.
    public MyCustomInterceptor(UtilisateurDAO userDAO){
        this.userDAO = userDAO ;
    }
    private UtilisateurDAO userDAO ;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
       // response.sendRedirect("/login?changed=1");

        return true;
    }
}
