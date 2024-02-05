package hh.sof3.bookstore.web;
//get request to the path /index

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String tervetuloa() {
        return "etusivu";
  }

}