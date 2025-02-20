package de.oette.course.C04;

import de.oette.course.C03.C03Entity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class FavouriteColorService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void storeColor(String colorName) {
        entityManager.persist(new FavouriteColor(colorName));
    }

    @Transactional
    public List<FavouriteColor> loadColors() {
        String queryString = "select favourite_color from FavouriteColor favourite_color";
        TypedQuery<FavouriteColor> query = entityManager.createQuery(queryString, FavouriteColor.class);
        return query.getResultList();
    }
}
