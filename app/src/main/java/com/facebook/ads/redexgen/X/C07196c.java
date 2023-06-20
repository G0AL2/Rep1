package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;

/* renamed from: com.facebook.ads.redexgen.X.6c  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07196c {
    public static String[] A03 = {"COmePc5O6jQNBThxNrU00eLA0sP62Ofb", "1OlTUJms59QGnZv6uedBszpwZ8CEYVJ", "oD0bBsFyrWHU6", "C7a4pm2tyO8SrXv1cdlxK2sPFdgwB5ae", "g8qGNC4JJd68o", "wdv0nL8gPgDp5YXIgWNDO16SJnt", "h7h0bvqqYit4L8HKMEE", "ho5Id5lQMxy9uaRyjuF"};
    public final Context A00;
    public final C6W A01;
    public final EnumC07426z A02;

    public C07196c(Context context, C6W c6w, EnumC07426z enumC07426z) {
        this.A01 = c6w;
        this.A00 = context;
        this.A02 = enumC07426z;
    }

    public final void A00(MotionEvent motionEvent) {
        int i10;
        int i11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Context context = this.A00;
        String packageName = context == null ? "" : context.getPackageName();
        EnumC07426z enumC07426z = this.A02;
        EnumC07426z enumC07426z2 = EnumC07426z.A0G;
        if (A03[7].length() != 16) {
            A03[6] = "q52vtyV4o3lWIqbyVHb";
            AnonymousClass78 anonymousClass78 = enumC07426z == enumC07426z2 ? null : new AnonymousClass78(packageName);
            float f10 = 1.0f;
            char c10 = 1;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 3:
                case 5:
                case 6:
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    int pointerId2 = Build.VERSION.SDK_INT;
                    if (pointerId2 >= 14) {
                        i10 = motionEvent.getToolType(actionIndex);
                    } else {
                        i10 = -1;
                    }
                    this.A01.A02(new Y4(elapsedRealtime, anonymousClass78, new C07236g(motionEvent.getActionMasked(), pointerId, i10, new float[]{motionEvent.getRawX(), motionEvent.getRawY()}, motionEvent.getSize(actionIndex), Math.min(motionEvent.getPressure(actionIndex), 1.0f), motionEvent.getOrientation(actionIndex))), C6V.A0E);
                    return;
                case 2:
                case 4:
                    int i12 = 0;
                    while (i12 < motionEvent.getPointerCount()) {
                        int pointerId3 = motionEvent.getPointerId(i12);
                        String[] strArr = A03;
                        if (strArr[2].length() != strArr[4].length()) {
                            break;
                        } else {
                            String[] strArr2 = A03;
                            strArr2[1] = "FtxLtPKiBWyCq8d2bMsvLwchXj4m1FL";
                            strArr2[5] = "2ZHjPJSTqIAuT8ks3iUv9R1XL7D";
                            if (Build.VERSION.SDK_INT >= 14) {
                                i11 = motionEvent.getToolType(i12);
                            } else {
                                i11 = -1;
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            float[] fArr = new float[2];
                            fArr[0] = motionEvent.getRawX();
                            fArr[c10] = motionEvent.getRawY();
                            this.A01.A02(new Y4(elapsedRealtime, anonymousClass78, new C07236g(actionMasked, pointerId3, i11, fArr, motionEvent.getSize(i12), Math.min(motionEvent.getPressure(i12), f10), motionEvent.getOrientation(i12))), C6V.A0E);
                            i12++;
                            f10 = 1.0f;
                            c10 = 1;
                        }
                    }
                    return;
                default:
                    return;
            }
        }
        throw new RuntimeException();
    }
}
