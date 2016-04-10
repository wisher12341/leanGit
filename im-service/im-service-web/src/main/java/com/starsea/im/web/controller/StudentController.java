package com.starsea.im.web.controller;

import com.starsea.im.aggregation.service.UserService;
import com.starsea.im.aggregation.util.ServiceResult;
import com.starsea.im.biz.entity.Student;
import com.starsea.im.biz.entity.StudyForm;
import com.starsea.im.biz.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by danny on 16/4/4.
 */
@Controller
@RequestMapping("/HelloWeb")
public class StudentController extends AjaxBase{

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") Student student,
                             ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());
        return "result";
    }

    @RequestMapping(value = "/addForm", method = RequestMethod.POST)
    @ResponseBody
    public ServiceResult addForm(HttpServletRequest req,
                                 @RequestParam(value = "hc[]") int[] hc,
            @RequestParam("xf1") int xf1 ) {

        ServiceResult serviceResult = new ServiceResult();
        serviceResult.setCode(200);
        serviceResult.setMsg("ok");

        StudyForm studyForm = enrichStudyForm(hc);
        serviceResult.setMsg(userService.addStudyForm(studyForm));
        int length = hc.length;
        return setResponseData(serviceResult);
    }

    public StudyForm enrichStudyForm(int[] hc) {

        StudyForm studyForm = new StudyForm();
        studyForm.setQuestion1(hc[0]);
        studyForm.setQuestion2(hc[1]);
        studyForm.setQuestion3(hc[2]);
        studyForm.setQuestion4(hc[3]);
        studyForm.setQuestion5(hc[4]);
        studyForm.setQuestion6(hc[5]);
        studyForm.setQuestion7(hc[6]);
        studyForm.setQuestion8(hc[7]);
        studyForm.setQuestion9(hc[8]);
        studyForm.setQuestion10(hc[9]);
        studyForm.setQuestion11(hc[10]);
        studyForm.setQuestion12(hc[11]);
        studyForm.setQuestion13(hc[12]);
        studyForm.setQuestion14(hc[13]);
        studyForm.setQuestion15(hc[14]);
        studyForm.setQuestion16(hc[15]);
        studyForm.setQuestion17(hc[16]);
        studyForm.setQuestion18(hc[17]);
        return studyForm;


    }




    }
