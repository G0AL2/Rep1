package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter;
import com.inmobi.media.ff;

/* compiled from: ScrollableDeckFreeContainer.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
class fn extends ff {

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView f25470a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f25471b;

    public fn(Context context) {
        super(context, (byte) 1);
        this.f25471b = false;
    }

    @Override // com.inmobi.media.ff
    public final void a(bv bvVar, fg fgVar, int i10, int i11, ff.a aVar) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fl.a(bvVar.a(0), this);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(20);
            layoutParams.setMarginEnd(20);
        } else {
            layoutParams.setMargins(20, 0, 20, 0);
        }
        layoutParams.gravity = i11;
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f25470a = recyclerView;
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f25470a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        addView(this.f25470a);
        this.f25470a.setAdapter((NativeRecyclerViewAdapter) fgVar);
    }
}
