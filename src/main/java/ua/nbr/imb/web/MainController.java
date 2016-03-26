/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.nbr.imb.web;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.nbr.imb.db.model.repo.UserRepository;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "/")
public class MainController {

//    @Autowired
//    private UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getRoot(HttpSession session) {
        return "redirect:/auth";
    }


//    @RequestMapping(value = "/auth", method = RequestMethod.GET)
//    public ModelAndView getAuth(HttpSession session) {
//        Boolean isAuth = false;
//        //Boolean isAuth = (Boolean) session.getAttribute("isAuth");
//        if (!isAuth) {
//            ModelAndView mav = new ModelAndView("auth");
//            mav.addObject("userList", userRepository.findAll());
//            return mav;
//        } else {
//            ModelAndView mav = new ModelAndView("index");
//            return mav;
//        }
//    }


    @RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView getIndex() {
        ModelAndView mav = new ModelAndView("index");
       // mav.addObject("userList", userRepository.findAll());

        return mav;
    }
}
