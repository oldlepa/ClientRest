package resume;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by diopous on 20/04/15.
 */


public class Experience {

    private String nomExperience;

    private String descriptionExperience;

    private String anneeExperience;

    public Experience(){}

    public Experience(String nomExperience,String descriptionExperience,String anneeExperience)
    {
        this.nomExperience=nomExperience;
        this.descriptionExperience=descriptionExperience;
        this.anneeExperience=anneeExperience;
    }

    public String getNomExperience(){ return nomExperience;}

    public String getDescriptionExperience(){ return descriptionExperience;}

    public String getAnneeExperience(){ return  anneeExperience;}

    @XmlElement
    public void setNomExperience(String nomExperience){this.nomExperience=nomExperience;}

    @XmlElement
    public void setDescriptionExperience(String descriptionExperience){this.descriptionExperience=descriptionExperience;}

    @XmlElement
    public void setAnneeExperience(String anneeExperience){this.anneeExperience=anneeExperience;}


}
