package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* loaded from: classes.dex */
public class j extends e {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16955a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            f16955a = iArr;
            try {
                iArr[UnitDisplayType.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16955a[UnitDisplayType.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE("none"),
        OPEN("open");
        

        /* renamed from: a  reason: collision with root package name */
        public String f16959a;

        b(String str) {
            this.f16959a = str;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        NONE("none"),
        ZOOM_IN("endcard_zoom_in");
        

        /* renamed from: a  reason: collision with root package name */
        public String f16963a;

        c(String str) {
            this.f16963a = str;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        LEGACY("legacy"),
        /* JADX INFO: Fake field, exist only in values array */
        EXTRACTOR("extractor"),
        /* JADX INFO: Fake field, exist only in values array */
        NONE("none");
        

        /* renamed from: a  reason: collision with root package name */
        public String f16966a;

        d(String str) {
            this.f16966a = str;
        }
    }

    public j() {
        super("video_player");
    }

    public int a(UnitDisplayType unitDisplayType) {
        if (unitDisplayType == UnitDisplayType.INTERSTITIAL) {
            Integer b10 = b("prebuffer_interstitial");
            if (b10 != null) {
                return b10.intValue();
            }
            return 3;
        }
        Integer b11 = b("prebuffer_rewarded");
        if (b11 != null) {
            return b11.intValue();
        }
        return 3;
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.e
    public e b() {
        j jVar = new j();
        a(jVar);
        return jVar;
    }

    public boolean c() {
        return a("cta_text_all_caps", false);
    }

    public int d() {
        Integer b10 = b("dl_retries");
        if (b10 != null) {
            return b10.intValue();
        }
        return 10;
    }

    public int e() {
        Integer b10 = b("dl_retry_delay");
        if (b10 != null) {
            return b10.intValue();
        }
        return 500;
    }

    public int f() {
        Integer b10 = b("endcard_animation_duration");
        int intValue = b10 != null ? b10.intValue() : 500;
        if (intValue < 500 || intValue > 3000) {
            return 500;
        }
        return intValue;
    }

    public c g() {
        c[] values;
        String a10 = a("endcard_animation_type", "none");
        for (c cVar : c.values()) {
            if (a10.equalsIgnoreCase(cVar.f16963a)) {
                return cVar;
            }
        }
        return c.NONE;
    }

    public int h() {
        Integer b10 = b("max_tries");
        if (b10 != null) {
            return b10.intValue();
        }
        return 0;
    }

    public int i() {
        Integer b10 = b("second_checkpoint");
        if (b10 != null) {
            return b10.intValue();
        }
        return 25;
    }
}
