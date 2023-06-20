package com.vehiclecloud.app.videofetch.rnbillingclient;

/* loaded from: classes3.dex */
interface Analytics {

    /* loaded from: classes3.dex */
    public interface Event {
        public static final String IAP_CLK = "iap_clk";
        public static final String IAP_CLOSE = "iap_close";
        public static final String IAP_IMP = "iap_imp";
        public static final String IAP_RET_FALSE = "iap_ret_false";
        public static final String IAP_RET_TRUE = "iap_ret_true";
    }

    /* loaded from: classes3.dex */
    public interface Param {
        public static final String AUTO_SELECT = "auto_select";
        public static final String CODE = "code";
        public static final String ERROR = "error";
        public static final String ITEM_NAME = "item_name";
        public static final String SERVER = "server";
        public static final String SKU = "sku";
        public static final String TARGET = "target";
    }

    /* loaded from: classes3.dex */
    public interface PurchaseError {
        public static final String DEVELOPER_ERROR = "developer_error";
        public static final String ITEM_ALREADY_OWNED = "item_already_owned";
        public static final String ITEM_UNAVAILABLE = "item_unavailable";
        public static final String USER_CANCELED = "user_canceled";
    }
}
