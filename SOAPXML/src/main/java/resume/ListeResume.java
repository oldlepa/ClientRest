package resume;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by diopous on 20/04/15.
 */

@XmlRootElement
public class ListeResume {

    private List<Resume> resume;
    private int nombreResume;

    public ListeResume()
    {
        resume=new ArrayList<Resume>();
        nombreResume=0;
    }

    public List<Resume> getResume()
    {
        return resume;
    }

    public void setResume(List<Resume> resume)
    {
        this.resume=resume;
    }

    public void addResume(Resume resume)
    {
        nombreResume++;
        resume.setId(nombreResume);
        this.resume.add(resume);
    }

    public void removeResume(Resume resume)
    {
        this.resume.remove(resume);
    }

    public Resume getResume(int id)
    {
        for(Resume res:resume)
        {
            if(res.getId()==id)
            {
                return res;
            }
        }
        return  null;
    }
}
