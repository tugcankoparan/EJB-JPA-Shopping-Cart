// default package
// Generated 25 Aug 2014 8:52:00 PM by Hibernate Tools 3.4.0.CR1
package com.linx.shoppingcart.entity;


import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 */
@Entity
@Table(name = "category", catalog = "shoppingcart")
public class Category implements java.io.Serializable {

  private static final long serialVersionUID = 1L;
  private Integer id;
  private String name;
  private List<Product> products = new ArrayList<Product>();

  public Category() {}


  public Category(String name) {
    this.name = name;
  }

  public Category(String name, List<Product> products) {
    this.name = name;
    this.products = products;
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

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "category")
  public List<Product> getProducts() {
    return this.products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }



}
