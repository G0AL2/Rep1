package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "UserProfileChangeRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class UserProfileChangeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new m0();
    @SafeParcelable.Field(getter = "getDisplayName", id = 2)

    /* renamed from: a  reason: collision with root package name */
    private String f23245a;
    @SafeParcelable.Field(getter = "getPhotoUrl", id = 3)

    /* renamed from: b  reason: collision with root package name */
    private String f23246b;
    @SafeParcelable.Field(getter = "shouldRemoveDisplayName", id = 4)

    /* renamed from: c  reason: collision with root package name */
    private boolean f23247c;
    @SafeParcelable.Field(getter = "shouldRemovePhotoUri", id = 5)

    /* renamed from: d  reason: collision with root package name */
    private boolean f23248d;

    /* renamed from: e  reason: collision with root package name */
    private Uri f23249e;

    /* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f23250a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f23251b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f23252c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f23253d;

        public UserProfileChangeRequest a() {
            String str = this.f23250a;
            Uri uri = this.f23251b;
            return new UserProfileChangeRequest(str, uri == null ? null : uri.toString(), this.f23252c, this.f23253d);
        }

        public a b(String str) {
            if (str == null) {
                this.f23252c = true;
            } else {
                this.f23250a = str;
            }
            return this;
        }

        public a c(Uri uri) {
            if (uri == null) {
                this.f23253d = true;
            } else {
                this.f23251b = uri;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public UserProfileChangeRequest(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z10, @SafeParcelable.Param(id = 5) boolean z11) {
        this.f23245a = str;
        this.f23246b = str2;
        this.f23247c = z10;
        this.f23248d = z11;
        this.f23249e = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public String getDisplayName() {
        return this.f23245a;
    }

    public Uri j1() {
        return this.f23249e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        SafeParcelWriter.writeString(parcel, 3, this.f23246b, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f23247c);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f23248d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.f23246b;
    }

    public final boolean zzb() {
        return this.f23247c;
    }

    public final boolean zzc() {
        return this.f23248d;
    }
}
