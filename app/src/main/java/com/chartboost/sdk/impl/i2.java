package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import java.util.HashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class i2 {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, DataUseConsent> f14081a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f14082b;

    public i2(SharedPreferences sharedPreferences) {
        this.f14082b = sharedPreferences;
        c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r12 == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
        if (r12 == 2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
        r11 = new com.chartboost.sdk.Privacy.model.Custom(r8.getString("privacyStandard"), r8.getString("consent"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
        r11 = new com.chartboost.sdk.Privacy.model.COPPA(r8.getBoolean("consent"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        r6 = com.chartboost.sdk.Privacy.model.CCPA.CCPA_CONSENT.OPT_IN_SALE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
        if (r6.getValue().equals(r10) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        r11 = new com.chartboost.sdk.Privacy.model.CCPA(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
        r6 = com.chartboost.sdk.Privacy.model.CCPA.CCPA_CONSENT.OPT_OUT_SALE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
        if (r6.getValue().equals(r10) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
        r11 = new com.chartboost.sdk.Privacy.model.CCPA(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.i2.c():void");
    }

    private void d() {
        if (this.f14082b != null) {
            JSONArray jSONArray = new JSONArray();
            for (DataUseConsent dataUseConsent : this.f14081a.values()) {
                jSONArray.put(dataUseConsent.toJson());
            }
            a(this.f14082b, jSONArray);
        }
    }

    public DataUseConsent a() {
        return this.f14081a.get("gdpr");
    }

    public HashMap<String, DataUseConsent> b() {
        return this.f14081a;
    }

    public void a(DataUseConsent dataUseConsent) {
        CBLogging.a("Chartboost", "Added privacy standard: " + dataUseConsent.getPrivacyStandard() + " with consent: " + dataUseConsent.getConsent());
        this.f14081a.put(dataUseConsent.getPrivacyStandard(), dataUseConsent);
        d();
    }

    public DataUseConsent a(String str) {
        DataUseConsent remove = this.f14081a.remove(str);
        d();
        return remove;
    }

    private void a(SharedPreferences sharedPreferences, JSONArray jSONArray) {
        if (sharedPreferences == null || jSONArray == null) {
            return;
        }
        sharedPreferences.edit().putString("privacy_standards", jSONArray.toString()).apply();
    }
}
