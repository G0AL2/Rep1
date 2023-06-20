package com.facebook.ads.redexgen.X;

import android.os.Build;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.2M  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C2M extends F9 {
    public C2M(C1400Xy c1400Xy) {
        super(c1400Xy);
        setCarouselLayoutManager(c1400Xy);
    }

    @Nullable
    public S9 getFullscreenCarouselRecyclerViewAdapter() {
        if (getAdapter() instanceof S9) {
            return (S9) getAdapter();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.F9
    public C1588cB getLayoutManager() {
        return (C1588cB) super.getLayoutManager();
    }

    private void setCarouselLayoutManager(C1400Xy c1400Xy) {
        C1588cB c1588cB = new C1588cB(c1400Xy, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1588cB.A1V(true);
        }
        super.setLayoutManager(c1588cB);
    }

    @Override // com.facebook.ads.redexgen.X.F9
    public void setLayoutManager(C4T c4t) {
    }
}
