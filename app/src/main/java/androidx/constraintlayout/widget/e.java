package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f2108d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    private static SparseIntArray f2109e = new SparseIntArray();

    /* renamed from: f  reason: collision with root package name */
    private static SparseIntArray f2110f = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.b> f2111a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f2112b = true;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<Integer, a> f2113c = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f2114a;

        /* renamed from: b  reason: collision with root package name */
        public final d f2115b = new d();

        /* renamed from: c  reason: collision with root package name */
        public final c f2116c = new c();

        /* renamed from: d  reason: collision with root package name */
        public final b f2117d = new b();

        /* renamed from: e  reason: collision with root package name */
        public final C0045e f2118e = new C0045e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.b> f2119f = new HashMap<>();

        /* renamed from: g  reason: collision with root package name */
        C0044a f2120g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ConstraintSet.java */
        /* renamed from: androidx.constraintlayout.widget.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0044a {

            /* renamed from: a  reason: collision with root package name */
            int[] f2121a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            int[] f2122b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            int f2123c = 0;

            /* renamed from: d  reason: collision with root package name */
            int[] f2124d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            float[] f2125e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            int f2126f = 0;

            /* renamed from: g  reason: collision with root package name */
            int[] f2127g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            String[] f2128h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            int f2129i = 0;

            /* renamed from: j  reason: collision with root package name */
            int[] f2130j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            boolean[] f2131k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            int f2132l = 0;

            C0044a() {
            }

            void a(int i10, float f10) {
                int i11 = this.f2126f;
                int[] iArr = this.f2124d;
                if (i11 >= iArr.length) {
                    this.f2124d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f2125e;
                    this.f2125e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f2124d;
                int i12 = this.f2126f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f2125e;
                this.f2126f = i12 + 1;
                fArr2[i12] = f10;
            }

            void b(int i10, int i11) {
                int i12 = this.f2123c;
                int[] iArr = this.f2121a;
                if (i12 >= iArr.length) {
                    this.f2121a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f2122b;
                    this.f2122b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2121a;
                int i13 = this.f2123c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f2122b;
                this.f2123c = i13 + 1;
                iArr4[i13] = i11;
            }

            void c(int i10, String str) {
                int i11 = this.f2129i;
                int[] iArr = this.f2127g;
                if (i11 >= iArr.length) {
                    this.f2127g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f2128h;
                    this.f2128h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f2127g;
                int i12 = this.f2129i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f2128h;
                this.f2129i = i12 + 1;
                strArr2[i12] = str;
            }

            void d(int i10, boolean z10) {
                int i11 = this.f2132l;
                int[] iArr = this.f2130j;
                if (i11 >= iArr.length) {
                    this.f2130j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f2131k;
                    this.f2131k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f2130j;
                int i12 = this.f2132l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f2131k;
                this.f2132l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i10, ConstraintLayout.b bVar) {
            this.f2114a = i10;
            b bVar2 = this.f2117d;
            bVar2.f2150i = bVar.f2017e;
            bVar2.f2152j = bVar.f2019f;
            bVar2.f2154k = bVar.f2021g;
            bVar2.f2156l = bVar.f2023h;
            bVar2.f2158m = bVar.f2025i;
            bVar2.f2160n = bVar.f2027j;
            bVar2.f2162o = bVar.f2029k;
            bVar2.f2164p = bVar.f2031l;
            bVar2.f2166q = bVar.f2033m;
            bVar2.f2167r = bVar.f2035n;
            bVar2.f2168s = bVar.f2037o;
            bVar2.f2169t = bVar.f2045s;
            bVar2.f2170u = bVar.f2046t;
            bVar2.f2171v = bVar.f2047u;
            bVar2.f2172w = bVar.f2048v;
            bVar2.f2173x = bVar.E;
            bVar2.f2174y = bVar.F;
            bVar2.f2175z = bVar.G;
            bVar2.A = bVar.f2039p;
            bVar2.B = bVar.f2041q;
            bVar2.C = bVar.f2043r;
            bVar2.D = bVar.T;
            bVar2.E = bVar.U;
            bVar2.F = bVar.V;
            bVar2.f2146g = bVar.f2013c;
            bVar2.f2142e = bVar.f2009a;
            bVar2.f2144f = bVar.f2011b;
            bVar2.f2138c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f2140d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.M = bVar.D;
            bVar2.U = bVar.I;
            bVar2.V = bVar.H;
            bVar2.X = bVar.K;
            bVar2.W = bVar.J;
            bVar2.f2159m0 = bVar.W;
            bVar2.f2161n0 = bVar.X;
            bVar2.Y = bVar.L;
            bVar2.Z = bVar.M;
            bVar2.f2135a0 = bVar.P;
            bVar2.f2137b0 = bVar.Q;
            bVar2.f2139c0 = bVar.N;
            bVar2.f2141d0 = bVar.O;
            bVar2.f2143e0 = bVar.R;
            bVar2.f2145f0 = bVar.S;
            bVar2.f2157l0 = bVar.Y;
            bVar2.O = bVar.f2050x;
            bVar2.Q = bVar.f2052z;
            bVar2.N = bVar.f2049w;
            bVar2.P = bVar.f2051y;
            bVar2.S = bVar.A;
            bVar2.R = bVar.B;
            bVar2.T = bVar.C;
            bVar2.f2165p0 = bVar.Z;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar2.K = bVar.getMarginEnd();
                this.f2117d.L = bVar.getMarginStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i10, f.a aVar) {
            f(i10, aVar);
            this.f2115b.f2194d = aVar.f2212s0;
            C0045e c0045e = this.f2118e;
            c0045e.f2198b = aVar.f2215v0;
            c0045e.f2199c = aVar.f2216w0;
            c0045e.f2200d = aVar.f2217x0;
            c0045e.f2201e = aVar.f2218y0;
            c0045e.f2202f = aVar.f2219z0;
            c0045e.f2203g = aVar.A0;
            c0045e.f2204h = aVar.B0;
            c0045e.f2206j = aVar.C0;
            c0045e.f2207k = aVar.D0;
            c0045e.f2208l = aVar.E0;
            c0045e.f2210n = aVar.f2214u0;
            c0045e.f2209m = aVar.f2213t0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(androidx.constraintlayout.widget.c cVar, int i10, f.a aVar) {
            g(i10, aVar);
            if (cVar instanceof androidx.constraintlayout.widget.a) {
                b bVar = this.f2117d;
                bVar.f2151i0 = 1;
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) cVar;
                bVar.f2147g0 = aVar2.getType();
                this.f2117d.f2153j0 = aVar2.getReferencedIds();
                this.f2117d.f2149h0 = aVar2.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f2117d;
            bVar.f2017e = bVar2.f2150i;
            bVar.f2019f = bVar2.f2152j;
            bVar.f2021g = bVar2.f2154k;
            bVar.f2023h = bVar2.f2156l;
            bVar.f2025i = bVar2.f2158m;
            bVar.f2027j = bVar2.f2160n;
            bVar.f2029k = bVar2.f2162o;
            bVar.f2031l = bVar2.f2164p;
            bVar.f2033m = bVar2.f2166q;
            bVar.f2035n = bVar2.f2167r;
            bVar.f2037o = bVar2.f2168s;
            bVar.f2045s = bVar2.f2169t;
            bVar.f2046t = bVar2.f2170u;
            bVar.f2047u = bVar2.f2171v;
            bVar.f2048v = bVar2.f2172w;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.G;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.J;
            bVar.A = bVar2.S;
            bVar.B = bVar2.R;
            bVar.f2050x = bVar2.O;
            bVar.f2052z = bVar2.Q;
            bVar.E = bVar2.f2173x;
            bVar.F = bVar2.f2174y;
            bVar.f2039p = bVar2.A;
            bVar.f2041q = bVar2.B;
            bVar.f2043r = bVar2.C;
            bVar.G = bVar2.f2175z;
            bVar.T = bVar2.D;
            bVar.U = bVar2.E;
            bVar.I = bVar2.U;
            bVar.H = bVar2.V;
            bVar.K = bVar2.X;
            bVar.J = bVar2.W;
            bVar.W = bVar2.f2159m0;
            bVar.X = bVar2.f2161n0;
            bVar.L = bVar2.Y;
            bVar.M = bVar2.Z;
            bVar.P = bVar2.f2135a0;
            bVar.Q = bVar2.f2137b0;
            bVar.N = bVar2.f2139c0;
            bVar.O = bVar2.f2141d0;
            bVar.R = bVar2.f2143e0;
            bVar.S = bVar2.f2145f0;
            bVar.V = bVar2.F;
            bVar.f2013c = bVar2.f2146g;
            bVar.f2009a = bVar2.f2142e;
            bVar.f2011b = bVar2.f2144f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f2138c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f2140d;
            String str = bVar2.f2157l0;
            if (str != null) {
                bVar.Y = str;
            }
            bVar.Z = bVar2.f2165p0;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(bVar2.L);
                bVar.setMarginEnd(this.f2117d.K);
            }
            bVar.a();
        }

        /* renamed from: e */
        public a clone() {
            a aVar = new a();
            aVar.f2117d.a(this.f2117d);
            aVar.f2116c.a(this.f2116c);
            aVar.f2115b.a(this.f2115b);
            aVar.f2118e.a(this.f2118e);
            aVar.f2114a = this.f2114a;
            aVar.f2120g = this.f2120g;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: q0  reason: collision with root package name */
        private static SparseIntArray f2133q0;

        /* renamed from: c  reason: collision with root package name */
        public int f2138c;

        /* renamed from: d  reason: collision with root package name */
        public int f2140d;

        /* renamed from: j0  reason: collision with root package name */
        public int[] f2153j0;

        /* renamed from: k0  reason: collision with root package name */
        public String f2155k0;

        /* renamed from: l0  reason: collision with root package name */
        public String f2157l0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2134a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2136b = false;

        /* renamed from: e  reason: collision with root package name */
        public int f2142e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2144f = -1;

        /* renamed from: g  reason: collision with root package name */
        public float f2146g = -1.0f;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2148h = true;

        /* renamed from: i  reason: collision with root package name */
        public int f2150i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f2152j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f2154k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f2156l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f2158m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f2160n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f2162o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f2164p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f2166q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f2167r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f2168s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f2169t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f2170u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f2171v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f2172w = -1;

        /* renamed from: x  reason: collision with root package name */
        public float f2173x = 0.5f;

        /* renamed from: y  reason: collision with root package name */
        public float f2174y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public String f2175z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = RecyclerView.UNDEFINED_DURATION;
        public int O = RecyclerView.UNDEFINED_DURATION;
        public int P = RecyclerView.UNDEFINED_DURATION;
        public int Q = RecyclerView.UNDEFINED_DURATION;
        public int R = RecyclerView.UNDEFINED_DURATION;
        public int S = RecyclerView.UNDEFINED_DURATION;
        public int T = RecyclerView.UNDEFINED_DURATION;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0  reason: collision with root package name */
        public int f2135a0 = 0;

        /* renamed from: b0  reason: collision with root package name */
        public int f2137b0 = 0;

        /* renamed from: c0  reason: collision with root package name */
        public int f2139c0 = 0;

        /* renamed from: d0  reason: collision with root package name */
        public int f2141d0 = 0;

        /* renamed from: e0  reason: collision with root package name */
        public float f2143e0 = 1.0f;

        /* renamed from: f0  reason: collision with root package name */
        public float f2145f0 = 1.0f;

        /* renamed from: g0  reason: collision with root package name */
        public int f2147g0 = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f2149h0 = 0;

        /* renamed from: i0  reason: collision with root package name */
        public int f2151i0 = -1;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f2159m0 = false;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f2161n0 = false;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f2163o0 = true;

        /* renamed from: p0  reason: collision with root package name */
        public int f2165p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2133q0 = sparseIntArray;
            sparseIntArray.append(k.f2238b5, 24);
            f2133q0.append(k.f2246c5, 25);
            f2133q0.append(k.f2262e5, 28);
            f2133q0.append(k.f2270f5, 29);
            f2133q0.append(k.f2310k5, 35);
            f2133q0.append(k.f2302j5, 34);
            f2133q0.append(k.L4, 4);
            f2133q0.append(k.K4, 3);
            f2133q0.append(k.I4, 1);
            f2133q0.append(k.f2356q5, 6);
            f2133q0.append(k.f2363r5, 7);
            f2133q0.append(k.S4, 17);
            f2133q0.append(k.T4, 18);
            f2133q0.append(k.U4, 19);
            f2133q0.append(k.E4, 90);
            f2133q0.append(k.f2355q4, 26);
            f2133q0.append(k.f2278g5, 31);
            f2133q0.append(k.f2286h5, 32);
            f2133q0.append(k.R4, 10);
            f2133q0.append(k.Q4, 9);
            f2133q0.append(k.f2384u5, 13);
            f2133q0.append(k.f2405x5, 16);
            f2133q0.append(k.f2391v5, 14);
            f2133q0.append(k.f2370s5, 11);
            f2133q0.append(k.f2398w5, 15);
            f2133q0.append(k.f2377t5, 12);
            f2133q0.append(k.f2334n5, 38);
            f2133q0.append(k.Z4, 37);
            f2133q0.append(k.Y4, 39);
            f2133q0.append(k.f2326m5, 40);
            f2133q0.append(k.X4, 20);
            f2133q0.append(k.f2318l5, 36);
            f2133q0.append(k.P4, 5);
            f2133q0.append(k.f2230a5, 91);
            f2133q0.append(k.f2294i5, 91);
            f2133q0.append(k.f2254d5, 91);
            f2133q0.append(k.J4, 91);
            f2133q0.append(k.H4, 91);
            f2133q0.append(k.f2376t4, 23);
            f2133q0.append(k.f2390v4, 27);
            f2133q0.append(k.f2404x4, 30);
            f2133q0.append(k.f2411y4, 8);
            f2133q0.append(k.f2383u4, 33);
            f2133q0.append(k.f2397w4, 2);
            f2133q0.append(k.f2362r4, 22);
            f2133q0.append(k.f2369s4, 21);
            f2133q0.append(k.f2342o5, 41);
            f2133q0.append(k.V4, 42);
            f2133q0.append(k.G4, 41);
            f2133q0.append(k.F4, 42);
            f2133q0.append(k.f2412y5, 76);
            f2133q0.append(k.M4, 61);
            f2133q0.append(k.O4, 62);
            f2133q0.append(k.N4, 63);
            f2133q0.append(k.f2349p5, 69);
            f2133q0.append(k.W4, 70);
            f2133q0.append(k.C4, 71);
            f2133q0.append(k.A4, 72);
            f2133q0.append(k.B4, 73);
            f2133q0.append(k.D4, 74);
            f2133q0.append(k.f2418z4, 75);
        }

        public void a(b bVar) {
            this.f2134a = bVar.f2134a;
            this.f2138c = bVar.f2138c;
            this.f2136b = bVar.f2136b;
            this.f2140d = bVar.f2140d;
            this.f2142e = bVar.f2142e;
            this.f2144f = bVar.f2144f;
            this.f2146g = bVar.f2146g;
            this.f2148h = bVar.f2148h;
            this.f2150i = bVar.f2150i;
            this.f2152j = bVar.f2152j;
            this.f2154k = bVar.f2154k;
            this.f2156l = bVar.f2156l;
            this.f2158m = bVar.f2158m;
            this.f2160n = bVar.f2160n;
            this.f2162o = bVar.f2162o;
            this.f2164p = bVar.f2164p;
            this.f2166q = bVar.f2166q;
            this.f2167r = bVar.f2167r;
            this.f2168s = bVar.f2168s;
            this.f2169t = bVar.f2169t;
            this.f2170u = bVar.f2170u;
            this.f2171v = bVar.f2171v;
            this.f2172w = bVar.f2172w;
            this.f2173x = bVar.f2173x;
            this.f2174y = bVar.f2174y;
            this.f2175z = bVar.f2175z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f2135a0 = bVar.f2135a0;
            this.f2137b0 = bVar.f2137b0;
            this.f2139c0 = bVar.f2139c0;
            this.f2141d0 = bVar.f2141d0;
            this.f2143e0 = bVar.f2143e0;
            this.f2145f0 = bVar.f2145f0;
            this.f2147g0 = bVar.f2147g0;
            this.f2149h0 = bVar.f2149h0;
            this.f2151i0 = bVar.f2151i0;
            this.f2157l0 = bVar.f2157l0;
            int[] iArr = bVar.f2153j0;
            if (iArr != null && bVar.f2155k0 == null) {
                this.f2153j0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2153j0 = null;
            }
            this.f2155k0 = bVar.f2155k0;
            this.f2159m0 = bVar.f2159m0;
            this.f2161n0 = bVar.f2161n0;
            this.f2163o0 = bVar.f2163o0;
            this.f2165p0 = bVar.f2165p0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f2348p4);
            this.f2136b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f2133q0.get(index);
                switch (i11) {
                    case 1:
                        this.f2166q = e.l(obtainStyledAttributes, index, this.f2166q);
                        break;
                    case 2:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        this.f2164p = e.l(obtainStyledAttributes, index, this.f2164p);
                        break;
                    case 4:
                        this.f2162o = e.l(obtainStyledAttributes, index, this.f2162o);
                        break;
                    case 5:
                        this.f2175z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        if (Build.VERSION.SDK_INT >= 17) {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        this.f2172w = e.l(obtainStyledAttributes, index, this.f2172w);
                        break;
                    case 10:
                        this.f2171v = e.l(obtainStyledAttributes, index, this.f2171v);
                        break;
                    case 11:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.f2142e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2142e);
                        break;
                    case 18:
                        this.f2144f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2144f);
                        break;
                    case 19:
                        this.f2146g = obtainStyledAttributes.getFloat(index, this.f2146g);
                        break;
                    case 20:
                        this.f2173x = obtainStyledAttributes.getFloat(index, this.f2173x);
                        break;
                    case 21:
                        this.f2140d = obtainStyledAttributes.getLayoutDimension(index, this.f2140d);
                        break;
                    case 22:
                        this.f2138c = obtainStyledAttributes.getLayoutDimension(index, this.f2138c);
                        break;
                    case 23:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        this.f2150i = e.l(obtainStyledAttributes, index, this.f2150i);
                        break;
                    case 25:
                        this.f2152j = e.l(obtainStyledAttributes, index, this.f2152j);
                        break;
                    case 26:
                        this.F = obtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        this.f2154k = e.l(obtainStyledAttributes, index, this.f2154k);
                        break;
                    case 29:
                        this.f2156l = e.l(obtainStyledAttributes, index, this.f2156l);
                        break;
                    case 30:
                        if (Build.VERSION.SDK_INT >= 17) {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } else {
                            break;
                        }
                    case 31:
                        this.f2169t = e.l(obtainStyledAttributes, index, this.f2169t);
                        break;
                    case 32:
                        this.f2170u = e.l(obtainStyledAttributes, index, this.f2170u);
                        break;
                    case 33:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        this.f2160n = e.l(obtainStyledAttributes, index, this.f2160n);
                        break;
                    case 35:
                        this.f2158m = e.l(obtainStyledAttributes, index, this.f2158m);
                        break;
                    case 36:
                        this.f2174y = obtainStyledAttributes.getFloat(index, this.f2174y);
                        break;
                    case 37:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        e.m(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        e.m(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.A = e.l(obtainStyledAttributes, index, this.A);
                                continue;
                            case 62:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                continue;
                            case 63:
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                continue;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f2143e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f2145f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.f2147g0 = obtainStyledAttributes.getInt(index, this.f2147g0);
                                        continue;
                                    case 73:
                                        this.f2149h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2149h0);
                                        continue;
                                    case 74:
                                        this.f2155k0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f2163o0 = obtainStyledAttributes.getBoolean(index, this.f2163o0);
                                        continue;
                                    case 76:
                                        this.f2165p0 = obtainStyledAttributes.getInt(index, this.f2165p0);
                                        continue;
                                    case 77:
                                        this.f2167r = e.l(obtainStyledAttributes, index, this.f2167r);
                                        continue;
                                    case 78:
                                        this.f2168s = e.l(obtainStyledAttributes, index, this.f2168s);
                                        continue;
                                    case 79:
                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        continue;
                                    case 80:
                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        continue;
                                    case 81:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        continue;
                                    case 82:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 83:
                                        this.f2137b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2137b0);
                                        continue;
                                    case 84:
                                        this.f2135a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2135a0);
                                        continue;
                                    case 85:
                                        this.f2141d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2141d0);
                                        continue;
                                    case 86:
                                        this.f2139c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2139c0);
                                        continue;
                                    case 87:
                                        this.f2159m0 = obtainStyledAttributes.getBoolean(index, this.f2159m0);
                                        continue;
                                    case 88:
                                        this.f2161n0 = obtainStyledAttributes.getBoolean(index, this.f2161n0);
                                        continue;
                                    case 89:
                                        this.f2157l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f2148h = obtainStyledAttributes.getBoolean(index, this.f2148h);
                                        continue;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2133q0.get(index));
                                        continue;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2133q0.get(index));
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f2176o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2177a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f2178b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f2179c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f2180d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f2181e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2182f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f2183g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f2184h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f2185i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f2186j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public int f2187k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f2188l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f2189m = -3;

        /* renamed from: n  reason: collision with root package name */
        public int f2190n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2176o = sparseIntArray;
            sparseIntArray.append(k.D5, 1);
            f2176o.append(k.F5, 2);
            f2176o.append(k.J5, 3);
            f2176o.append(k.C5, 4);
            f2176o.append(k.B5, 5);
            f2176o.append(k.A5, 6);
            f2176o.append(k.E5, 7);
            f2176o.append(k.I5, 8);
            f2176o.append(k.H5, 9);
            f2176o.append(k.G5, 10);
        }

        public void a(c cVar) {
            this.f2177a = cVar.f2177a;
            this.f2178b = cVar.f2178b;
            this.f2180d = cVar.f2180d;
            this.f2181e = cVar.f2181e;
            this.f2182f = cVar.f2182f;
            this.f2185i = cVar.f2185i;
            this.f2183g = cVar.f2183g;
            this.f2184h = cVar.f2184h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f2419z5);
            this.f2177a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2176o.get(index)) {
                    case 1:
                        this.f2185i = obtainStyledAttributes.getFloat(index, this.f2185i);
                        break;
                    case 2:
                        this.f2181e = obtainStyledAttributes.getInt(index, this.f2181e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f2180d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f2180d = q.b.f35730c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f2182f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2178b = e.l(obtainStyledAttributes, index, this.f2178b);
                        break;
                    case 6:
                        this.f2179c = obtainStyledAttributes.getInteger(index, this.f2179c);
                        break;
                    case 7:
                        this.f2183g = obtainStyledAttributes.getFloat(index, this.f2183g);
                        break;
                    case 8:
                        this.f2187k = obtainStyledAttributes.getInteger(index, this.f2187k);
                        break;
                    case 9:
                        this.f2186j = obtainStyledAttributes.getFloat(index, this.f2186j);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f2190n = resourceId;
                            if (resourceId != -1) {
                                this.f2189m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i11 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f2188l = string;
                            if (string.indexOf("/") > 0) {
                                this.f2190n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f2189m = -2;
                                break;
                            } else {
                                this.f2189m = -1;
                                break;
                            }
                        } else {
                            this.f2189m = obtainStyledAttributes.getInteger(index, this.f2190n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2191a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f2192b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2193c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f2194d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f2195e = Float.NaN;

        public void a(d dVar) {
            this.f2191a = dVar.f2191a;
            this.f2192b = dVar.f2192b;
            this.f2194d = dVar.f2194d;
            this.f2195e = dVar.f2195e;
            this.f2193c = dVar.f2193c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.N5);
            this.f2191a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.P5) {
                    this.f2194d = obtainStyledAttributes.getFloat(index, this.f2194d);
                } else if (index == k.O5) {
                    this.f2192b = obtainStyledAttributes.getInt(index, this.f2192b);
                    this.f2192b = e.f2108d[this.f2192b];
                } else if (index == k.R5) {
                    this.f2193c = obtainStyledAttributes.getInt(index, this.f2193c);
                } else if (index == k.Q5) {
                    this.f2195e = obtainStyledAttributes.getFloat(index, this.f2195e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0045e {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f2196o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2197a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f2198b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f2199c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f2200d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f2201e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f2202f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f2203g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f2204h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f2205i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f2206j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f2207k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f2208l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f2209m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f2210n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2196o = sparseIntArray;
            sparseIntArray.append(k.f2247c6, 1);
            f2196o.append(k.f2255d6, 2);
            f2196o.append(k.f2263e6, 3);
            f2196o.append(k.f2231a6, 4);
            f2196o.append(k.f2239b6, 5);
            f2196o.append(k.W5, 6);
            f2196o.append(k.X5, 7);
            f2196o.append(k.Y5, 8);
            f2196o.append(k.Z5, 9);
            f2196o.append(k.f2271f6, 10);
            f2196o.append(k.f2279g6, 11);
            f2196o.append(k.f2287h6, 12);
        }

        public void a(C0045e c0045e) {
            this.f2197a = c0045e.f2197a;
            this.f2198b = c0045e.f2198b;
            this.f2199c = c0045e.f2199c;
            this.f2200d = c0045e.f2200d;
            this.f2201e = c0045e.f2201e;
            this.f2202f = c0045e.f2202f;
            this.f2203g = c0045e.f2203g;
            this.f2204h = c0045e.f2204h;
            this.f2205i = c0045e.f2205i;
            this.f2206j = c0045e.f2206j;
            this.f2207k = c0045e.f2207k;
            this.f2208l = c0045e.f2208l;
            this.f2209m = c0045e.f2209m;
            this.f2210n = c0045e.f2210n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.V5);
            this.f2197a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2196o.get(index)) {
                    case 1:
                        this.f2198b = obtainStyledAttributes.getFloat(index, this.f2198b);
                        break;
                    case 2:
                        this.f2199c = obtainStyledAttributes.getFloat(index, this.f2199c);
                        break;
                    case 3:
                        this.f2200d = obtainStyledAttributes.getFloat(index, this.f2200d);
                        break;
                    case 4:
                        this.f2201e = obtainStyledAttributes.getFloat(index, this.f2201e);
                        break;
                    case 5:
                        this.f2202f = obtainStyledAttributes.getFloat(index, this.f2202f);
                        break;
                    case 6:
                        this.f2203g = obtainStyledAttributes.getDimension(index, this.f2203g);
                        break;
                    case 7:
                        this.f2204h = obtainStyledAttributes.getDimension(index, this.f2204h);
                        break;
                    case 8:
                        this.f2206j = obtainStyledAttributes.getDimension(index, this.f2206j);
                        break;
                    case 9:
                        this.f2207k = obtainStyledAttributes.getDimension(index, this.f2207k);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f2208l = obtainStyledAttributes.getDimension(index, this.f2208l);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f2209m = true;
                            this.f2210n = obtainStyledAttributes.getDimension(index, this.f2210n);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        this.f2205i = e.l(obtainStyledAttributes, index, this.f2205i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f2109e.append(k.f2281h0, 25);
        f2109e.append(k.f2289i0, 26);
        f2109e.append(k.f2305k0, 29);
        f2109e.append(k.f2313l0, 30);
        f2109e.append(k.f2358r0, 36);
        f2109e.append(k.f2351q0, 35);
        f2109e.append(k.O, 4);
        f2109e.append(k.N, 3);
        f2109e.append(k.J, 1);
        f2109e.append(k.L, 91);
        f2109e.append(k.K, 92);
        f2109e.append(k.A0, 6);
        f2109e.append(k.B0, 7);
        f2109e.append(k.V, 17);
        f2109e.append(k.W, 18);
        f2109e.append(k.X, 19);
        f2109e.append(k.F, 99);
        f2109e.append(k.f2232b, 27);
        f2109e.append(k.f2321m0, 32);
        f2109e.append(k.f2329n0, 33);
        f2109e.append(k.U, 10);
        f2109e.append(k.T, 9);
        f2109e.append(k.E0, 13);
        f2109e.append(k.H0, 16);
        f2109e.append(k.F0, 14);
        f2109e.append(k.C0, 11);
        f2109e.append(k.G0, 15);
        f2109e.append(k.D0, 12);
        f2109e.append(k.f2379u0, 40);
        f2109e.append(k.f2265f0, 39);
        f2109e.append(k.f2257e0, 41);
        f2109e.append(k.f2372t0, 42);
        f2109e.append(k.f2249d0, 20);
        f2109e.append(k.f2365s0, 37);
        f2109e.append(k.S, 5);
        f2109e.append(k.f2273g0, 87);
        f2109e.append(k.f2344p0, 87);
        f2109e.append(k.f2297j0, 87);
        f2109e.append(k.M, 87);
        f2109e.append(k.I, 87);
        f2109e.append(k.f2272g, 24);
        f2109e.append(k.f2288i, 28);
        f2109e.append(k.f2378u, 31);
        f2109e.append(k.f2385v, 8);
        f2109e.append(k.f2280h, 34);
        f2109e.append(k.f2296j, 2);
        f2109e.append(k.f2256e, 23);
        f2109e.append(k.f2264f, 21);
        f2109e.append(k.f2386v0, 95);
        f2109e.append(k.Y, 96);
        f2109e.append(k.f2248d, 22);
        f2109e.append(k.f2304k, 43);
        f2109e.append(k.f2399x, 44);
        f2109e.append(k.f2364s, 45);
        f2109e.append(k.f2371t, 46);
        f2109e.append(k.f2357r, 60);
        f2109e.append(k.f2343p, 47);
        f2109e.append(k.f2350q, 48);
        f2109e.append(k.f2312l, 49);
        f2109e.append(k.f2320m, 50);
        f2109e.append(k.f2328n, 51);
        f2109e.append(k.f2336o, 52);
        f2109e.append(k.f2392w, 53);
        f2109e.append(k.f2393w0, 54);
        f2109e.append(k.Z, 55);
        f2109e.append(k.f2400x0, 56);
        f2109e.append(k.f2225a0, 57);
        f2109e.append(k.f2407y0, 58);
        f2109e.append(k.f2233b0, 59);
        f2109e.append(k.P, 61);
        f2109e.append(k.R, 62);
        f2109e.append(k.Q, 63);
        f2109e.append(k.f2406y, 64);
        f2109e.append(k.R0, 65);
        f2109e.append(k.E, 66);
        f2109e.append(k.S0, 67);
        f2109e.append(k.K0, 79);
        f2109e.append(k.f2240c, 38);
        f2109e.append(k.J0, 68);
        f2109e.append(k.f2414z0, 69);
        f2109e.append(k.f2241c0, 70);
        f2109e.append(k.I0, 97);
        f2109e.append(k.C, 71);
        f2109e.append(k.A, 72);
        f2109e.append(k.B, 73);
        f2109e.append(k.D, 74);
        f2109e.append(k.f2413z, 75);
        f2109e.append(k.L0, 76);
        f2109e.append(k.f2337o0, 77);
        f2109e.append(k.T0, 78);
        f2109e.append(k.H, 80);
        f2109e.append(k.G, 81);
        f2109e.append(k.M0, 82);
        f2109e.append(k.Q0, 83);
        f2109e.append(k.P0, 84);
        f2109e.append(k.O0, 85);
        f2109e.append(k.N0, 86);
        SparseIntArray sparseIntArray = f2110f;
        int i10 = k.f2396w3;
        sparseIntArray.append(i10, 6);
        f2110f.append(i10, 7);
        f2110f.append(k.f2360r2, 27);
        f2110f.append(k.f2417z3, 13);
        f2110f.append(k.C3, 16);
        f2110f.append(k.A3, 14);
        f2110f.append(k.f2403x3, 11);
        f2110f.append(k.B3, 15);
        f2110f.append(k.f2410y3, 12);
        f2110f.append(k.f2354q3, 40);
        f2110f.append(k.f2300j3, 39);
        f2110f.append(k.f2292i3, 41);
        f2110f.append(k.f2347p3, 42);
        f2110f.append(k.f2284h3, 20);
        f2110f.append(k.f2340o3, 37);
        f2110f.append(k.f2236b3, 5);
        f2110f.append(k.f2308k3, 87);
        f2110f.append(k.f2332n3, 87);
        f2110f.append(k.f2316l3, 87);
        f2110f.append(k.Y2, 87);
        f2110f.append(k.X2, 87);
        f2110f.append(k.f2395w2, 24);
        f2110f.append(k.f2409y2, 28);
        f2110f.append(k.K2, 31);
        f2110f.append(k.L2, 8);
        f2110f.append(k.f2402x2, 34);
        f2110f.append(k.f2416z2, 2);
        f2110f.append(k.f2381u2, 23);
        f2110f.append(k.f2388v2, 21);
        f2110f.append(k.f2361r3, 95);
        f2110f.append(k.f2244c3, 96);
        f2110f.append(k.f2374t2, 22);
        f2110f.append(k.A2, 43);
        f2110f.append(k.N2, 44);
        f2110f.append(k.I2, 45);
        f2110f.append(k.J2, 46);
        f2110f.append(k.H2, 60);
        f2110f.append(k.F2, 47);
        f2110f.append(k.G2, 48);
        f2110f.append(k.B2, 49);
        f2110f.append(k.C2, 50);
        f2110f.append(k.D2, 51);
        f2110f.append(k.E2, 52);
        f2110f.append(k.M2, 53);
        f2110f.append(k.f2368s3, 54);
        f2110f.append(k.f2252d3, 55);
        f2110f.append(k.f2375t3, 56);
        f2110f.append(k.f2260e3, 57);
        f2110f.append(k.f2382u3, 58);
        f2110f.append(k.f2268f3, 59);
        f2110f.append(k.f2228a3, 62);
        f2110f.append(k.Z2, 63);
        f2110f.append(k.O2, 64);
        f2110f.append(k.N3, 65);
        f2110f.append(k.U2, 66);
        f2110f.append(k.O3, 67);
        f2110f.append(k.F3, 79);
        f2110f.append(k.f2367s2, 38);
        f2110f.append(k.G3, 98);
        f2110f.append(k.E3, 68);
        f2110f.append(k.f2389v3, 69);
        f2110f.append(k.f2276g3, 70);
        f2110f.append(k.S2, 71);
        f2110f.append(k.Q2, 72);
        f2110f.append(k.R2, 73);
        f2110f.append(k.T2, 74);
        f2110f.append(k.P2, 75);
        f2110f.append(k.H3, 76);
        f2110f.append(k.f2324m3, 77);
        f2110f.append(k.P3, 78);
        f2110f.append(k.W2, 80);
        f2110f.append(k.V2, 81);
        f2110f.append(k.I3, 82);
        f2110f.append(k.M3, 83);
        f2110f.append(k.L3, 84);
        f2110f.append(k.K3, 85);
        f2110f.append(k.J3, 86);
        f2110f.append(k.D3, 97);
    }

    private int[] h(View view, String str) {
        int i10;
        Object f10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = j.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (f10 = ((ConstraintLayout) view.getParent()).f(0, trim)) != null && (f10 instanceof Integer)) {
                i10 = ((Integer) f10).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        return i12 != split.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    private a i(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? k.f2353q2 : k.f2224a);
        p(context, aVar, obtainStyledAttributes, z10);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(Object obj, TypedArray typedArray, int i10, int i11) {
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        if (i12 != 3) {
            int i13 = -2;
            boolean z10 = false;
            if (i12 != 5) {
                int i14 = typedArray.getInt(i10, 0);
                if (i14 != -4) {
                    i13 = (i14 == -3 || !(i14 == -2 || i14 == -1)) ? 0 : i14;
                } else {
                    z10 = true;
                }
            } else {
                i13 = typedArray.getDimensionPixelSize(i10, 0);
            }
            if (obj instanceof ConstraintLayout.b) {
                ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar).width = i13;
                    bVar.W = z10;
                    return;
                }
                ((ViewGroup.MarginLayoutParams) bVar).height = i13;
                bVar.X = z10;
                return;
            } else if (obj instanceof b) {
                b bVar2 = (b) obj;
                if (i11 == 0) {
                    bVar2.f2138c = i13;
                    bVar2.f2159m0 = z10;
                    return;
                }
                bVar2.f2140d = i13;
                bVar2.f2161n0 = z10;
                return;
            } else if (obj instanceof a.C0044a) {
                a.C0044a c0044a = (a.C0044a) obj;
                if (i11 == 0) {
                    c0044a.b(23, i13);
                    c0044a.d(80, z10);
                    return;
                }
                c0044a.b(21, i13);
                c0044a.d(81, z10);
                return;
            } else {
                return;
            }
        }
        n(obj, typedArray.getString(i10), i11);
    }

    static void n(Object obj, String str, int i10) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if ("ratio".equalsIgnoreCase(trim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    o(bVar, trim2);
                    return;
                } else if (obj instanceof b) {
                    ((b) obj).f2175z = trim2;
                    return;
                } else if (obj instanceof a.C0044a) {
                    ((a.C0044a) obj).c(5, trim2);
                    return;
                } else {
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.H = parseFloat;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.I = parseFloat;
                        }
                    } else if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i10 == 0) {
                            bVar3.f2138c = 0;
                            bVar3.V = parseFloat;
                        } else {
                            bVar3.f2140d = 0;
                            bVar3.U = parseFloat;
                        }
                    } else if (obj instanceof a.C0044a) {
                        a.C0044a c0044a = (a.C0044a) obj;
                        if (i10 == 0) {
                            c0044a.b(23, 0);
                            c0044a.a(39, parseFloat);
                        } else {
                            c0044a.b(21, 0);
                            c0044a.a(40, parseFloat);
                        }
                    }
                } else if (!"parent".equalsIgnoreCase(trim)) {
                } else {
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.R = max;
                            bVar4.L = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.S = max;
                            bVar4.M = 2;
                        }
                    } else if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i10 == 0) {
                            bVar5.f2138c = 0;
                            bVar5.f2143e0 = max;
                            bVar5.Y = 2;
                        } else {
                            bVar5.f2140d = 0;
                            bVar5.f2145f0 = max;
                            bVar5.Z = 2;
                        }
                    } else if (obj instanceof a.C0044a) {
                        a.C0044a c0044a2 = (a.C0044a) obj;
                        if (i10 == 0) {
                            c0044a2.b(23, 0);
                            c0044a2.b(54, 2);
                        } else {
                            c0044a2.b(21, 0);
                            c0044a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(ConstraintLayout.b bVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i10 = 0;
            int i11 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i10 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i11 = i10;
                i10 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i10, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i11 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i10);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.G = str;
    }

    private void p(Context context, a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            q(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != k.f2240c && k.f2378u != index && k.f2385v != index) {
                aVar.f2116c.f2177a = true;
                aVar.f2117d.f2136b = true;
                aVar.f2115b.f2191a = true;
                aVar.f2118e.f2197a = true;
            }
            switch (f2109e.get(index)) {
                case 1:
                    b bVar = aVar.f2117d;
                    bVar.f2166q = l(typedArray, index, bVar.f2166q);
                    break;
                case 2:
                    b bVar2 = aVar.f2117d;
                    bVar2.J = typedArray.getDimensionPixelSize(index, bVar2.J);
                    break;
                case 3:
                    b bVar3 = aVar.f2117d;
                    bVar3.f2164p = l(typedArray, index, bVar3.f2164p);
                    break;
                case 4:
                    b bVar4 = aVar.f2117d;
                    bVar4.f2162o = l(typedArray, index, bVar4.f2162o);
                    break;
                case 5:
                    aVar.f2117d.f2175z = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f2117d;
                    bVar5.D = typedArray.getDimensionPixelOffset(index, bVar5.D);
                    break;
                case 7:
                    b bVar6 = aVar.f2117d;
                    bVar6.E = typedArray.getDimensionPixelOffset(index, bVar6.E);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar7 = aVar.f2117d;
                        bVar7.K = typedArray.getDimensionPixelSize(index, bVar7.K);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    b bVar8 = aVar.f2117d;
                    bVar8.f2172w = l(typedArray, index, bVar8.f2172w);
                    break;
                case 10:
                    b bVar9 = aVar.f2117d;
                    bVar9.f2171v = l(typedArray, index, bVar9.f2171v);
                    break;
                case 11:
                    b bVar10 = aVar.f2117d;
                    bVar10.Q = typedArray.getDimensionPixelSize(index, bVar10.Q);
                    break;
                case 12:
                    b bVar11 = aVar.f2117d;
                    bVar11.R = typedArray.getDimensionPixelSize(index, bVar11.R);
                    break;
                case 13:
                    b bVar12 = aVar.f2117d;
                    bVar12.N = typedArray.getDimensionPixelSize(index, bVar12.N);
                    break;
                case 14:
                    b bVar13 = aVar.f2117d;
                    bVar13.P = typedArray.getDimensionPixelSize(index, bVar13.P);
                    break;
                case 15:
                    b bVar14 = aVar.f2117d;
                    bVar14.S = typedArray.getDimensionPixelSize(index, bVar14.S);
                    break;
                case 16:
                    b bVar15 = aVar.f2117d;
                    bVar15.O = typedArray.getDimensionPixelSize(index, bVar15.O);
                    break;
                case 17:
                    b bVar16 = aVar.f2117d;
                    bVar16.f2142e = typedArray.getDimensionPixelOffset(index, bVar16.f2142e);
                    break;
                case 18:
                    b bVar17 = aVar.f2117d;
                    bVar17.f2144f = typedArray.getDimensionPixelOffset(index, bVar17.f2144f);
                    break;
                case 19:
                    b bVar18 = aVar.f2117d;
                    bVar18.f2146g = typedArray.getFloat(index, bVar18.f2146g);
                    break;
                case 20:
                    b bVar19 = aVar.f2117d;
                    bVar19.f2173x = typedArray.getFloat(index, bVar19.f2173x);
                    break;
                case 21:
                    b bVar20 = aVar.f2117d;
                    bVar20.f2140d = typedArray.getLayoutDimension(index, bVar20.f2140d);
                    break;
                case 22:
                    d dVar = aVar.f2115b;
                    dVar.f2192b = typedArray.getInt(index, dVar.f2192b);
                    d dVar2 = aVar.f2115b;
                    dVar2.f2192b = f2108d[dVar2.f2192b];
                    break;
                case 23:
                    b bVar21 = aVar.f2117d;
                    bVar21.f2138c = typedArray.getLayoutDimension(index, bVar21.f2138c);
                    break;
                case 24:
                    b bVar22 = aVar.f2117d;
                    bVar22.G = typedArray.getDimensionPixelSize(index, bVar22.G);
                    break;
                case 25:
                    b bVar23 = aVar.f2117d;
                    bVar23.f2150i = l(typedArray, index, bVar23.f2150i);
                    break;
                case 26:
                    b bVar24 = aVar.f2117d;
                    bVar24.f2152j = l(typedArray, index, bVar24.f2152j);
                    break;
                case 27:
                    b bVar25 = aVar.f2117d;
                    bVar25.F = typedArray.getInt(index, bVar25.F);
                    break;
                case 28:
                    b bVar26 = aVar.f2117d;
                    bVar26.H = typedArray.getDimensionPixelSize(index, bVar26.H);
                    break;
                case 29:
                    b bVar27 = aVar.f2117d;
                    bVar27.f2154k = l(typedArray, index, bVar27.f2154k);
                    break;
                case 30:
                    b bVar28 = aVar.f2117d;
                    bVar28.f2156l = l(typedArray, index, bVar28.f2156l);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar29 = aVar.f2117d;
                        bVar29.L = typedArray.getDimensionPixelSize(index, bVar29.L);
                        break;
                    } else {
                        break;
                    }
                case 32:
                    b bVar30 = aVar.f2117d;
                    bVar30.f2169t = l(typedArray, index, bVar30.f2169t);
                    break;
                case 33:
                    b bVar31 = aVar.f2117d;
                    bVar31.f2170u = l(typedArray, index, bVar31.f2170u);
                    break;
                case 34:
                    b bVar32 = aVar.f2117d;
                    bVar32.I = typedArray.getDimensionPixelSize(index, bVar32.I);
                    break;
                case 35:
                    b bVar33 = aVar.f2117d;
                    bVar33.f2160n = l(typedArray, index, bVar33.f2160n);
                    break;
                case 36:
                    b bVar34 = aVar.f2117d;
                    bVar34.f2158m = l(typedArray, index, bVar34.f2158m);
                    break;
                case 37:
                    b bVar35 = aVar.f2117d;
                    bVar35.f2174y = typedArray.getFloat(index, bVar35.f2174y);
                    break;
                case 38:
                    aVar.f2114a = typedArray.getResourceId(index, aVar.f2114a);
                    break;
                case 39:
                    b bVar36 = aVar.f2117d;
                    bVar36.V = typedArray.getFloat(index, bVar36.V);
                    break;
                case 40:
                    b bVar37 = aVar.f2117d;
                    bVar37.U = typedArray.getFloat(index, bVar37.U);
                    break;
                case 41:
                    b bVar38 = aVar.f2117d;
                    bVar38.W = typedArray.getInt(index, bVar38.W);
                    break;
                case 42:
                    b bVar39 = aVar.f2117d;
                    bVar39.X = typedArray.getInt(index, bVar39.X);
                    break;
                case 43:
                    d dVar3 = aVar.f2115b;
                    dVar3.f2194d = typedArray.getFloat(index, dVar3.f2194d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0045e c0045e = aVar.f2118e;
                        c0045e.f2209m = true;
                        c0045e.f2210n = typedArray.getDimension(index, c0045e.f2210n);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    C0045e c0045e2 = aVar.f2118e;
                    c0045e2.f2199c = typedArray.getFloat(index, c0045e2.f2199c);
                    break;
                case 46:
                    C0045e c0045e3 = aVar.f2118e;
                    c0045e3.f2200d = typedArray.getFloat(index, c0045e3.f2200d);
                    break;
                case 47:
                    C0045e c0045e4 = aVar.f2118e;
                    c0045e4.f2201e = typedArray.getFloat(index, c0045e4.f2201e);
                    break;
                case 48:
                    C0045e c0045e5 = aVar.f2118e;
                    c0045e5.f2202f = typedArray.getFloat(index, c0045e5.f2202f);
                    break;
                case 49:
                    C0045e c0045e6 = aVar.f2118e;
                    c0045e6.f2203g = typedArray.getDimension(index, c0045e6.f2203g);
                    break;
                case 50:
                    C0045e c0045e7 = aVar.f2118e;
                    c0045e7.f2204h = typedArray.getDimension(index, c0045e7.f2204h);
                    break;
                case 51:
                    C0045e c0045e8 = aVar.f2118e;
                    c0045e8.f2206j = typedArray.getDimension(index, c0045e8.f2206j);
                    break;
                case 52:
                    C0045e c0045e9 = aVar.f2118e;
                    c0045e9.f2207k = typedArray.getDimension(index, c0045e9.f2207k);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0045e c0045e10 = aVar.f2118e;
                        c0045e10.f2208l = typedArray.getDimension(index, c0045e10.f2208l);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    b bVar40 = aVar.f2117d;
                    bVar40.Y = typedArray.getInt(index, bVar40.Y);
                    break;
                case 55:
                    b bVar41 = aVar.f2117d;
                    bVar41.Z = typedArray.getInt(index, bVar41.Z);
                    break;
                case 56:
                    b bVar42 = aVar.f2117d;
                    bVar42.f2135a0 = typedArray.getDimensionPixelSize(index, bVar42.f2135a0);
                    break;
                case 57:
                    b bVar43 = aVar.f2117d;
                    bVar43.f2137b0 = typedArray.getDimensionPixelSize(index, bVar43.f2137b0);
                    break;
                case 58:
                    b bVar44 = aVar.f2117d;
                    bVar44.f2139c0 = typedArray.getDimensionPixelSize(index, bVar44.f2139c0);
                    break;
                case 59:
                    b bVar45 = aVar.f2117d;
                    bVar45.f2141d0 = typedArray.getDimensionPixelSize(index, bVar45.f2141d0);
                    break;
                case 60:
                    C0045e c0045e11 = aVar.f2118e;
                    c0045e11.f2198b = typedArray.getFloat(index, c0045e11.f2198b);
                    break;
                case 61:
                    b bVar46 = aVar.f2117d;
                    bVar46.A = l(typedArray, index, bVar46.A);
                    break;
                case 62:
                    b bVar47 = aVar.f2117d;
                    bVar47.B = typedArray.getDimensionPixelSize(index, bVar47.B);
                    break;
                case 63:
                    b bVar48 = aVar.f2117d;
                    bVar48.C = typedArray.getFloat(index, bVar48.C);
                    break;
                case 64:
                    c cVar = aVar.f2116c;
                    cVar.f2178b = l(typedArray, index, cVar.f2178b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f2116c.f2180d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f2116c.f2180d = q.b.f35730c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f2116c.f2182f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f2116c;
                    cVar2.f2185i = typedArray.getFloat(index, cVar2.f2185i);
                    break;
                case 68:
                    d dVar4 = aVar.f2115b;
                    dVar4.f2195e = typedArray.getFloat(index, dVar4.f2195e);
                    break;
                case 69:
                    aVar.f2117d.f2143e0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f2117d.f2145f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f2117d;
                    bVar49.f2147g0 = typedArray.getInt(index, bVar49.f2147g0);
                    break;
                case 73:
                    b bVar50 = aVar.f2117d;
                    bVar50.f2149h0 = typedArray.getDimensionPixelSize(index, bVar50.f2149h0);
                    break;
                case 74:
                    aVar.f2117d.f2155k0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f2117d;
                    bVar51.f2163o0 = typedArray.getBoolean(index, bVar51.f2163o0);
                    break;
                case 76:
                    c cVar3 = aVar.f2116c;
                    cVar3.f2181e = typedArray.getInt(index, cVar3.f2181e);
                    break;
                case 77:
                    aVar.f2117d.f2157l0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f2115b;
                    dVar5.f2193c = typedArray.getInt(index, dVar5.f2193c);
                    break;
                case 79:
                    c cVar4 = aVar.f2116c;
                    cVar4.f2183g = typedArray.getFloat(index, cVar4.f2183g);
                    break;
                case 80:
                    b bVar52 = aVar.f2117d;
                    bVar52.f2159m0 = typedArray.getBoolean(index, bVar52.f2159m0);
                    break;
                case 81:
                    b bVar53 = aVar.f2117d;
                    bVar53.f2161n0 = typedArray.getBoolean(index, bVar53.f2161n0);
                    break;
                case 82:
                    c cVar5 = aVar.f2116c;
                    cVar5.f2179c = typedArray.getInteger(index, cVar5.f2179c);
                    break;
                case 83:
                    C0045e c0045e12 = aVar.f2118e;
                    c0045e12.f2205i = l(typedArray, index, c0045e12.f2205i);
                    break;
                case 84:
                    c cVar6 = aVar.f2116c;
                    cVar6.f2187k = typedArray.getInteger(index, cVar6.f2187k);
                    break;
                case 85:
                    c cVar7 = aVar.f2116c;
                    cVar7.f2186j = typedArray.getFloat(index, cVar7.f2186j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f2116c.f2190n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f2116c;
                        if (cVar8.f2190n != -1) {
                            cVar8.f2189m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i11 == 3) {
                        aVar.f2116c.f2188l = typedArray.getString(index);
                        if (aVar.f2116c.f2188l.indexOf("/") > 0) {
                            aVar.f2116c.f2190n = typedArray.getResourceId(index, -1);
                            aVar.f2116c.f2189m = -2;
                            break;
                        } else {
                            aVar.f2116c.f2189m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.f2116c;
                        cVar9.f2189m = typedArray.getInteger(index, cVar9.f2190n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2109e.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2109e.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f2117d;
                    bVar54.f2167r = l(typedArray, index, bVar54.f2167r);
                    break;
                case 92:
                    b bVar55 = aVar.f2117d;
                    bVar55.f2168s = l(typedArray, index, bVar55.f2168s);
                    break;
                case 93:
                    b bVar56 = aVar.f2117d;
                    bVar56.M = typedArray.getDimensionPixelSize(index, bVar56.M);
                    break;
                case 94:
                    b bVar57 = aVar.f2117d;
                    bVar57.T = typedArray.getDimensionPixelSize(index, bVar57.T);
                    break;
                case 95:
                    m(aVar.f2117d, typedArray, index, 0);
                    break;
                case 96:
                    m(aVar.f2117d, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f2117d;
                    bVar58.f2165p0 = typedArray.getInt(index, bVar58.f2165p0);
                    break;
            }
        }
        b bVar59 = aVar.f2117d;
        if (bVar59.f2155k0 != null) {
            bVar59.f2153j0 = null;
        }
    }

    private static void q(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0044a c0044a = new a.C0044a();
        aVar.f2120g = c0044a;
        aVar.f2116c.f2177a = false;
        aVar.f2117d.f2136b = false;
        aVar.f2115b.f2191a = false;
        aVar.f2118e.f2197a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f2110f.get(index)) {
                case 2:
                    c0044a.b(2, typedArray.getDimensionPixelSize(index, aVar.f2117d.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2109e.get(index));
                    break;
                case 5:
                    c0044a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0044a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f2117d.D));
                    break;
                case 7:
                    c0044a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f2117d.E));
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        c0044a.b(8, typedArray.getDimensionPixelSize(index, aVar.f2117d.K));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    c0044a.b(11, typedArray.getDimensionPixelSize(index, aVar.f2117d.Q));
                    break;
                case 12:
                    c0044a.b(12, typedArray.getDimensionPixelSize(index, aVar.f2117d.R));
                    break;
                case 13:
                    c0044a.b(13, typedArray.getDimensionPixelSize(index, aVar.f2117d.N));
                    break;
                case 14:
                    c0044a.b(14, typedArray.getDimensionPixelSize(index, aVar.f2117d.P));
                    break;
                case 15:
                    c0044a.b(15, typedArray.getDimensionPixelSize(index, aVar.f2117d.S));
                    break;
                case 16:
                    c0044a.b(16, typedArray.getDimensionPixelSize(index, aVar.f2117d.O));
                    break;
                case 17:
                    c0044a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f2117d.f2142e));
                    break;
                case 18:
                    c0044a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f2117d.f2144f));
                    break;
                case 19:
                    c0044a.a(19, typedArray.getFloat(index, aVar.f2117d.f2146g));
                    break;
                case 20:
                    c0044a.a(20, typedArray.getFloat(index, aVar.f2117d.f2173x));
                    break;
                case 21:
                    c0044a.b(21, typedArray.getLayoutDimension(index, aVar.f2117d.f2140d));
                    break;
                case 22:
                    c0044a.b(22, f2108d[typedArray.getInt(index, aVar.f2115b.f2192b)]);
                    break;
                case 23:
                    c0044a.b(23, typedArray.getLayoutDimension(index, aVar.f2117d.f2138c));
                    break;
                case 24:
                    c0044a.b(24, typedArray.getDimensionPixelSize(index, aVar.f2117d.G));
                    break;
                case 27:
                    c0044a.b(27, typedArray.getInt(index, aVar.f2117d.F));
                    break;
                case 28:
                    c0044a.b(28, typedArray.getDimensionPixelSize(index, aVar.f2117d.H));
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        c0044a.b(31, typedArray.getDimensionPixelSize(index, aVar.f2117d.L));
                        break;
                    } else {
                        break;
                    }
                case 34:
                    c0044a.b(34, typedArray.getDimensionPixelSize(index, aVar.f2117d.I));
                    break;
                case 37:
                    c0044a.a(37, typedArray.getFloat(index, aVar.f2117d.f2174y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f2114a);
                    aVar.f2114a = resourceId;
                    c0044a.b(38, resourceId);
                    break;
                case 39:
                    c0044a.a(39, typedArray.getFloat(index, aVar.f2117d.V));
                    break;
                case 40:
                    c0044a.a(40, typedArray.getFloat(index, aVar.f2117d.U));
                    break;
                case 41:
                    c0044a.b(41, typedArray.getInt(index, aVar.f2117d.W));
                    break;
                case 42:
                    c0044a.b(42, typedArray.getInt(index, aVar.f2117d.X));
                    break;
                case 43:
                    c0044a.a(43, typedArray.getFloat(index, aVar.f2115b.f2194d));
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        c0044a.d(44, true);
                        c0044a.a(44, typedArray.getDimension(index, aVar.f2118e.f2210n));
                        break;
                    } else {
                        break;
                    }
                case 45:
                    c0044a.a(45, typedArray.getFloat(index, aVar.f2118e.f2199c));
                    break;
                case 46:
                    c0044a.a(46, typedArray.getFloat(index, aVar.f2118e.f2200d));
                    break;
                case 47:
                    c0044a.a(47, typedArray.getFloat(index, aVar.f2118e.f2201e));
                    break;
                case 48:
                    c0044a.a(48, typedArray.getFloat(index, aVar.f2118e.f2202f));
                    break;
                case 49:
                    c0044a.a(49, typedArray.getDimension(index, aVar.f2118e.f2203g));
                    break;
                case 50:
                    c0044a.a(50, typedArray.getDimension(index, aVar.f2118e.f2204h));
                    break;
                case 51:
                    c0044a.a(51, typedArray.getDimension(index, aVar.f2118e.f2206j));
                    break;
                case 52:
                    c0044a.a(52, typedArray.getDimension(index, aVar.f2118e.f2207k));
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        c0044a.a(53, typedArray.getDimension(index, aVar.f2118e.f2208l));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    c0044a.b(54, typedArray.getInt(index, aVar.f2117d.Y));
                    break;
                case 55:
                    c0044a.b(55, typedArray.getInt(index, aVar.f2117d.Z));
                    break;
                case 56:
                    c0044a.b(56, typedArray.getDimensionPixelSize(index, aVar.f2117d.f2135a0));
                    break;
                case 57:
                    c0044a.b(57, typedArray.getDimensionPixelSize(index, aVar.f2117d.f2137b0));
                    break;
                case 58:
                    c0044a.b(58, typedArray.getDimensionPixelSize(index, aVar.f2117d.f2139c0));
                    break;
                case 59:
                    c0044a.b(59, typedArray.getDimensionPixelSize(index, aVar.f2117d.f2141d0));
                    break;
                case 60:
                    c0044a.a(60, typedArray.getFloat(index, aVar.f2118e.f2198b));
                    break;
                case 62:
                    c0044a.b(62, typedArray.getDimensionPixelSize(index, aVar.f2117d.B));
                    break;
                case 63:
                    c0044a.a(63, typedArray.getFloat(index, aVar.f2117d.C));
                    break;
                case 64:
                    c0044a.b(64, l(typedArray, index, aVar.f2116c.f2178b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0044a.c(65, typedArray.getString(index));
                        break;
                    } else {
                        c0044a.c(65, q.b.f35730c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0044a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0044a.a(67, typedArray.getFloat(index, aVar.f2116c.f2185i));
                    break;
                case 68:
                    c0044a.a(68, typedArray.getFloat(index, aVar.f2115b.f2195e));
                    break;
                case 69:
                    c0044a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0044a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0044a.b(72, typedArray.getInt(index, aVar.f2117d.f2147g0));
                    break;
                case 73:
                    c0044a.b(73, typedArray.getDimensionPixelSize(index, aVar.f2117d.f2149h0));
                    break;
                case 74:
                    c0044a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0044a.d(75, typedArray.getBoolean(index, aVar.f2117d.f2163o0));
                    break;
                case 76:
                    c0044a.b(76, typedArray.getInt(index, aVar.f2116c.f2181e));
                    break;
                case 77:
                    c0044a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0044a.b(78, typedArray.getInt(index, aVar.f2115b.f2193c));
                    break;
                case 79:
                    c0044a.a(79, typedArray.getFloat(index, aVar.f2116c.f2183g));
                    break;
                case 80:
                    c0044a.d(80, typedArray.getBoolean(index, aVar.f2117d.f2159m0));
                    break;
                case 81:
                    c0044a.d(81, typedArray.getBoolean(index, aVar.f2117d.f2161n0));
                    break;
                case 82:
                    c0044a.b(82, typedArray.getInteger(index, aVar.f2116c.f2179c));
                    break;
                case 83:
                    c0044a.b(83, l(typedArray, index, aVar.f2118e.f2205i));
                    break;
                case 84:
                    c0044a.b(84, typedArray.getInteger(index, aVar.f2116c.f2187k));
                    break;
                case 85:
                    c0044a.a(85, typedArray.getFloat(index, aVar.f2116c.f2186j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f2116c.f2190n = typedArray.getResourceId(index, -1);
                        c0044a.b(89, aVar.f2116c.f2190n);
                        c cVar = aVar.f2116c;
                        if (cVar.f2190n != -1) {
                            cVar.f2189m = -2;
                            c0044a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i11 == 3) {
                        aVar.f2116c.f2188l = typedArray.getString(index);
                        c0044a.c(90, aVar.f2116c.f2188l);
                        if (aVar.f2116c.f2188l.indexOf("/") > 0) {
                            aVar.f2116c.f2190n = typedArray.getResourceId(index, -1);
                            c0044a.b(89, aVar.f2116c.f2190n);
                            aVar.f2116c.f2189m = -2;
                            c0044a.b(88, -2);
                            break;
                        } else {
                            aVar.f2116c.f2189m = -1;
                            c0044a.b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.f2116c;
                        cVar2.f2189m = typedArray.getInteger(index, cVar2.f2190n);
                        c0044a.b(88, aVar.f2116c.f2189m);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2109e.get(index));
                    break;
                case 93:
                    c0044a.b(93, typedArray.getDimensionPixelSize(index, aVar.f2117d.M));
                    break;
                case 94:
                    c0044a.b(94, typedArray.getDimensionPixelSize(index, aVar.f2117d.T));
                    break;
                case 95:
                    m(c0044a, typedArray, index, 0);
                    break;
                case 96:
                    m(c0044a, typedArray, index, 1);
                    break;
                case 97:
                    c0044a.b(97, typedArray.getInt(index, aVar.f2117d.f2165p0));
                    break;
                case 98:
                    if (androidx.constraintlayout.motion.widget.j.f1935x0) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f2114a);
                        aVar.f2114a = resourceId2;
                        if (resourceId2 == -1) {
                            typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        typedArray.getString(index);
                        break;
                    } else {
                        aVar.f2114a = typedArray.getResourceId(index, aVar.f2114a);
                        break;
                    }
                case 99:
                    c0044a.d(99, typedArray.getBoolean(index, aVar.f2117d.f2148h));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2113c.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f2113c.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.b(childAt));
            } else if (this.f2112b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id2 != -1) {
                    if (this.f2113c.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f2113c.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof androidx.constraintlayout.widget.a) {
                                aVar.f2117d.f2151i0 = 1;
                                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                                aVar2.setId(id2);
                                aVar2.setType(aVar.f2117d.f2147g0);
                                aVar2.setMargin(aVar.f2117d.f2149h0);
                                aVar2.setAllowsGoneWidget(aVar.f2117d.f2163o0);
                                b bVar = aVar.f2117d;
                                int[] iArr = bVar.f2153j0;
                                if (iArr != null) {
                                    aVar2.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f2155k0;
                                    if (str != null) {
                                        bVar.f2153j0 = h(aVar2, str);
                                        aVar2.setReferencedIds(aVar.f2117d.f2153j0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.d(bVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.b.e(childAt, aVar.f2119f);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f2115b;
                            if (dVar.f2193c == 0) {
                                childAt.setVisibility(dVar.f2192b);
                            }
                            int i11 = Build.VERSION.SDK_INT;
                            if (i11 >= 17) {
                                childAt.setAlpha(aVar.f2115b.f2194d);
                                childAt.setRotation(aVar.f2118e.f2198b);
                                childAt.setRotationX(aVar.f2118e.f2199c);
                                childAt.setRotationY(aVar.f2118e.f2200d);
                                childAt.setScaleX(aVar.f2118e.f2201e);
                                childAt.setScaleY(aVar.f2118e.f2202f);
                                C0045e c0045e = aVar.f2118e;
                                if (c0045e.f2205i != -1) {
                                    View findViewById = ((View) childAt.getParent()).findViewById(aVar.f2118e.f2205i);
                                    if (findViewById != null) {
                                        float top = (findViewById.getTop() + findViewById.getBottom()) / 2.0f;
                                        float left = (findViewById.getLeft() + findViewById.getRight()) / 2.0f;
                                        if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                            childAt.setPivotX(left - childAt.getLeft());
                                            childAt.setPivotY(top - childAt.getTop());
                                        }
                                    }
                                } else {
                                    if (!Float.isNaN(c0045e.f2203g)) {
                                        childAt.setPivotX(aVar.f2118e.f2203g);
                                    }
                                    if (!Float.isNaN(aVar.f2118e.f2204h)) {
                                        childAt.setPivotY(aVar.f2118e.f2204h);
                                    }
                                }
                                childAt.setTranslationX(aVar.f2118e.f2206j);
                                childAt.setTranslationY(aVar.f2118e.f2207k);
                                if (i11 >= 21) {
                                    childAt.setTranslationZ(aVar.f2118e.f2208l);
                                    C0045e c0045e2 = aVar.f2118e;
                                    if (c0045e2.f2209m) {
                                        childAt.setElevation(c0045e2.f2210n);
                                    }
                                }
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f2113c.get(num);
            if (aVar3 != null) {
                if (aVar3.f2117d.f2151i0 == 1) {
                    androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.f2117d;
                    int[] iArr2 = bVar3.f2153j0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f2155k0;
                        if (str2 != null) {
                            bVar3.f2153j0 = h(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.f2117d.f2153j0);
                        }
                    }
                    aVar4.setType(aVar3.f2117d.f2147g0);
                    aVar4.setMargin(aVar3.f2117d.f2149h0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    aVar4.s();
                    aVar3.d(generateDefaultLayoutParams);
                    constraintLayout.addView(aVar4, generateDefaultLayoutParams);
                }
                if (aVar3.f2117d.f2134a) {
                    View hVar = new h(constraintLayout.getContext());
                    hVar.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.d(generateDefaultLayoutParams2);
                    constraintLayout.addView(hVar, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof androidx.constraintlayout.widget.c) {
                ((androidx.constraintlayout.widget.c) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(Context context, int i10) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2113c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f2112b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2113c.containsKey(Integer.valueOf(id2))) {
                this.f2113c.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f2113c.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f2119f = androidx.constraintlayout.widget.b.a(this.f2111a, childAt);
                aVar.f(id2, bVar);
                aVar.f2115b.f2192b = childAt.getVisibility();
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 17) {
                    aVar.f2115b.f2194d = childAt.getAlpha();
                    aVar.f2118e.f2198b = childAt.getRotation();
                    aVar.f2118e.f2199c = childAt.getRotationX();
                    aVar.f2118e.f2200d = childAt.getRotationY();
                    aVar.f2118e.f2201e = childAt.getScaleX();
                    aVar.f2118e.f2202f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        C0045e c0045e = aVar.f2118e;
                        c0045e.f2203g = pivotX;
                        c0045e.f2204h = pivotY;
                    }
                    aVar.f2118e.f2206j = childAt.getTranslationX();
                    aVar.f2118e.f2207k = childAt.getTranslationY();
                    if (i11 >= 21) {
                        aVar.f2118e.f2208l = childAt.getTranslationZ();
                        C0045e c0045e2 = aVar.f2118e;
                        if (c0045e2.f2209m) {
                            c0045e2.f2210n = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                    aVar.f2117d.f2163o0 = aVar2.getAllowsGoneWidget();
                    aVar.f2117d.f2153j0 = aVar2.getReferencedIds();
                    aVar.f2117d.f2147g0 = aVar2.getType();
                    aVar.f2117d.f2149h0 = aVar2.getMargin();
                }
            }
        }
    }

    public void g(f fVar) {
        int childCount = fVar.getChildCount();
        this.f2113c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = fVar.getChildAt(i10);
            f.a aVar = (f.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f2112b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2113c.containsKey(Integer.valueOf(id2))) {
                this.f2113c.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f2113c.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.c) {
                    aVar2.h((androidx.constraintlayout.widget.c) childAt, id2, aVar);
                }
                aVar2.g(id2, aVar);
            }
        }
    }

    public void j(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    a i11 = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        i11.f2117d.f2134a = true;
                    }
                    this.f2113c.put(Integer.valueOf(i11.f2114a), i11);
                    continue;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.k(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
