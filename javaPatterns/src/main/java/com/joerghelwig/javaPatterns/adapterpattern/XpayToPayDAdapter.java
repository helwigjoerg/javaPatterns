package com.joerghelwig.javaPatterns.adapterpattern;



public class XpayToPayDAdapter implements PayD{

	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cVVNo;
	private Double totalAmount;
	
	private final Xpay xpay;
	
	public XpayToPayDAdapter(Xpay xpay){
		this.xpay = xpay;
		setProp();
	}

	public String getCustCardNo() {
		return custCardNo;
	}

	public String getCardOwnerName() {
		return cardOwnerName;
	}

	public String getCardExpMonthDate() {
		return cardExpMonthDate;
	}

	public Integer getCVVNo() {
		return cVVNo;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}

	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}

	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;
	}

	public void setCVVNo(Integer cVVNo) {
		this.cVVNo = cVVNo;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	/**
	 * The setProp() method of the above class is used to set the xpay�s properties into the payD�s object. 
	 * We set the methods which are similar in work in both the interfaces.
	 *  However, there is only single method in PayD interface to set the month and the year of the credit card, as opposed to two methods in the 
	 *  Xpay interface. We joined the result of the two methods of the Xpay object (this.xpay.getCardExpMonth()+"/"+this.xpay.getCardExpYear()) 
	 *  and sets it into the setCardExpMonthDate() method.
	 */
	private void setProp(){
		setCardOwnerName(this.xpay.getCustomerName());
		setCustCardNo(this.xpay.getCreditCardNo());
		setCardExpMonthDate(this.xpay.getCardExpMonth()+"/"+this.xpay.getCardExpYear());
		setCVVNo(this.xpay.getCardCVVNo().intValue());
		setTotalAmount(this.xpay.getAmount());
	}

}
