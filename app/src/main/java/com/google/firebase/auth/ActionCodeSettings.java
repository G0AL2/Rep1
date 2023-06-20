package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "ActionCodeSettingsCreator")
/* loaded from: classes3.dex */
public class ActionCodeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new o0();
    @SafeParcelable.Field(getter = "getUrl", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f23187a;
    @SafeParcelable.Field(getter = "getIOSBundle", id = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f23188b;
    @SafeParcelable.Field(getter = "getIOSAppStoreId", id = 3)

    /* renamed from: c  reason: collision with root package name */
    private final String f23189c;
    @SafeParcelable.Field(getter = "getAndroidPackageName", id = 4)

    /* renamed from: d  reason: collision with root package name */
    private final String f23190d;
    @SafeParcelable.Field(getter = "getAndroidInstallApp", id = 5)

    /* renamed from: e  reason: collision with root package name */
    private final boolean f23191e;
    @SafeParcelable.Field(getter = "getAndroidMinimumVersion", id = 6)

    /* renamed from: f  reason: collision with root package name */
    private final String f23192f;
    @SafeParcelable.Field(getter = "canHandleCodeInApp", id = 7)

    /* renamed from: g  reason: collision with root package name */
    private final boolean f23193g;
    @SafeParcelable.Field(getter = "getLocaleHeader", id = 8)

    /* renamed from: h  reason: collision with root package name */
    private String f23194h;
    @SafeParcelable.Field(getter = "getRequestType", id = 9)

    /* renamed from: i  reason: collision with root package name */
    private int f23195i;
    @SafeParcelable.Field(getter = "getDynamicLinkDomain", id = 10)

    /* renamed from: j  reason: collision with root package name */
    private String f23196j;

    /* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f23197a;

        /* renamed from: b  reason: collision with root package name */
        private String f23198b;

        /* renamed from: c  reason: collision with root package name */
        private String f23199c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f23200d;

        /* renamed from: e  reason: collision with root package name */
        private String f23201e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f23202f = false;

        /* renamed from: g  reason: collision with root package name */
        private String f23203g;

        /* synthetic */ a(e0 e0Var) {
        }

        public ActionCodeSettings a() {
            if (this.f23197a != null) {
                return new ActionCodeSettings(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        public a b(String str, boolean z10, String str2) {
            this.f23199c = str;
            this.f23200d = z10;
            this.f23201e = str2;
            return this;
        }

        public a c(String str) {
            this.f23203g = str;
            return this;
        }

        public a d(boolean z10) {
            this.f23202f = z10;
            return this;
        }

        public a e(String str) {
            this.f23198b = str;
            return this;
        }

        public a f(String str) {
            this.f23197a = str;
            return this;
        }
    }

    private ActionCodeSettings(a aVar) {
        this.f23187a = aVar.f23197a;
        this.f23188b = aVar.f23198b;
        this.f23189c = null;
        this.f23190d = aVar.f23199c;
        this.f23191e = aVar.f23200d;
        this.f23192f = aVar.f23201e;
        this.f23193g = aVar.f23202f;
        this.f23196j = aVar.f23203g;
    }

    public static a p1() {
        return new a(null);
    }

    public static ActionCodeSettings q1() {
        return new ActionCodeSettings(new a(null));
    }

    public boolean j1() {
        return this.f23193g;
    }

    public boolean k1() {
        return this.f23191e;
    }

    public String l1() {
        return this.f23192f;
    }

    public String m1() {
        return this.f23190d;
    }

    public String n1() {
        return this.f23188b;
    }

    public String o1() {
        return this.f23187a;
    }

    public final void r1(String str) {
        this.f23194h = str;
    }

    public final void s1(int i10) {
        this.f23195i = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, o1(), false);
        SafeParcelWriter.writeString(parcel, 2, n1(), false);
        SafeParcelWriter.writeString(parcel, 3, this.f23189c, false);
        SafeParcelWriter.writeString(parcel, 4, m1(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, k1());
        SafeParcelWriter.writeString(parcel, 6, l1(), false);
        SafeParcelWriter.writeBoolean(parcel, 7, j1());
        SafeParcelWriter.writeString(parcel, 8, this.f23194h, false);
        SafeParcelWriter.writeInt(parcel, 9, this.f23195i);
        SafeParcelWriter.writeString(parcel, 10, this.f23196j, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f23195i;
    }

    public final String zzc() {
        return this.f23196j;
    }

    public final String zzd() {
        return this.f23189c;
    }

    public final String zze() {
        return this.f23194h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public ActionCodeSettings(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 5) boolean z10, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) boolean z11, @SafeParcelable.Param(id = 8) String str6, @SafeParcelable.Param(id = 9) int i10, @SafeParcelable.Param(id = 10) String str7) {
        this.f23187a = str;
        this.f23188b = str2;
        this.f23189c = str3;
        this.f23190d = str4;
        this.f23191e = z10;
        this.f23192f = str5;
        this.f23193g = z11;
        this.f23194h = str6;
        this.f23195i = i10;
        this.f23196j = str7;
    }
}
