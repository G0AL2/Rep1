package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.d0;
import com.facebook.react.uimanager.e0;
import fm.castbox.mediation.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ReactBaseTextShadowNode.java */
@TargetApi(23)
/* loaded from: classes.dex */
public abstract class f extends com.facebook.react.uimanager.j {
    protected u A;
    protected boolean B;
    protected int C;
    protected boolean D;
    protected int E;
    protected int F;
    protected int G;
    protected int H;
    protected int I;
    protected int J;
    protected float K;
    protected float L;
    protected float M;
    protected int N;
    protected boolean O;
    protected boolean P;
    protected boolean Q;
    protected boolean R;
    protected float S;
    protected int T;
    protected int U;
    protected String V;
    protected String W;
    protected boolean X;
    protected Map<Integer, d0> Y;

    /* renamed from: z  reason: collision with root package name */
    protected p f16192z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactBaseTextShadowNode.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected int f16193a;

        /* renamed from: b  reason: collision with root package name */
        protected int f16194b;

        /* renamed from: c  reason: collision with root package name */
        protected j f16195c;

        a(int i10, int i11, j jVar) {
            this.f16193a = i10;
            this.f16194b = i11;
            this.f16195c = jVar;
        }

        public void a(SpannableStringBuilder spannableStringBuilder, int i10) {
            int i11 = this.f16193a;
            spannableStringBuilder.setSpan(this.f16195c, i11, this.f16194b, ((i10 << 16) & 16711680) | ((i11 == 0 ? 18 : 34) & (-16711681)));
        }
    }

    public f() {
        this(null);
    }

    private static void q1(f fVar, SpannableStringBuilder spannableStringBuilder, List<a> list, u uVar, boolean z10, Map<Integer, d0> map, int i10) {
        u uVar2;
        float e02;
        float k10;
        if (uVar != null) {
            uVar2 = uVar.a(fVar.A);
        } else {
            uVar2 = fVar.A;
        }
        u uVar3 = uVar2;
        int b10 = fVar.b();
        for (int i11 = 0; i11 < b10; i11++) {
            e0 a10 = fVar.a(i11);
            if (a10 instanceof i) {
                spannableStringBuilder.append((CharSequence) z.a(((i) a10).p1(), uVar3.l()));
            } else if (a10 instanceof f) {
                q1((f) a10, spannableStringBuilder, list, uVar3, z10, map, spannableStringBuilder.length());
            } else if (a10 instanceof l) {
                spannableStringBuilder.append("0");
                list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((l) a10).q1()));
            } else if (z10) {
                int O = a10.O();
                com.facebook.yoga.v u10 = a10.u();
                com.facebook.yoga.v M = a10.M();
                com.facebook.yoga.u uVar4 = u10.f16655b;
                com.facebook.yoga.u uVar5 = com.facebook.yoga.u.POINT;
                if (uVar4 == uVar5 && M.f16655b == uVar5) {
                    e02 = u10.f16654a;
                    k10 = M.f16654a;
                } else {
                    a10.Q();
                    e02 = a10.e0();
                    k10 = a10.k();
                }
                spannableStringBuilder.append("0");
                list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new w(O, (int) e02, (int) k10)));
                map.put(Integer.valueOf(O), a10);
                a10.g();
            } else {
                throw new com.facebook.react.uimanager.h("Unexpected view type nested under a <Text> or <TextInput> node: " + a10.getClass());
            }
            a10.g();
        }
        int length = spannableStringBuilder.length();
        if (length >= i10) {
            if (fVar.B) {
                list.add(new a(i10, length, new ReactForegroundColorSpan(fVar.C)));
            }
            if (fVar.D) {
                list.add(new a(i10, length, new ReactBackgroundColorSpan(fVar.E)));
            }
            float d10 = uVar3.d();
            if (!Float.isNaN(d10) && (uVar == null || uVar.d() != d10)) {
                list.add(new a(i10, length, new com.facebook.react.views.text.a(d10)));
            }
            int c10 = uVar3.c();
            if (uVar == null || uVar.c() != c10) {
                list.add(new a(i10, length, new ReactAbsoluteSizeSpan(c10)));
            }
            if (fVar.T != -1 || fVar.U != -1 || fVar.V != null) {
                list.add(new a(i10, length, new c(fVar.T, fVar.U, fVar.W, fVar.V, fVar.U().getAssets())));
            }
            if (fVar.O) {
                list.add(new a(i10, length, new ReactUnderlineSpan()));
            }
            if (fVar.P) {
                list.add(new a(i10, length, new ReactStrikethroughSpan()));
            }
            if ((fVar.K != 0.0f || fVar.L != 0.0f || fVar.M != 0.0f) && Color.alpha(fVar.N) != 0) {
                list.add(new a(i10, length, new s(fVar.K, fVar.L, fVar.M, fVar.N)));
            }
            float e10 = uVar3.e();
            if (!Float.isNaN(e10) && (uVar == null || uVar.e() != e10)) {
                list.add(new a(i10, length, new b(e10)));
            }
            list.add(new a(i10, length, new k(fVar.O())));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Spannable r1(f fVar, String str, boolean z10, com.facebook.react.uimanager.o oVar) {
        int i10;
        int i11 = 0;
        f6.a.b((z10 && oVar == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        HashMap hashMap = z10 ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) z.a(str, fVar.A.l()));
        }
        q1(fVar, spannableStringBuilder, arrayList, null, z10, hashMap, 0);
        fVar.X = false;
        fVar.Y = hashMap;
        float f10 = Float.NaN;
        for (a aVar : arrayList) {
            j jVar = aVar.f16195c;
            boolean z11 = jVar instanceof v;
            if (z11 || (jVar instanceof w)) {
                if (z11) {
                    i10 = ((v) jVar).b();
                    fVar.X = true;
                } else {
                    w wVar = (w) jVar;
                    int a10 = wVar.a();
                    d0 d0Var = (d0) hashMap.get(Integer.valueOf(wVar.b()));
                    oVar.h(d0Var);
                    d0Var.z(fVar);
                    i10 = a10;
                }
                if (Float.isNaN(f10) || i10 > f10) {
                    f10 = i10;
                }
            }
            aVar.a(spannableStringBuilder, i11);
            i11++;
        }
        fVar.A.o(f10);
        p pVar = this.f16192z;
        if (pVar != null) {
            pVar.a(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    @w6.a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z10) {
        if (z10 != this.R) {
            this.R = z10;
            x0();
        }
    }

    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z10) {
        if (z10 != this.A.b()) {
            this.A.m(z10);
            x0();
        }
    }

    @w6.a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (R()) {
            boolean z10 = num != null;
            this.D = z10;
            if (z10) {
                this.E = num.intValue();
            }
            x0();
        }
    }

    @w6.a(customType = "Color", name = "color")
    public void setColor(Integer num) {
        boolean z10 = num != null;
        this.B = z10;
        if (z10) {
            this.C = num.intValue();
        }
        x0();
    }

    @w6.a(name = "fontFamily")
    public void setFontFamily(String str) {
        this.V = str;
        x0();
    }

    @w6.a(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f10) {
        this.A.n(f10);
        x0();
    }

    @w6.a(name = "fontStyle")
    public void setFontStyle(String str) {
        int b10 = q.b(str);
        if (b10 != this.T) {
            this.T = b10;
            x0();
        }
    }

    @w6.a(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String c10 = q.c(readableArray);
        if (TextUtils.equals(c10, this.W)) {
            return;
        }
        this.W = c10;
        x0();
    }

    @w6.a(name = "fontWeight")
    public void setFontWeight(String str) {
        int d10 = q.d(str);
        if (d10 != this.U) {
            this.U = d10;
            x0();
        }
    }

    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z10) {
        this.Q = z10;
    }

    @w6.a(defaultFloat = Float.NaN, name = "letterSpacing")
    public void setLetterSpacing(float f10) {
        this.A.p(f10);
        x0();
    }

    @w6.a(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f10) {
        this.A.q(f10);
        x0();
    }

    @w6.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f10) {
        if (f10 != this.A.k()) {
            this.A.r(f10);
            x0();
        }
    }

    @w6.a(name = "minimumFontScale")
    public void setMinimumFontScale(float f10) {
        if (f10 != this.S) {
            this.S = f10;
            x0();
        }
    }

    @w6.a(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i10) {
        if (i10 == 0) {
            i10 = -1;
        }
        this.F = i10;
        x0();
    }

    @w6.a(name = "textAlign")
    public void setTextAlign(String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.J = 1;
            }
            this.G = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.J = 0;
            }
            if (str != null && !"auto".equals(str)) {
                if ("left".equals(str)) {
                    this.G = 3;
                } else if ("right".equals(str)) {
                    this.G = 5;
                } else if ("center".equals(str)) {
                    this.G = 1;
                } else {
                    throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
                }
            } else {
                this.G = 0;
            }
        }
        x0();
    }

    @w6.a(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (str != null && !"highQuality".equals(str)) {
            if ("simple".equals(str)) {
                this.H = 0;
            } else if ("balanced".equals(str)) {
                this.H = 2;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
            }
        } else {
            this.H = 1;
        }
        x0();
    }

    @w6.a(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        String[] split;
        this.O = false;
        this.P = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.O = true;
                } else if ("line-through".equals(str2)) {
                    this.P = true;
                }
            }
        }
        x0();
    }

    @w6.a(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i10) {
        if (i10 != this.N) {
            this.N = i10;
            x0();
        }
    }

    @w6.a(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.K = 0.0f;
        this.L = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.K = com.facebook.react.uimanager.r.b(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.L = com.facebook.react.uimanager.r.b(readableMap.getDouble("height"));
            }
        }
        x0();
    }

    @w6.a(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f10) {
        if (f10 != this.M) {
            this.M = f10;
            x0();
        }
    }

    @w6.a(name = "textTransform")
    public void setTextTransform(String str) {
        if (str == null) {
            this.A.s(z.UNSET);
        } else if ("none".equals(str)) {
            this.A.s(z.NONE);
        } else if ("uppercase".equals(str)) {
            this.A.s(z.UPPERCASE);
        } else if ("lowercase".equals(str)) {
            this.A.s(z.LOWERCASE);
        } else if ("capitalize".equals(str)) {
            this.A.s(z.CAPITALIZE);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
        }
        x0();
    }

    public f(p pVar) {
        this.B = false;
        this.D = false;
        this.F = -1;
        this.G = 0;
        this.H = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        this.I = 0;
        this.J = 0;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 1426063360;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.R = false;
        this.S = 0.0f;
        this.T = -1;
        this.U = -1;
        this.V = null;
        this.W = null;
        this.X = false;
        this.A = new u();
        this.f16192z = pVar;
    }
}
