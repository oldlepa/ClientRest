package resume;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by diopous on 20/04/15.
 */
public class Language {

    private String nomLangue;

    private String niveau;

    public Language(){}

    public Language(String nomLangue,String niveau)
    {
        this.nomLangue=nomLangue;
        this.niveau=niveau;
    }

    public String getNomLangue(){ return nomLangue;}

    public String getNiveau(){return niveau;}

    @XmlElement
    public void setNomLangue(String nomLangue){this.nomLangue=nomLangue;}

    @XmlElement
    public void setNiveau(String niveau){this.niveau=niveau;}
}
