package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;
import qe.k;

/* compiled from: ViewPagerAdapter.kt */
/* loaded from: classes3.dex */
public final class g extends RecyclerView.h<h> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<View> f28394a = new ArrayList<>();

    public final void a(View view, int i10) {
        k.f(view, "child");
        this.f28394a.add(i10, view);
        notifyItemInserted(i10);
    }

    public final View b(int i10) {
        View view = this.f28394a.get(i10);
        k.e(view, "childrenViews[index]");
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public void onBindViewHolder(h hVar, int i10) {
        k.f(hVar, "holder");
        FrameLayout c10 = hVar.c();
        View b10 = b(i10);
        if (c10.getChildCount() > 0) {
            c10.removeAllViews();
        }
        if (b10.getParent() != null) {
            ViewParent parent = b10.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) parent).removeView(b10);
        }
        c10.addView(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public h onCreateViewHolder(ViewGroup viewGroup, int i10) {
        k.f(viewGroup, "parent");
        return h.f28395a.a(viewGroup);
    }

    public final void e() {
        int size = this.f28394a.size();
        this.f28394a.clear();
        notifyItemRangeRemoved(0, size);
    }

    public final void f(View view) {
        k.f(view, "child");
        g(this.f28394a.indexOf(view));
    }

    public final void g(int i10) {
        this.f28394a.remove(i10);
        notifyItemRemoved(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f28394a.size();
    }
}
