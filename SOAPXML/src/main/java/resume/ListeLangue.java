package resume;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by diopous on 20/04/15.
 */

@XmlRootElement
public class ListeLangue {

    private List<Language> langue;

    public ListeLangue()
    {
        langue=new ArrayList<Language>();
    }

    public List<Language> getLangue(){ return langue;}

    public void setLangue(List<Language> langue){ this.langue=langue;}

    public void addLangue(Language langue){ this.langue.add(langue);}

    public void removeLangue(Language langue){this.langue.remove(langue);}

}
