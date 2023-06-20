package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.bx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1575bx extends C4P {
    public static String[] A01 = {"ufm8s7LRmOM7", "sIBwdoM05ajejE", "0NxvrnR7UZDHrBy4xVhLU5lsqzWJ5R3x", "FsILnIqpIa8iE3wffvJrO4tNlZdDmpUd", "wKnqjXSh8f61FKWyknAGi8xlXXoDdiLA", "lpMPMGmveEx5YZPPZgDkriuB4nzdouJK", "fQPzW90JHWOApVaaQbndX59CGXgCnXlm", "Pp9SKBa6RS3IfLIGXA9e4oeVKGHa5CsE"};
    public boolean A00 = true;

    public abstract boolean A0R(AbstractC06774l abstractC06774l);

    public abstract boolean A0S(AbstractC06774l abstractC06774l);

    public abstract boolean A0T(AbstractC06774l abstractC06774l, int i10, int i11, int i12, int i13);

    public abstract boolean A0U(AbstractC06774l abstractC06774l, AbstractC06774l abstractC06774l2, int i10, int i11, int i12, int i13);

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0D(@NonNull AbstractC06774l abstractC06774l) {
        return !this.A00 || abstractC06774l.A0b();
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0E(@NonNull AbstractC06774l abstractC06774l, @Nullable C4O c4o, @NonNull C4O c4o2) {
        if (c4o != null && (c4o.A01 != c4o2.A01 || c4o.A03 != c4o2.A03)) {
            return A0T(abstractC06774l, c4o.A01, c4o.A03, c4o2.A01, c4o2.A03);
        }
        return A0R(abstractC06774l);
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0F(@NonNull AbstractC06774l abstractC06774l, @NonNull C4O c4o, @Nullable C4O c4o2) {
        int i10 = c4o.A01;
        int i11 = c4o.A03;
        View view = abstractC06774l.A0H;
        int left = c4o2 == null ? view.getLeft() : c4o2.A01;
        int newLeft = c4o2 == null ? view.getTop() : c4o2.A03;
        if (!abstractC06774l.A0c() && (i10 != left || i11 != newLeft)) {
            view.layout(left, newLeft, view.getWidth() + left, view.getHeight() + newLeft);
            return A0T(abstractC06774l, i10, i11, left, newLeft);
        }
        return A0S(abstractC06774l);
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0G(@NonNull AbstractC06774l abstractC06774l, @NonNull C4O c4o, @NonNull C4O c4o2) {
        if (c4o.A01 != c4o2.A01 || c4o.A03 != c4o2.A03) {
            return A0T(abstractC06774l, c4o.A01, c4o.A03, c4o2.A01, c4o2.A03);
        }
        A0O(abstractC06774l);
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0H(@NonNull AbstractC06774l abstractC06774l, @NonNull AbstractC06774l abstractC06774l2, @NonNull C4O c4o, @NonNull C4O c4o2) {
        int fromTop;
        int toLeft;
        int i10 = c4o.A01;
        int i11 = c4o.A03;
        if (abstractC06774l2.A0h()) {
            fromTop = c4o.A01;
            toLeft = c4o.A03;
        } else {
            fromTop = c4o2.A01;
            toLeft = c4o2.A03;
        }
        if (A01[1].length() != 14) {
            throw new RuntimeException();
        }
        A01[1] = "7F8ns227Orjao7";
        return A0U(abstractC06774l, abstractC06774l2, i10, i11, fromTop, toLeft);
    }

    public final void A0N(AbstractC06774l abstractC06774l) {
        A0C(abstractC06774l);
    }

    public final void A0O(AbstractC06774l abstractC06774l) {
        A0C(abstractC06774l);
    }

    public final void A0P(AbstractC06774l abstractC06774l) {
        A0C(abstractC06774l);
    }

    public final void A0Q(AbstractC06774l abstractC06774l, boolean z10) {
        A0C(abstractC06774l);
    }
}
