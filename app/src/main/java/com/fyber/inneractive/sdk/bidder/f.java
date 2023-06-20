package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* loaded from: classes.dex */
public class f {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16818a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            f16818a = iArr;
            try {
                iArr[UnitDisplayType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16818a[UnitDisplayType.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16818a[UnitDisplayType.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16818a[UnitDisplayType.MRECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static TokenParametersOuterClass$TokenParameters.NullableBool a(Boolean bool) {
        TokenParametersOuterClass$TokenParameters.NullableBool.a newBuilder = TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            newBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.f19803b).setData(booleanValue);
        }
        return newBuilder.a();
    }

    public static TokenParametersOuterClass$TokenParameters.d b(String str) {
        if (str.equals("native")) {
            return TokenParametersOuterClass$TokenParameters.d.NATIVE;
        }
        if (!str.equals("unity3d")) {
            return TokenParametersOuterClass$TokenParameters.d.UNRECOGNIZED;
        }
        return TokenParametersOuterClass$TokenParameters.d.UNITY3D;
    }

    public static TokenParametersOuterClass$TokenParameters.NullableString c(String str) {
        TokenParametersOuterClass$TokenParameters.NullableString.a newBuilder = TokenParametersOuterClass$TokenParameters.NullableString.newBuilder();
        if (!TextUtils.isEmpty(str)) {
            newBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.f19803b).setData(str);
        }
        return newBuilder.a();
    }

    public static TokenParametersOuterClass$TokenParameters.NullableUInt32 a(int i10) {
        TokenParametersOuterClass$TokenParameters.NullableUInt32.a newBuilder = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (i10 > 0) {
            newBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.f19803b).setData(i10);
        }
        return newBuilder.a();
    }

    public static TokenParametersOuterClass$TokenParameters.NullableFloat a(String str) {
        TokenParametersOuterClass$TokenParameters.NullableFloat.a newBuilder = TokenParametersOuterClass$TokenParameters.NullableFloat.newBuilder();
        if (str != null) {
            float parseFloat = Float.parseFloat(str);
            newBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableFloat) newBuilder.f19803b).setData(parseFloat);
        }
        return newBuilder.a();
    }

    public static TokenParametersOuterClass$TokenParameters.k a(UnitDisplayType unitDisplayType) {
        int i10 = a.f16818a[unitDisplayType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return TokenParametersOuterClass$TokenParameters.k.UNITDISPLAYTYPEUNKNOWN;
                    }
                    return TokenParametersOuterClass$TokenParameters.k.MRECT;
                }
                return TokenParametersOuterClass$TokenParameters.k.REWARDED;
            }
            return TokenParametersOuterClass$TokenParameters.k.INTERSTITIAL;
        }
        return TokenParametersOuterClass$TokenParameters.k.BANNER;
    }
}
