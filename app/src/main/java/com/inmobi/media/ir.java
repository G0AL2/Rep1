package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: UidMap.java */
/* loaded from: classes3.dex */
public class ir {

    /* renamed from: a  reason: collision with root package name */
    private gb f25787a;

    public ir(gb gbVar) {
        this.f25787a = gbVar;
    }

    private String b() {
        return new JSONObject(c()).toString();
    }

    private Map<String, String> c() {
        ip e10;
        HashMap hashMap = new HashMap();
        String str = null;
        try {
            if (this.f25787a.GPID && (e10 = iq.a().e()) != null && (str = e10.b()) != null) {
                hashMap.put("GPID", str);
            }
            a(hashMap, str);
        } catch (Exception unused) {
            a(hashMap, str);
        }
        return hashMap;
    }

    public final HashMap<String, String> a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("u-id-map", b());
        return hashMap;
    }

    private void a(Map<String, String> map, String str) {
        try {
            if (this.f25787a.UM5 && str == null) {
                iq.a();
                iq.a();
                map.put("UM5", iq.a(iq.d(), "MD5"));
            }
            if (this.f25787a.O1 && str == null) {
                iq.a();
                iq.a();
                map.put("O1", iq.a(iq.d(), "SHA-1"));
            }
        } catch (Exception unused) {
        }
    }
}
