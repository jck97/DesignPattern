/*
 *@Author: JinCh
 *@Date: Created in 2019/3/11  17:24
 *@Description:
 */
package learn.Behavioral.Observe;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Observable;

public class SPSYS {

    private Double price;

    public SPSYS(Double price) {
        this.price = price;
    }

    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public Double getPrice() {
        return price;
    }

    public void change(double rio){
        Double oldPrice = price;
        price = oldPrice*(1+rio);
        if (rio>0.05 || rio<-0.05){
            this.pcs.firePropertyChange("price", oldPrice, price);
        }
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }
}
