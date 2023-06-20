package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;

/* compiled from: CustomTabHelper.java */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25519d = "g";

    /* renamed from: a  reason: collision with root package name */
    public androidx.browser.customtabs.c f25520a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.browser.customtabs.e f25521b;

    /* renamed from: c  reason: collision with root package name */
    public a f25522c;

    /* compiled from: CustomTabHelper.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void a(int i10);
    }

    public static void a(Context context, androidx.browser.customtabs.d dVar, Uri uri, f fVar) {
        String a10 = h.a(context);
        try {
            try {
                if (a10 == null) {
                    fVar.a(uri.toString());
                    return;
                }
                dVar.f1796a.setFlags(268435456);
                dVar.f1796a.setPackage(a10);
                dVar.a(context, uri);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            hs.b(context, uri.toString());
        }
    }

    public final void a(Context context) {
        String a10;
        if (this.f25520a != null || context == null || (a10 = h.a(context)) == null) {
            return;
        }
        androidx.browser.customtabs.e eVar = new androidx.browser.customtabs.e() { // from class: com.inmobi.media.g.2
            @Override // android.content.ServiceConnection
            public final void onBindingDied(ComponentName componentName) {
                g.this.f25520a = null;
                if (g.this.f25522c != null) {
                    a unused = g.this.f25522c;
                }
            }

            @Override // androidx.browser.customtabs.e
            public final void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.c cVar) {
                g.this.f25520a = cVar;
                if (g.this.f25522c != null) {
                    g.this.f25522c.a();
                }
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                g.this.f25520a = null;
                if (g.this.f25522c != null) {
                    a unused = g.this.f25522c;
                }
            }
        };
        this.f25521b = eVar;
        androidx.browser.customtabs.c.a(context, a10, eVar);
    }
}
