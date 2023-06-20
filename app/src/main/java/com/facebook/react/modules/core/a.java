package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;

/* compiled from: ChoreographerCompat.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f15469b;

    /* renamed from: a  reason: collision with root package name */
    private Choreographer f15470a = c();

    /* compiled from: ChoreographerCompat.java */
    /* renamed from: com.facebook.react.modules.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0209a {

        /* renamed from: a  reason: collision with root package name */
        private Choreographer.FrameCallback f15471a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChoreographerCompat.java */
        /* renamed from: com.facebook.react.modules.core.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class Choreographer$FrameCallbackC0210a implements Choreographer.FrameCallback {
            Choreographer$FrameCallbackC0210a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                AbstractC0209a.this.a(j10);
            }
        }

        public abstract void a(long j10);

        Choreographer.FrameCallback b() {
            if (this.f15471a == null) {
                this.f15471a = new Choreographer$FrameCallbackC0210a();
            }
            return this.f15471a;
        }
    }

    private a() {
    }

    private void a(Choreographer.FrameCallback frameCallback) {
        this.f15470a.postFrameCallback(frameCallback);
    }

    private void b(Choreographer.FrameCallback frameCallback) {
        this.f15470a.removeFrameCallback(frameCallback);
    }

    private Choreographer c() {
        return Choreographer.getInstance();
    }

    public static a d() {
        UiThreadUtil.assertOnUiThread();
        if (f15469b == null) {
            f15469b = new a();
        }
        return f15469b;
    }

    public void e(AbstractC0209a abstractC0209a) {
        a(abstractC0209a.b());
    }

    public void f(AbstractC0209a abstractC0209a) {
        b(abstractC0209a.b());
    }
}
