package all; /**
 * Created by diopous on 16/04/15.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


//@Controller
//@RequestMapping("/resume")
public class XMLController {

    /*
    @RequestMapping(value="{name}", method = RequestMethod.GET)
    public @ResponseBody Coffee getCoffeeInXML(@PathVariable String name) {

        Coffee coffee = new Coffee(name, 100);

        return coffee;

    }
    */
    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody Resumer getResumeInXML(@PathVariable String id)
    {

        Resumer resume=new Resumer();

        return resume;
    }

    @RequestMapping(value="", method = RequestMethod.GET)
    public @ResponseBody Resumer getResumesInXML()
    {

        Resumer resume=new Resumer("DIOP","Ousmane",12,"Rouen",11111);

        return resume;
    }

}
