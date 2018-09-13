// default package
// Generated 25 Aug 2014 8:52:00 PM by Hibernate Tools 3.4.0.CR1
package com.linx.shoppingcart.entity;


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "product", catalog = "shoppingcart")
public class Product implements java.io.Serializable {

  private static final long serialVersionUID = 1L;
  private Integer id;
  private Category category;
  private String name;
  private BigDecimal price;
  private String description;
  private Date dateCreated;
  private Set<OrderedProduct> orderedProducts = new HashSet<OrderedProduct>(0);

  public Product() {}


  public Product(Category category, String name, BigDecimal price, String description,
      Date dateCreated) {
    this.category = category;
    this.name = name;
    this.price = price;
    this.description = description;
    this.dateCreated = dateCreated;
  }

  public Product(Category category, String name, BigDecimal price, String description,
      Date dateCreated, Set<OrderedProduct> orderedProducts) {
    this.category = category;
    this.name = name;
    this.price = price;
    this.description = description;
    this.dateCreated = dateCreated;
    this.orderedProducts = orderedProducts;
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

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "category_id", nullable = false)
  public Category getCategory() {
    return this.category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }


  @Column(name = "name", nullable = false, length = 45)
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Column(name = "price", nullable = false, precision = 5)
  public BigDecimal getPrice() {
    return this.price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  @Column(name = "description", nullable = false, length = 145)
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "date_created", nullable = false, length = 19)
  public Date getDateCreated() {
    return this.dateCreated;
  }

  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
  public Set<OrderedProduct> getOrderedProducts() {
    return this.orderedProducts;
  }

  public void setOrderedProducts(Set<OrderedProduct> orderedProducts) {
    this.orderedProducts = orderedProducts;
  }



}
