package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.q;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class i implements com.fyber.inneractive.sdk.response.i {

    /* renamed from: a  reason: collision with root package name */
    public URL f17347a;

    /* renamed from: b  reason: collision with root package name */
    public String f17348b;

    /* renamed from: d  reason: collision with root package name */
    public String f17350d;

    /* renamed from: e  reason: collision with root package name */
    public String f17351e;

    /* renamed from: f  reason: collision with root package name */
    public String f17352f;

    /* renamed from: c  reason: collision with root package name */
    public Map<q, List<String>> f17349c = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public boolean f17353g = false;

    public void a(q qVar, String str) {
        List<String> list = this.f17349c.get(qVar);
        if (list == null) {
            list = new ArrayList<>();
            this.f17349c.put(qVar, list);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }

    public boolean b() {
        String str;
        return this.f17353g && this.f17347a != null && ((str = this.f17348b) == null || (!TextUtils.isEmpty(str) && this.f17348b.equalsIgnoreCase("omid")));
    }

    public String toString() {
        return "Verification{mJavaScriptResource=" + this.f17347a + ", mTrackingEvents=" + this.f17349c + ", mVerificationParameters='" + this.f17350d + "', mVendor='" + this.f17351e + "'}";
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public List<String> a(q qVar) {
        Map<q, List<String>> map;
        if (qVar == null || (map = this.f17349c) == null) {
            return null;
        }
        return map.get(qVar);
    }

    public String a() {
        if (this.f17353g) {
            if (TextUtils.isEmpty(this.f17348b)) {
                return "apiFramework = ";
            }
            if (this.f17348b.equalsIgnoreCase("omid")) {
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(this.f17352f) ? "" : this.f17352f;
                return String.format("JavaScriptResource_url = %s", objArr);
            }
            return String.format("apiFramework = %s", this.f17348b);
        }
        return "JavaScriptResource = ";
    }
}
