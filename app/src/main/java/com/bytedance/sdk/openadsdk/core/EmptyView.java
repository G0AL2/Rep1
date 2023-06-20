package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.x;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class EmptyView extends View implements x.a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f11812a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11813b;

    /* renamed from: c  reason: collision with root package name */
    private a f11814c;

    /* renamed from: d  reason: collision with root package name */
    private View f11815d;

    /* renamed from: e  reason: collision with root package name */
    private List<View> f11816e;

    /* renamed from: f  reason: collision with root package name */
    private List<View> f11817f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11818g;

    /* renamed from: h  reason: collision with root package name */
    private int f11819h;

    /* renamed from: i  reason: collision with root package name */
    private final Handler f11820i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicBoolean f11821j;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(View view);

        void a(boolean z10);

        void b();
    }

    public EmptyView(Context context, View view) {
        super(m.a());
        this.f11820i = new com.bytedance.sdk.component.utils.x(Looper.getMainLooper(), this);
        this.f11821j = new AtomicBoolean(true);
        this.f11815d = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    private void b() {
        a aVar;
        if (!this.f11821j.getAndSet(false) || (aVar = this.f11814c) == null) {
            return;
        }
        aVar.a();
    }

    private void c() {
        a aVar;
        if (this.f11821j.getAndSet(true) || (aVar = this.f11814c) == null) {
            return;
        }
        aVar.b();
    }

    private void d() {
        if (!this.f11813b || this.f11812a) {
            return;
        }
        this.f11812a = true;
        this.f11820i.sendEmptyMessage(1);
    }

    private void e() {
        if (this.f11812a) {
            this.f11820i.removeCallbacksAndMessages(null);
            this.f11812a = false;
        }
    }

    public void a() {
        a(this.f11816e, null);
        a(this.f11817f, null);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        this.f11818g = false;
        b();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
        this.f11818g = true;
        c();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        b();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        c();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        a aVar = this.f11814c;
        if (aVar != null) {
            aVar.a(z10);
        }
    }

    public void setAdType(int i10) {
        this.f11819h = i10;
    }

    public void setCallback(a aVar) {
        this.f11814c = aVar;
    }

    public void setNeedCheckingShow(boolean z10) {
        this.f11813b = z10;
        if (!z10 && this.f11812a) {
            e();
        } else if (!z10 || this.f11812a) {
        } else {
            d();
        }
    }

    public void setRefClickViews(List<View> list) {
        this.f11816e = list;
    }

    public void setRefCreativeViews(List<View> list) {
        this.f11817f = list;
    }

    public void a(List<View> list, com.bytedance.sdk.openadsdk.core.b.c cVar) {
        if (com.bytedance.sdk.component.utils.j.b(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(cVar);
                    view.setOnTouchListener(cVar);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.x.a
    public void a(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            boolean c10 = com.bytedance.sdk.openadsdk.utils.u.c(m.a(), m.a().getPackageName());
            if (!x.a(this.f11815d, 20, this.f11819h) && c10) {
                if (this.f11818g) {
                    return;
                }
                setNeedCheckingShow(true);
                return;
            }
            this.f11820i.sendEmptyMessageDelayed(2, 1000L);
        } else if (this.f11812a) {
            if (x.a(this.f11815d, 20, this.f11819h)) {
                e();
                this.f11820i.sendEmptyMessageDelayed(2, 1000L);
                a aVar = this.f11814c;
                if (aVar != null) {
                    aVar.a(this.f11815d);
                    return;
                }
                return;
            }
            this.f11820i.sendEmptyMessageDelayed(1, 1000L);
        }
    }
}
