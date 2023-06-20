package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzwe;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.d0;
import com.google.firebase.auth.w;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "DefaultFirebaseUserCreator")
/* loaded from: classes3.dex */
public final class zzx extends FirebaseUser {
    public static final Parcelable.Creator<zzx> CREATOR = new g();
    @SafeParcelable.Field(getter = "getCachedTokenState", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private zzwe f23309a;
    @SafeParcelable.Field(getter = "getDefaultAuthUserInfo", id = 2)

    /* renamed from: b  reason: collision with root package name */
    private zzt f23310b;
    @SafeParcelable.Field(getter = "getFirebaseAppName", id = 3)

    /* renamed from: c  reason: collision with root package name */
    private final String f23311c;
    @SafeParcelable.Field(getter = "getUserType", id = 4)

    /* renamed from: d  reason: collision with root package name */
    private String f23312d;
    @SafeParcelable.Field(getter = "getUserInfos", id = 5)

    /* renamed from: e  reason: collision with root package name */
    private List f23313e;
    @SafeParcelable.Field(getter = "getProviders", id = 6)

    /* renamed from: f  reason: collision with root package name */
    private List f23314f;
    @SafeParcelable.Field(getter = "getCurrentVersion", id = 7)

    /* renamed from: g  reason: collision with root package name */
    private String f23315g;
    @SafeParcelable.Field(getter = "isAnonymous", id = 8)

    /* renamed from: h  reason: collision with root package name */
    private Boolean f23316h;
    @SafeParcelable.Field(getter = "getMetadata", id = 9)

    /* renamed from: i  reason: collision with root package name */
    private zzz f23317i;
    @SafeParcelable.Field(getter = "isNewUser", id = 10)

    /* renamed from: j  reason: collision with root package name */
    private boolean f23318j;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 11)

    /* renamed from: k  reason: collision with root package name */
    private zze f23319k;
    @SafeParcelable.Field(getter = "getMultiFactorInfoList", id = 12)

    /* renamed from: l  reason: collision with root package name */
    private zzbb f23320l;

    public zzx(ob.e eVar, List list) {
        Preconditions.checkNotNull(eVar);
        this.f23311c = eVar.p();
        this.f23312d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f23315g = "2";
        E1(list);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final ob.e C1() {
        return ob.e.o(this.f23311c);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final /* bridge */ /* synthetic */ FirebaseUser D1() {
        K1();
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final FirebaseUser E1(List list) {
        Preconditions.checkNotNull(list);
        this.f23313e = new ArrayList(list.size());
        this.f23314f = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            d0 d0Var = (d0) list.get(i10);
            if (d0Var.q().equals("firebase")) {
                this.f23310b = (zzt) d0Var;
            } else {
                synchronized (this) {
                    this.f23314f.add(d0Var.q());
                }
            }
            synchronized (this) {
                this.f23313e.add((zzt) d0Var);
            }
        }
        if (this.f23310b == null) {
            synchronized (this) {
                this.f23310b = (zzt) this.f23313e.get(0);
            }
        }
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final zzwe F1() {
        return this.f23309a;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void G1(zzwe zzweVar) {
        this.f23309a = (zzwe) Preconditions.checkNotNull(zzweVar);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void H1(List list) {
        Parcelable.Creator<zzbb> creator = zzbb.CREATOR;
        zzbb zzbbVar = null;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
                if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                    arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
                }
            }
            zzbbVar = new zzbb(arrayList);
        }
        this.f23320l = zzbbVar;
    }

    public final zze I1() {
        return this.f23319k;
    }

    public final zzx J1(String str) {
        this.f23315g = str;
        return this;
    }

    public final zzx K1() {
        this.f23316h = Boolean.FALSE;
        return this;
    }

    public final List L1() {
        zzbb zzbbVar = this.f23320l;
        return zzbbVar != null ? zzbbVar.j1() : new ArrayList();
    }

    public final List M1() {
        return this.f23313e;
    }

    public final void N1(zze zzeVar) {
        this.f23319k = zzeVar;
    }

    public final void O1(boolean z10) {
        this.f23318j = z10;
    }

    public final void P1(zzz zzzVar) {
        this.f23317i = zzzVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.d0
    public final String e() {
        return this.f23310b.e();
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.d0
    public final String getDisplayName() {
        return this.f23310b.getDisplayName();
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.d0
    public final String getEmail() {
        return this.f23310b.getEmail();
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.d0
    public final String getPhoneNumber() {
        return this.f23310b.getPhoneNumber();
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.d0
    public final Uri getPhotoUrl() {
        return this.f23310b.getPhotoUrl();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final FirebaseUserMetadata l1() {
        return this.f23317i;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final /* synthetic */ w m1() {
        return new sb.e(this);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List<? extends d0> n1() {
        return this.f23313e;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String o1() {
        Map map;
        zzwe zzweVar = this.f23309a;
        if (zzweVar == null || zzweVar.zze() == null || (map = (Map) b.a(zzweVar.zze()).b().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final boolean p1() {
        Boolean bool = this.f23316h;
        if (bool == null || bool.booleanValue()) {
            zzwe zzweVar = this.f23309a;
            String e10 = zzweVar != null ? b.a(zzweVar.zze()).e() : "";
            boolean z10 = false;
            if (this.f23313e.size() <= 1 && (e10 == null || !e10.equals("custom"))) {
                z10 = true;
            }
            this.f23316h = Boolean.valueOf(z10);
        }
        return this.f23316h.booleanValue();
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.d0
    public final String q() {
        return this.f23310b.q();
    }

    @Override // com.google.firebase.auth.d0
    public final boolean r0() {
        return this.f23310b.r0();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f23309a, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f23310b, i10, false);
        SafeParcelWriter.writeString(parcel, 3, this.f23311c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f23312d, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f23313e, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.f23314f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f23315g, false);
        SafeParcelWriter.writeBooleanObject(parcel, 8, Boolean.valueOf(p1()), false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f23317i, i10, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f23318j);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f23319k, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f23320l, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zze() {
        return this.f23309a.zze();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zzf() {
        return this.f23309a.zzh();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List zzg() {
        return this.f23314f;
    }

    public final boolean zzs() {
        return this.f23318j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzx(@SafeParcelable.Param(id = 1) zzwe zzweVar, @SafeParcelable.Param(id = 2) zzt zztVar, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) List list, @SafeParcelable.Param(id = 6) List list2, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) Boolean bool, @SafeParcelable.Param(id = 9) zzz zzzVar, @SafeParcelable.Param(id = 10) boolean z10, @SafeParcelable.Param(id = 11) zze zzeVar, @SafeParcelable.Param(id = 12) zzbb zzbbVar) {
        this.f23309a = zzweVar;
        this.f23310b = zztVar;
        this.f23311c = str;
        this.f23312d = str2;
        this.f23313e = list;
        this.f23314f = list2;
        this.f23315g = str3;
        this.f23316h = bool;
        this.f23317i = zzzVar;
        this.f23318j = z10;
        this.f23319k = zzeVar;
        this.f23320l = zzbbVar;
    }
}
