package com.reactnativepagerview;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import qe.k;

/* compiled from: ViewPagerViewHolder.kt */
/* loaded from: classes3.dex */
public final class h extends RecyclerView.d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28395a = new a(null);

    /* compiled from: ViewPagerViewHolder.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }

        public final h a(ViewGroup viewGroup) {
            k.f(viewGroup, "parent");
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setSaveEnabled(false);
            return new h(frameLayout, null);
        }
    }

    private h(FrameLayout frameLayout) {
        super(frameLayout);
    }

    public /* synthetic */ h(FrameLayout frameLayout, qe.g gVar) {
        this(frameLayout);
    }

    public final FrameLayout c() {
        return (FrameLayout) this.itemView;
    }
}
