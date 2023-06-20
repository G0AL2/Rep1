package com.chartboost.sdk.impl;

import android.content.ActivityNotFoundException;
import android.util.Log;
import com.chartboost.sdk.Libraries.CBLogging;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v1 {

    /* renamed from: a  reason: collision with root package name */
    protected final w0 f14324a;

    /* renamed from: b  reason: collision with root package name */
    protected final com.chartboost.sdk.d f14325b;

    /* renamed from: c  reason: collision with root package name */
    protected JSONObject f14326c;

    /* renamed from: d  reason: collision with root package name */
    Runnable f14327d = new k();

    /* renamed from: e  reason: collision with root package name */
    Runnable f14328e = new o();

    /* renamed from: f  reason: collision with root package name */
    Runnable f14329f = new p();

    /* renamed from: g  reason: collision with root package name */
    Runnable f14330g = new q();

    /* renamed from: h  reason: collision with root package name */
    Runnable f14331h = new r();

    /* renamed from: i  reason: collision with root package name */
    Runnable f14332i = new s();

    /* renamed from: j  reason: collision with root package name */
    Runnable f14333j = new t();

    /* renamed from: k  reason: collision with root package name */
    Runnable f14334k = new u();

    /* renamed from: l  reason: collision with root package name */
    Runnable f14335l = new v();

    /* renamed from: m  reason: collision with root package name */
    Runnable f14336m = new a();

    /* renamed from: n  reason: collision with root package name */
    Runnable f14337n = new b();

    /* renamed from: o  reason: collision with root package name */
    Runnable f14338o = new c();

    /* renamed from: p  reason: collision with root package name */
    Runnable f14339p = new d();

    /* renamed from: q  reason: collision with root package name */
    Runnable f14340q = new e();

    /* renamed from: r  reason: collision with root package name */
    Runnable f14341r = new f();

    /* renamed from: s  reason: collision with root package name */
    Runnable f14342s = new g();

    /* renamed from: t  reason: collision with root package name */
    Runnable f14343t = new h();

    /* renamed from: u  reason: collision with root package name */
    Runnable f14344u = new i();

    /* renamed from: v  reason: collision with root package name */
    Runnable f14345v = new j();

    /* renamed from: w  reason: collision with root package name */
    Runnable f14346w = new l();

    /* renamed from: x  reason: collision with root package name */
    Runnable f14347x = new m();

    /* renamed from: y  reason: collision with root package name */
    Runnable f14348y = new n();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w0 w0Var = v1.this.f14324a;
            if (w0Var != null) {
                w0Var.onHideCustomView();
            } else {
                CBLogging.b("NativeBridgeCommand", "Video completed command error - client");
            }
            com.chartboost.sdk.d dVar = v1.this.f14325b;
            if (dVar != null) {
                dVar.d(1);
                v1.this.f14325b.F();
                return;
            }
            CBLogging.b("NativeBridgeCommand", "Video completed command error - protocol");
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v1 v1Var = v1.this;
            if (v1Var.f14325b != null) {
                try {
                    String string = v1Var.f14326c.getString("name");
                    if (!com.chartboost.sdk.impl.l.b().a(string)) {
                        v1.this.f14325b.f13805e = string;
                    }
                } catch (Exception unused) {
                    CBLogging.b("NativeBridgeCommand", "Cannot find video file name");
                    com.chartboost.sdk.d dVar = v1.this.f14325b;
                    if (dVar != null) {
                        dVar.h("Parsing exception unknown field for video pause");
                    }
                }
                v1.this.f14325b.d(3);
                return;
            }
            CBLogging.b("NativeBridgeCommand", "Video paused command error");
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v1 v1Var = v1.this;
            if (v1Var.f14325b != null) {
                try {
                    String string = v1Var.f14326c.getString("name");
                    if (!com.chartboost.sdk.impl.l.b().a(string)) {
                        v1.this.f14325b.f13805e = string;
                    }
                } catch (Exception unused) {
                    CBLogging.b("NativeBridgeCommand", "Cannot find video file name");
                    v1.this.f14325b.h("Parsing exception unknown field for video play");
                }
                v1.this.f14325b.d(2);
                return;
            }
            CBLogging.b("NativeBridgeCommand", "Video playing command error");
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v1 v1Var = v1.this;
            if (v1Var.f14325b != null) {
                try {
                    String string = v1Var.f14326c.getString("name");
                    if (com.chartboost.sdk.impl.l.b().a(string)) {
                        return;
                    }
                    v1.this.f14325b.f13805e = string;
                    return;
                } catch (Exception unused) {
                    CBLogging.b("NativeBridgeCommand", "Cannot find video file name");
                    v1.this.f14325b.h("Parsing exception unknown field for video replay");
                    return;
                }
            }
            CBLogging.b("NativeBridgeCommand", "Video replay command error");
        }
    }

    /* loaded from: classes.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = v1.this.f14326c.getString("message");
                String name = y0.class.getName();
                Log.d(name, "JS->Native Warning message: " + string);
                v1.this.f14325b.h(string);
            } catch (Exception unused) {
                CBLogging.b("NativeBridgeCommand", "Warning message is empty");
                com.chartboost.sdk.d dVar = v1.this.f14325b;
                if (dVar != null) {
                    dVar.h("");
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                v1 v1Var = v1.this;
                v1Var.f14325b.a(v1Var.f14326c);
            } catch (Exception unused) {
                CBLogging.b("NativeBridgeCommand", "Invalid set orientation command");
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                v1.this.f14325b.D();
            } catch (Exception unused) {
                CBLogging.b("NativeBridgeCommand", "Invalid rewarded video completed command");
            }
        }
    }

    /* loaded from: classes.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                v1.this.f14325b.u();
            } catch (Exception unused) {
                CBLogging.b("NativeBridgeCommand", "Invalid rewarded command");
            }
        }
    }

    /* loaded from: classes.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((g3) v1.this.f14325b).T();
            } catch (Exception unused) {
                CBLogging.b("NativeBridgeCommand", "Invalid play video completed command");
            }
        }
    }

    /* loaded from: classes.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((g3) v1.this.f14325b).S();
            } catch (Exception unused) {
                CBLogging.b("NativeBridgeCommand", "Invalid pause video completed command");
            }
        }
    }

    /* loaded from: classes.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v1 v1Var = v1.this;
            com.chartboost.sdk.d dVar = v1Var.f14325b;
            if (dVar != null) {
                dVar.a((JSONObject) null, v1Var.a());
            } else {
                CBLogging.b("NativeBridgeCommand", "Click command error");
            }
        }
    }

    /* loaded from: classes.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((g3) v1.this.f14325b).L();
            } catch (Exception unused) {
                CBLogging.b("NativeBridgeCommand", "Invalid close video completed command");
            }
        }
    }

    /* loaded from: classes.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((g3) v1.this.f14325b).P();
            } catch (Exception unused) {
                CBLogging.b("NativeBridgeCommand", "Invalid mute video completed command");
            }
        }
    }

    /* loaded from: classes.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((g3) v1.this.f14325b).U();
            } catch (Exception unused) {
                CBLogging.b("NativeBridgeCommand", "Invalid unmute video completed command");
            }
        }
    }

    /* loaded from: classes.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.chartboost.sdk.d dVar = v1.this.f14325b;
            if (dVar != null) {
                dVar.e();
            } else {
                CBLogging.b("NativeBridgeCommand", "Close command error");
            }
        }
    }

    /* loaded from: classes.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("######### JS->Native Video current player duration");
                float f10 = ((float) v1.this.f14326c.getDouble("duration")) * 1000.0f;
                sb2.append(f10);
                CBLogging.a("NativeBridgeCommand", sb2.toString());
                v1.this.f14325b.a(f10);
            } catch (Exception unused) {
                com.chartboost.sdk.d dVar = v1.this.f14325b;
                if (dVar != null) {
                    dVar.h("Parsing exception unknown field for current player duration");
                }
                CBLogging.b("NativeBridgeCommand", "Cannot find duration parameter for the video");
            }
        }
    }

    /* loaded from: classes.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                v1 v1Var = v1.this;
                v1Var.f14325b.f(v1Var.a(v1Var.f14326c, "JS->Native Debug message: "));
            } catch (Exception unused) {
                CBLogging.b("NativeBridgeCommand", "Exception occurred while parsing the message for webview debug track event");
                com.chartboost.sdk.d dVar = v1.this.f14325b;
                if (dVar != null) {
                    dVar.f("Exception occurred while parsing the message for webview debug track event");
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                v1.this.f14325b.v();
                v1 v1Var = v1.this;
                v1Var.f14325b.c(v1Var.a(v1Var.f14326c, "JS->Native Error message: "));
            } catch (Exception unused) {
                CBLogging.b("NativeBridgeCommand", "Error message is empty");
                com.chartboost.sdk.d dVar = v1.this.f14325b;
                if (dVar != null) {
                    dVar.c("");
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = v1.this.f14326c.getString(ImagesContract.URL);
                if (!string.startsWith("http://") && !string.startsWith("https://")) {
                    string = "https://" + string;
                }
                v1 v1Var = v1.this;
                v1Var.f14325b.a(string, null, v1Var.a());
            } catch (ActivityNotFoundException e10) {
                CBLogging.b("NativeBridgeCommand", "ActivityNotFoundException occured when opening a url in a browser: " + e10.toString());
            } catch (Exception e11) {
                CBLogging.b("NativeBridgeCommand", "Exception while opening a browser view with MRAID url: " + e11.toString());
            }
        }
    }

    /* loaded from: classes.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.chartboost.sdk.d dVar = v1.this.f14325b;
            if (dVar != null) {
                dVar.E();
            } else {
                CBLogging.b("NativeBridgeCommand", "Show command error");
            }
        }
    }

    /* loaded from: classes.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("######### JS->Native Video total player duration");
                float f10 = ((float) v1.this.f14326c.getDouble("duration")) * 1000.0f;
                sb2.append(f10);
                CBLogging.a("NativeBridgeCommand", sb2.toString());
                v1.this.f14325b.b(f10);
            } catch (Exception unused) {
                com.chartboost.sdk.d dVar = v1.this.f14325b;
                if (dVar != null) {
                    dVar.h("Parsing exception unknown field for total player duration");
                }
                CBLogging.b("NativeBridgeCommand", "Cannot find duration parameter for the video");
            }
        }
    }

    /* loaded from: classes.dex */
    class v implements Runnable {
        v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = v1.this.f14326c.getString("event");
                v1.this.f14325b.g(string);
                String name = y0.class.getName();
                Log.d(name, "JS->Native Track VAST event message: " + string);
            } catch (Exception unused) {
                CBLogging.b("NativeBridgeCommand", "Exception occured while parsing the message for webview tracking VAST events");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v1(w0 w0Var, com.chartboost.sdk.d dVar) {
        this.f14324a = w0Var;
        this.f14325b = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        this.f14326c = jSONObject;
    }

    protected String a(JSONObject jSONObject, String str) throws JSONException {
        String string = jSONObject.getString("message");
        String name = y0.class.getName();
        Log.d(name, str + string);
        return string;
    }

    protected Boolean a() {
        JSONObject jSONObject = this.f14326c;
        if (jSONObject != null) {
            try {
                return Boolean.valueOf(jSONObject.getBoolean("shouldDismiss"));
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
