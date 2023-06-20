package com.bytedance.sdk.openadsdk.d;

import android.content.Context;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.d.c.e;
import com.bytedance.sdk.component.d.d;
import com.bytedance.sdk.component.d.i;
import com.bytedance.sdk.component.d.m;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.utils.s;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ImageLoaderWrapper.java */
/* loaded from: classes.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ImageLoaderWrapper.java */
    /* renamed from: com.bytedance.sdk.openadsdk.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0180a {

        /* renamed from: a  reason: collision with root package name */
        private static m f13191a = a(com.bytedance.sdk.openadsdk.core.m.a());

        /* JADX INFO: Access modifiers changed from: private */
        public static i b(String str) {
            return a(f13191a.a(str));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i b(k kVar) {
            return a(f13191a.a(kVar.a()).a(kVar.b()).b(kVar.c()).a(kVar.g()));
        }

        private static m a(Context context) {
            return com.bytedance.sdk.component.d.c.b.a(context, new e.a().a(new com.bytedance.sdk.component.d.c.a.a(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040L, new File(CacheDirFactory.getImageCacheDir()))).a(com.bytedance.sdk.component.f.e.a(5)).a(new d() { // from class: com.bytedance.sdk.openadsdk.d.a.a.1
                @Override // com.bytedance.sdk.component.d.d
                /* renamed from: b */
                public com.bytedance.sdk.component.d.b.d a(com.bytedance.sdk.component.d.e eVar) {
                    com.bytedance.sdk.component.b.a.i e10 = com.bytedance.sdk.openadsdk.i.d.a().b().e();
                    com.bytedance.sdk.component.b.a.k b10 = new k.a().a(eVar.a()).a().b();
                    com.bytedance.sdk.component.b.a.m mVar = null;
                    com.bytedance.sdk.component.d.b.e eVar2 = eVar.c() ? new com.bytedance.sdk.component.d.b.e() : null;
                    if (eVar2 != null) {
                        eVar2.a(System.currentTimeMillis());
                    }
                    try {
                        mVar = e10.a(b10).a();
                        if (eVar2 != null) {
                            eVar2.b(System.currentTimeMillis());
                        }
                        Map<String, String> a10 = a(eVar, mVar);
                        byte[] d10 = mVar.f().d();
                        if (eVar2 != null) {
                            eVar2.c(System.currentTimeMillis());
                        }
                        com.bytedance.sdk.component.d.b.d dVar = new com.bytedance.sdk.component.d.b.d(mVar.c(), d10, "", a10);
                        dVar.a(eVar2);
                        return dVar;
                    } catch (Throwable th) {
                        try {
                            return a(eVar2, th);
                        } finally {
                            com.bytedance.sdk.component.d.c.c.b.a(mVar);
                        }
                    }
                }

                private Map<String, String> a(com.bytedance.sdk.component.d.e eVar, com.bytedance.sdk.component.b.a.m mVar) {
                    if (eVar.b()) {
                        com.bytedance.sdk.component.b.a.e g10 = mVar.g();
                        HashMap hashMap = new HashMap();
                        int a10 = g10.a();
                        for (int i10 = 0; i10 < a10; i10++) {
                            String a11 = g10.a(i10);
                            String b10 = g10.b(i10);
                            if (a11 != null) {
                                hashMap.put(a11, b10);
                            }
                        }
                        return hashMap;
                    }
                    return null;
                }

                private com.bytedance.sdk.component.d.b.d a(com.bytedance.sdk.component.d.b.e eVar, Throwable th) {
                    l.d("ImageLoaderWrapper", th.getMessage());
                    if (eVar != null) {
                        eVar.c(System.currentTimeMillis());
                    }
                    com.bytedance.sdk.component.d.b.d dVar = new com.bytedance.sdk.component.d.b.d(0, th, "net failed");
                    dVar.a(eVar);
                    return dVar;
                }
            }).a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream b(String str, String str2) {
            return f13191a.a(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(String str, String str2, String str3) {
            return f13191a.a(str, str2, str3);
        }

        private static i a(i iVar) {
            return s.a() ? iVar.a(new b()) : iVar;
        }
    }

    public static i a(String str) {
        return C0180a.b(str);
    }

    public static i a(com.bytedance.sdk.openadsdk.core.e.k kVar) {
        return C0180a.b(kVar);
    }

    public static InputStream a(String str, String str2) {
        return C0180a.b(str, str2);
    }

    public static boolean a(String str, String str2, String str3) {
        return C0180a.b(str, str2, str3);
    }

    public static m a() {
        return C0180a.f13191a;
    }
}
