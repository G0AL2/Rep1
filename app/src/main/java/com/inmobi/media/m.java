package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.common.internal.ImagesContract;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLEncoder;

/* compiled from: LandingPageHandler.java */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: c  reason: collision with root package name */
    private static final String f25882c = "m";

    /* renamed from: a  reason: collision with root package name */
    public hm f25883a;

    /* renamed from: b  reason: collision with root package name */
    public Context f25884b;

    /* renamed from: d  reason: collision with root package name */
    private final String f25885d = "inmobinativebrowser";

    /* renamed from: e  reason: collision with root package name */
    private final String f25886e = "inmobideeplink";

    /* renamed from: f  reason: collision with root package name */
    private final String f25887f = ImagesContract.URL;

    /* renamed from: g  reason: collision with root package name */
    private final String f25888g = "primaryUrl";

    /* renamed from: h  reason: collision with root package name */
    private final String f25889h = "fallbackUrl";

    /* renamed from: i  reason: collision with root package name */
    private final String f25890i = "primaryTrackingUrl";

    /* renamed from: j  reason: collision with root package name */
    private final String f25891j = "fallbackTrackingUrl";

    /* renamed from: k  reason: collision with root package name */
    private String f25892k = "CustomExpand handling failed";

    /* renamed from: l  reason: collision with root package name */
    private hn f25893l;

    /* renamed from: m  reason: collision with root package name */
    private f f25894m;

    public m(Context context, hn hnVar, f fVar, hm hmVar) {
        this.f25884b = context;
        this.f25893l = hnVar;
        this.f25894m = fVar;
        this.f25883a = hmVar;
    }

    private boolean f(String str, String str2, String str3) {
        try {
            return d(str, str2, str3);
        } catch (Exception unused) {
            this.f25883a.a(str2, "Unexpected error", "open");
            hu.a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r0.equals("EX_NATIVE") != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 == 0) goto Lb
            r6.a(r7, r8)
            return r1
        Lb:
            android.net.Uri r0 = android.net.Uri.parse(r9)
            java.lang.String r2 = r0.getScheme()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L1d
            r6.a(r7, r8)
            return r1
        L1d:
            java.lang.String r2 = r0.getScheme()
            java.lang.String r3 = "inmobinativebrowser"
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L2e
            r6.b(r7, r8, r9)
            return r3
        L2e:
            java.lang.String r2 = r0.getScheme()
            java.lang.String r4 = "inmobideeplink"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L3e
            r6.c(r7, r8, r9)
            return r3
        L3e:
            com.inmobi.media.hk.a()
            android.content.Context r2 = r6.f25884b
            boolean r2 = com.inmobi.media.hk.a(r2, r9)
            if (r2 == 0) goto L4d
            r6.e(r7, r8, r9)
            return r3
        L4d:
            boolean r0 = com.inmobi.media.hs.a(r0)
            if (r0 == 0) goto Laf
            com.inmobi.media.hn r0 = r6.f25893l
            boolean r2 = r0.f25677a
            if (r2 == 0) goto L5a
            return r1
        L5a:
            java.lang.String r0 = r0.f25678b
            r2 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case -2032180703: goto L82;
                case -702637789: goto L79;
                case 112775115: goto L6f;
                case 409244785: goto L65;
                default: goto L64;
            }
        L64:
            goto L8c
        L65:
            java.lang.String r1 = "IN_NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8c
            r1 = 2
            goto L8d
        L6f:
            java.lang.String r1 = "IN_CUSTOM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8c
            r1 = 1
            goto L8d
        L79:
            java.lang.String r4 = "EX_NATIVE"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L8c
            goto L8d
        L82:
            java.lang.String r1 = "DEFAULT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8c
            r1 = 3
            goto L8d
        L8c:
            r1 = -1
        L8d:
            if (r1 == 0) goto L9b
            if (r1 == r3) goto L96
            boolean r7 = r6.f(r7, r8, r9)
            return r7
        L96:
            boolean r7 = r6.a(r9)
            return r7
        L9b:
            com.inmobi.media.hl.a()
            android.content.Context r0 = r6.f25884b
            boolean r0 = com.inmobi.media.hl.a(r0, r9)
            if (r0 != 0) goto Lab
            boolean r7 = r6.d(r7, r8, r9)
            return r7
        Lab:
            r6.e(r7, r8, r9)
            return r3
        Laf:
            com.inmobi.media.hl.a()
            android.content.Context r0 = r6.f25884b
            boolean r0 = com.inmobi.media.hl.a(r0, r9)
            if (r0 == 0) goto Lbe
            r6.e(r7, r8, r9)
            return r3
        Lbe:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            boolean r9 = com.inmobi.media.hs.a(r9)
            if (r9 != 0) goto Lcf
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r4)     // Catch: java.lang.InterruptedException -> Lce
            goto Lcf
        Lce:
        Lcf:
            r6.a(r7, r8)
            com.inmobi.media.hn r7 = r6.f25893l
            boolean r7 = r7.f25677a
            if (r7 != 0) goto Ld9
            return r3
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.m.a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public final void b(String str, String str2, String str3) {
        String queryParameter = Uri.parse(str3).getQueryParameter(ImagesContract.URL);
        if (TextUtils.isEmpty(queryParameter)) {
            this.f25883a.a(str2, "Invalid URL", str);
            return;
        }
        hl.a();
        if (hl.a(this.f25884b, queryParameter)) {
            e(str, str2, str3);
        } else {
            this.f25883a.a(str2, "Invalid URL", str);
        }
    }

    public final boolean c(String str, String str2, String str3) {
        Uri parse = Uri.parse(str3);
        if (b(parse.getQueryParameter("primaryUrl"), parse.getQueryParameter("primaryTrackingUrl"))) {
            e(str, str2, str3);
            return true;
        } else if (b(parse.getQueryParameter("fallbackUrl"), parse.getQueryParameter("fallbackTrackingUrl"))) {
            e(str, str2, str3);
            return true;
        } else {
            this.f25883a.a(str2, "Invalid URL", str);
            return false;
        }
    }

    public final boolean d(String str, String str2, String str3) {
        if (str3 != null && (!str3.startsWith("http") || URLUtil.isValidUrl(str3))) {
            String a10 = h.a(this.f25884b);
            try {
                try {
                    boolean z10 = this.f25893l.f25679c;
                    if (a10 != null && z10) {
                        new co(str3, this.f25884b, this.f25894m).b();
                        return true;
                    }
                    return a(str3);
                } catch (Exception unused) {
                    hs.b(this.f25884b, str3);
                    this.f25883a.b(str, str2, str3);
                    this.f25883a.a();
                    return false;
                }
            } catch (URISyntaxException unused2) {
                return false;
            }
        }
        this.f25883a.a(str2, "Invalid URL", str);
        return false;
    }

    public final void e(String str, String str2, String str3) {
        this.f25883a.a();
        this.f25883a.b(str, str2, str3);
    }

    private boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        hl.a();
        if (hl.a(this.f25884b, str)) {
            b(str2);
            return true;
        }
        return false;
    }

    private static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        bk.a().a(str, true);
    }

    private static String c(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public final boolean a(String str) {
        if (str.isEmpty()) {
            return false;
        }
        hk.a();
        if (!hk.a(this.f25884b, str) && hs.a(Uri.parse(str))) {
            Intent intent = new Intent(this.f25884b, InMobiAdActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", str);
            this.f25883a.a(intent);
            this.f25883a.b(null, null, str);
            return true;
        }
        return false;
    }

    public final void a(String str, String str2, String str3, String str4) {
        while (true) {
            try {
                hs.b(this.f25884b, str3);
                e(str, str2, str3);
                return;
            } catch (ActivityNotFoundException unused) {
                this.f25883a.a(str2, "Cannot resolve URI (" + c(str3) + ")", str);
                if (str4 == null) {
                    return;
                }
            } catch (URISyntaxException unused2) {
                this.f25883a.a(str2, "Cannot resolve URI (" + c(str3) + ")", str);
                if (str4 == null) {
                    return;
                }
            } catch (Exception unused3) {
                this.f25883a.a(str2, "Unexpected error", str);
                hu.a((byte) 1, f25882c, "Could not open URL; SDK encountered an unexpected error");
                return;
            }
            str3 = str4;
            str4 = null;
        }
    }

    public final void a(String str, String str2) {
        this.f25883a.a(str2, "Invalid URL", str);
    }
}
