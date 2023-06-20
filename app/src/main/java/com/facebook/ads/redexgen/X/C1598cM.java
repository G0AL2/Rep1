package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* renamed from: com.facebook.ads.redexgen.X.cM  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1598cM extends C06282m {
    public static String[] A01 = {"qdMAGnvFuVn0ea0M3RnyzUUMgxm0S2Dt", "2PeyHnmE0bX58Ffgk0gx7OXrgxltyZLW", "2int", "nVrienaBQfkWnV6qIsNJmuY2fGTgVaBy", "EIAfoPo9YRxYx4hqHxVbjlkHHJjThpFm", "", "SPMlRY4DBSEQqdOiv1Q7wDslDeTbAa0F", "kfFOHzhabps7JVIWzUifit9US33gkwJk"};
    public final /* synthetic */ C3M A00;

    public C1598cM(C3M c3m) {
        this.A00 = c3m;
    }

    private boolean A00() {
        return this.A00.A01 != null && this.A00.A01.A05() > 1;
    }

    @Override // com.facebook.ads.redexgen.X.C06282m
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C3M.class.getName());
        accessibilityEvent.setScrollable(A00());
        if (accessibilityEvent.getEventType() == 4096 && this.A00.A01 != null) {
            accessibilityEvent.setItemCount(this.A00.A01.A05());
            accessibilityEvent.setFromIndex(this.A00.A00);
            accessibilityEvent.setToIndex(this.A00.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C06282m
    public final void A08(View view, C3X c3x) {
        super.A08(view, c3x);
        c3x.A0O(C3M.class.getName());
        c3x.A0R(A00());
        if (this.A00.canScrollHorizontally(1)) {
            c3x.A0N(4096);
        }
        if (this.A00.canScrollHorizontally(-1)) {
            c3x.A0N(Constants.BUFFER_SIZE);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C06282m
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            return true;
        }
        if (i10 != 4096) {
            if (i10 == 8192 && this.A00.canScrollHorizontally(-1)) {
                C3M c3m = this.A00;
                c3m.setCurrentItem(c3m.A00 - 1);
                return true;
            }
            return false;
        }
        C3M c3m2 = this.A00;
        String[] strArr = A01;
        if (strArr[3].charAt(13) != strArr[7].charAt(13)) {
            throw new RuntimeException();
        }
        A01[4] = "Vr8sNFSEZwclN9wLDYuYxTMloU2ohTqa";
        if (c3m2.canScrollHorizontally(1)) {
            C3M c3m3 = this.A00;
            c3m3.setCurrentItem(c3m3.A00 + 1);
            return true;
        }
        return false;
    }
}
