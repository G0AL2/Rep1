package com.bytedance.sdk.component.adexpress.a.b;

import android.text.TextUtils;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: TmplDiffManager.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f9343a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f9344b = new AtomicBoolean(false);

    private d() {
    }

    private JSONObject c(String str) {
        if (com.bytedance.sdk.component.adexpress.a.a.a.a().c() == null) {
            return null;
        }
        com.bytedance.sdk.component.e.b.b g10 = com.bytedance.sdk.component.adexpress.a.a.a.a().c().g();
        g10.a(str);
        com.bytedance.sdk.component.e.b a10 = g10.a();
        if (a10 != null) {
            try {
                if (a10.f() && a10.d() != null) {
                    return new JSONObject(a10.d());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public Set<String> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return c.a().b(str);
    }

    public static d a() {
        if (f9343a == null) {
            synchronized (d.class) {
                if (f9343a == null) {
                    f9343a = new d();
                }
            }
        }
        return f9343a;
    }

    private void b() {
        if (com.bytedance.sdk.component.adexpress.a.a.a.a().c() == null) {
            return;
        }
        int a10 = com.bytedance.sdk.component.adexpress.a.a.a.a().c().a();
        if (a10 <= 0) {
            a10 = 100;
        }
        List<com.bytedance.sdk.component.adexpress.a.c.b> b10 = c.a().b();
        if (!b10.isEmpty() && a10 < b10.size()) {
            TreeMap treeMap = new TreeMap();
            for (com.bytedance.sdk.component.adexpress.a.c.b bVar : b10) {
                treeMap.put(bVar.g(), bVar);
            }
            HashSet hashSet = new HashSet();
            int size = (int) (b10.size() - (a10 * 0.75f));
            int i10 = 0;
            for (Map.Entry entry : treeMap.entrySet()) {
                if (entry != null && i10 < size) {
                    i10++;
                    ((Long) entry.getKey()).longValue();
                    com.bytedance.sdk.component.adexpress.a.c.b bVar2 = (com.bytedance.sdk.component.adexpress.a.c.b) entry.getValue();
                    if (bVar2 != null) {
                        hashSet.add(bVar2.b());
                    }
                }
            }
            a(hashSet);
            this.f9344b.set(false);
            return;
        }
        l.b("TmplDiffManager", "end doCheckAndDeleteTask maxTplCnt,local size" + a10 + ", 目前存储的模版的个数 " + b10.size());
    }

    public com.bytedance.sdk.component.adexpress.a.c.b a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return c.a().a(str);
    }

    public void a(com.bytedance.sdk.component.adexpress.a.c.c cVar, String str) {
        if (cVar == null) {
            l.e("TmplDiffManager", "saveTemplate error: tplInfo == null");
            return;
        }
        final String str2 = cVar.f9368a;
        final String str3 = cVar.f9370c;
        final String str4 = cVar.f9369b;
        final String str5 = cVar.f9371d;
        final String str6 = cVar.f9372e;
        final String h10 = TextUtils.isEmpty(str) ? com.bytedance.sdk.component.adexpress.a.a.a.a().c() != null ? com.bytedance.sdk.component.adexpress.a.a.a.a().c().h() : "" : str;
        if (TextUtils.isEmpty(str2)) {
            l.e("TmplDiffManager", "saveTemplate error:tmpId is empty");
        } else {
            com.bytedance.sdk.component.f.e.a(new g("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.a.b.d.1
                @Override // java.lang.Runnable
                public void run() {
                    d.this.a(str2, str3, str4, str5, str6, h10);
                }
            }, 10);
        }
    }

    private void b(String str, String str2, String str3, String str4, String str5, String str6) {
        c.a().a(new com.bytedance.sdk.component.adexpress.a.c.b().a(str).b(str2).c(str3).d(str4).e(str5).f(str6).a(Long.valueOf(System.currentTimeMillis())));
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, String str2, String str3, String str4, String str5, String str6) {
        if (a(str) != null) {
            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                b(str6, str, str3, str2, str4, str5);
            }
            return;
        } else if (TextUtils.isEmpty(str4)) {
            a(str2, str6, str);
        } else if (TextUtils.isEmpty(str3)) {
            a(str2, str6, str);
        } else {
            b(str6, str, str3, str2, str4, str5);
        }
        boolean b10 = e.b(str5);
        if (!a.f() || b10) {
            b.a().a(true);
        }
    }

    private void a(String str, String str2, String str3) {
        JSONObject c10;
        if (TextUtils.isEmpty(str) || (c10 = c(str)) == null) {
            return;
        }
        String optString = c10.optString("md5");
        String optString2 = c10.optString(MediationMetaData.KEY_VERSION);
        String optString3 = c10.optString("data");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.a.c.b a10 = new com.bytedance.sdk.component.adexpress.a.c.b().a(str2).b(str3).c(optString).d(str).e(optString3).f(optString2).a(Long.valueOf(System.currentTimeMillis()));
        c.a().a(a10);
        b();
        if (e.b(optString2)) {
            a10.f(optString2);
            b.a().a(true);
        }
    }

    public void a(Set<String> set) {
        try {
            c.a().a(set);
        } catch (Throwable th) {
            l.b("TmplDiffManager", th.getMessage());
        }
    }
}
