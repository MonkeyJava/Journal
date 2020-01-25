package dao;

import entity.Journal;

import java.sql.SQLException;
import java.util.List;

public interface JournalDAO {
    //create
    void add(Journal journal) throws SQLException;

    //read
    List<Journal> getAll() throws SQLException;

    Journal getById(Long id) throws SQLException;

    //update
    void update(Journal journal) throws SQLException;

    //delete
    void remove(Journal journal) throws SQLException;
}
