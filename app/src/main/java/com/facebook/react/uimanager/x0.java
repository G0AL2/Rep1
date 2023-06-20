package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.r0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: UIViewOperationQueue.java */
/* loaded from: classes.dex */
public class x0 {
    private static final String A = "x0";

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.react.uimanager.n f15981b;

    /* renamed from: e  reason: collision with root package name */
    private final j f15984e;

    /* renamed from: f  reason: collision with root package name */
    private final ReactApplicationContext f15985f;

    /* renamed from: k  reason: collision with root package name */
    private y6.a f15990k;

    /* renamed from: o  reason: collision with root package name */
    private long f15994o;

    /* renamed from: p  reason: collision with root package name */
    private long f15995p;

    /* renamed from: q  reason: collision with root package name */
    private long f15996q;

    /* renamed from: r  reason: collision with root package name */
    private long f15997r;

    /* renamed from: s  reason: collision with root package name */
    private long f15998s;

    /* renamed from: t  reason: collision with root package name */
    private long f15999t;

    /* renamed from: u  reason: collision with root package name */
    private long f16000u;

    /* renamed from: v  reason: collision with root package name */
    private long f16001v;

    /* renamed from: w  reason: collision with root package name */
    private long f16002w;

    /* renamed from: x  reason: collision with root package name */
    private long f16003x;

    /* renamed from: y  reason: collision with root package name */
    private long f16004y;

    /* renamed from: z  reason: collision with root package name */
    private long f16005z;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f15980a = new int[4];

    /* renamed from: c  reason: collision with root package name */
    private final Object f15982c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Object f15983d = new Object();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<h> f15986g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<u> f15987h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<Runnable> f15988i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private ArrayDeque<u> f15989j = new ArrayDeque<>();

    /* renamed from: l  reason: collision with root package name */
    private boolean f15991l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f15992m = false;

    /* renamed from: n  reason: collision with root package name */
    private boolean f15993n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f16006a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f16007b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayDeque f16008c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f16009d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f16010e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f16011f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f16012g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f16013h;

