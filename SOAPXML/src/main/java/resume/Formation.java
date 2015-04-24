package resume;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by diopous on 20/04/15.
 */
public class Formation {

    private String annee;

    private String intitule;

    private String etablissment;

    public Formation(){ }

    public Formation(String annee,String intitule,String etablissement)
    {
        this.annee=annee;
        this.intitule=intitule;
        this.etablissment=etablissement;
    }

    public String getAnnee(){ return annee;}

    public String getIntitule() { return intitule;}

    public String getEtablissment(){return etablissment;}

    @XmlElement
    public void setAnnee(String annee){this.annee=annee;}

    @XmlElement
    public void setIntitule(String intitule){this.intitule=intitule;}

    @XmlElement
    public void setEtablissment(String etablissment){this.etablissment=etablissment;}
}

