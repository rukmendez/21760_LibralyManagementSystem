
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "operations_tb")
public class CheckOutModel {
    @Id
    @Column(name = "Client_Full_Name",length = 40)
    private String name;
    @Column(name = "Book_Title",length = 40)
    private String title;
    @Temporal(TemporalType.DATE)
    @Column(name = "Date",length = 40)
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    

    public CheckOutModel() {
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "CheckOutModel{" + "name=" + name + ", title=" + title + ", date=" + date + '}';
    }

  
    
}
