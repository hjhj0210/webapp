package com.spring.siba;
 
import java.util.List;
import java.util.Locale;
 
import javax.inject.Inject;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.example.dto.MemberVO;
import com.example.service.MemberService;
 
/**
 * Handles requests for the application home page.
 */
@Controller
public class MenuGuController {
    
    private static final Logger logger = LoggerFactory.getLogger(MenuGuController.class);
    
    @Inject
    private MemberService service;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "gu", method = RequestMethod.GET)
    public String map(Locale locale, Model model) throws Exception{
 
        logger.info("gu");
        
        return "gu";
    }
    
    
}