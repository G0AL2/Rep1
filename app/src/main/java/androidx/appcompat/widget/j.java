package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* loaded from: classes.dex */
class j {

    /* renamed from: a  reason: collision with root package name */
    private final CompoundButton f1543a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f1544b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f1545c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1546d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1547e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1548f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(CompoundButton compoundButton) {
        this.f1543a = compoundButton;
    }

    void a() {
        Drawable a10 = androidx.core.widget.d.a(this.f1543a);
        if (a10 != null) {
            if (this.f1546d || this.f1547e) {
                Drawable mutate = androidx.core.graphics.drawable.a.r(a10).mutate();
                if (this.f1546d) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f1544b);
                }
                if (this.f1547e) {
                    androidx.core.graphics.drawable.a.p(mutate, this.f1545c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1543a.getDrawableState());
                }
                this.f1543a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i10) {
        Drawable a10;
        return (Build.VERSION.SDK_INT >= 17 || (a10 = androidx.core.widget.d.a(this.f1543a)) == null) ? i10 : i10 + a10.getIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.f1544b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.f1545c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1543a
            android.content.Context r0 = r0.getContext()
            int[] r3 = d.j.R0
            r8 = 0
            androidx.appcompat.widget.z0 r0 = androidx.appcompat.widget.z0.v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1543a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.z.o0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = d.j.T0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.n(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CompoundButton r11 = r9.f1543a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = e.a.b(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = 0
        L3b:
            if (r10 != 0) goto L58
            int r10 = d.j.S0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.n(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CompoundButton r11 = r9.f1543a     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = e.a.b(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = d.j.U0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CompoundButton r11 = r9.f1543a     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.d.c(r11, r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = d.j.V0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CompoundButton r11 = r9.f1543a     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.k(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.g0.e(r10, r1)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.d.d(r11, r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.w()
            return
        L84:
            r10 = move-exception
            r0.w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.e(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (this.f1548f) {
            this.f1548f = false;
            return;
        }
        this.f1548f = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.f1544b = colorStateList;
        this.f1546d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        this.f1545c = mode;
        this.f1547e = true;
        a();
    }
}
