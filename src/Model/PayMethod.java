package Model;

public class PayMethod{
    
    // * Atributos
    private long id;
    private int cardNum, cvv, expDate;

    // * Constructor vacío
    public PayMethod() {
    }

    // * Constructor
    public PayMethod(int cardNum, int cvv, int expDate) {
        this.cardNum = cardNum;
        this.cvv = cvv;
        this.expDate = expDate;
    }
    
    // * Getters y Setters
    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getExpDate() {
        return expDate;
    }

    public void setExpDate(int expDate) {
        this.expDate = expDate;
    }

}
