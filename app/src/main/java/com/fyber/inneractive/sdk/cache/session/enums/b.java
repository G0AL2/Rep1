package com.fyber.inneractive.sdk.cache.session.enums;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum c uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final b f16852c;

    /* renamed from: d  reason: collision with root package name */
    public static final b f16853d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f16854e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f16855f;

    /* renamed from: g  reason: collision with root package name */
    public static final b f16856g;

    /* renamed from: h  reason: collision with root package name */
    public static final b f16857h;

    /* renamed from: i  reason: collision with root package name */
    public static final b f16858i;

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ b[] f16859j;

    /* renamed from: a  reason: collision with root package name */
    public UnitDisplayType f16860a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16861b;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16862a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            f16862a = iArr;
            try {
                iArr[UnitDisplayType.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16862a[UnitDisplayType.MRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16862a[UnitDisplayType.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16862a[UnitDisplayType.INTERSTITIAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        UnitDisplayType unitDisplayType = UnitDisplayType.REWARDED;
        b bVar = new b("REWARDED_VIDEO", 0, unitDisplayType, true);
        f16852c = bVar;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.INTERSTITIAL;
        b bVar2 = new b("INTERSTITIAL_VIDEO", 1, unitDisplayType2, true);
        f16853d = bVar2;
        b bVar3 = new b("RECTANGLE_DISPLAY", 2, UnitDisplayType.MRECT, false);
        f16854e = bVar3;
        b bVar4 = new b("REWARDED_DISPLAY", 3, unitDisplayType, true);
        f16855f = bVar4;
        b bVar5 = new b("BANNER_DISPLAY", 4, UnitDisplayType.BANNER, false);
        f16856g = bVar5;
        b bVar6 = new b("INTERSTITIAL_DISPLAY", 5, unitDisplayType2, false);
        f16857h = bVar6;
        b bVar7 = new b("NONE", 6, UnitDisplayType.DEFAULT, false);
        f16858i = bVar7;
        f16859j = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
    }

    public b(String str, int i10, UnitDisplayType unitDisplayType, boolean z10) {
        this.f16860a = unitDisplayType;
        this.f16861b = z10;
    }

    public static b a(String str, String str2) {
        int i10 = a.f16862a[UnitDisplayType.fromValue(str).ordinal()];
        if (i10 == 1) {
            return str2.contains(DownloadResource.TYPE_VIDEO) ? f16852c : f16855f;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    return null;
                }
                return str2.contains(DownloadResource.TYPE_VIDEO) ? f16853d : f16857h;
            }
            return f16856g;
        } else {
            return f16854e;
        }
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f16859j.clone();
    }
}
