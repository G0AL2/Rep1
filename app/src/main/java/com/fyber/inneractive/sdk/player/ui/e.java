package com.fyber.inneractive.sdk.player.ui;

import android.view.TextureView;
import android.view.View;
import com.fyber.inneractive.sdk.util.s;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class e extends TextureView {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<i> f19772a;

    public e(i iVar) {
        super(iVar.getContext());
        this.f19772a = new WeakReference<>(iVar);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        i iVar = (i) s.a(this.f19772a);
        if (iVar != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(iVar.B.f20323a, 1073741824);
            i11 = View.MeasureSpec.makeMeasureSpec(iVar.B.f20324b, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
