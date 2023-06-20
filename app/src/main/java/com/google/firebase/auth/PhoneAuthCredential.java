package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "PhoneAuthCredentialCreator")
/* loaded from: classes3.dex */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new h0();
    @SafeParcelable.Field(getter = "getSessionInfo", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private String f23230a;
    @SafeParcelable.Field(getter = "getSmsCode", id = 2)

    /* renamed from: b  reason: collision with root package name */
    private String f23231b;
    @SafeParcelable.Field(getter = "getHasVerificationProof", id = 3)

    /* renamed from: c  reason: collision with root package name */
    private boolean f23232c;
    @SafeParcelable.Field(getter = "getPhoneNumber", id = 4)

    /* renamed from: d  reason: collision with root package name */
    private String f23233d;
    @SafeParcelable.Field(getter = "getAutoCreate", id = 5)

    /* renamed from: e  reason: collision with root package name */
    private boolean f23234e;
    @SafeParcelable.Field(getter = "getTemporaryProof", id = 6)

    /* renamed from: f  reason: collision with root package name */
    private String f23235f;
    @SafeParcelable.Field(getter = "getMfaEnrollmentId", id = 7)

    /* renamed from: g  reason: collision with root package name */
    private String f23236g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public PhoneAuthCredential(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) boolean z10, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) boolean z11, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) String str5) {
        boolean z12 = false;
        if ((z10 && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || ((z10 && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))))) {
            z12 = true;
        }
        Preconditions.checkArgument(z12, "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.f23230a = str;
        this.f23231b = str2;
        this.f23232c = z10;
        this.f23233d = str3;
        this.f23234e = z11;
        this.f23235f = str4;
        this.f23236g = str5;
    }

    public static PhoneAuthCredential n1(String str, String str2) {
        return new PhoneAuthCredential(str, str2, false, null, true, null, null);
    }

    public static PhoneAuthCredential o1(String str, String str2) {
        return new PhoneAuthCredential(null, null, false, str, true, str2, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String j1() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential k1() {
        return clone();
    }

    public String l1() {
        return this.f23231b;
    }

    /* renamed from: m1 */
    public final PhoneAuthCredential clone() {
        return new PhoneAuthCredential(this.f23230a, l1(), this.f23232c, this.f23233d, this.f23234e, this.f23235f, this.f23236g);
    }

    public final PhoneAuthCredential p1(boolean z10) {
        this.f23234e = false;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f23230a, false);
        SafeParcelWriter.writeString(parcel, 2, l1(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f23232c);
        SafeParcelWriter.writeString(parcel, 4, this.f23233d, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f23234e);
        SafeParcelWriter.writeString(parcel, 6, this.f23235f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f23236g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zzf() {
        return this.f23233d;
    }

    public final String zzg() {
        return this.f23230a;
    }

    public final String zzh() {
        return this.f23235f;
    }

    public final boolean zzi() {
        return this.f23234e;
    }
}
