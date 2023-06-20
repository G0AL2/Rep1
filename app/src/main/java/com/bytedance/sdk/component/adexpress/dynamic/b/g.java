package com.bytedance.sdk.component.adexpress.dynamic.b;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.c.l;
import com.inmobi.media.au;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;

/* compiled from: DynamicLayoutNativeValue.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public int f9607a;

    /* renamed from: b  reason: collision with root package name */
    public String f9608b;

    /* renamed from: c  reason: collision with root package name */
    private f f9609c;

    /* renamed from: d  reason: collision with root package name */
    private e f9610d;

    /* renamed from: e  reason: collision with root package name */
    private String f9611e;

    public g(e eVar) {
        this.f9610d = eVar;
        this.f9607a = eVar.a();
        this.f9608b = eVar.c();
        this.f9611e = eVar.d();
        if (com.bytedance.sdk.component.adexpress.c.c() == 1) {
            this.f9609c = eVar.f();
        } else {
            this.f9609c = eVar.e();
        }
        if (com.bytedance.sdk.component.adexpress.c.b()) {
            this.f9609c = eVar.e();
        }
    }

    private boolean L() {
        return "logo-union".equals(this.f9610d.b()) || "logounion".equals(this.f9610d.b()) || "logoad".equals(this.f9610d.b());
    }

    private boolean M() {
        if (com.bytedance.sdk.component.adexpress.c.b()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.f9608b) && this.f9608b.contains("adx:")) || l.b();
    }

    public boolean A() {
        return this.f9609c.R();
    }

    public int B() {
        return this.f9609c.T();
    }

    public int C() {
        return this.f9609c.S();
    }

    public String D() {
        return this.f9609c.t();
    }

    public int E() {
        return this.f9609c.ae();
    }

    public int F() {
        return this.f9609c.aj();
    }

    public int G() {
        return this.f9609c.ab();
    }

    public int H() {
        return this.f9609c.aa();
    }

    public String I() {
        return this.f9609c.s();
    }

    public boolean J() {
        return this.f9609c.e();
    }

    public String K() {
        return this.f9610d.b() + ":" + this.f9609c.ad();
    }

    public int a() {
        return (int) this.f9609c.f();
    }

    public int b() {
        return (int) this.f9609c.i();
    }

    public int c() {
        return (int) this.f9609c.g();
    }

    public int d() {
        return (int) this.f9609c.h();
    }

    public float e() {
        return this.f9609c.j();
    }

    public String f() {
        return this.f9607a == 0 ? this.f9608b : "";
    }

    public int g() {
        return a(this.f9609c.n());
    }

    public int h() {
        String m10 = this.f9609c.m();
        if ("left".equals(m10)) {
            return 2;
        }
        if ("center".equals(m10)) {
            return 4;
        }
        return "right".equals(m10) ? 3 : 2;
    }

    public int i() {
        int h10 = h();
        if (h10 == 4) {
            return 17;
        }
        return h10 == 3 ? 5 : 3;
    }

    public String j() {
        int i10 = this.f9607a;
        return (i10 == 2 || i10 == 13) ? this.f9608b : "";
    }

    public String k() {
        return this.f9607a == 1 ? this.f9608b : "";
    }

    public String l() {
        return this.f9611e;
    }

    public double m() {
        if (this.f9607a == 11) {
            try {
                double parseDouble = Double.parseDouble(this.f9608b);
                return !com.bytedance.sdk.component.adexpress.c.b() ? (int) parseDouble : parseDouble;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public double n() {
        return this.f9609c.k();
    }

    public float o() {
        return this.f9609c.c();
    }

    public int p() {
        return a(this.f9609c.p());
    }

    public float q() {
        return this.f9609c.d();
    }

    public int r() {
        return this.f9609c.af();
    }

    public boolean s() {
        return this.f9609c.ag();
    }

    public boolean t() {
        return this.f9609c.y();
    }

    public int u() {
        return this.f9609c.z();
    }

    public int v() {
        String u10 = this.f9609c.u();
        if ("skip-with-time-skip-btn".equals(this.f9610d.b()) || "skip".equals(this.f9610d.b()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.f9610d.b())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.f9610d.b()) && !"skip-with-time".equals(this.f9610d.b())) {
            if (this.f9607a == 10 && TextUtils.equals(this.f9609c.v(), au.CLICK_BEACON)) {
                return 5;
            }
            if (L() && M()) {
                return 0;
            }
            if (L()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.f9610d.b())) {
                return 3;
            }
            if (!TextUtils.isEmpty(u10) && !u10.equals("none")) {
                if (u10.equals(DownloadResource.TYPE_VIDEO) || (this.f9610d.a() == 7 && TextUtils.equals(u10, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.c.b() && this.f9610d.e() != null && this.f9610d.e().ai()) ? 11 : 4;
                } else if (u10.equals("normal")) {
                    return 1;
                } else {
                    return (u10.equals("creative") || "slide".equals(this.f9609c.v())) ? 2 : 0;
                }
            }
        }
        return 0;
    }

    public int w() {
        return a(this.f9609c.o());
    }

    public int x() {
        return this.f9609c.a();
    }

    public String y() {
        return this.f9609c.b();
    }

    public String z() {
        return this.f9609c.v();
    }

    public static float[] b(String str) {
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (split == null || split.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3])};
    }

    public void a(float f10) {
        this.f9609c.a(f10);
    }

    public static int a(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null && split.length == 4) {
            return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2])) | 0;
        }
        return -16777216;
    }

    public boolean a(int i10) {
        e eVar = this.f9610d;
        if (eVar == null) {
            return false;
        }
        if (i10 == 1) {
            this.f9609c = eVar.f();
        } else {
            this.f9609c = eVar.e();
        }
        return this.f9609c != null;
    }
}
