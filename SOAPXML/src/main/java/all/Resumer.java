package all;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by diopous on 16/04/15.
 */

@XmlRootElement(name = "Resume")
public class Resumer {

    public  int tel;
    public  String adresse;
    public int age;
    public String firstname;
    public String nom;
    public int id;

    public Resumer(String prenom,String nom,int Age,String adresse,int tel)
    {
        this.firstname=prenom;
        this.nom=nom;
        this.adresse=adresse;
        this.tel=tel;
        this.age=Age;

    }

    public Resumer()
    {

    }

    public String getPrenom()
    {
        return firstname;
    }

    @XmlElement
    public void setPrenom(String prenom)
    {
        this.firstname=prenom;
    }

    public String getNom()
    {
        return nom;
    }
    @XmlElement
    public void setNom(String nom)
    {
        this.nom=nom;
    }

    public int getAge()
    {
        return age;
    }

    @XmlElement
    public void setAge(int age)
    {
        this.age=age;
    }

    public String getAdresse()
    {
        return adresse;
    }

    @XmlElement
    public void setAdresse(String adresse)
    {
        this.adresse=adresse;
    }

    public int getTel()
    {
        return tel;
    }

    @XmlElement
    public void setTel(int tel)
    {
        this.tel=tel;
    }


}
