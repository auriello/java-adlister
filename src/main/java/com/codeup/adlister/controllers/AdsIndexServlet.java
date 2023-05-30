package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//you must include your server and the url path that the servlet will use to process the information
@WebServlet(name = "controllers.AdsIndexServlet", urlPatterns = "/ads")

//this class (AdsIndexServlet) is public and will extend another class (HttpServlet). this means that AdsIndex can use properties/methods from HttpServlet(parent class)
public class AdsIndexServlet extends HttpServlet {

//    the method is protected which means only the same package or subclass can access this method. our doGet methods retrieve information from the server.
    protected void doGet(HttpServletRequest request, HttpServletResponse response)

//            HttpServletRequest and HttpServletResponse are the parameters
            throws ServletException, IOException {

//the request object is used with the setAttribute method to store the ads(ATTRIBUte) data from the DaoFactory
        request.setAttribute("ads", DaoFactory.getAdsDao().all());

//after the request is made, the response is then forwarded to the JSP file so that the client will have the response aka the information will be generated for the client to see on the screen
        request.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(request, response);
    }
}
