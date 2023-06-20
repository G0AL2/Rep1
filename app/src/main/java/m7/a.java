package m7;

import com.google.android.gms.ads.AdError;

/* compiled from: PangleConstants.java */
/* loaded from: classes2.dex */
public class a {
    public static AdError a(int i10, String str) {
        return new AdError(i10, str, "com.google.ads.mediation.pangle");
    }

    public static AdError b(int i10, String str) {
        return new AdError(i10, str, "com.pangle.ads");
    }
}
