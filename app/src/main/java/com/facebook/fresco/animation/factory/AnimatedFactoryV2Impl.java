package com.facebook.fresco.animation.factory;

import android.content.Context;
import com.facebook.common.time.RealtimeSinceBootClock;
import o5.f;
import p5.i;
import w3.h;
import y3.d;
import y3.n;

@d
/* loaded from: classes.dex */
public class AnimatedFactoryV2Impl implements l5.a {

    /* renamed from: a  reason: collision with root package name */
    private final f f14523a;

    /* renamed from: b  reason: collision with root package name */
    private final r5.f f14524b;

    /* renamed from: c  reason: collision with root package name */
    private final i<t3.d, w5.c> f14525c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f14526d;

    /* renamed from: e  reason: collision with root package name */
    private m5.a f14527e;

    /* renamed from: f  reason: collision with root package name */
    private v5.a f14528f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements n<Integer> {
        a(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        }

        @Override // y3.n
        /* renamed from: a */
        public Integer get() {
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements n<Integer> {
        b(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        }

        @Override // y3.n
        /* renamed from: a */
        public Integer get() {
            return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements m5.a {
        c() {
        }
    }

    @d
    public AnimatedFactoryV2Impl(f fVar, r5.f fVar2, i<t3.d, w5.c> iVar, boolean z10) {
        this.f14523a = fVar;
        this.f14524b = fVar2;
        this.f14525c = iVar;
        this.f14526d = z10;
    }

    private e5.a d() {
        a aVar = new a(this);
        return new e5.a(e(), h.g(), new w3.c(this.f14524b.d()), RealtimeSinceBootClock.get(), this.f14523a, this.f14525c, aVar, new b(this));
    }

    private m5.a e() {
        if (this.f14527e == null) {
            this.f14527e = new c();
        }
        return this.f14527e;
    }

    @Override // l5.a
    public v5.a a(Context context) {
        if (this.f14528f == null) {
            this.f14528f = d();
        }
        return this.f14528f;
    }
}
