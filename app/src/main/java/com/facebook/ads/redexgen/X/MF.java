package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* loaded from: assets/audience_network.dex */
public final class MF implements View.OnSystemUiVisibilityChangeListener {
    public int A00;
    @Nullable
    public Window A01;
    public final View A03;
    public ME A02 = ME.A03;
    public final Runnable A04 = new C1287Tm(this);

    public MF(View view) {
        this.A03 = view;
        this.A03.setOnSystemUiVisibilityChangeListener(this);
    }

    private void A00(int i10, boolean z10) {
        Window window = this.A01;
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z10) {
            attributes.flags |= i10;
        } else {
            attributes.flags &= i10 ^ (-1);
        }
        this.A01.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(boolean z10) {
        if (ME.A03.equals(this.A02)) {
            return;
        }
        int i10 = 3840;
        if (!z10) {
            i10 = 3840 | 7;
        }
        Handler handler = this.A03.getHandler();
        if (handler != null && z10) {
            handler.removeCallbacks(this.A04);
            handler.postDelayed(this.A04, Constants.MIN_PROGRESS_TIME);
        }
        this.A03.setSystemUiVisibility(i10);
    }

    public final void A03() {
        this.A01 = null;
    }

    public final void A04(Window window) {
        this.A01 = window;
    }

    public final void A05(ME me2) {
        this.A02 = me2;
        if (MD.A00[this.A02.ordinal()] != 1) {
            A00(67108864, false);
            A00(134217728, false);
            this.A03.setSystemUiVisibility(0);
            return;
        }
        A00(67108864, true);
        A00(134217728, true);
        A02(false);
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i10) {
        this.A00 = i10;
        if (((this.A00 ^ i10) & 2) != 0 && (i10 & 2) == 0) {
            A02(true);
        }
    }
}
