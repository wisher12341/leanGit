package com.starsea.im.aggregation.transfor;

import com.starsea.im.biz.entity.StudyForm;
import com.starsea.im.biz.entity.WatchForm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by danny on 16/4/21.
 */
public class Transformer {

    public static StudyForm enrichStudyForm(String name, String sex, String myClass, String school, String organization, String evaluationPerson, String evaluationTime, int[] hc) throws ParseException {

        StudyForm studyForm = new StudyForm();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(evaluationTime);
        studyForm.setName(name);
        studyForm.setSex(sex);
        studyForm.setBanji(myClass);
        studyForm.setSchool(school);
        studyForm.setOrganization(organization);
        studyForm.setEvaluationPerson(evaluationPerson);
        studyForm.setEvaluationTime(date);
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

    public static WatchForm enrichWatchForm(String name, String evaluationPerson, String evaluationTime, int[] hc) throws ParseException {

        WatchForm watchForm = new WatchForm();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(evaluationTime);
        watchForm.setName(name);
        watchForm.setEvaluationPerson(evaluationPerson);
        watchForm.setEvaluationTime(date);


        return watchForm;

    }
}
