package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14313a;

    /* renamed from: b  reason: collision with root package name */
    private final com.chartboost.sdk.Networking.b f14314b;

    /* renamed from: c  reason: collision with root package name */
    final r0 f14315c;

    /* renamed from: d  reason: collision with root package name */
    final Handler f14316d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f14317a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f14318b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.chartboost.sdk.Model.c f14319c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s0 f14320d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.chartboost.sdk.impl.v0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0189a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f14322a;

            RunnableC0189a(String str) {
                this.f14322a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a aVar = a.this;
                    v0.this.c(aVar.f14318b, aVar.f14319c, this.f14322a, aVar.f14320d);
                } catch (Exception e10) {
                    CBLogging.b("CBURLOpener", "open openOnUiThread Runnable.run: " + e10.toString());
                }
            }
        }

        a(String str, Context context, com.chartboost.sdk.Model.c cVar, s0 s0Var) {
            this.f14317a = str;
            this.f14318b = context;
            this.f14319c = cVar;
            this.f14320d = s0Var;
        }

        private void a(String str) {
            v0.this.f14316d.post(new RunnableC0189a(str));
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
            if (r3 == null) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: Exception -> 0x0058, TryCatch #2 {Exception -> 0x0058, blocks: (B:3:0x0002, B:18:0x0048, B:22:0x0050, B:23:0x0053, B:24:0x0054), top: B:31:0x0002 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = "CBURLOpener"
                java.lang.String r1 = r6.f14317a     // Catch: java.lang.Exception -> L58
                com.chartboost.sdk.impl.v0 r2 = com.chartboost.sdk.impl.v0.this     // Catch: java.lang.Exception -> L58
                com.chartboost.sdk.impl.r0 r2 = r2.f14315c     // Catch: java.lang.Exception -> L58
                boolean r2 = r2.e()     // Catch: java.lang.Exception -> L58
                if (r2 == 0) goto L54
                r2 = 0
                java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
                java.lang.String r4 = r6.f14317a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
                java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
                javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
                javax.net.ssl.SSLSocketFactory r2 = com.chartboost.sdk.impl.t0.c()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4c
                r3.setSSLSocketFactory(r2)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4c
                r2 = 0
                r3.setInstanceFollowRedirects(r2)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4c
                r2 = 10000(0x2710, float:1.4013E-41)
                r3.setConnectTimeout(r2)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4c
                r3.setReadTimeout(r2)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4c
                java.lang.String r2 = "Location"
                java.lang.String r2 = r3.getHeaderField(r2)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4c
                if (r2 == 0) goto L48
                r1 = r2
                goto L48
            L39:
                r2 = move-exception
                goto L41
            L3b:
                r1 = move-exception
                goto L4e
            L3d:
                r3 = move-exception
                r5 = r3
                r3 = r2
                r2 = r5
            L41:
                java.lang.String r4 = "Exception raised while opening a HTTPS Conection"
                com.chartboost.sdk.Libraries.CBLogging.a(r0, r4, r2)     // Catch: java.lang.Throwable -> L4c
                if (r3 == 0) goto L54
            L48:
                r3.disconnect()     // Catch: java.lang.Exception -> L58
                goto L54
            L4c:
                r1 = move-exception
                r2 = r3
            L4e:
                if (r2 == 0) goto L53
                r2.disconnect()     // Catch: java.lang.Exception -> L58
            L53:
                throw r1     // Catch: java.lang.Exception -> L58
            L54:
                r6.a(r1)     // Catch: java.lang.Exception -> L58
                goto L71
            L58:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "open followTask: "
                r2.append(r3)
                java.lang.String r1 = r1.toString()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                com.chartboost.sdk.Libraries.CBLogging.b(r0, r1)
            L71:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.v0.a.run():void");
        }
    }

    public v0(Executor executor, com.chartboost.sdk.Networking.b bVar, r0 r0Var, Handler handler) {
        this.f14313a = executor;
        this.f14314b = bVar;
        this.f14315c = r0Var;
        this.f14316d = handler;
    }

    public void a(com.chartboost.sdk.Model.c cVar, boolean z10, String str, CBError.CBClickError cBClickError, s0 s0Var) {
        s0 s0Var2;
        if (cVar != null) {
            cVar.B = false;
            if (cVar.E()) {
                cVar.f13685b = 4;
            }
        }
        if (!z10) {
            com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.f13879d;
            if (aVar != null) {
                aVar.didFailToRecordClick(str, cBClickError);
            }
        } else if (cVar != null && (s0Var2 = cVar.f13705v) != null) {
            this.f14314b.a(s0Var2);
        } else if (s0Var != null) {
            this.f14314b.a(s0Var);
        }
    }

    public void b(Context context, com.chartboost.sdk.Model.c cVar, String str, s0 s0Var) {
        try {
            String scheme = new URI(str).getScheme();
            if (scheme == null) {
                a(str, cVar);
                a(cVar, false, str, CBError.CBClickError.URI_INVALID, s0Var);
            } else if (!scheme.equals("http") && !scheme.equals("https")) {
                c(context, cVar, str, s0Var);
            } else {
                this.f14313a.execute(new a(str, context, cVar, s0Var));
            }
        } catch (URISyntaxException unused) {
            a(str, cVar);
            a(cVar, false, str, CBError.CBClickError.URI_INVALID, s0Var);
        }
    }

    void c(Context context, com.chartboost.sdk.Model.c cVar, String str, s0 s0Var) {
        if (cVar != null && cVar.E()) {
            cVar.f13685b = 5;
        }
        if (context == null) {
            a(cVar, false, str, CBError.CBClickError.NO_HOST_ACTIVITY, s0Var);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        } catch (Exception unused) {
            if (str.startsWith("market://")) {
                try {
                    str = "https://market.android.com/" + str.substring(9);
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    if (!(context instanceof Activity)) {
                        intent2.addFlags(268435456);
                    }
                    intent2.setData(Uri.parse(str));
                    context.startActivity(intent2);
                } catch (Exception e10) {
                    CBLogging.a("CBURLOpener", "Exception raised openeing an inavld playstore URL", e10);
                    a(cVar, false, str, CBError.CBClickError.URI_UNRECOGNIZED, s0Var);
                    return;
                }
            } else {
                a(cVar, false, str, CBError.CBClickError.URI_UNRECOGNIZED, s0Var);
            }
        }
        a(cVar, true, str, null, s0Var);
    }

    private void a(String str, com.chartboost.sdk.Model.c cVar) {
        String str2;
        String str3 = "";
        if (cVar != null) {
            c e10 = cVar.e();
            str2 = cVar.f13695l;
            if (e10 != null) {
                str3 = e10.f13935b;
            }
        } else {
            str2 = "";
        }
        m1.d(new com.chartboost.sdk.Tracking.a("click_invalid_url_error", str, str3, str2));
    }

    public boolean a(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(Uri.parse(str));
            return context.getPackageManager().queryIntentActivities(intent, Constants.MIN_PROGRESS_STEP).size() > 0;
        } catch (Exception e10) {
            CBLogging.a("CBURLOpener", "Cannot open URL", e10);
            return false;
        }
    }

    public void a(Context context, com.chartboost.sdk.Model.c cVar, String str, s0 s0Var) {
        b(context, cVar, str, s0Var);
    }
}
