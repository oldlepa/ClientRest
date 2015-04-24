import resume.*;

import javax.swing.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by diopous on 24/04/15.
 */
public class Application_client {

    private Service service;
    private JAXBContext j;
    private static  final QName qname=new QName("","");

    private static final int FRAME_Larg=420;
    private static  final int FRAME_haut=600;
    private static final String url="http://localhost:8080/SpringMVC/rest/resume/";

    private JFrame frame;
    private JTextPane textPane;
    private JScrollPane scroll;

    private JButton visualiseCV;
    private  JButton ajouterCV;
    private JButton   CVOK;
    private  JTextField identifiant;

    private JButton ajouterLangue;
    private JButton ajouterFormation;
    private JButton ajouterExperience;
    private JButton ajouter;
    private JButton accueil;

    private JTextField nom;
    private JTextField prenom;
    private JTextField objectif;

    private List<JTextField> langue;
    private List<JTextField> formation;
    private List<JTextField> experience;

    public Application_client()
    {
        try
        {
            j=JAXBContext.newInstance(Experience.class, Formation.class, Language.class, Resume.class, ListeExperience.class,ListeFormation.class,ListeLangue.class,ListeResume.class);
        }
        catch(JAXBException je)
        {
            System.out.println("Impossible"+je);
        }
        vue_Interface();
        composant();
        Controller();
    }

    public void vue_Interface()
    {
       frame=new JFrame("Application CV XML");
        frame.setBackground(Color.BLACK);
        frame.setPreferredSize(new Dimension(FRAME_Larg,FRAME_haut));
        frame.setMinimumSize(new Dimension(FRAME_Larg,FRAME_haut));
        textPane=new JTextPane();
        textPane.setEditable(false);
        scroll=new JScrollPane();
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        //une ressource pour une image visualisation des CV
        visualiseCV=new JButton("Visualiser un CV");
        visualiseCV.setBackground(Color.BLACK);
        visualiseCV.setForeground(Color.RED);
        visualiseCV.setBorder(null);

        ajouterCV = new JButton("Ajouter CV");
        ajouterCV.setBackground(Color.RED);
        ajouterCV.setForeground(Color.BLACK);
        ajouterCV.setBorder(null);

        CVOK = new JButton("OK");
        CVOK.setBackground(Color.RED);
        CVOK.setForeground(Color.BLACK);
        CVOK.setBorder(null);


        textPane.setBackground(Color.BLACK);
        textPane.setForeground(Color.WHITE);

        identifiant=new JTextField(3);
        nom=new JTextField();
        prenom=new JTextField();
        objectif=new JTextField();

        //pour les icones
         ajouterLangue=new JButton("Ajouter Langue");
         ajouterFormation=new JButton("Ajouter Formation");
         ajouterExperience=new JButton("Ajouter Experience");

        ajouterLangue.setBackground(Color.BLACK);
        ajouterLangue.setForeground(Color.BLACK);
        ajouterLangue.setBorder(null);

        ajouterFormation.setBackground(Color.BLACK);
        ajouterFormation.setForeground(Color.BLACK);
        ajouterFormation.setBorder(null);

        ajouterExperience.setBackground(Color.BLACK);
        ajouterExperience.setForeground(Color.BLACK);
        ajouterExperience.setBorder(null);

        langue= new ArrayList<JTextField>();
        langue.add(new JTextField("Langue1"));
        langue.add(new JTextField("Langue2"));
        langue.add(new JTextField("Langue3"));

        formation=new ArrayList<JTextField>();
        formation.add(new JTextField("formation1"));
        formation.add(new JTextField("formation2"));
        formation.add(new JTextField("formation3"));

        experience=new ArrayList<JTextField>();
        experience.add(new JTextField("experience1"));
        experience.add(new JTextField("experience2"));
        experience.add(new JTextField("experience3"));

        ajouter=new JButton("Ajouter Liste CV");
        ajouter.setBackground(Color.BLACK);
        ajouter.setForeground(Color.BLACK);
        ajouter.setBorder(null);

        accueil=new JButton("Accueil");
        accueil.setBackground(Color.BLACK);
        accueil.setForeground(Color.BLACK);
        accueil.setBorder(null);
    }

    public void composant()
    {
        JPanel pan=new JPanel(new GridLayout(0,1));{
        JLabel lab=new JLabel("Debut");
        pan.add(lab,BorderLayout.CENTER);
        pan.setBackground(Color.WHITE);

        JPanel p2 = new JPanel();
        p2.add(visualiseCV, BorderLayout.CENTER);
        p2.setBackground(Color.WHITE);
        pan.add(p2);

        JPanel p3 = new JPanel();
        p3.setBackground(Color.WHITE);
        p3.add(ajouterCV, BorderLayout.CENTER);
        pan.add(p3);
    }
        frame.add(pan, BorderLayout.CENTER);
        frame.add(scroll, BorderLayout.CENTER);
        scroll.getViewport().add(pan);
    }

    public void tousLesCV()
    {
        JPanel pan=new JPanel(new BorderLayout());
        JPanel panel=new JPanel(new BorderLayout());{

        JLabel label=new JLabel("Debut",JLabel.CENTER);
        label.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        panel.add(label,BorderLayout.NORTH);
        panel.setBackground(Color.BLACK);

        JPanel panel3 = new JPanel(new BorderLayout()); {
        
        JLabel afficher = new JLabel("Voir CV", JLabel.CENTER);
        panel3.setBackground(Color.BLACK);
        panel3.add(afficher, BorderLayout.WEST);
        JPanel panel4 = new JPanel(new FlowLayout()); {
            panel4.add(identifiant);
            panel4.setBackground(Color.BLACK);
        }
        panel3.add(panel4);
        panel3.add(CVOK, BorderLayout.EAST);
    }
        panel.add(panel3, BorderLayout.SOUTH);

        pan.add(panel, BorderLayout.NORTH);
        pan.setBackground(Color.BLACK);
        pan.add(identifiant, BorderLayout.CENTER);
        pan.add(accueil, BorderLayout.SOUTH);
        accueil.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
    }
    frame.add(pan, BorderLayout.CENTER);
    frame.add(scroll, BorderLayout.CENTER);
    scroll.getViewport().add(pan);

    }

    private void Controller() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        accueil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                composant();
            }
        });
        visualiseCV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Vous allez visualiser tous les CV");
            }
        });
        ajouterCV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Debuter l'ajout des CV");
            }
        });
        CVOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int id = 1;
                if (identifiant.getText().equals("")) {
                    try {
                        System.out.println("verification du cv");
                    } catch (Exception e1) {
                    }
                    return;
                }
                try {
                    id = Integer.valueOf(identifiant.getText());
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(frame, "L'id n'est pas valide !");
                    return;
                }
                if (id <= 0) {
                    JOptionPane.showMessageDialog(frame, "L'id doit être positif !");
                    return;
                }
                try {
                    System.out.println("Nous retourne l'identifiant d'un CV");
                } catch (Exception e1) {
                    return;
                }
            }
        });
    }



    public void display()
    {
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

        public static void main(String[] args)
        {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Application_client().display();
                }
            });
        }

}
