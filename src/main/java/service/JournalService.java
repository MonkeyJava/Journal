package service;

import bl.SessionUtil;
import dao.JournalDAO;
import entity.Journal;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import java.sql.SQLException;
import java.util.List;

public class JournalService extends SessionUtil implements JournalDAO {

    public void add(Journal journal) throws SQLException {
        //open session with a transaction
        openTransactionSession();

        Session session = getSession();
        session.save(journal);

        //close session with a transaction
        closeTransactionSession();
    }

    public List<Journal> getAll() throws SQLException {
        //open session with a transaction
        openTransactionSession();

        String sql = "SELECT * FROM JOURNAL";

        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Journal.class);
        List<Journal> journalsList = query.list();

        //close session with a transaction
        closeTransactionSession();
        return journalsList;
    }

    public Journal getById(Long id) throws SQLException {
        //open session with a transaction
        openTransactionSession();

        String sql = "SELECT * FROM JOURNAL WHERE ID= :id";

        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Journal.class);
        query.setParameter("id", id);

        Journal journal = (Journal)query.getSingleResult();

        //close session with a transaction
        closeTransactionSession();
        return journal;
    }

    public void update(Journal journal) throws SQLException {
        //open session with a transaction
        openTransactionSession();

        Session session = getSession();
        session.update(journal);

        //close session with a transaction
        closeTransactionSession();
    }

    public void remove(Journal journal) throws SQLException {
        //open session with a transaction
        openTransactionSession();

        Session session = getSession();
        session.load(journal, journal.getId());  //не работает метод remove, как мне надо
        session.delete(journal);
        //session.remove(journal);

        //close session with a transaction
        closeTransactionSession();
    }
}
