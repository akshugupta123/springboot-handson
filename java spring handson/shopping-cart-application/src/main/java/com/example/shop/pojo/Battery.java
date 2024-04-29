//package com.example.shop.product;
package com.example.shop.pojo;
import com.example.shop.pojo.Product;

public class Battery extends Product {
    private boolean rechargeable;

    // Getter
    public boolean isRechargeable() {
        return rechargeable;
    }

    // Setter
    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}
