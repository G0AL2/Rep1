package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "EmailAuthCredentialCreator")
/* loaded from: classes3.dex */
public class EmailAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new r0();
    @SafeParcelable.Field(getter = "getEmail", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private String f23204a;
    @SafeParcelable.Field(getter = "getPassword", id = 2)

    /* renamed from: b  reason: collision with root package name */
    private String f23205b;
    @SafeParcelable.Field(getter = "getSignInLink", id = 3)

    /* renamed from: c  reason: collision with root package name */
    private final String f23206c;
    @SafeParcelable.Field(getter = "getCachedState", id = 4)

    /* renamed from: d  reason: collision with root package name */
    private String f23207d;
    @SafeParcelable.Field(getter = "isForLinking", id = 5)

    /* renamed from: e  reason: collision with root package name */
    private boolean f23208e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public EmailAuthCredential(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 5) boolean z10) {
        this.f23204a = Preconditions.checkNotEmpty(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f23205b = str2;
        this.f23206c = str3;
        this.f23207d = str4;
        this.f23208e = z10;
    }

    public static boolean n1(String str) {
        e c10;
        return (TextUtils.isEmpty(str) || (c10 = e.c(str)) == null || c10.b() != 4) ? false : true;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String j1() {
        return "password";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential k1() {
        return new EmailAuthCredential(this.f23204a, this.f23205b, this.f23206c, this.f23207d, this.f23208e);
    }

    public String l1() {
        return !TextUtils.isEmpty(this.f23205b) ? "password" : "emailLink";
    }

    public final EmailAuthCredential m1(FirebaseUser firebaseUser) {
        this.f23207d = firebaseUser.zzf();
        this.f23208e = true;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f23204a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f23205b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f23206c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f23207d, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f23208e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zzc() {
        return this.f23207d;
    }

    public final String zzd() {
        return this.f23204a;
    }

    public final String zze() {
        return this.f23205b;
    }

    public final String zzf() {
        return this.f23206c;
    }

    public final boolean zzg() {
        return !TextUtils.isEmpty(this.f23206c);
    }

    public final boolean zzh() {
        return this.f23208e;
    }
}
