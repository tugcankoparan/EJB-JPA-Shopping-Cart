// default package
// Generated 25 Aug 2014 8:52:00 PM by Hibernate Tools 3.4.0.CR1
package com.linx.shoppingcart.entity;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "customer", catalog = "shoppingcart")
public class Customer implements java.io.Serializable {

  private static final long serialVersionUID = 1L;
  private Integer id;
  private String name;
  private String address;
  private String email;
  private String cityRegion;
  private String phone;
  private String ccNumber;
  private Set<CustomerOrder> customerOrders = new HashSet<CustomerOrder>(0);

  public Customer() {}


  public Customer(String name, String address, String email, String cityRegion, String phone,
      String ccNumber) {
    this.name = name;
    this.address = address;
    this.email = email;
    this.cityRegion = cityRegion;
    this.phone = phone;
    this.ccNumber = ccNumber;
  }

  public Customer(String name, String address, String email, String cityRegion, String phone,
      String ccNumber, Set<CustomerOrder> customerOrders) {
    this.name = name;
    this.address = address;
    this.email = email;
    this.cityRegion = cityRegion;
    this.phone = phone;
    this.ccNumber = ccNumber;
    this.customerOrders = customerOrders;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Column(name = "name", nullable = false, length = 45)
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Column(name = "address", nullable = false, length = 45)
  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Column(name = "email", nullable = false, length = 45)
  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Column(name = "city_region", nullable = false, length = 2)
  public String getCityRegion() {
    return this.cityRegion;
  }

  public void setCityRegion(String cityRegion) {
    this.cityRegion = cityRegion;
  }


  @Column(name = "phone", nullable = false, length = 45)
  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Column(name = "cc_number", nullable = false, length = 19)
  public String getCcNumber() {
    return this.ccNumber;
  }

  public void setCcNumber(String ccNumber) {
    this.ccNumber = ccNumber;
  }

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer")
  public Set<CustomerOrder> getCustomerOrders() {
    return this.customerOrders;
  }

  public void setCustomerOrders(Set<CustomerOrder> customerOrders) {
    this.customerOrders = customerOrders;
  }



}
