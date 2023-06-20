package com.chartboost.sdk.Privacy.model;

import java.util.Locale;
import qe.k;
import ve.q;

/* loaded from: classes.dex */
public final class Custom extends GenericDataUseConsent {

    /* renamed from: c  reason: collision with root package name */
    private final String f13758c;

    /* renamed from: d  reason: collision with root package name */
    private final String f13759d;

    public Custom(String str, String str2) {
        this.f13758c = str;
        this.f13759d = str2;
        a();
    }

    private final void a() {
        String str = this.f13758c;
        if (str != null && this.f13759d != null) {
            if (a(str)) {
                handleException("Invalid Custom privacy standard name. Cannot use GDPR as privacy standard");
                return;
            } else if (isValidConsent(this.f13758c) && isValidConsent(this.f13759d)) {
                setPrivacyStandard(this.f13758c);
                setConsent(this.f13759d);
                return;
            } else {
                handleException("Invalid Custom consent values. Use valid values between 1 and 100 characters. privacyStandard: " + ((Object) this.f13758c) + " consent: " + ((Object) this.f13759d));
                return;
            }
        }
        handleException("Invalid Custom privacy standard name. Values cannot be null");
    }

    public final String getCustomConsent() {
        return this.f13759d;
    }

    public final String getCustomPrivacyStandard() {
        return this.f13758c;
    }

    @Override // com.chartboost.sdk.Privacy.model.GenericDataUseConsent, com.chartboost.sdk.Privacy.model.DataUseConsent
    public boolean isValidConsent(String str) {
        k.f(str, "consent");
        int length = str.length();
        return 1 <= length && length <= 99;
    }

    private final boolean a(String str) {
        String str2;
        CharSequence x02;
        if (str != null) {
            x02 = q.x0(str);
            String obj = x02.toString();
            if (obj != null) {
                str2 = obj.toLowerCase(Locale.ROOT);
                k.e(str2, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                return k.a("gdpr", str2);
            }
        }
        str2 = null;
        return k.a("gdpr", str2);
    }
}
