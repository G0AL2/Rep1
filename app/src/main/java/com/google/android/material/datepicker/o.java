package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: YearGridAdapter.java */
/* loaded from: classes2.dex */
public class o extends RecyclerView.h<b> {

    /* renamed from: a  reason: collision with root package name */
    private final e<?> f22356a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: YearGridAdapter.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f22357a;

        a(int i10) {
            this.f22357a = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o.this.f22356a.u(Month.e(this.f22357a, o.this.f22356a.o().f22261c));
            o.this.f22356a.v(e.k.DAY);
        }
    }

    /* compiled from: YearGridAdapter.java */
    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.d0 {

        /* renamed from: a  reason: collision with root package name */
        final TextView f22359a;

        b(TextView textView) {
            super(textView);
            this.f22359a = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(e<?> eVar) {
        this.f22356a = eVar;
    }

    private View.OnClickListener b(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i10) {
        return i10 - this.f22356a.m().l().f22262d;
    }

    int d(int i10) {
        return this.f22356a.m().l().f22262d + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: e */
    public void onBindViewHolder(b bVar, int i10) {
        int d10 = d(i10);
        String string = bVar.f22359a.getContext().getString(ha.j.f31246l);
        bVar.f22359a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(d10)));
        bVar.f22359a.setContentDescription(String.format(string, Integer.valueOf(d10)));
        com.google.android.material.datepicker.b n10 = this.f22356a.n();
        Calendar i11 = n.i();
        com.google.android.material.datepicker.a aVar = i11.get(1) == d10 ? n10.f22277f : n10.f22275d;
        for (Long l10 : this.f22356a.p().T0()) {
            i11.setTimeInMillis(l10.longValue());
            if (i11.get(1) == d10) {
                aVar = n10.f22276e;
            }
        }
        aVar.d(bVar.f22359a);
        bVar.f22359a.setOnClickListener(b(d10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ha.h.f31231k, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f22356a.m().m();
    }
}
