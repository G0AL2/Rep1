package com.inmobi.ads.viewsv2;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.media.bv;
import com.inmobi.media.bx;
import com.inmobi.media.fc;
import com.inmobi.media.fg;
import com.inmobi.media.fl;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class NativeRecyclerViewAdapter extends RecyclerView.h<a> implements fg {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24423a = "NativeRecyclerViewAdapter";

    /* renamed from: b  reason: collision with root package name */
    private bx f24424b;

    /* renamed from: c  reason: collision with root package name */
    private fc f24425c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray<WeakReference<View>> f24426d = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends RecyclerView.d0 {

        /* renamed from: b  reason: collision with root package name */
        private ViewGroup f24428b;

        a(View view) {
            super(view);
            this.f24428b = (ViewGroup) view;
        }
    }

    public NativeRecyclerViewAdapter(bx bxVar, fc fcVar) {
        this.f24424b = bxVar;
        this.f24425c = fcVar;
    }

    public ViewGroup buildScrollableView(int i10, ViewGroup viewGroup, bv bvVar) {
        ViewGroup a10 = this.f24425c.a(viewGroup, bvVar);
        this.f24425c.b(a10, bvVar);
        a10.setLayoutParams(fl.a(bvVar, viewGroup));
        return a10;
    }

    @Override // com.inmobi.media.fg
    public void destroy() {
        bx bxVar = this.f24424b;
        if (bxVar != null) {
            bxVar.f24856h = null;
            bxVar.f24854f = null;
            this.f24424b = null;
        }
        this.f24425c = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        bx bxVar = this.f24424b;
        if (bxVar == null) {
            return 0;
        }
        return bxVar.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(a aVar, int i10) {
        View buildScrollableView;
        bx bxVar = this.f24424b;
        bv a10 = bxVar == null ? null : bxVar.a(i10);
        WeakReference<View> weakReference = this.f24426d.get(i10);
        if (a10 != null) {
            if (weakReference == null || (buildScrollableView = weakReference.get()) == null) {
                buildScrollableView = buildScrollableView(i10, aVar.f24428b, a10);
            }
            if (buildScrollableView != null) {
                if (i10 != getItemCount() - 1) {
                    aVar.f24428b.setPadding(0, 0, 16, 0);
                }
                aVar.f24428b.addView(buildScrollableView);
                this.f24426d.put(i10, new WeakReference<>(buildScrollableView));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a(new FrameLayout(viewGroup.getContext()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(a aVar) {
        aVar.f24428b.removeAllViews();
        super.onViewRecycled((NativeRecyclerViewAdapter) aVar);
    }
}
