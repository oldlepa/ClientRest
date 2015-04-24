package resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by diopous on 20/04/15.
 */

@XmlRootElement(name = "resume")
public class Resume {

    private int id;
    private String nom;
    private String prenom;
    private String objectif;
    ListeFormation formation;
    ListeExperience experience;
    ListeLangue langue;

    public Resume(){
        this.id=0;
        this.nom="";
        this.prenom="";
        this.objectif="";
        this.formation=new ListeFormation();
        this.experience=new ListeExperience();
        this.langue=new ListeLangue();
    }
    public Resume(String nom,String prenom,String objectif,ListeFormation formation,ListeExperience experience,ListeLangue langue)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.objectif=objectif;
        this.formation=formation;
        this.experience=experience;
        this.langue=langue;

    }

    public int getId(){return id;}

    @XmlElement
    public void setId(int id){this.id=id;}


   public String getNom(){return nom;}

    @XmlElement
    public void setNom(String nom){this.nom=nom;}

    public String getPrenom(){return prenom;}

    @XmlElement
    public void setPrenom(String prenom){this.prenom=prenom;}

    public String getObjectif(){return objectif;}

    @XmlElement
    public void setObjectif(String objectif){this.objectif=objectif;    }

    public ListeFormation getFormation(){return formation;}

    @XmlElement
    public void setFormation(ListeFormation formation){this.formation=formation;}

    public ListeExperience getExperience(){return experience;}

    @XmlElement
    public void setExperience(ListeExperience experience){this.experience=experience;}

    public ListeLangue getLangue(){return langue;}

    @XmlElement
    public void setLangue(ListeLangue langue){this.langue=langue;}


}
