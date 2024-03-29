package services.categorie;

import java.sql.SQLException;
import java.util.List;

public interface ICategorie <T> {
    void AjouterCategorie (T t ) throws SQLException;
    void ModifierCategorie (T t ) throws SQLException;
    void SupprimerCategorie (int id ) throws SQLException;
    List<T> AfficherCategorie ( ) throws SQLException;

}
