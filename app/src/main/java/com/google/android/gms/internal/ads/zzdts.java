package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdts extends FrameLayout {
    private final com.google.android.gms.ads.internal.util.zzas zza;

    public zzdts(Context context, View view, com.google.android.gms.ads.internal.util.zzas zzasVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.zza = zzasVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.zza.zzm(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && (childAt instanceof zzcli)) {
                arrayList.add((zzcli) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((zzcli) arrayList.get(i11)).destroy();
        }
    }
}
