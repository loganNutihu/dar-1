package org.rti.zcore.dar.gen.openmrs;

import org.rti.zcore.openmrs.OpenMRSEncounter;
import org.rti.zcore.openmrs.OpenMrsMultiValue;
import org.rti.zcore.openmrs.OpenMrsValue;

/**
 * JavaBean Item generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2012-09-14
 *         Time: 11:43:50
 *         Form Name: Item
 *         Form Id: 131
 */

/**
 * @hibernate.joined-subclass table="item"
 * @hibernate.joined-subclass-key column="id"
 */
public class Item extends OpenMRSEncounter {

private OpenMrsValue code;	//code field2152
private OpenMrsValue name;	//name field2153
private OpenMrsValue item_group_id;	//item_group_id field2154
private OpenMrsValue unit;	//unit field2155
private OpenMrsValue pack_size;	//pack_size field2276
private OpenMrsValue use_in_report;	//use_in_report field2294


 /**
  * @return
  * @hibernate.property column="code"
  */
    public OpenMrsValue getCode() {
        return this.code;
    }

    public void setCode(OpenMrsValue code) {
        this.code = code;
    }





 /**
  * @return
  * @hibernate.property column="name"
  */
    public OpenMrsValue getName() {
        return this.name;
    }

    public void setName(OpenMrsValue name) {
        this.name = name;
    }





 /**
  * @return
  * @hibernate.property column="item_group_id"
  */
    public OpenMrsValue getItem_group_id() {
        return this.item_group_id;
    }

    public void setItem_group_id(OpenMrsValue item_group_id) {
        this.item_group_id = item_group_id;
    }





 /**
  * @return
  * @hibernate.property column="unit"
  */
    public OpenMrsValue getUnit() {
        return this.unit;
    }

    public void setUnit(OpenMrsValue unit) {
        this.unit = unit;
    }





 /**
  * @return
  * @hibernate.property column="pack_size"
  */
    public OpenMrsValue getPack_size() {
        return this.pack_size;
    }

    public void setPack_size(OpenMrsValue pack_size) {
        this.pack_size = pack_size;
    }





 /**
  * @return
  * @hibernate.property column="use_in_report"
  */
    public OpenMrsValue getUse_in_report() {
        return this.use_in_report;
    }

    public void setUse_in_report(OpenMrsValue use_in_report) {
        this.use_in_report = use_in_report;
    }





}
