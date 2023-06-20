package com.fyber.inneractive.sdk.renderers;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.util.j;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f20084b;

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f20085c;

    /* renamed from: j  reason: collision with root package name */
    public final c f20092j;

    /* renamed from: d  reason: collision with root package name */
    public float f20086d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public int f20087e = 1;

    /* renamed from: f  reason: collision with root package name */
    public float f20088f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public long f20089g = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f20090h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f20091i = false;

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f20093k = new a();

    /* renamed from: a  reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.j<Rect> f20083a = new com.fyber.inneractive.sdk.util.j<>(4, new C0269b(this));

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.renderers.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0269b implements j.a<Rect> {
        public C0269b(b bVar) {
        }

        @Override // com.fyber.inneractive.sdk.util.j.a
        public Rect a() {
            return new Rect();
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
    }

    public b(com.fyber.inneractive.sdk.response.e eVar, FrameLayout frameLayout, c cVar) {
        this.f20084b = eVar;
        this.f20085c = frameLayout;
        this.f20092j = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.b.a():void");
    }

    public void b() {
        if (this.f20091i || this.f20090h || this.f20089g == 0) {
            return;
        }
        this.f20089g = 0L;
        this.f20090h = true;
        a();
    }

    public void c() {
        this.f20090h = false;
        com.fyber.inneractive.sdk.util.n.f20310b.removeCallbacks(this.f20093k);
    }
}
