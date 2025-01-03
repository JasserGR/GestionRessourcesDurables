package Model.Utilisateurs;


import java.util.HashSet;
import java.util.Set;

public final class Administrateur extends Utilisateur {
    private Set<Auditeur> listAuditeurs;
    private Set<Utilisateur> listUtilisateurs;

    public Administrateur(String nom, String motDePasse) {
        super(nom, motDePasse);
        this.listAuditeurs = new HashSet<>();
        this.listUtilisateurs = new HashSet<>();
    }

    public Administrateur(int id, String nom, String motDePasse,String type) {
        super(id, nom, motDePasse, type);
        this.listAuditeurs = new HashSet<>();
        this.listUtilisateurs = new HashSet<>();
    }

    public Set<Auditeur> getListAuditeurs() {
        return listAuditeurs;
    }

    public void setListAuditeurs(Set<Auditeur> listAuditeurs) {
        this.listAuditeurs = listAuditeurs;
    }

    public Set<Utilisateur> getListUtilisateurs() {
        return listUtilisateurs;
    }

    public void setListUtilisateurs(Set<Utilisateur> listUtilisateurs) {
        this.listUtilisateurs = listUtilisateurs;
    }

    public void gererProfils() {
        System.out.println("L'administrateur " + getNom() + " gère les profils.");
        System.out.println("Auditeurs enregistrés : " + listAuditeurs.size());
        System.out.println("Utilisateurs enregistrés : " + listUtilisateurs.size());
    }

    @Override
    public String toString() {
        return "Administrateur{" + "listAuditeurs=" + listAuditeurs + ", listUtilisateurs=" + listUtilisateurs + '}';
    }
    
}
