package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes2.dex */
public class j extends RecyclerView.h<b> {

    /* renamed from: a  reason: collision with root package name */
    private final CalendarConstraints f22347a;

    /* renamed from: b  reason: collision with root package name */
    private final DateSelector<?> f22348b;

    /* renamed from: c  reason: collision with root package name */
    private final e.l f22349c;

    /* renamed from: d  reason: collision with root package name */
    private final int f22350d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MonthsPagerAdapter.java */
    /* loaded from: classes2.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f22351a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f22351a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f22351a.getAdapter2().j(i10)) {
                j.this.f22349c.a(this.f22351a.getAdapter2().getItem(i10).longValue());
            }
        }
    }

    /* compiled from: MonthsPagerAdapter.java */
    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.d0 {

        /* renamed from: a  reason: collision with root package name */
        final TextView f22353a;

        /* renamed from: b  reason: collision with root package name */
        final MaterialCalendarGridView f22354b;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(ha.f.f31202i);
            this.f22353a = textView;
            z.r0(textView, true);
            this.f22354b = (MaterialCalendarGridView) linearLayout.findViewById(ha.f.f31198e);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, e.l lVar) {
        Month l10 = calendarConstraints.l();
        Month i10 = calendarConstraints.i();
        Month k10 = calendarConstraints.k();
        if (l10.compareTo(k10) <= 0) {
            if (k10.compareTo(i10) <= 0) {
                this.f22350d = (i.f22342e * e.q(context)) + (f.q(context) ? e.q(context) : 0);
                this.f22347a = calendarConstraints;
                this.f22348b = dateSelector;
                this.f22349c = lVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month b(int i10) {
        return this.f22347a.l().k(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence c(int i10) {
        return b(i10).i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d(Month month) {
        return this.f22347a.l().l(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: e */
    public void onBindViewHolder(b bVar, int i10) {
        Month k10 = this.f22347a.l().k(i10);
        bVar.f22353a.setText(k10.i());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f22354b.findViewById(ha.f.f31198e);
        if (materialCalendarGridView.getAdapter2() != null && k10.equals(materialCalendarGridView.getAdapter2().f22343a)) {
            materialCalendarGridView.getAdapter2().notifyDataSetChanged();
        } else {
            i iVar = new i(k10, this.f22348b, this.f22347a);
            materialCalendarGridView.setNumColumns(k10.f22263e);
            materialCalendarGridView.setAdapter((ListAdapter) iVar);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(ha.h.f31229i, viewGroup, false);
        if (f.q(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f22350d));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f22347a.j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return this.f22347a.l().k(i10).j();
    }
}
