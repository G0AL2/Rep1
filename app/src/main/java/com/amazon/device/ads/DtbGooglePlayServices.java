package com.amazon.device.ads;

/* loaded from: classes.dex */
class DtbGooglePlayServices {
    private static final String LOG_TAG = "DtbGooglePlayServices";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class AdvertisingInfo {
        private String advertisingIdentifier;
        private boolean gpsAvailable = true;
        private Boolean limitAdTrackingEnabled;

        /* JADX INFO: Access modifiers changed from: package-private */
        public static AdvertisingInfo createNotAvailable() {
            return new AdvertisingInfo().setGooglePlayServicesAvailable(false);
        }

        private AdvertisingInfo setGooglePlayServicesAvailable(boolean z10) {
            this.gpsAvailable = z10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String getAdvertisingIdentifier() {
            return this.advertisingIdentifier;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean hasAdvertisingIdentifier() {
            return getAdvertisingIdentifier() != null;
        }

        boolean isGooglePlayServicesAvailable() {
            return this.gpsAvailable;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public AdvertisingInfo setAdvertisingIdentifier(String str) {
            this.advertisingIdentifier = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public AdvertisingInfo setLimitAdTrackingEnabled(Boolean bool) {
            this.limitAdTrackingEnabled = bool;
            return this;
        }
    }

    private boolean isAdvertisingClassAvailable() {
        return DtbCommonUtils.isClassAvailable("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    private boolean isGooglePlayServicesAvailable() {
        return !DtbSharedPreferences.getInstance().isGooglePlayServicesUnavailable();
    }

    private void setGooglePlayServicesAvailable(boolean z10) {
        DtbSharedPreferences.getInstance().setGooglePlayServicesUnavailable(!z10);
    }

    public AdvertisingInfo getAdvertisingIdentifierInfo() {
        if (!isGooglePlayServicesAvailable()) {
            DtbLog.debug(LOG_TAG, "The Google Play Services Advertising Identifier feature is not available.");
            return AdvertisingInfo.createNotAvailable();
        }
        AdvertisingInfo advertisingInfo = null;
        boolean isAdvertisingClassAvailable = isAdvertisingClassAvailable();
        if (isAdvertisingClassAvailable) {
            advertisingInfo = DtbGooglePlayServicesAdapter.newAdapter().getAdvertisingIdentifierInfo();
            if (advertisingInfo.getAdvertisingIdentifier() != null && !advertisingInfo.getAdvertisingIdentifier().isEmpty()) {
                return advertisingInfo;
            }
        }
        AdvertisingInfo advertisingIdentifierInfo = DtbFireOSServiceAdapter.newAdapter().getAdvertisingIdentifierInfo();
        if (advertisingIdentifierInfo.getAdvertisingIdentifier() != null && !advertisingIdentifierInfo.getAdvertisingIdentifier().isEmpty()) {
            setGooglePlayServicesAvailable(advertisingIdentifierInfo.isGooglePlayServicesAvailable());
            return advertisingIdentifierInfo;
        }
        DtbLog.debug(LOG_TAG, "The Google Play Services Advertising Identifier feature is not available.");
        if (!isAdvertisingClassAvailable || (advertisingInfo != null && !advertisingInfo.isGooglePlayServicesAvailable())) {
            setGooglePlayServicesAvailable(false);
        }
        return AdvertisingInfo.createNotAvailable();
    }
}
