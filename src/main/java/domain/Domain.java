package domain;

import bl.HibernateUtil;
import entity.Journal;
import service.JournalService;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

public class Domain {

    public static void main(String[] args) throws SQLException {

        JournalService journalService = new JournalService();

        Journal journal = new Journal();
        journal.setOrder(1234);
        journal.setProductName("Item");
        journal.setNumber(127444444);
        journal.setTypeOfTest("Test");
        journal.setQuantity(1);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, Calendar.JANUARY, 25);
        journal.setDate(new Date(calendar.getTime().getTime()));
        journal.setTestersName("Petya");
        journal.setNote("Very cool product");

        //journalService.add(journal);
       journalService.remove(journal);

        List<Journal> all = journalService.getAll();
        for (Journal j : all){
            System.out.println(j);
        }
      /* Journal journal1 = journalService.getById(1L);
        System.out.println(journal1);*/



        HibernateUtil.shutdown();
    }
}
