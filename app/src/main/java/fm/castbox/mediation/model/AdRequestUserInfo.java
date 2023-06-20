package fm.castbox.mediation.model;

import ed.c;

/* loaded from: classes3.dex */
public class AdRequestUserInfo {
    @c("country_code")
    private String countryCode;

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public String toString() {
        return "AdRequestUserInfo{countryCode='" + this.countryCode + "'}";
    }
}
