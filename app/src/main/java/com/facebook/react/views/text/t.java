package com.facebook.react.views.text;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.t;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TextAttributeProps.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: x  reason: collision with root package name */
    private static final int f16242x;

    /* renamed from: y  reason: collision with root package name */
    private static final int f16243y;

    /* renamed from: z  reason: collision with root package name */
    private static final int f16244z;

    /* renamed from: d  reason: collision with root package name */
    protected int f16248d;

    /* renamed from: f  reason: collision with root package name */
    protected int f16250f;

    /* renamed from: a  reason: collision with root package name */
    protected float f16245a = Float.NaN;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f16246b = false;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f16247c = true;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f16249e = false;

    /* renamed from: g  reason: collision with root package name */
    protected int f16251g = -1;

    /* renamed from: h  reason: collision with root package name */
    protected float f16252h = -1.0f;

    /* renamed from: i  reason: collision with root package name */
    protected float f16253i = -1.0f;

    /* renamed from: j  reason: collision with root package name */
    protected float f16254j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    protected z f16255k = z.NONE;

    /* renamed from: l  reason: collision with root package name */
    protected float f16256l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    protected float f16257m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    protected float f16258n = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    protected int f16259o = 1426063360;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f16260p = false;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f16261q = false;

    /* renamed from: r  reason: collision with root package name */
    protected t.d f16262r = null;

    /* renamed from: s  reason: collision with root package name */
    protected int f16263s = -1;

    /* renamed from: t  reason: collision with root package name */
    protected int f16264t = -1;

    /* renamed from: u  reason: collision with root package name */
    protected String f16265u = null;

    /* renamed from: v  reason: collision with root package name */
    protected String f16266v = null;

    /* renamed from: w  reason: collision with root package name */
    protected float f16267w = Float.NaN;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f16242x = 0;
        f16243y = i10 < 23 ? 0 : 1;
        f16244z = 0;
    }

    private t() {
    }

    private void A(float f10) {
        this.f16254j = f10;
    }

    private void B(float f10) {
        float c10;
        this.f16253i = f10;
        if (f10 == -1.0f) {
            this.f16245a = Float.NaN;
            return;
        }
        if (this.f16247c) {
            c10 = com.facebook.react.uimanager.r.e(f10);
        } else {
            c10 = com.facebook.react.uimanager.r.c(f10);
        }
        this.f16245a = c10;
    }

    private void C(int i10) {
    }

    private void D(String str) {
        String[] split;
        this.f16260p = false;
        this.f16261q = false;
        if (str != null) {
            for (String str2 : str.split(Constants.FILENAME_SEQUENCE_SEPARATOR)) {
                if ("underline".equals(str2)) {
                    this.f16260p = true;
                } else if ("strikethrough".equals(str2)) {
                    this.f16261q = true;
                }
            }
        }
    }

    private void E(int i10) {
        if (i10 != this.f16259o) {
            this.f16259o = i10;
        }
    }

    private void F(ReadableMap readableMap) {
        this.f16256l = 0.0f;
        this.f16257m = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.f16256l = com.facebook.react.uimanager.r.b(readableMap.getDouble("width"));
            }
            if (!readableMap.hasKey("height") || readableMap.isNull("height")) {
                return;
            }
            this.f16257m = com.facebook.react.uimanager.r.b(readableMap.getDouble("height"));
        }
    }

    private void G(float f10) {
        if (f10 != this.f16258n) {
            this.f16258n = f10;
        }
    }

    private void H(String str) {
        if (str != null && !"none".equals(str)) {
            if ("uppercase".equals(str)) {
                this.f16255k = z.UPPERCASE;
                return;
            } else if ("lowercase".equals(str)) {
                this.f16255k = z.LOWERCASE;
                return;
            } else if ("capitalize".equals(str)) {
                this.f16255k = z.CAPITALIZE;
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
            }
        }
        this.f16255k = z.NONE;
    }

    public static t a(f0 f0Var) {
        t tVar = new t();
        tVar.C(h(f0Var, "numberOfLines", -1));
        tVar.B(f(f0Var, "lineHeight", -1.0f));
        tVar.A(f(f0Var, "letterSpacing", Float.NaN));
        tVar.p(d(f0Var, "allowFontScaling", true));
        tVar.t(f(f0Var, "fontSize", -1.0f));
        tVar.r(f0Var.g("color") ? Integer.valueOf(f0Var.d("color", 0)) : null);
        tVar.r(f0Var.g("foregroundColor") ? Integer.valueOf(f0Var.d("foregroundColor", 0)) : null);
        tVar.q(f0Var.g("backgroundColor") ? Integer.valueOf(f0Var.d("backgroundColor", 0)) : null);
        tVar.s(l(f0Var, "fontFamily"));
        tVar.x(l(f0Var, "fontWeight"));
        tVar.u(l(f0Var, "fontStyle"));
        tVar.v(c(f0Var, "fontVariant"));
        tVar.y(d(f0Var, "includeFontPadding", true));
        tVar.D(l(f0Var, "textDecorationLine"));
        tVar.F(f0Var.g("textShadowOffset") ? f0Var.e("textShadowOffset") : null);
        tVar.G(h(f0Var, "textShadowRadius", 1));
        tVar.E(h(f0Var, "textShadowColor", 1426063360));
        tVar.H(l(f0Var, "textTransform"));
        tVar.z(l(f0Var, "layoutDirection"));
        tVar.o(l(f0Var, "accessibilityRole"));
        return tVar;
    }

    public static t b(ReadableMapBuffer readableMapBuffer) {
        t tVar = new t();
        Iterator<ReadableMapBuffer.c> it = readableMapBuffer.iterator();
        while (it.hasNext()) {
            ReadableMapBuffer.c next = it.next();
            int e10 = next.e();
            if (e10 == 0) {
                tVar.r(Integer.valueOf(next.d()));
            } else if (e10 == 1) {
                tVar.q(Integer.valueOf(next.d()));
            } else if (e10 == 3) {
                tVar.s(next.g());
            } else if (e10 == 4) {
                tVar.t((float) next.c());
            } else if (e10 == 15) {
                tVar.D(next.g());
            } else if (e10 == 18) {
                tVar.G(next.d());
            } else if (e10 == 19) {
                tVar.E(next.d());
            } else if (e10 == 21) {
                tVar.z(next.g());
            } else if (e10 != 22) {
                switch (e10) {
                    case 6:
                        tVar.x(next.g());
                        continue;
                    case 7:
                        tVar.u(next.g());
                        continue;
                    case 8:
                        tVar.w(next.f());
                        continue;
                    case 9:
                        tVar.p(next.b());
                        continue;
                    case 10:
                        tVar.A((float) next.c());
                        continue;
                    case 11:
                        tVar.B((float) next.c());
                        continue;
                }
            } else {
                tVar.o(next.g());
            }
        }
        return tVar;
    }

    private static ReadableArray c(f0 f0Var, String str) {
        if (f0Var.g(str)) {
            return f0Var.a(str);
        }
        return null;
    }

    private static boolean d(f0 f0Var, String str, boolean z10) {
        return f0Var.g(str) ? f0Var.b(str, z10) : z10;
    }

    private static float f(f0 f0Var, String str, float f10) {
        return f0Var.g(str) ? f0Var.c(str, f10) : f10;
    }

    public static int g(String str) {
        int i10 = f16244z;
        if (str != null) {
            if (str.equals("normal")) {
                return 1;
            }
            return !str.equals("none") ? 2 : 0;
        }
        return i10;
    }

    private static int h(f0 f0Var, String str, int i10) {
        return f0Var.g(str) ? f0Var.d(str, i10) : i10;
    }

    public static int i(f0 f0Var) {
        if (!"justify".equals(f0Var.g("textAlign") ? f0Var.f("textAlign") : null) || Build.VERSION.SDK_INT < 26) {
            return f16242x;
        }
        return 1;
    }

    public static int j(String str) {
        if (str == null || "undefined".equals(str)) {
            return -1;
        }
        if ("rtl".equals(str)) {
            return 1;
        }
        if ("ltr".equals(str)) {
            return 0;
        }
        throw new JSApplicationIllegalArgumentException("Invalid layoutDirection: " + str);
    }

    private static String l(f0 f0Var, String str) {
        if (f0Var.g(str)) {
            return f0Var.f(str);
        }
        return null;
    }

    public static int m(f0 f0Var, boolean z10) {
        String f10 = f0Var.g("textAlign") ? f0Var.f("textAlign") : null;
        if ("justify".equals(f10)) {
            return 3;
        }
        if (f10 == null || "auto".equals(f10)) {
            return 0;
        }
        if ("left".equals(f10)) {
            if (!z10) {
                return 3;
            }
        } else if (!"right".equals(f10)) {
            if ("center".equals(f10)) {
                return 1;
            }
            throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + f10);
        } else if (z10) {
            return 3;
        }
        return 5;
    }

    public static int n(String str) {
        int i10 = f16243y;
        if (str != null) {
            if (str.equals("balanced")) {
                return 2;
            }
            return !str.equals("simple") ? 1 : 0;
        }
        return i10;
    }

    private void o(String str) {
        if (str != null) {
            this.f16262r = t.d.a(str);
        }
    }

    private void p(boolean z10) {
        if (z10 != this.f16247c) {
            this.f16247c = z10;
            t(this.f16252h);
            B(this.f16253i);
            A(this.f16254j);
        }
    }

    private void q(Integer num) {
        boolean z10 = num != null;
        this.f16249e = z10;
        if (z10) {
            this.f16250f = num.intValue();
        }
    }

    private void r(Integer num) {
        boolean z10 = num != null;
        this.f16246b = z10;
        if (z10) {
            this.f16248d = num.intValue();
        }
    }

    private void s(String str) {
        this.f16265u = str;
    }

    private void t(float f10) {
        double ceil;
        this.f16252h = f10;
        if (f10 != -1.0f) {
            if (this.f16247c) {
                ceil = Math.ceil(com.facebook.react.uimanager.r.e(f10));
            } else {
                ceil = Math.ceil(com.facebook.react.uimanager.r.c(f10));
            }
            f10 = (float) ceil;
        }
        this.f16251g = (int) f10;
    }

    private void u(String str) {
        this.f16263s = q.b(str);
    }

    private void v(ReadableArray readableArray) {
        this.f16266v = q.c(readableArray);
    }

    private void w(ReadableMapBuffer readableMapBuffer) {
        if (readableMapBuffer != null && readableMapBuffer.getCount() != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<ReadableMapBuffer.c> it = readableMapBuffer.iterator();
            while (it.hasNext()) {
                String g10 = it.next().g();
                if (g10 != null) {
                    char c10 = 65535;
                    switch (g10.hashCode()) {
                        case -1195362251:
                            if (g10.equals("proportional-nums")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1061392823:
                            if (g10.equals("lining-nums")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case -771984547:
                            if (g10.equals("tabular-nums")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case -659678800:
                            if (g10.equals("oldstyle-nums")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 1183323111:
                            if (g10.equals("small-caps")) {
                                c10 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            arrayList.add("'pnum'");
                            continue;
                        case 1:
                            arrayList.add("'lnum'");
                            continue;
                        case 2:
                            arrayList.add("'tnum'");
                            continue;
                        case 3:
                            arrayList.add("'onum'");
                            continue;
                        case 4:
                            arrayList.add("'smcp'");
                            continue;
                    }
                }
            }
            this.f16266v = TextUtils.join(", ", arrayList);
            return;
        }
        this.f16266v = null;
    }

    private void x(String str) {
        this.f16264t = q.d(str);
    }

    private void y(boolean z10) {
    }

    private void z(String str) {
        j(str);
    }

    public float e() {
        return !Float.isNaN(this.f16245a) && !Float.isNaN(this.f16267w) && (this.f16267w > this.f16245a ? 1 : (this.f16267w == this.f16245a ? 0 : -1)) > 0 ? this.f16267w : this.f16245a;
    }

    public float k() {
        float c10;
        if (this.f16247c) {
            c10 = com.facebook.react.uimanager.r.e(this.f16254j);
        } else {
            c10 = com.facebook.react.uimanager.r.c(this.f16254j);
        }
        int i10 = this.f16251g;
        if (i10 > 0) {
            return c10 / i10;
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.f16251g);
    }
}
