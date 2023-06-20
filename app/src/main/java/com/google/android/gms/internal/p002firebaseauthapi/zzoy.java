package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.EmailAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "SignInWithEmailLinkAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoy  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzoy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoy> CREATOR = new zzoz();
    @SafeParcelable.Field(getter = "getCredential", id = 1)
    private final EmailAuthCredential zza;

    @SafeParcelable.Constructor
    public zzoy(@SafeParcelable.Param(id = 1) EmailAuthCredential emailAuthCredential) {
        this.zza = emailAuthCredential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final EmailAuthCredential zza() {
        return this.zza;
    }
}
