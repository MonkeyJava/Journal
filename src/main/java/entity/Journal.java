package entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "JOURNAL")
public class Journal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ORDERS")
    private int order;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "NUMBER")
    private int number;

    @Column(name = "TYPE_OF_TEST")
    private String typeOfTest;

    @Column(name = "QUANTITY")
    private int quantity;

   // @Temporal(TemporalType.DATE)
    @Column(name = "DATE")
    private Date date;

    @Column(name = "TESTERS_NAME")
    private String testersName;

    @Column(name = "NOTE")
    private String note;

    public Journal(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTypeOfTest() {
        return typeOfTest;
    }

    public void setTypeOfTest(String typeOfTest) {
        this.typeOfTest = typeOfTest;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTestersName() {
        return testersName;
    }

    public void setTestersName(String testersName) {
        this.testersName = testersName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "id=" + id +
                ", order=" + order +
                ", productName='" + productName + '\'' +
                ", number=" + number +
                ", typeOfTest='" + typeOfTest + '\'' +
                ", quantity='" + quantity + '\'' +
                ", date=" + date +
                ", testersName='" + testersName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
