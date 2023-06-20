package com.applovin.mediation.nativeAds.adPlacer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.applovin.impl.mediation.b.a.c;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* loaded from: classes.dex */
public class MaxRecyclerAdapter extends RecyclerView.h<RecyclerView.d0> implements MaxAdPlacer.Listener {

    /* renamed from: a  reason: collision with root package name */
    private final MaxAdPlacer f9061a;

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView.h f9062b;

    /* renamed from: c  reason: collision with root package name */
    private final a f9063c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f9064d;

    /* renamed from: e  reason: collision with root package name */
    private c f9065e;

    /* renamed from: f  reason: collision with root package name */
    private MaxAdPlacer.Listener f9066f;

    /* renamed from: g  reason: collision with root package name */
    private int f9067g;

    /* loaded from: classes.dex */
    public static class MaxAdRecyclerViewHolder extends RecyclerView.d0 {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f9069a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f9069a = (ViewGroup) view.findViewById(R.id.native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f9069a;
        }
    }

    /* loaded from: classes.dex */
    private class a extends RecyclerView.j {
        private a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        @SuppressLint({"NotifyDataSetChanged"})
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeChanged(int i10, int i11) {
            int adjustedPosition = MaxRecyclerAdapter.this.f9061a.getAdjustedPosition(i10);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f9061a.getAdjustedPosition((i10 + i11) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeInserted(int i10, int i11) {
            int adjustedPosition = MaxRecyclerAdapter.this.f9061a.getAdjustedPosition(i10);
            for (int i12 = 0; i12 < i11; i12++) {
                MaxRecyclerAdapter.this.f9061a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        @SuppressLint({"NotifyDataSetChanged"})
        public void onItemRangeMoved(int i10, int i11, int i12) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeRemoved(int i10, int i11) {
            int adjustedPosition = MaxRecyclerAdapter.this.f9061a.getAdjustedPosition(i10);
            int itemCount = MaxRecyclerAdapter.this.f9062b.getItemCount();
            int adjustedCount = MaxRecyclerAdapter.this.f9061a.getAdjustedCount(itemCount + i11);
            for (int i12 = 0; i12 < i11; i12++) {
                MaxRecyclerAdapter.this.f9061a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f9061a.getAdjustedCount(itemCount);
            int i13 = adjustedCount - adjustedCount2;
            Collection<Integer> clearTrailingAds = MaxRecyclerAdapter.this.f9061a.clearTrailingAds(adjustedCount2 - 1);
            if (!clearTrailingAds.isEmpty()) {
                i13 += clearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (i13 - i11), i13);
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.h hVar, Activity activity) {
        a aVar = new a();
        this.f9063c = aVar;
        this.f9067g = 8;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f9061a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(hVar.hasStableIds());
        this.f9062b = hVar;
        hVar.registerAdapterDataObserver(aVar);
    }

    private int a(int i10) {
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f9064d.getContext(), this.f9064d.getWidth());
        RecyclerView.p layoutManager = this.f9064d.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            return layoutManager instanceof StaggeredGridLayoutManager ? pxToDp / ((StaggeredGridLayoutManager) layoutManager).y2() : pxToDp;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        return (pxToDp / gridLayoutManager.b3()) * gridLayoutManager.f3().f(i10);
    }

    public void destroy() {
        try {
            this.f9062b.unregisterAdapterDataObserver(this.f9063c);
        } catch (Exception unused) {
        }
        this.f9061a.destroy();
        c cVar = this.f9065e;
        if (cVar != null) {
            cVar.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f9061a;
    }

    public int getAdjustedPosition(int i10) {
        return this.f9061a.getAdjustedPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f9061a.getAdjustedCount(this.f9062b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        if (this.f9062b.hasStableIds()) {
            return this.f9061a.isFilledPosition(i10) ? this.f9061a.getAdItemId(i10) : this.f9062b.getItemId(this.f9061a.getOriginalPosition(i10));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (this.f9061a.isAdPosition(i10)) {
            return -42;
        }
        return this.f9062b.getItemViewType(this.f9061a.getOriginalPosition(i10));
    }

    public int getOriginalPosition(int i10) {
        return this.f9061a.getOriginalPosition(i10);
    }

    public void loadAds() {
        this.f9061a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f9066f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i10) {
        notifyItemChanged(i10);
        MaxAdPlacer.Listener listener = this.f9066f;
        if (listener != null) {
            listener.onAdLoaded(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i10) {
        MaxAdPlacer.Listener listener = this.f9066f;
        if (listener != null) {
            listener.onAdRemoved(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f9066f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f9064d = recyclerView;
        c cVar = new c(recyclerView);
        this.f9065e = cVar;
        cVar.a(new c.a() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.1
            @Override // com.applovin.impl.mediation.b.a.c.a
            public void a(int i10, int i11) {
                MaxRecyclerAdapter.this.f9061a.updateFillablePositions(i10, Math.min(i11 + MaxRecyclerAdapter.this.f9067g, MaxRecyclerAdapter.this.getItemCount() - 1));
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i10) {
        this.f9065e.a(d0Var.itemView, i10);
        if (!this.f9061a.isAdPosition(i10)) {
            this.f9062b.onBindViewHolder(d0Var, this.f9061a.getOriginalPosition(i10));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.f9061a.getAdSize(i10, a(i10));
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) d0Var).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
            return;
        }
        layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
        layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
        containerView.setLayoutParams(layoutParams);
        this.f9061a.renderAd(i10, containerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == -42) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            RecyclerView.p layoutManager = this.f9064d.getLayoutManager();
            if (layoutManager == null || !layoutManager.u()) {
                layoutParams.width = -1;
                layoutParams.height = -2;
            } else {
                layoutParams.width = -2;
                layoutParams.height = -1;
            }
            inflate.setLayoutParams(layoutParams);
            return new MaxAdRecyclerViewHolder(inflate);
        }
        return this.f9062b.onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f9064d = null;
        c cVar = this.f9065e;
        if (cVar != null) {
            cVar.a();
            this.f9065e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean onFailedToRecycleView(RecyclerView.d0 d0Var) {
        return d0Var instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(d0Var) : this.f9062b.onFailedToRecycleView(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(RecyclerView.d0 d0Var) {
        if (d0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(d0Var);
        } else {
            this.f9062b.onViewAttachedToWindow(d0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(RecyclerView.d0 d0Var) {
        if (d0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(d0Var);
        } else {
            this.f9062b.onViewDetachedFromWindow(d0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(RecyclerView.d0 d0Var) {
        c cVar = this.f9065e;
        if (cVar != null) {
            cVar.a(d0Var.itemView);
        }
        if (!(d0Var instanceof MaxAdRecyclerViewHolder)) {
            this.f9062b.onViewRecycled(d0Var);
            return;
        }
        if (this.f9061a.isFilledPosition(d0Var.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) d0Var).getContainerView().removeAllViews();
        }
        super.onViewRecycled(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void setHasStableIds(boolean z10) {
        super.setHasStableIds(z10);
        this.f9062b.unregisterAdapterDataObserver(this.f9063c);
        this.f9062b.setHasStableIds(z10);
        this.f9062b.registerAdapterDataObserver(this.f9063c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f9066f = listener;
    }

    public void setLookAhead(int i10) {
        this.f9067g = i10;
    }
}
