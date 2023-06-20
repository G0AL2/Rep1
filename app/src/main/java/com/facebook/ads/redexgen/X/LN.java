package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public final class LN {
    public static byte[] A00;
    public static String[] A01 = {"R2O7PMYP6nkOeNui3I4WlXx4fu7rpRKA", "y", "n9RLgUbY6qPVyxnn4C2MCNq6tOX6tKMu", "KtI8XvYnNiAs4lVQz", "VIjGruAAxxfbDEfj8", "jnPluIPOifq7BY1vqnqKLiUetY3DHsfM", "J5aiTqmsNT2689NKU", "zCaDldCe0EtEl2h3W"};
    public static final Package A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Set<C1400Xy> A06;
    public static final AtomicReference<LW> A07;
    public static final AtomicReference<LY> A08;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-68, -49, -46, -36, -27, -19, -49, -46, -19, -35, -48, -40, -19, -41, -46, -19, -39, -45, -25, 102, 121, 124, -122, -113, -105, -121, -118, -127, Byte.MAX_VALUE, -127, -122, 121, -124, -105, 125, -112, -116, -118, 121, -117, -94, -75, -72, -62, -53, -45, -57, -75, -54, -71, -72, -45, -57, -56, -75, -56, -71, -45, -72, -75, -56, -75, -33, -19, 2, -15, -16, -84, -1, 0, -19, 0, -15, -84, -18, 1, -6, -16, -8, -15, -84, -11, -1, -84, -15, -7, -4, 0, 5, -83, -77, -75, -58, -79, -57, -58, -69, -66, -82, -69, -84, -80, -71, -74, -78, -69, -63, -84, -63, -68, -72, -78, -69};
    }

    static {
        A07();
        A02 = LN.class.getPackage();
        A04 = A02 + A06(40, 22, 98);
        A03 = A02 + A06(0, 19, 124);
        A05 = A02 + A06(19, 21, 38);
        A06 = Collections.newSetFromMap(new WeakHashMap());
        A07 = new AtomicReference<>();
        A08 = new AtomicReference<>();
    }

    public static Intent A00(Intent cloneIntent) {
        Intent cloneFilter = cloneIntent.cloneFilter();
        cloneFilter.setFlags(cloneIntent.getFlags());
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(cloneIntent.getExtras());
        cloneFilter.putExtra(A05, obtain.marshall());
        obtain.recycle();
        return cloneFilter;
    }

    public static Intent A01(Intent startIntent, ClassLoader classLoader) {
        Intent cloneFilter = startIntent.cloneFilter();
        cloneFilter.setFlags(startIntent.getFlags());
        Bundle bundle = new Bundle();
        Parcel obtain = Parcel.obtain();
        byte[] byteArrayExtra = startIntent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            bundle = obtain.readBundle(classLoader);
            obtain.recycle();
        }
        cloneFilter.putExtras(bundle);
        return cloneFilter;
    }

    public static Bundle A02(Bundle bundle, ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(classLoader);
            obtain.recycle();
            String[] strArr = A01;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "08vXapB5qdF8q1e2g";
            strArr2[3] = "bPV7EQI3jYdBWJzP2";
            return readBundle;
        }
        throw new IllegalStateException(A06(62, 28, 122));
    }

    @Nullable
    public static C1400Xy A03(Intent intent) {
        String adId = intent.getStringExtra(A03);
        if (adId != null) {
            for (C1400Xy c1400Xy : A06) {
                if (adId.equals(c1400Xy.A0D().getId())) {
                    return c1400Xy;
                }
            }
            return null;
        }
        return null;
    }

    public static AdActivityIntent A04(C1400Xy c1400Xy) {
        AdActivityIntent adActivityIntent = new AdActivityIntent(c1400Xy.getApplicationContext(), A05());
        adActivityIntent.putExtra(A03, c1400Xy.A0D().getId());
        A06.add(c1400Xy);
        return adActivityIntent;
    }

    public static Class A05() {
        if (A01[1].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "4NnM5dRGBMW0KGxzs";
        strArr[3] = "N6FCbEqQMIqNBYuck";
        return AudienceNetworkActivity.class;
    }

    public static void A08(Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle2);
        bundle.putByteArray(A04, obtain.marshall());
        obtain.recycle();
    }

    public static void A09(C1400Xy c1400Xy, AdActivityIntent adActivityIntent) throws LL {
        try {
            c1400Xy.getApplicationContext().startActivity(A00(adActivityIntent));
        } catch (ActivityNotFoundException e10) {
            throw new LL(e10);
        }
    }

    public static boolean A0A(Intent intent, Set<String> set) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String prefix = data.toString();
        for (String url : set) {
            if (prefix.startsWith(url)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0B(C1400Xy c1400Xy, Intent intent) throws LL {
        return A0D(c1400Xy, intent, A07.get());
    }

    public static boolean A0C(C1400Xy c1400Xy, Intent intent) throws LL {
        LW lw = A07.get();
        if (lw == null || c1400Xy.A0C() == null) {
            return false;
        }
        String requestId = c1400Xy.A0A();
        try {
            Activity A0C = c1400Xy.A0C();
            if (requestId == null) {
                requestId = A06(0, 0, 81);
            }
            return lw.startActivityForResult(intent, 0, A0C, requestId);
        } catch (ActivityNotFoundException e10) {
            throw new LL(e10);
        } catch (Exception e11) {
            c1400Xy.A06().A8y(A06(90, 8, 64), C07828z.A07, new AnonymousClass90(e11));
            return false;
        }
    }

    @VisibleForTesting
    public static boolean A0D(C1400Xy c1400Xy, Intent intent, @Nullable LW lw) throws LL {
        if (A0A(intent, JR.A0W(c1400Xy))) {
            return false;
        }
        Activity activity = c1400Xy;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A01[1] = "W";
        Activity A0C = c1400Xy.A0C();
        if (A0C != null) {
            activity = A0C;
        } else {
            intent.addFlags(268435456);
        }
        if (lw != null && !A0A(intent, JR.A0Y(c1400Xy))) {
            String requestId = c1400Xy.A0A();
            if (requestId == null) {
                try {
                    requestId = A06(0, 0, 81);
                } catch (ActivityNotFoundException e10) {
                    throw new LL(e10);
                } catch (Exception e11) {
                    c1400Xy.A06().A8y(A06(90, 8, 64), C07828z.A08, new AnonymousClass90(e11));
                    return false;
                }
            }
            return lw.startActivity(activity, intent, requestId);
        }
        try {
            activity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e12) {
            throw new LL(e12);
        }
    }

    public static boolean A0E(C1400Xy c1400Xy, Uri uri, String str) throws ActivityNotFoundException {
        return A0F(c1400Xy, uri, str, A08.get());
    }

    @VisibleForTesting
    public static boolean A0F(C1400Xy c1400Xy, Uri uri, String str, @Nullable LY ly) throws ActivityNotFoundException {
        if (ly == null || c1400Xy.A0C() == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString(A06(98, 15, 59), str);
        return ly.handleUriForResult(c1400Xy, uri.toString(), bundle, null, 0, c1400Xy.A0C());
    }
}
