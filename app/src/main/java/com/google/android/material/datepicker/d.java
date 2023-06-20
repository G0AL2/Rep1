package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: classes2.dex */
class d extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    private static final int f22280d;

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f22281a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22282b;

    /* renamed from: c  reason: collision with root package name */
    private final int f22283c;

    static {
        f22280d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public d() {
        Calendar k10 = n.k();
        this.f22281a = k10;
        this.f22282b = k10.getMaximum(7);
        this.f22283c = k10.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f22283c;
        int i12 = this.f22282b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i10) {
        if (i10 >= this.f22282b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f22282b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ha.h.f31227g, viewGroup, false);
        }
        this.f22281a.set(7, b(i10));
        textView.setText(this.f22281a.getDisplayName(7, f22280d, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(ha.j.f31245k), this.f22281a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
