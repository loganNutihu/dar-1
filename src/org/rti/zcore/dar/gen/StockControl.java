package org.rti.zcore.dar.gen;

import org.rti.zcore.dar.gen.*;
import org.rti.zcore.EncounterData;
import org.rti.zcore.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import java.sql.Timestamp;
import org.rti.zcore.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean StockControl generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2012-02-10
 *         Time: 14:53:45
 *         Form Name: Stock Control
 *         Form Id: 161
 */

/**
 * @hibernate.joined-subclass table="stock_control"
 * @hibernate.joined-subclass-key column="id"
 */
public class StockControl extends EncounterData {

private Date date_of_record;	//date_of_record field2241
private Long item_id;	//item_id field2236
private Integer type_of_change;	//type_of_change field2250
private Integer change_value;	//change_value field2251
private Date expiry_date;	//expiry_date field2244
private transient Integer quantity_remaining;	//quantity_remaining field2274
private transient Integer issued;	//issued field2239
private transient Integer received;	//received field2238
private transient Integer pos_adjust;	//pos_adjust field2246
private transient Integer neg_adjust;	//neg_adjust field2247
private transient Integer losses;	//losses field2245
private String notes;	//notes field2237
private Integer balance;	//balance field2248
private Long last_patient_item_id;	//last_patient_item_id field2249
private Integer computedBalance;	//computedBalance field2285


 /**
  * @return
  * @hibernate.property column="date_of_record"
  */
    public Date getDate_of_record() {
        return this.date_of_record;
    }

    public void setDate_of_record(Date date_of_record) {
        this.date_of_record = date_of_record;
    }





 /**
  * @return
  * @hibernate.property column="item_id"
  */
    public Long getItem_id() {
        return this.item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }





 /**
  * @return
  * @hibernate.property column="type_of_change"
  */
    public Integer getType_of_change() {
        return this.type_of_change;
    }

    public void setType_of_change(Integer type_of_change) {
        this.type_of_change = type_of_change;
    }





 /**
  * @return
  * @hibernate.property column="change_value"
  */
    public Integer getChange_value() {
        return this.change_value;
    }

    public void setChange_value(Integer change_value) {
        this.change_value = change_value;
    }





 /**
  * @return
  * @hibernate.property column="expiry_date"
  */
    public Date getExpiry_date() {
        return this.expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }





























 /**
  * @return
  * @hibernate.property column="notes"
  */
    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }





 /**
  * @return
  * @hibernate.property column="balance"
  */
    public Integer getBalance() {
        return this.balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }





 /**
  * @return
  * @hibernate.property column="last_patient_item_id"
  */
    public Long getLast_patient_item_id() {
        return this.last_patient_item_id;
    }

    public void setLast_patient_item_id(Long last_patient_item_id) {
        this.last_patient_item_id = last_patient_item_id;
    }





 /**
  * @return
  * @hibernate.property column="computedBalance"
  */
    public Integer getComputedBalance() {
        return this.computedBalance;
    }

    public void setComputedBalance(Integer computedBalance) {
        this.computedBalance = computedBalance;
    }





}