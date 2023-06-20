package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MonthAdapter.java */
/* loaded from: classes2.dex */
public class i extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    static final int f22342e = n.k().getMaximum(4);

    /* renamed from: a  reason: collision with root package name */
    final Month f22343a;

    /* renamed from: b  reason: collision with root package name */
    final DateSelector<?> f22344b;

    /* renamed from: c  reason: collision with root package name */
    b f22345c;

    /* renamed from: d  reason: collision with root package name */
    final CalendarConstraints f22346d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f22343a = month;
        this.f22344b = dateSelector;
        this.f22346d = calendarConstraints;
    }

    private void e(Context context) {
        if (this.f22345c == null) {
            this.f22345c = new b(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i10) {
        return b() + (i10 - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f22343a.g();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i10) {
        if (i10 < this.f22343a.g() || i10 > h()) {
            return null;
        }
        return Long.valueOf(this.f22343a.h(i(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    @Override // android.widget.Adapter
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = ha.h.f31226f
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L61
            com.google.android.material.datepicker.Month r2 = r5.f22343a
            int r3 = r2.f22264f
            if (r7 < r3) goto L2e
            goto L61
        L2e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.Month r2 = r5.f22343a
            long r2 = r2.h(r7)
            com.google.android.material.datepicker.Month r7 = r5.f22343a
            int r7 = r7.f22262d
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.m()
            int r4 = r4.f22262d
            if (r7 != r4) goto L53
            java.lang.String r7 = com.google.android.material.datepicker.c.a(r2)
            r0.setContentDescription(r7)
            goto L5a
        L53:
            java.lang.String r7 = com.google.android.material.datepicker.c.c(r2)
            r0.setContentDescription(r7)
        L5a:
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L69
        L61:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L69:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L70
            return r0
        L70:
            com.google.android.material.datepicker.CalendarConstraints r7 = r5.f22346d
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r7 = r7.h()
            long r2 = r6.longValue()
            boolean r7 = r7.b(r2)
            if (r7 == 0) goto Ld5
            r0.setEnabled(r8)
            com.google.android.material.datepicker.DateSelector<?> r7 = r5.f22344b
            java.util.Collection r7 = r7.T0()
            java.util.Iterator r7 = r7.iterator()
        L8d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb5
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.n.a(r3)
            long r1 = com.google.android.material.datepicker.n.a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L8d
            com.google.android.material.datepicker.b r6 = r5.f22345c
            com.google.android.material.datepicker.a r6 = r6.f22273b
            r6.d(r0)
            return r0
        Lb5:
            java.util.Calendar r7 = com.google.android.material.datepicker.n.i()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto Lcd
            com.google.android.material.datepicker.b r6 = r5.f22345c
            com.google.android.material.datepicker.a r6 = r6.f22274c
            r6.d(r0)
            return r0
        Lcd:
            com.google.android.material.datepicker.b r6 = r5.f22345c
            com.google.android.material.datepicker.a r6 = r6.f22272a
            r6.d(r0)
            return r0
        Ld5:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.b r6 = r5.f22345c
            com.google.android.material.datepicker.a r6 = r6.f22278g
            r6.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.i.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(int i10) {
        return i10 % this.f22343a.f22263e == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(int i10) {
        return (i10 + 1) % this.f22343a.f22263e == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f22343a.f22264f + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f22343a.f22263e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return (this.f22343a.g() + this.f22343a.f22264f) - 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    int i(int i10) {
        return (i10 - this.f22343a.g()) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j(int i10) {
        return i10 >= b() && i10 <= h();
    }
}
