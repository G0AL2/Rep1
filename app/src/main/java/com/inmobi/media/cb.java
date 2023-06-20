package com.inmobi.media;

import com.google.android.gms.common.api.Api;
import java.util.Locale;

/* compiled from: NativeTextAsset.java */
/* loaded from: classes3.dex */
public class cb extends bt {

    /* compiled from: NativeTextAsset.java */
    /* loaded from: classes3.dex */
    public static class a extends bu {

        /* renamed from: l  reason: collision with root package name */
        protected int f24890l;

        /* renamed from: m  reason: collision with root package name */
        protected String f24891m;

        /* renamed from: n  reason: collision with root package name */
        protected int f24892n;

        /* renamed from: o  reason: collision with root package name */
        protected String[] f24893o;

        /* renamed from: p  reason: collision with root package name */
        public byte f24894p;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, String str2, String str3, String str4, cc ccVar) {
            this(i10, i11, i12, i13, i14, i15, i16, i17, str, str2, str3, str4, 12, (byte) 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, "#ff000000", new String[]{"none"}, ccVar);
        }

        @Override // com.inmobi.media.bu
        public final String e() {
            return this.f24843j.toLowerCase(Locale.US);
        }

        public final int h() {
            return this.f24890l;
        }

        public final String i() {
            return this.f24891m.toLowerCase(Locale.US);
        }

        public final String[] j() {
            return this.f24893o;
        }

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, String str2, String str3, String str4, int i18, byte b10, int i19, String str5, String[] strArr, cc ccVar) {
            super(i10, i11, i12, i13, i14, i15, i16, i17, str, str2, str3, str4, ccVar);
            this.f24890l = i18;
            this.f24891m = str5.length() == 0 ? "#ff000000" : str5;
            this.f24892n = i19;
            int min = Math.min(strArr.length, 4);
            String[] strArr2 = new String[min];
            this.f24893o = strArr2;
            this.f24894p = b10;
            System.arraycopy(strArr, 0, strArr2, 0, min);
        }
    }

    public cb(String str, String str2, bu buVar, String str3) {
        super(str, str2, "TEXT", buVar);
        this.f24813e = str3;
    }

    public cb(String str, String str2, String str3, bu buVar, String str4) {
        super(str, str2, str3, buVar);
        this.f24813e = str4;
    }
}
