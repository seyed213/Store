package com.nikdiba.store.enums;

public enum OrderStatus {


    CANCEL {
        public String toString() {
            return "CANCEL";
        }
    },
    PAYED {
        public String toString() {
            return "PAYED";
        }
    },
    DELIVERED {
        public String toString() {
            return "DELIVERED";
        }
    },
    IN_DELIVERY {
        public String toString() {
            return "IN_DELIVERY";
        }
    },
    INVENTORY_OUT {
        public String toString() {
            return "INVENTORY_OUT";
        }
    },
    PACKAGING {
        public String toString() {
            return "PACKAGING";
        }
    },
    CURRENT {
        public String toString() {
            return "CURRENT";
        }
    }

}
