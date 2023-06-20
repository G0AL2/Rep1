package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.e;
import com.chartboost.sdk.Privacy.model.CCPA;
import com.chartboost.sdk.Privacy.model.COPPA;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class u1 {

    /* renamed from: a  reason: collision with root package name */
    private i2 f14311a;

    public u1(i2 i2Var) {
        this.f14311a = i2Var;
    }

    private HashSet<String> b(e.b bVar) {
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public List<DataUseConsent> a(e.b bVar) {
        HashMap<String, DataUseConsent> b10 = this.f14311a.b();
        List<DataUseConsent> a10 = a(b10);
        ArrayList arrayList = new ArrayList();
        HashSet<String> b11 = b(bVar);
        if (b11 != null) {
            for (DataUseConsent dataUseConsent : a10) {
                if (a(b11, dataUseConsent)) {
                    arrayList.add(dataUseConsent);
                }
            }
        } else {
            if (b10.containsKey(CCPA.CCPA_STANDARD)) {
                arrayList.add(b10.get(CCPA.CCPA_STANDARD));
            }
            if (b10.containsKey(COPPA.COPPA_STANDARD)) {
                arrayList.add(b10.get(COPPA.COPPA_STANDARD));
            }
        }
        return arrayList;
    }

    private boolean a(HashSet<String> hashSet, DataUseConsent dataUseConsent) {
        if (hashSet.contains(dataUseConsent.getPrivacyStandard())) {
            return true;
        }
        CBLogging.e("Chartboost", "DataUseConsent " + dataUseConsent.getPrivacyStandard() + " is not whitelisted.");
        return false;
    }

    private List<DataUseConsent> a(HashMap<String, DataUseConsent> hashMap) {
        HashMap hashMap2 = new HashMap(hashMap);
        hashMap2.remove("gdpr");
        return new ArrayList(hashMap2.values());
    }
}
