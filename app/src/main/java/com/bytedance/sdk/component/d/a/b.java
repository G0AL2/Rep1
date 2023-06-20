package com.bytedance.sdk.component.d.a;

import com.bytedance.sdk.component.d.h;
import com.bytedance.sdk.component.d.k;
import java.util.WeakHashMap;

/* compiled from: KeyGeneratorFactory.java */
/* loaded from: classes.dex */
public class b {
    public static k a() {
        return new k() { // from class: com.bytedance.sdk.component.d.a.b.1

            /* renamed from: a  reason: collision with root package name */
            private WeakHashMap<String, String> f10085a = new WeakHashMap<>();

            @Override // com.bytedance.sdk.component.d.k
            public String a(h hVar) {
                return a(hVar.a() + "#width=" + hVar.b() + "#height=" + hVar.c() + "#scaletype=" + hVar.d());
            }

            @Override // com.bytedance.sdk.component.d.k
            public String b(h hVar) {
                return a(hVar.a());
            }

            private String a(String str) {
                String str2 = this.f10085a.get(str);
                if (str2 == null) {
                    String a10 = com.bytedance.sdk.component.d.c.c.c.a(str);
                    this.f10085a.put(str, a10);
                    return a10;
                }
                return str2;
            }
        };
    }
}
