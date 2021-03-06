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
 * JavaBean PatientCondition generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2012-09-14
 *         Time: 11:43:47
 *         Form Name: Health
 *         Form Id: 136
 */

/**
 * @hibernate.joined-subclass table="patient_condition"
 * @hibernate.joined-subclass-key column="id"
 */
public class PatientCondition extends EncounterData {

private Float weight;	//weight field2168
private Float height;	//height field2169
private Float bmi_calculated;	//bmi_calculated field2289
private Integer who_screen;	//who_screen field2277
private Integer cd4count;	//cd4count field2278
private Integer tb_status;	//tb_status field2290
private String oi_indications;	//oi_indications field2292


 /**
  * @return
  * @hibernate.property column="weight"
  */
    public Float getWeight() {
        return this.weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }





 /**
  * @return
  * @hibernate.property column="height"
  */
    public Float getHeight() {
        return this.height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }





 /**
  * @return
  * @hibernate.property column="bmi_calculated"
  */
    public Float getBmi_calculated() {
        return this.bmi_calculated;
    }

    public void setBmi_calculated(Float bmi_calculated) {
        this.bmi_calculated = bmi_calculated;
    }





 /**
  * @return
  * @hibernate.property column="who_screen"
  */
    public Integer getWho_screen() {
        return this.who_screen;
    }

    public void setWho_screen(Integer who_screen) {
        this.who_screen = who_screen;
    }





 /**
  * @return
  * @hibernate.property column="cd4count"
  */
    public Integer getCd4count() {
        return this.cd4count;
    }

    public void setCd4count(Integer cd4count) {
        this.cd4count = cd4count;
    }





 /**
  * @return
  * @hibernate.property column="tb_status"
  */
    public Integer getTb_status() {
        return this.tb_status;
    }

    public void setTb_status(Integer tb_status) {
        this.tb_status = tb_status;
    }





 /**
  * @return
  * @hibernate.property column="oi_indications"
  */
    public String getOi_indications() {
        return this.oi_indications;
    }

    public void setOi_indications(String oi_indications) {
        this.oi_indications = oi_indications;
    }





}
