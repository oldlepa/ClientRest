package resume;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by diopous on 20/04/15.
 */

@XmlRootElement
public class ListeExperience {

    private List<Experience> experiences;

    public ListeExperience()
    {
        experiences=new ArrayList<Experience>();
    }

    public List<Experience> getExperiences(){return experiences;}

    public void setExperiences(List<Experience> experiences){this.experiences=experiences;}

    public void addExperience(Experience experience){this.experiences.add(experience);}

    public void removeExperience(Experience experience){this.experiences.remove(experience);}
}
