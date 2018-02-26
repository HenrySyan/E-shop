package am.itspace.eshop.controller;

import am.itspace.eshop.model.UserType;
import am.itspace.eshop.repository.BrandRepository;
import am.itspace.eshop.repository.CategoryRepository;
import am.itspace.eshop.repository.ProductRepository;
import am.itspace.eshop.security.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @Autowired
    private BrandRepository brandRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainPage(ModelMap map) {
        map.addAttribute("allCategories", categoryRepository.findAll());
        map.addAttribute("allBrands", brandRepository.findAll());
        map.addAttribute("allProducts", productRepository.findAll());
        return "index";
    }

    @RequestMapping(value = "/loginSuccess", method = RequestMethod.GET)
    public String loginSuccess() {
        CurrentUser principal = (CurrentUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal.getUser().getType() == UserType.MANAGER) {
            return "redirect:/admin";
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public String login() {
        return "login";
    }



}
