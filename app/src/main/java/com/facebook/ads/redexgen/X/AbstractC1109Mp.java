package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.widget.LinearLayout;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;

/* renamed from: com.facebook.ads.redexgen.X.Mp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1109Mp extends LinearLayout {
    public static int A00 = (int) (Lr.A00 * 56.0f);

    public abstract void A04(C1K c1k, boolean z10);

    public abstract boolean A05();

    public abstract int getToolbarHeight();

    public abstract void setAdReportingVisible(boolean z10);

    public abstract void setPageDetails(C1U c1u, String str, int i10, C05921b c05921b);

    public abstract void setPageDetailsVisible(boolean z10);

    public abstract void setProgress(float f10);

    public abstract void setProgressSpinnerInvisible(boolean z10);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i10);

    public abstract void setToolbarListener(InterfaceC1108Mo interfaceC1108Mo);

    public AbstractC1109Mp(Context context) {
        super(context);
    }
}
