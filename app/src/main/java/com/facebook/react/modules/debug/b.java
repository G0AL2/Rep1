package com.facebook.react.modules.debug;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: FpsDebugFrameCallback.java */
/* loaded from: classes.dex */
public class b extends a.AbstractC0209a {

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.react.modules.core.a f15525b;

    /* renamed from: c  reason: collision with root package name */
    private final ReactContext f15526c;

    /* renamed from: d  reason: collision with root package name */
    private final UIManagerModule f15527d;

    /* renamed from: n  reason: collision with root package name */
    private TreeMap<Long, C0212b> f15537n;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15529f = false;

    /* renamed from: g  reason: collision with root package name */
    private long f15530g = -1;

    /* renamed from: h  reason: collision with root package name */
    private long f15531h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f15532i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f15533j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f15534k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f15535l = 0;

    /* renamed from: m  reason: collision with root package name */
    private boolean f15536m = false;

    /* renamed from: e  reason: collision with root package name */
    private final com.facebook.react.modules.debug.a f15528e = new com.facebook.react.modules.debug.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FpsDebugFrameCallback.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f15538a;

        a(b bVar) {
            this.f15538a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f15525b = com.facebook.react.modules.core.a.d();
            b.this.f15525b.e(this.f15538a);
        }
    }

    /* compiled from: FpsDebugFrameCallback.java */
    /* renamed from: com.facebook.react.modules.debug.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0212b {

        /* renamed from: a  reason: collision with root package name */
        public final int f15540a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15541b;

        /* renamed from: c  reason: collision with root package name */
        public final int f15542c;

        /* renamed from: d  reason: collision with root package name */
        public final double f15543d;

        /* renamed from: e  reason: collision with root package name */
        public final double f15544e;

        /* renamed from: f  reason: collision with root package name */
        public final int f15545f;

        public C0212b(int i10, int i11, int i12, int i13, double d10, double d11, int i14) {
            this.f15540a = i10;
            this.f15541b = i11;
            this.f15542c = i12;
            this.f15543d = d10;
            this.f15544e = d11;
            this.f15545f = i14;
        }
    }

    public b(ReactContext reactContext) {
        this.f15526c = reactContext;
        this.f15527d = (UIManagerModule) f6.a.c((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class));
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0209a
    public void a(long j10) {
        if (this.f15529f) {
            return;
        }
        if (this.f15530g == -1) {
            this.f15530g = j10;
        }
        long j11 = this.f15531h;
        this.f15531h = j10;
        if (this.f15528e.e(j11, j10)) {
            this.f15535l++;
        }
        this.f15532i++;
        int e10 = e();
        if ((e10 - this.f15533j) - 1 >= 4) {
            this.f15534k++;
        }
        if (this.f15536m) {
            f6.a.c(this.f15537n);
            this.f15537n.put(Long.valueOf(System.currentTimeMillis()), new C0212b(i(), j(), e10, this.f15534k, f(), h(), k()));
        }
        this.f15533j = e10;
        com.facebook.react.modules.core.a aVar = this.f15525b;
        if (aVar != null) {
            aVar.e(this);
        }
    }

    public int e() {
        return (int) ((k() / 16.9d) + 1.0d);
    }

    public double f() {
        if (this.f15531h == this.f15530g) {
            return 0.0d;
        }
        return (i() * 1.0E9d) / (this.f15531h - this.f15530g);
    }

    public C0212b g(long j10) {
        f6.a.d(this.f15537n, "FPS was not recorded at each frame!");
        Map.Entry<Long, C0212b> floorEntry = this.f15537n.floorEntry(Long.valueOf(j10));
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getValue();
    }

    public double h() {
        if (this.f15531h == this.f15530g) {
            return 0.0d;
        }
        return (j() * 1.0E9d) / (this.f15531h - this.f15530g);
    }

    public int i() {
        return this.f15532i - 1;
    }

    public int j() {
        return this.f15535l - 1;
    }

    public int k() {
        return ((int) (this.f15531h - this.f15530g)) / 1000000;
    }

    public void l() {
        this.f15529f = false;
        this.f15526c.getCatalystInstance().addBridgeIdleDebugListener(this.f15528e);
        this.f15527d.setViewHierarchyUpdateDebugListener(this.f15528e);
        UiThreadUtil.runOnUiThread(new a(this));
    }

    public void m() {
        this.f15537n = new TreeMap<>();
        this.f15536m = true;
        l();
    }

    public void n() {
        this.f15529f = true;
        this.f15526c.getCatalystInstance().removeBridgeIdleDebugListener(this.f15528e);
        this.f15527d.setViewHierarchyUpdateDebugListener(null);
    }
}
