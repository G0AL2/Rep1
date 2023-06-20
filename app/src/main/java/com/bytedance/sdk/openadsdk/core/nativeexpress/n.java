package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.e.g;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: ViewGestureDetector.java */
/* loaded from: classes.dex */
public class n extends GestureDetector {

    /* renamed from: a  reason: collision with root package name */
    private final a f12663a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.b.f f12664b;

    /* compiled from: ViewGestureDetector.java */
    /* loaded from: classes.dex */
    static class a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f12665a = false;

        a() {
        }

        void a() {
            this.f12665a = false;
        }

        boolean b() {
            return this.f12665a;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f12665a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public n(Context context) {
        this(context, new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f12663a.a();
    }

    public boolean b() {
        return this.f12663a.b();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f12664b.a(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public n(Context context, a aVar) {
        super(context, aVar);
        this.f12663a = aVar;
        this.f12664b = new com.bytedance.sdk.openadsdk.core.b.f();
        setIsLongpressEnabled(false);
    }

    public com.bytedance.sdk.openadsdk.core.e.g a(Context context, View view, View view2) {
        if (this.f12664b == null) {
            return new g.a().a();
        }
        return new g.a().f(this.f12664b.f11910a).e(this.f12664b.f11911b).d(this.f12664b.f11912c).c(this.f12664b.f11913d).b(this.f12664b.f11914e).a(this.f12664b.f11915f).b(v.a(view)).a(v.a(view2)).c(v.c(view)).d(v.c(view2)).d(this.f12664b.f11916g).e(this.f12664b.f11917h).f(this.f12664b.f11918i).a(this.f12664b.f11920l).b(com.bytedance.sdk.openadsdk.core.h.d().b() ? 1 : 2).a("vessel").a(v.e(context)).c(v.g(context)).b(v.f(context)).a();
    }
}
