// default package
// Generated 25 Aug 2014 8:52:00 PM by Hibernate Tools 3.4.0.CR1
package com.linx.shoppingcart.entity;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "ordered_product", catalog = "shoppingcart")
@NamedQueries({
    @NamedQuery(name = "OrderedProduct.findByCustomerOrderId", query = "SELECT o FROM OrderedProduct o WHERE o.id.customerOrderId = :customerOrderId")
    })
  

public class OrderedProduct implements java.io.Serializable {
  
  private static final long serialVersionUID = 1L;
  private OrderedProductId id;
  private Product product;
  private CustomerOrder customerOrder;
  private int quantity;

  public OrderedProduct() {}

  public OrderedProduct(OrderedProductId id) {
    this.id = id;
    /*this.product = product;
    this.customerOrder = customerOrder;
    this.quantity = quantity;*/
  }

  @EmbeddedId
  @AttributeOverrides({
      @AttributeOverride(name = "customerOrderId", column = @Column(name = "customer_order_id",
          nullable = false)),
      @AttributeOverride(name = "productId",
          column = @Column(name = "product_id", nullable = false))})
  public OrderedProductId getId() {
    return this.id;
  }

  public void setId(OrderedProductId id) {
    this.id = id;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "product_id", nullable = false, insertable = false, updatable = false)
  public Product getProduct() {
    return this.product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "customer_order_id", nullable = false, insertable = false, updatable = false)
  public CustomerOrder getCustomerOrder() {
    return this.customerOrder;
  }

  public void setCustomerOrder(CustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
  }


  @Column(name = "quantity", nullable = false)
  public int getQuantity() {
    return this.quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }



}
