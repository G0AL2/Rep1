package com.inmobi.media;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NativeDataSource.java */
/* loaded from: classes3.dex */
public final class fa extends androidx.viewpager.widget.a implements fg {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25325a = "fa";

    /* renamed from: e  reason: collision with root package name */
    private static Handler f25326e = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private boolean f25327b;

    /* renamed from: c  reason: collision with root package name */
    private final bx f25328c;

    /* renamed from: d  reason: collision with root package name */
    private fc f25329d;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray<Runnable> f25330f = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public fa(bx bxVar, fc fcVar) {
        this.f25328c = bxVar;
        this.f25329d = fcVar;
    }

    @Override // com.inmobi.media.fg
    public final void destroy() {
        this.f25327b = true;
        int size = this.f25330f.size();
        for (int i10 = 0; i10 < size; i10++) {
            f25326e.removeCallbacks(this.f25330f.get(this.f25330f.keyAt(i10)));
        }
        this.f25330f.clear();
    }

    @Override // androidx.viewpager.widget.a
    public final void destroyItem(ViewGroup viewGroup, int i10, final Object obj) {
        viewGroup.removeView((View) obj);
        Runnable runnable = this.f25330f.get(i10);
        if (runnable != null) {
            f25326e.removeCallbacks(runnable);
        }
        f25326e.post(new Runnable() { // from class: com.inmobi.media.fa.1
            @Override // java.lang.Runnable
            public final void run() {
                fa.this.f25329d.f25347c.a((View) obj);
            }
        });
    }

    @Override // androidx.viewpager.widget.a
    public final int getCount() {
        return this.f25328c.c();
    }

    @Override // androidx.viewpager.widget.a
    public final int getItemPosition(Object obj) {
        Object tag = obj == null ? null : ((View) obj).getTag();
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    @TargetApi(21)
    public final Object instantiateItem(final ViewGroup viewGroup, final int i10) {
        final bv a10 = this.f25328c.a(i10);
        if (a10 == null) {
            return null;
        }
        final ViewGroup a11 = this.f25329d.a(viewGroup, a10);
        int abs = Math.abs(this.f25329d.f25345a - i10);
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.fa.2
            @Override // java.lang.Runnable
            public final void run() {
                if (fa.this.f25327b) {
                    return;
                }
                fa.this.f25330f.remove(i10);
                fa.this.f25329d.b(a11, a10);
            }
        };
        this.f25330f.put(i10, runnable);
        f25326e.postDelayed(runnable, abs * 50);
        a11.setLayoutParams(fl.a(a10, viewGroup));
        a11.setTag(Integer.valueOf(i10));
        viewGroup.addView(a11);
        return a11;
    }

    @Override // androidx.viewpager.widget.a
    public final boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }
}
