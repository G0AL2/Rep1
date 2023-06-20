package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.SystemClock;
import android.view.OrientationEventListener;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6Y  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6Y {
    @Nullable
    public static OrientationEventListener A02;
    public final C6W A00;
    public final EnumC07426z A01;

    public C6Y(C6W c6w, EnumC07426z enumC07426z) {
        this.A00 = c6w;
        this.A01 = enumC07426z;
    }

    public final synchronized void A01() {
        if (A02 != null) {
            A02.disable();
            A02 = null;
        }
    }

    public final synchronized void A02(final Context context) {
        final AnonymousClass78 anonymousClass78;
        if (A02 != null) {
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        String packageName = context == null ? "" : context.getPackageName();
        if (this.A01 == EnumC07426z.A0G) {
            anonymousClass78 = null;
        } else {
            anonymousClass78 = new AnonymousClass78(packageName);
        }
        A02 = new OrientationEventListener(context, 3) { // from class: com.facebook.ads.redexgen.X.6X
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i10) {
                C6W c6w;
                YA ya2 = new YA(elapsedRealtime, anonymousClass78, i10);
                c6w = C6Y.this.A00;
                c6w.A02(ya2, C6V.A0A);
            }
        };
        A02.enable();
    }
}
