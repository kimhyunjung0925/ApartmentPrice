package com.koreait.ap;

import com.koreait.ap.model.ApartmentInfoEntity;
import com.koreait.ap.model.LocationCodeEntity;
import com.koreait.ap.model.SearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Locale;

@Controller
@RequestMapping
public class ApController {
    @Autowired
    private ApService service;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("locationList", service.selLocationList());
        return "main";
    }

    @PostMapping("/result")
    public String result(SearchDto dto, RedirectAttributes ra){
        service.insApartmentInfo(service.getData(dto), dto);
        ra.addFlashAttribute("result", service.selApartmentInfoList(dto));
        return "redirect:/";
    }
}
