package com.applovin.impl.adview.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f6864a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6865b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6866c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f6867d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f6868e;

    public b(Activity activity) {
        this.f6864a = activity;
        int rotation = Utils.getRotation(activity);
        this.f6866c = rotation;
        boolean isTablet = AppLovinSdkUtils.isTablet(activity);
        this.f6867d = isTablet;
        this.f6865b = a(rotation, isTablet);
        this.f6868e = isTablet && 2 == a(activity);
    }

    private int a(int i10, boolean z10) {
        if (z10 && this.f6868e) {
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 1) {
                return 9;
            }
            if (i10 == 2) {
                return 8;
            }
            return i10 == 3 ? 1 : -1;
        } else if (i10 == 0) {
            return 1;
        } else {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 9;
            }
            return i10 == 3 ? 8 : -1;
        }
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    private void a(int i10) {
        try {
            this.f6864a.setRequestedOrientation(i10);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r6 != 3) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
        if (r6 != 1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0044, code lost:
        if (r6 == 2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0047, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0053, code lost:
        if (r6 == 1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.applovin.impl.sdk.ad.e.b r6) {
        /*
            r5 = this;
            com.applovin.impl.sdk.ad.e$b r0 = com.applovin.impl.sdk.ad.e.b.ACTIVITY_PORTRAIT
            r1 = 3
            r2 = 2
            r3 = 1
            if (r6 != r0) goto L2e
            boolean r6 = r5.f6867d
            r0 = 9
            if (r6 == 0) goto L1e
            boolean r6 = r5.f6868e
            if (r6 == 0) goto L1e
            int r6 = r5.f6866c
            if (r6 == r3) goto L18
            if (r6 == r1) goto L18
            goto L24
        L18:
            if (r6 != r3) goto L24
        L1a:
            r5.a(r0)
            goto L56
        L1e:
            int r6 = r5.f6866c
            if (r6 == 0) goto L28
            if (r6 == r2) goto L28
        L24:
            r5.a(r3)
            goto L56
        L28:
            if (r6 != 0) goto L2b
            goto L24
        L2b:
            r3 = 9
            goto L24
        L2e:
            com.applovin.impl.sdk.ad.e$b r0 = com.applovin.impl.sdk.ad.e.b.ACTIVITY_LANDSCAPE
            if (r6 != r0) goto L56
            boolean r6 = r5.f6867d
            r0 = 8
            r4 = 0
            if (r6 == 0) goto L49
            boolean r6 = r5.f6868e
            if (r6 == 0) goto L49
            int r6 = r5.f6866c
            if (r6 == 0) goto L44
            if (r6 == r2) goto L44
            goto L4f
        L44:
            if (r6 != r2) goto L47
            goto L1a
        L47:
            r0 = 0
            goto L1a
        L49:
            int r6 = r5.f6866c
            if (r6 == r3) goto L53
            if (r6 == r1) goto L53
        L4f:
            r5.a(r4)
            goto L56
        L53:
            if (r6 != r3) goto L1a
            goto L47
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.activity.b.a(com.applovin.impl.sdk.ad.e$b):void");
    }

    public void a(e eVar) {
        int i10;
        if (!eVar.E() || (i10 = this.f6865b) == -1) {
            a(eVar.p());
        } else {
            a(i10);
        }
    }
}
