package com.google.android.ads.mediationtestsuite.dataobjects;

import ed.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jspecify.nullness.Nullable;

/* loaded from: classes2.dex */
public class NetworkResponse {
    private List<String> adapters;
    private Map<String, String> data;
    @c("rtb_adapters")
    private List<String> rtbAdapters;

    public NetworkResponse(Map<String, String> map, String str, boolean z10) {
        this.data = map;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (z10) {
            this.rtbAdapters = arrayList;
        } else {
            this.adapters = arrayList;
        }
    }

    @Nullable
    public String a() {
        if (e()) {
            return this.rtbAdapters.get(0);
        }
        List<String> list = this.adapters;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.adapters.get(0);
    }

    public Map<String, String> b() {
        return this.data;
    }

    public boolean c() {
        String a10 = a();
        if (a10 == null) {
            return false;
        }
        return this.data != null || a10.equals(AdUnit.GOOGLE_ADAPTER_CLASS);
    }

    public boolean d() {
        return a() != null && a().equals(AdUnit.CUSTOM_EVENT_ADAPTER_CLASS);
    }

    public boolean e() {
        List<String> list = this.rtbAdapters;
        return (list == null || list.isEmpty()) ? false : true;
    }
}
