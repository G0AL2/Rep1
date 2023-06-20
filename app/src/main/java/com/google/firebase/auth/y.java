package com.google.firebase.auth;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public class y extends h {

    /* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f23335a;

        /* renamed from: b  reason: collision with root package name */
        private String f23336b;

        /* renamed from: c  reason: collision with root package name */
        private String f23337c;

        /* renamed from: d  reason: collision with root package name */
        private String f23338d;

        /* synthetic */ a(String str, g0 g0Var) {
            this.f23335a = str;
        }

        public AuthCredential a() {
            String str = this.f23335a;
            String str2 = this.f23336b;
            String str3 = this.f23337c;
            String str4 = this.f23338d;
            Parcelable.Creator<zze> creator = zze.CREATOR;
            Preconditions.checkNotEmpty(str, "Must specify a non-empty providerId");
            if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
                throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
            }
            return new zze(str, str2, str3, null, null, null, str4);
        }

        public a b(String str, String str2) {
            this.f23336b = str;
            this.f23338d = str2;
            return this;
        }
    }

    @Deprecated
    public static AuthCredential a(String str, String str2, String str3) {
        return zze.m1(str, str2, str3, null, null);
    }

    public static a b(String str) {
        return new a(Preconditions.checkNotEmpty(str), null);
    }
}
