package resume;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by diopous on 20/04/15.
 */
public class ListeFormation {

   private List<Formation> formationList;

   public ListeFormation()
   {
       formationList = new ArrayList<Formation>();
   }

   public List<Formation> getFormationList(){return formationList;}

   @XmlElement
   public void setFormationList(List<Formation> formationList){ this.formationList=formationList;}

   public void addFormation(Formation formation){this.formationList.add(formation);}

   public void removeFormation(Formation formation){this.formationList.remove(formation);}

}
