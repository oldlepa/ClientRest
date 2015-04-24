package resume;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by diopous on 20/04/15.
 */

@Controller
@RequestMapping("/resume")
public class XMLController {

    private  ListeResume resumes;


    /*@RequestMapping(value="{name}", method = RequestMethod.GET)
    public @ResponseBody
    Resume getResumeInXML(@PathVariable String name) {

        Resume resume = new Resume(name, " DIOP "," Devenir Ingenieur ");

        return resume;

    }*/

    public XMLController()
    {
        resumes=new ListeResume();

        //ajout de formation
        ListeFormation formation=new ListeFormation();
        Formation form=new Formation("2014-2015","Master 1 Informatique","Universite de Rouen");
        formation.addFormation(form);

        //ajout d'experience
        ListeExperience experience=new ListeExperience();
        Experience exp=new Experience("Developpeur Web","Charger du web XML","2014-2015");
        experience.addExperience(exp);

        //ajout de langue
        ListeLangue langue=new ListeLangue();
        Language lang=new Language("Anglais","Faible");
        langue.addLangue(lang);
        //ajout d'un cv
        Resume cv1=new Resume("DIOP","Ousmane","Ingenieur en Informatique",formation,experience,langue);
        resumes.addResume(cv1);

        Resume cv2=new Resume("NDIAYE","MACTAR","Medecin",formation,experience,langue);
        resumes.addResume(cv2);
    }



    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody ListeResume getResume()
    {
        return resumes;
    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody Resume getResumeInXML(@PathVariable int id) {
        return resumes.getResume(id);
    }

    @RequestMapping(method= RequestMethod.POST)
    public  @ResponseBody String addResume(@RequestBody Resume resume)
    {
        this.resumes.addResume(resume);
        return "CV Enregistre:"+resume.toString();
    }
}