        a(int i10, ArrayList arrayList, ArrayDeque arrayDeque, ArrayList arrayList2, long j10, long j11, long j12, long j13) {
            this.f16006a = i10;
            this.f16007b = arrayList;
            this.f16008c = arrayDeque;
            this.f16009d = arrayList2;
            this.f16010e = j10;
            this.f16011f = j11;
            this.f16012g = j12;
            this.f16013h = j13;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.facebook.systrace.b.a(0L, "DispatchUI").a("BatchId", this.f16006a).c();
            try {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    ArrayList arrayList = this.f16007b;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            h hVar = (h) it.next();
                            try {
                                hVar.c();
                            } catch (RetryableMountingLayerException e10) {
                                if (hVar.a() == 0) {
                                    hVar.b();
                                    x0.this.f15986g.add(hVar);
                                } else {
                                    ReactSoftExceptionLogger.logSoftException(x0.A, new ReactNoCrashSoftException(e10));
                                }
                            } catch (Throwable th) {
                                ReactSoftExceptionLogger.logSoftException(x0.A, th);
                            }
                        }
                    }
                    ArrayDeque arrayDeque = this.f16008c;
                    if (arrayDeque != null) {
                        Iterator it2 = arrayDeque.iterator();
                        while (it2.hasNext()) {
                            ((u) it2.next()).h();
                        }
                    }
                    ArrayList arrayList2 = this.f16009d;
                    if (arrayList2 != null) {
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            ((u) it3.next()).h();
                        }
                    }
                    if (x0.this.f15993n && x0.this.f15995p == 0) {
                        x0.this.f15995p = this.f16010e;
                        x0.this.f15996q = SystemClock.uptimeMillis();
                        x0.this.f15997r = this.f16011f;
                        x0.this.f15998s = this.f16012g;
                        x0.this.f15999t = uptimeMillis;
                        x0 x0Var = x0.this;
                        x0Var.f16000u = x0Var.f15996q;
                        x0.this.f16003x = this.f16013h;
                        com.facebook.systrace.a.b(0L, "delayBeforeDispatchViewUpdates", 0, x0.this.f15995p * 1000000);
                        com.facebook.systrace.a.f(0L, "delayBeforeDispatchViewUpdates", 0, x0.this.f15998s * 1000000);
                        com.facebook.systrace.a.b(0L, "delayBeforeBatchRunStart", 0, x0.this.f15998s * 1000000);
                        com.facebook.systrace.a.f(0L, "delayBeforeBatchRunStart", 0, x0.this.f15999t * 1000000);
                    }
                    x0.this.f15981b.f();
                    if (x0.this.f15990k != null) {
                        x0.this.f15990k.a();
                    }
                } catch (Exception e11) {
                    x0.this.f15992m = true;
                    throw e11;
                }
            } finally {
                com.facebook.systrace.a.g(0L);
            }
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    class b extends GuardedRunnable {
        b(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            x0.this.T();
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class c extends y {

        /* renamed from: b  reason: collision with root package name */
        private final int f16016b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f16017c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f16018d;

        public c(int i10, int i11, boolean z10, boolean z11) {
            super(x0.this, i10);
            this.f16016b = i11;
            this.f16018d = z10;
            this.f16017c = z11;
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            if (!this.f16018d) {
                x0.this.f15981b.z(this.f16076a, this.f16016b, this.f16017c);
            } else {
                x0.this.f15981b.e();
            }
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private class d implements u {

        /* renamed from: a  reason: collision with root package name */
        private final ReadableMap f16020a;

        /* renamed from: b  reason: collision with root package name */
        private final Callback f16021b;

        /* synthetic */ d(x0 x0Var, ReadableMap readableMap, Callback callback, a aVar) {
            this(readableMap, callback);
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            x0.this.f15981b.h(this.f16020a, this.f16021b);
        }

        private d(ReadableMap readableMap, Callback callback) {
            this.f16020a = readableMap;
            this.f16021b = callback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    public final class e extends y {

        /* renamed from: b  reason: collision with root package name */
        private final n0 f16023b;

        /* renamed from: c  reason: collision with root package name */
        private final String f16024c;

        /* renamed from: d  reason: collision with root package name */
        private final f0 f16025d;

        public e(n0 n0Var, int i10, String str, f0 f0Var) {
            super(x0.this, i10);
            this.f16023b = n0Var;
            this.f16024c = str;
            this.f16025d = f0Var;
            com.facebook.systrace.a.j(0L, "createView", this.f16076a);
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            com.facebook.systrace.a.d(0L, "createView", this.f16076a);
            x0.this.f15981b.j(this.f16023b, this.f16076a, this.f16024c, this.f16025d);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class f implements u {
        private f() {
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            x0.this.f15981b.k();
        }

        /* synthetic */ f(x0 x0Var, a aVar) {
            this();
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    @Deprecated
    /* loaded from: classes.dex */
    private final class g extends y implements h {

        /* renamed from: b  reason: collision with root package name */
        private final int f16028b;

        /* renamed from: c  reason: collision with root package name */
        private final ReadableArray f16029c;

        /* renamed from: d  reason: collision with root package name */
        private int f16030d;

        public g(int i10, int i11, ReadableArray readableArray) {
            super(x0.this, i10);
            this.f16030d = 0;
            this.f16028b = i11;
            this.f16029c = readableArray;
        }

        @Override // com.facebook.react.uimanager.x0.h
        public int a() {
            return this.f16030d;
        }

        @Override // com.facebook.react.uimanager.x0.h
        public void b() {
            this.f16030d++;
        }

        @Override // com.facebook.react.uimanager.x0.h
        public void c() {
            x0.this.f15981b.l(this.f16076a, this.f16028b, this.f16029c);
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            try {
                x0.this.f15981b.l(this.f16076a, this.f16028b, this.f16029c);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(x0.A, new RuntimeException("Error dispatching View Command", th));
            }
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private interface h {
        int a();

        void b();

        void c();
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class i extends y implements h {

        /* renamed from: b  reason: collision with root package name */
        private final String f16032b;

        /* renamed from: c  reason: collision with root package name */
        private final ReadableArray f16033c;

        /* renamed from: d  reason: collision with root package name */
        private int f16034d;

        public i(int i10, String str, ReadableArray readableArray) {
            super(x0.this, i10);
            this.f16034d = 0;
            this.f16032b = str;
            this.f16033c = readableArray;
        }

        @Override // com.facebook.react.uimanager.x0.h
        public int a() {
            return this.f16034d;
        }

        @Override // com.facebook.react.uimanager.x0.h
        public void b() {
            this.f16034d++;
        }

        @Override // com.facebook.react.uimanager.x0.h
        public void c() {
            x0.this.f15981b.m(this.f16076a, this.f16032b, this.f16033c);
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            try {
                x0.this.f15981b.m(this.f16076a, this.f16032b, this.f16033c);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(x0.A, new RuntimeException("Error dispatching View Command", th));
            }
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private class j extends com.facebook.react.uimanager.f {

        /* renamed from: c  reason: collision with root package name */
        private final int f16036c;

        /* synthetic */ j(x0 x0Var, ReactContext reactContext, int i10, a aVar) {
            this(reactContext, i10);
        }

        private void d(long j10) {
            u uVar;
            while (16 - ((System.nanoTime() - j10) / 1000000) >= this.f16036c) {
                synchronized (x0.this.f15983d) {
                    if (x0.this.f15989j.isEmpty()) {
                        return;
                    }
                    uVar = (u) x0.this.f15989j.pollFirst();
                }
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    uVar.h();
                    x0.v(x0.this, SystemClock.uptimeMillis() - uptimeMillis);
                } catch (Exception e10) {
                    x0.this.f15992m = true;
                    throw e10;
                }
            }
        }

        @Override // com.facebook.react.uimanager.f
        public void c(long j10) {
            if (x0.this.f15992m) {
                z3.a.G("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            com.facebook.systrace.a.c(0L, "dispatchNonBatchedUIOperations");
            try {
                d(j10);
                com.facebook.systrace.a.g(0L);
                x0.this.T();
                com.facebook.react.modules.core.g.i().m(g.c.DISPATCH_UI, this);
            } catch (Throwable th) {
                com.facebook.systrace.a.g(0L);
                throw th;
            }
        }

        private j(ReactContext reactContext, int i10) {
            super(reactContext);
            this.f16036c = i10;
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class k implements u {

        /* renamed from: a  reason: collision with root package name */
        private final int f16038a;

        /* renamed from: b  reason: collision with root package name */
        private final float f16039b;

        /* renamed from: c  reason: collision with root package name */
        private final float f16040c;

        /* renamed from: d  reason: collision with root package name */
        private final Callback f16041d;

        /* synthetic */ k(x0 x0Var, int i10, float f10, float f11, Callback callback, a aVar) {
            this(i10, f10, f11, callback);
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            try {
                x0.this.f15981b.t(this.f16038a, x0.this.f15980a);
                float f10 = x0.this.f15980a[0];
                float f11 = x0.this.f15980a[1];
                int o10 = x0.this.f15981b.o(this.f16038a, this.f16039b, this.f16040c);
                try {
                    x0.this.f15981b.t(o10, x0.this.f15980a);
                    this.f16041d.invoke(Integer.valueOf(o10), Float.valueOf(com.facebook.react.uimanager.r.a(x0.this.f15980a[0] - f10)), Float.valueOf(com.facebook.react.uimanager.r.a(x0.this.f15980a[1] - f11)), Float.valueOf(com.facebook.react.uimanager.r.a(x0.this.f15980a[2])), Float.valueOf(com.facebook.react.uimanager.r.a(x0.this.f15980a[3])));
                } catch (com.facebook.react.uimanager.h unused) {
                    this.f16041d.invoke(new Object[0]);
                }
            } catch (com.facebook.react.uimanager.h unused2) {
                this.f16041d.invoke(new Object[0]);
            }
        }

        private k(int i10, float f10, float f11, Callback callback) {
            this.f16038a = i10;
            this.f16039b = f10;
            this.f16040c = f11;
            this.f16041d = callback;
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class l implements u {

        /* renamed from: a  reason: collision with root package name */
        private final d0 f16043a;

        /* renamed from: b  reason: collision with root package name */
        private final r0.b f16044b;

        /* synthetic */ l(x0 x0Var, d0 d0Var, r0.b bVar, a aVar) {
            this(x0Var, d0Var, bVar);
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            this.f16044b.a(this.f16043a);
        }

        private l(x0 x0Var, d0 d0Var, r0.b bVar) {
            this.f16043a = d0Var;
            this.f16044b = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    public final class m extends y {

        /* renamed from: b  reason: collision with root package name */
        private final int[] f16045b;

        /* renamed from: c  reason: collision with root package name */
        private final y0[] f16046c;

        /* renamed from: d  reason: collision with root package name */
        private final int[] f16047d;

        public m(int i10, int[] iArr, y0[] y0VarArr, int[] iArr2) {
            super(x0.this, i10);
            this.f16045b = iArr;
            this.f16046c = y0VarArr;
            this.f16047d = iArr2;
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            x0.this.f15981b.r(this.f16076a, this.f16045b, this.f16046c, this.f16047d);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class n implements u {

        /* renamed from: a  reason: collision with root package name */
        private final int f16049a;

        /* renamed from: b  reason: collision with root package name */
        private final Callback f16050b;

        /* synthetic */ n(x0 x0Var, int i10, Callback callback, a aVar) {
            this(i10, callback);
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            try {
                x0.this.f15981b.u(this.f16049a, x0.this.f15980a);
                this.f16050b.invoke(Float.valueOf(com.facebook.react.uimanager.r.a(x0.this.f15980a[0])), Float.valueOf(com.facebook.react.uimanager.r.a(x0.this.f15980a[1])), Float.valueOf(com.facebook.react.uimanager.r.a(x0.this.f15980a[2])), Float.valueOf(com.facebook.react.uimanager.r.a(x0.this.f15980a[3])));
            } catch (com.facebook.react.uimanager.p unused) {
                this.f16050b.invoke(new Object[0]);
            }
        }

        private n(int i10, Callback callback) {
            this.f16049a = i10;
            this.f16050b = callback;
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class o implements u {

        /* renamed from: a  reason: collision with root package name */
        private final int f16052a;

        /* renamed from: b  reason: collision with root package name */
        private final Callback f16053b;

        /* synthetic */ o(x0 x0Var, int i10, Callback callback, a aVar) {
            this(i10, callback);
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            try {
                x0.this.f15981b.t(this.f16052a, x0.this.f15980a);
                float a10 = com.facebook.react.uimanager.r.a(x0.this.f15980a[0]);
                float a11 = com.facebook.react.uimanager.r.a(x0.this.f15980a[1]);
                this.f16053b.invoke(0, 0, Float.valueOf(com.facebook.react.uimanager.r.a(x0.this.f15980a[2])), Float.valueOf(com.facebook.react.uimanager.r.a(x0.this.f15980a[3])), Float.valueOf(a10), Float.valueOf(a11));
            } catch (com.facebook.react.uimanager.p unused) {
                this.f16053b.invoke(new Object[0]);
            }
        }

        private o(int i10, Callback callback) {
            this.f16052a = i10;
            this.f16053b = callback;
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class p extends y {
        public p(int i10) {
            super(x0.this, i10);
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            x0.this.f15981b.v(this.f16076a);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class q extends y {

        /* renamed from: b  reason: collision with root package name */
        private final int f16056b;

        /* synthetic */ q(x0 x0Var, int i10, int i11, a aVar) {
            this(i10, i11);
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            x0.this.f15981b.y(this.f16076a, this.f16056b);
        }

        private q(int i10, int i11) {
            super(x0.this, i10);
            this.f16056b = i11;
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private class r implements u {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f16058a;

        /* synthetic */ r(x0 x0Var, boolean z10, a aVar) {
            this(z10);
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            x0.this.f15981b.A(this.f16058a);
        }

        private r(boolean z10) {
            this.f16058a = z10;
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class s extends y {

        /* renamed from: b  reason: collision with root package name */
        private final ReadableArray f16060b;

        /* renamed from: c  reason: collision with root package name */
        private final Callback f16061c;

        /* renamed from: d  reason: collision with root package name */
        private final Callback f16062d;

        public s(int i10, ReadableArray readableArray, Callback callback, Callback callback2) {
            super(x0.this, i10);
            this.f16060b = readableArray;
            this.f16061c = callback;
            this.f16062d = callback2;
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            x0.this.f15981b.B(this.f16076a, this.f16060b, this.f16062d, this.f16061c);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private class t implements u {

        /* renamed from: a  reason: collision with root package name */
        private final q0 f16064a;

        public t(q0 q0Var) {
            this.f16064a = q0Var;
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            this.f16064a.a(x0.this.f15981b);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    public interface u {
        void h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    public final class v extends y {

        /* renamed from: b  reason: collision with root package name */
        private final int f16066b;

        /* renamed from: c  reason: collision with root package name */
        private final int f16067c;

        /* renamed from: d  reason: collision with root package name */
        private final int f16068d;

        /* renamed from: e  reason: collision with root package name */
        private final int f16069e;

        /* renamed from: f  reason: collision with root package name */
        private final int f16070f;

        public v(int i10, int i11, int i12, int i13, int i14, int i15) {
            super(x0.this, i11);
            this.f16066b = i10;
            this.f16067c = i12;
            this.f16068d = i13;
            this.f16069e = i14;
            this.f16070f = i15;
            com.facebook.systrace.a.j(0L, "updateLayout", this.f16076a);
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            com.facebook.systrace.a.d(0L, "updateLayout", this.f16076a);
            x0.this.f15981b.C(this.f16066b, this.f16076a, this.f16067c, this.f16068d, this.f16069e, this.f16070f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    public final class w extends y {

        /* renamed from: b  reason: collision with root package name */
        private final f0 f16072b;

        /* synthetic */ w(x0 x0Var, int i10, f0 f0Var, a aVar) {
            this(i10, f0Var);
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            x0.this.f15981b.E(this.f16076a, this.f16072b);
        }

        private w(int i10, f0 f0Var) {
            super(x0.this, i10);
            this.f16072b = f0Var;
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class x extends y {

        /* renamed from: b  reason: collision with root package name */
        private final Object f16074b;

        public x(int i10, Object obj) {
            super(x0.this, i10);
            this.f16074b = obj;
        }

        @Override // com.facebook.react.uimanager.x0.u
        public void h() {
            x0.this.f15981b.F(this.f16076a, this.f16074b);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private abstract class y implements u {

        /* renamed from: a  reason: collision with root package name */
        public int f16076a;

        public y(x0 x0Var, int i10) {
            this.f16076a = i10;
        }
    }

    public x0(ReactApplicationContext reactApplicationContext, com.facebook.react.uimanager.n nVar, int i10) {
        this.f15981b = nVar;
        this.f15984e = new j(this, reactApplicationContext, i10 == -1 ? 8 : i10, null);
        this.f15985f = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.f15992m) {
            z3.a.G("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.f15982c) {
            if (this.f15988i.isEmpty()) {
                return;
            }
            ArrayList<Runnable> arrayList = this.f15988i;
            this.f15988i = new ArrayList<>();
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            if (this.f15993n) {
                this.f16001v = SystemClock.uptimeMillis() - uptimeMillis;
                this.f16002w = this.f15994o;
                this.f15993n = false;
                com.facebook.systrace.a.b(0L, "batchedExecutionTime", 0, 1000000 * uptimeMillis);
                com.facebook.systrace.a.e(0L, "batchedExecutionTime", 0);
            }
            this.f15994o = 0L;
        }
    }

    static /* synthetic */ long v(x0 x0Var, long j10) {
        long j11 = x0Var.f15994o + j10;
        x0Var.f15994o = j11;
        return j11;
    }

    public void A(ReadableMap readableMap, Callback callback) {
        this.f15987h.add(new d(this, readableMap, callback, null));
    }

    public void B(n0 n0Var, int i10, String str, f0 f0Var) {
        synchronized (this.f15983d) {
            this.f16004y++;
            this.f15989j.addLast(new e(n0Var, i10, str, f0Var));
        }
    }

    public void C() {
        this.f15987h.add(new f(this, null));
    }

    @Deprecated
    public void D(int i10, int i11, ReadableArray readableArray) {
        this.f15986g.add(new g(i10, i11, readableArray));
    }

    public void E(int i10, String str, ReadableArray readableArray) {
        this.f15986g.add(new i(i10, str, readableArray));
    }

    public void F(int i10, float f10, float f11, Callback callback) {
        this.f15987h.add(new k(this, i10, f10, f11, callback, null));
    }

    public void G(d0 d0Var, r0.b bVar) {
        this.f15987h.add(new l(this, d0Var, bVar, null));
    }

    public void H(int i10, int[] iArr, y0[] y0VarArr, int[] iArr2) {
        this.f15987h.add(new m(i10, iArr, y0VarArr, iArr2));
    }

    public void I(int i10, Callback callback) {
        this.f15987h.add(new o(this, i10, callback, null));
    }

    public void J(int i10, Callback callback) {
        this.f15987h.add(new n(this, i10, callback, null));
    }

    public void K(int i10) {
        this.f15987h.add(new p(i10));
    }

    public void L(int i10, int i11) {
        this.f15987h.add(new q(this, i10, i11, null));
    }

    public void M(int i10, int i11, boolean z10) {
        this.f15987h.add(new c(i10, i11, false, z10));
    }

    public void N(boolean z10) {
        this.f15987h.add(new r(this, z10, null));
    }

    public void O(int i10, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.f15987h.add(new s(i10, readableArray, callback, callback2));
    }

    public void P(q0 q0Var) {
        this.f15987h.add(new t(q0Var));
    }

    public void Q(int i10, Object obj) {
        this.f15987h.add(new x(i10, obj));
    }

    public void R(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f15987h.add(new v(i10, i11, i12, i13, i14, i15));
    }

    public void S(int i10, String str, f0 f0Var) {
        this.f16005z++;
        this.f15987h.add(new w(this, i10, f0Var, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.facebook.react.uimanager.n U() {
        return this.f15981b;
    }

    public Map<String, Long> V() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.f15995p));
        hashMap.put("CommitEndTime", Long.valueOf(this.f15996q));
        hashMap.put("LayoutTime", Long.valueOf(this.f15997r));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.f15998s));
        hashMap.put("RunStartTime", Long.valueOf(this.f15999t));
        hashMap.put("RunEndTime", Long.valueOf(this.f16000u));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.f16001v));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.f16002w));
        hashMap.put("NativeModulesThreadCpuTime", Long.valueOf(this.f16003x));
        hashMap.put("CreateViewCount", Long.valueOf(this.f16004y));
        hashMap.put("UpdatePropsCount", Long.valueOf(this.f16005z));
        return hashMap;
    }

    public boolean W() {
        return this.f15987h.isEmpty() && this.f15986g.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X() {
        this.f15991l = false;
        com.facebook.react.modules.core.g.i().o(g.c.DISPATCH_UI, this.f15984e);
        T();
    }

    public void Y(q0 q0Var) {
        this.f15987h.add(0, new t(q0Var));
    }

    public void Z() {
        this.f15993n = true;
        this.f15995p = 0L;
        this.f16004y = 0L;
        this.f16005z = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a0() {
        this.f15991l = true;
        com.facebook.react.modules.core.g.i().m(g.c.DISPATCH_UI, this.f15984e);
    }

    public void b0(y6.a aVar) {
        this.f15990k = aVar;
    }

    public void x(int i10, View view) {
        this.f15981b.b(i10, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public void y(int i10, long j10, long j11) {
        long j12;
        ArrayList<h> arrayList;
        ArrayList<u> arrayList2;
        ArrayDeque<u> arrayDeque;
        com.facebook.systrace.b.a(0L, "UIViewOperationQueue.dispatchViewUpdates").a("batchId", i10).c();
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            j12 = 0;
            ArrayDeque<u> arrayDeque2 = null;
            if (this.f15986g.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList<h> arrayList3 = this.f15986g;
                this.f15986g = new ArrayList<>();
                arrayList = arrayList3;
            }
            if (this.f15987h.isEmpty()) {
                arrayList2 = null;
            } else {
                ArrayList<u> arrayList4 = this.f15987h;
                this.f15987h = new ArrayList<>();
                arrayList2 = arrayList4;
            }
            synchronized (this.f15983d) {
                try {
                    if (!this.f15989j.isEmpty()) {
                        arrayDeque2 = this.f15989j;
                        this.f15989j = new ArrayDeque<>();
                    }
                    arrayDeque = arrayDeque2;
                } catch (Throwable th) {
                    th = th;
                }
            }
            y6.a aVar = this.f15990k;
            if (aVar != null) {
                aVar.b();
            }
            try {
                a aVar2 = new a(i10, arrayList, arrayDeque, arrayList2, j10, j11, uptimeMillis, currentThreadTimeMillis);
                j12 = 0;
                com.facebook.systrace.b.a(0L, "acquiring mDispatchRunnablesLock").a("batchId", i10).c();
                synchronized (this.f15982c) {
                    com.facebook.systrace.a.g(0L);
                    this.f15988i.add(aVar2);
                }
                if (!this.f15991l) {
                    UiThreadUtil.runOnUiThread(new b(this.f15985f));
                }
                com.facebook.systrace.a.g(0L);
            } catch (Throwable th2) {
                th = th2;
                j12 = 0;
                com.facebook.systrace.a.g(j12);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j12 = 0;
        }
    }

    public void z() {
        this.f15987h.add(new c(0, 0, true, false));
    }
}
